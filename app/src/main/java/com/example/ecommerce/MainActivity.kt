package com.example.ecommerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

val products = mutableListOf<Product>(Product(1 , "HEADPHONE", 50000F, R.drawable.headphone,"Apple Headphone Latest Collection",
    "Latest Collection with latest technology,high sound quality. Most selling product in the market. It is now availaible with 20% off."),
    Product(2 , "Google Home", 60000F, R.drawable.google_home,"line of smart speakers developed by Google",
        "The devices enable users to speak voice commands to interact with services through Google Assistant, the company's virtual assistant."),
    Product(3 , "LAPTOP", 90000F, R.drawable.laptop,"10th Gen Intel® Core™ i9 10900K",
        "Equipped with an 8-core 11th Gen Intel® Core™ i9 for high-performance gaming, and an FHD 360Hz display with NVIDIA G-SYNC® for smooth gameplay."),
    Product(4 , "Google Home", 60000F, R.drawable.earpod,"Voice Control With Hey Siri.",
        "24 hour total battery life with Charging Case.\n" +
                "3 hours charge from case in 15 minutes.")
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}