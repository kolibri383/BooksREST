package com.example.booksrest.exception

class BookNotFoundException(id: Long):RuntimeException("Book id not found : $id") {
}