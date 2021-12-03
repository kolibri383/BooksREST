package com.example.booksrest.service

import com.example.booksrest.dto.BookDto
import com.example.booksrest.model.Book
import java.math.BigDecimal

interface BookService {
    fun getAll():List<Book>
    fun getById(id:Long):Book
    fun create(newBook: BookDto)
    fun delete(id: Long)
    fun update(id: Long,update: Map<String,BigDecimal>)
}