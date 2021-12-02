package com.example.booksrest.service

import com.example.booksrest.model.Book

interface BookService {
    fun getAllBooks():List<Book>
}