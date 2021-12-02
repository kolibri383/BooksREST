package com.example.booksrest.service

import com.example.booksrest.dao.BookDao
import com.example.booksrest.model.Book
import org.springframework.stereotype.Service

@Service
class BookServiceImpl(private val bookDao: BookDao) : BookService {
    override fun getAllBooks(): List<Book> = bookDao.findAll().toList()
}