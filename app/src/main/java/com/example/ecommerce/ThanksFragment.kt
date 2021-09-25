package com.example.ecommerce

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_checkout.*
import kotlinx.android.synthetic.main.fragment_detail.*
import kotlinx.android.synthetic.main.fragment_thanks.*
import kotlinx.android.synthetic.main.list_item.*


class ThanksFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_thanks, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var product: Product? = null
        val id = arguments?.getInt("ID")
        id?.let {
            product = products.find { it.id == id }
        }

        product?.let {
            with(it) {


                con.setOnClickListener{
                    val bundle = Bundle()
                    bundle.putInt("ID", this.id)
                    findNavController().navigate(R.id.action_thanks_to_Home, bundle)
                }

            }
        }
    }
}





