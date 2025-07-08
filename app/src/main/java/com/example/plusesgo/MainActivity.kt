package com.example.plusesgo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var cart: ArrayList<Product>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cart = arrayListOf()
        val productList = listOf(
            Product("Toor Dal", 120),
            Product("Urad Dal", 105),
            Product("Moong Dal", 110),
            Product("Chana Dal", 100),
            Product("Rajma", 90),
            Product("Masoor Dal", 95),
            Product("Rice", 60),
            Product("Ragi", 45),
            Product("Kabuli Chana", 110)
        )

        val listView = findViewById<ListView>(R.id.listView)
        val adapter = ProductAdapter(this, productList, cart)
        listView.adapter = adapter

        val goToCartButton = findViewById<Button>(R.id.goToCartButton)
        goToCartButton.setOnClickListener {
            val intent = Intent(this, CartActivity::class.java)
            intent.putExtra("cart", cart)
            startActivity(intent)
        }
    }
}

