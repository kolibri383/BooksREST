package com.example.booksrest.controller

import com.example.booksrest.model.Book
import com.example.booksrest.service.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/books")
class BooksController(
    @Autowired
    private val bookService: BookService,
){
    @GetMapping
    fun getAll(): List<Book>? = bookService.getAllBooks()

}