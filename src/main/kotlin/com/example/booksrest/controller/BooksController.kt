package com.example.booksrest.controller

import com.example.booksrest.dto.BookDto
import com.example.booksrest.model.Book
import com.example.booksrest.service.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal

@RestController
@RequestMapping("/books")
class BooksController(
    @Autowired
    private val bookService: BookService,
){
    @GetMapping
    fun getAllBooks(): List<Book> = bookService.getAll()

    @GetMapping("/{id}")
    fun getBookById(@PathVariable id:Long) = bookService.getById(id)

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping
    fun newBook(@RequestBody book: BookDto){
        bookService.create(book)
    }

    @PatchMapping("/{id}")
    fun pathBook(@PathVariable id: Long, @RequestBody update: Map<String,BigDecimal>){
        bookService.update(id,update)
    }

    @DeleteMapping("/{id}")
    fun deleteBook(@PathVariable id: Long){
        bookService.delete(id)
    }


}