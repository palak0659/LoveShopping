package com.example.ecommerce

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */




class DetailFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var product: Product? = null
        val id = arguments?.getInt("ID")
        id?.let {
            product = products.find { it.id == id }
        }

        product?.let {
            with(it) {

                val product_photo: ImageView = view.findViewById(R.id.image)
                val product_name: TextView = view.findViewById(R.id.name)
                val product_price: TextView = view.findViewById(R.id.price)
                val product_description: TextView = view.findViewById(R.id.description)
                val product_full_description: TextView = view.findViewById(R.id.full_description)
                val buy: Button = view.findViewById(R.id.buy)
                product_name.text = name
                product_price.text = "Price: Rs {price}"
                product_description.text = shortDescription
                product_full_description.text = longdescription
                product_photo.setImageResource(imageId)

                buy.setOnClickListener()
                {
                    val bundle = Bundle()
                    bundle.putInt("ID", this.id)
                    findNavController().navigate(R.id.action_detail_to_Checkout, bundle)
                }

            }
        }
    }
}

private fun Button.setOnClickListener() {
    TODO("Not yet implemented")
}
