package com.example.plusesgo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val products = listOf(
            Product("Rice", 45.0),
            Product("Toor Dal", 85.0),
            Product("Urad Dal", 95.0),
            Product("Raagi", 40.0),
            Product("Chana Dal", 75.0)
        )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ProductAdapter(products)
        recyclerView.adapter = adapter
    }
}
