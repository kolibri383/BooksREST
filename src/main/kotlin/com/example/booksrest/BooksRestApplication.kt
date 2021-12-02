package com.example.booksrest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BooksRestApplication

fun main(args: Array<String>) {
    runApplication<BooksRestApplication>(*args)
}
