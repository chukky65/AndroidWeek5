package com.chuks.whatsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chuks.whatsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnWhatsAppClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var WhatsAdapter: WhatsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val names: List<Properties> = listOf(
            Properties(
                R.drawable.ic_angelina_jolie_portrait, "Anglelina", "jolie"
            ),
            Properties(
                R.drawable.ic_wheel2, "wheel", "tyre"
            ),
            Properties(
                R.drawable.ic_prof_1, "Adim", "Nwafor"
            ),
            Properties(
                R.drawable.ic_prof_12, "Ike", "Adabe"
            ),
            Properties(
                R.drawable.ic_prof_13, "Ada", "Okafor"
            ),
            Properties(
                R.drawable.ic_prof_16, "Jenifer", "Smith"
            ),
            Properties(
                R.drawable.ic_prof_15, "Obi", "John"
            ),
            Properties(
                R.drawable.ic_anonymous_aiga_car_rental, "Bmw", "Fast"
            ),
            Properties(
                R.drawable.ic_prof_14, "Mr John", "Boss"
            ),
            Properties(
                R.drawable.ic_prof_18, "May", "Elyon"
            ),
            Properties(
                R.drawable.ic_prof_2, "Uche", "Okwusa"
            ),
            Properties(
                R.drawable.ic_mrbean, "Mr Bean", "comedian"
            ),
            Properties(
                R.drawable.ic_prof_4, "Uche", "paul"
            ),
            Properties(
                R.drawable.ic_prof_6, "Pst Gab", "Yadi"
            ),
            Properties(
                R.drawable.ic_prof_9, "Prof", "Kelly"
            ),
            Properties(
                R.drawable.ic_prof_8, "Chukky", "Tech"
            ),
            Properties(
                R.drawable.ic_prof_12, "yapol", "kollins"
            ),
            Properties(
                R.drawable.ic_angelina_jolie_portrait, "Anglelina", "jolie"
            ),
            Properties(
                R.drawable.ic_wheel2, "wheel", "tyre"
            ),
            Properties(
                R.drawable.ic_prof_1, "Adim", "Nwafor"
            ),
            Properties(
                R.drawable.ic_prof_12, "Ike", "Adabe"
            ),
            Properties(
                R.drawable.ic_prof_13, "Ada", "Okafor"
            )
        )
        WhatsAdapter = WhatsAdapter(names, this)
        binding.recyclerView.adapter = WhatsAdapter
    }

    override fun onWhatsAppClick(groupList: Properties, position: Int) {
        val intent = Intent(this, WhatAppFullViewActivity::class.java)
        intent.putExtra("imageView", groupList.imageRes.toString())
        intent.putExtra("textView", groupList.firstText)
        intent.putExtra("textView2", groupList.SecondText)

        startActivity(intent)
    }
}