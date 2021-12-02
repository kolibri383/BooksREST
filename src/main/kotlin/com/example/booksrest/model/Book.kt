package com.example.booksrest.model


import java.math.BigDecimal
import javax.persistence.*

@Entity
class Book(
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false)
    val id: Long,
    @Column(nullable = false)
    var name: String,
    @Column(nullable = false)
    var author: String,
    @Column(nullable = false)
    var price: BigDecimal,
)