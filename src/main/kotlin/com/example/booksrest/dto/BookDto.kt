package com.example.booksrest.dto

import java.math.BigDecimal
import javax.persistence.*



class BookDto(
    var name: String,
    var author: String,
    var price: BigDecimal,
)