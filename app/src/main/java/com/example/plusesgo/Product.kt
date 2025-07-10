package com.example.plusesgo

import java.io.Serializable

data class Product(
    val name: String,
    val pricePerKg: Double,
    var quantity: Int = 0
)

