package com.example.plusesgo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CartActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var tvTotal: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        tvTotal = findViewById(R.id.tvTotal)
        recyclerView = findViewById(R.id.recyclerViewCart)

        val cartItems = listOf(
            Product("Rice", 45.0, 2),
            Product("Raagi", 40.0, 3),
            Product("Toor Dal", 85.0, 1),
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ProductAdapter(cartItems)

        val total = cartItems.sumOf { it.pricePerKg * it.quantity }
        tvTotal.text = "Total: ₹%.2f".format(total)
    }
}
