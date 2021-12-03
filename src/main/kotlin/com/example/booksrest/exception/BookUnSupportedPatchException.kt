package com.example.booksrest.exception

import java.math.BigDecimal

class BookUnSupportedFieldPatchException(price: BigDecimal?) :
    RuntimeException("field called price not may be $price.")