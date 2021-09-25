package com.example.ecommerce

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_checkout.*


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
                quantity.text = name
                amount.text = getString(R.string.price, price)
                order.text = getString(R.string.order_total, price)
                ima.setImageResource(imageId)

                checkout.setOnClickListener{
                    val bundle = Bundle()
                    bundle.putInt("ID", this.id)
                    findNavController().navigate(R.id.action_Checkout_to_thanks,bundle)
                }

            }
        }



    }

}
