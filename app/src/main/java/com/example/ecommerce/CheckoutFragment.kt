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
 * Use the [CheckoutFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CheckoutFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_checkout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        var product: Product? = null
        val id = arguments?.getInt( "ID")
        id?.let {
            product = products.find {it.id == id}
        }

        product?.let{
            with(it){
                val product_photo: ImageView = view.findViewById(R.id.image)
                val product_name: TextView = view.findViewById(R.id.name)
                val product_price: TextView = view.findViewById(R.id.price)
                val order_total: TextView = view.findViewById(R.id.order)
                val checkout: Button = view.findViewById(R.id.checkout)
                product_name.text = name
                product_price.text = "Price: Rs {price}"
                order_total.text = "Order Total: Rs {price}"
                product_photo.setImageResource(imageId)

                checkout.setOnClickListener()
                {
                    val bundle = Bundle()
                    bundle.putInt("ID", this.id)
                    findNavController().navigate(R.id.action_Checkout_to_thanks,bundle)
                }

            }
        }



    }

}
private fun Button.setOnClickListener() {
    TODO("Not yet implemented")
}