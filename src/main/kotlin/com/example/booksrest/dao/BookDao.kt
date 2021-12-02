package com.example.booksrest.dao

import com.example.booksrest.model.Book
import org.springframework.data.repository.CrudRepository

interface BookDao: CrudRepository<Book,Long> {
}