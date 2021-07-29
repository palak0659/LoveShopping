package com.example.ecommerce

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.RecyclerView


class ProductAdapter(function: () -> Unit) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){

    var productData = arrayOf<Product>()
        set(value){
            field = value
            notifyDataSetChanged()
        }
    class ProductViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val product_photo: ImageView = view.findViewById(R.id.image)
        val product_name: TextView = view.findViewById(R.id.name)
        val product_price: TextView = view.findViewById(R.id.price)
        val product_description: TextView = view.findViewById(R.id.description)
    }

    override fun getItemCount() = productData.size

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ProductViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ProductViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        with(holder){
            product_photo.setImageResource(productData[position].imageId)
            product_name.text = productData[position].name
            product_price.text = productData[position].price.toString()
            product_description.text = productData[position].shortDescription


        }

    }

    override fun getItemId(position: Int): Long {
        return productData[position].id.hashCode().toLong()
    }

    fun submitList(products: MutableList<Product>) {
        TODO("Not yet implemented")
    }


}
