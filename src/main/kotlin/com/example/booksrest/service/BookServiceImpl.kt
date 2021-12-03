package com.example.booksrest.service

import com.example.booksrest.dao.BookDao
import com.example.booksrest.dto.BookDto
import com.example.booksrest.exception.BookNotFoundException
import com.example.booksrest.exception.BookUnSupportedFieldPatchException
import com.example.booksrest.model.Book
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class BookServiceImpl(private val bookDao: BookDao) : BookService {
    override fun getAll(): List<Book> =
        bookDao.findAll().toList()

    override fun getById(id: Long): Book =
        bookDao.findById(id).orElseThrow{throw BookNotFoundException(id)}




    override fun create(newBook: BookDto) {
        val book = Book(
            name = newBook.name,
            author = newBook.author,
            price = newBook.price,
        )
        bookDao.save(book)
    }

    override fun delete(id: Long) {
        bookDao.deleteById(id)
    }

    override fun update(id: Long, update: Map<String,BigDecimal>) {
        bookDao.findById(id).map{ book ->
                val newPrice = update["price"]
                if(newPrice?.signum()==1){
                    book.price = newPrice
                    bookDao.save(book)
                }
                else
                    throw BookUnSupportedFieldPatchException(newPrice)
        }.orElseGet{throw BookNotFoundException(id)}
    }

}
