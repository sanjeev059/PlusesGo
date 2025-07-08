package com.example.plusesgo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView

class ProductAdapter(
    context: Context,
    private val products: List<Product>,
    private val cart: ArrayList<Product>
) : ArrayAdapter<Product>(context, 0, products) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_product, parent, false)
        val product = products[position]

        val nameTextView = view.findViewById<TextView>(R.id.nameTextView)
        val priceTextView = view.findViewById<TextView>(R.id.priceTextView)
        val addButton = view.findViewById<Button>(R.id.addButton)

        nameTextView.text = product.name
        priceTextView.text = "₹${product.price}"
        addButton.setOnClickListener {
            cart.add(product)
        }

        return view
    }
}

