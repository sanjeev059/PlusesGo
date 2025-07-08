package com.example.plusesgo

import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val cart = intent.getSerializableExtra("cart") as ArrayList<Product>
        val listView = findViewById<ListView>(R.id.cartListView)
        val totalView = findViewById<TextView>(R.id.totalTextView)

        val adapter = ProductAdapter(this, cart, arrayListOf())
        listView.adapter = adapter

        val total = cart.sumOf { it.price }
        totalView.text = "Total: ₹$total\n\nOrder Placed Successfully!"
    }
}

