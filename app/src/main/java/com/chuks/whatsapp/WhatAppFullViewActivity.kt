package com.chuks.whatsapp

import android.content.Intent
import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chuks.whatsapp.databinding.ActivityMainBinding
import com.chuks.whatsapp.databinding.ActivityWhatAppFullViewBinding

class WhatAppFullViewActivity : AppCompatActivity() {
    lateinit var binding : ActivityWhatAppFullViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWhatAppFullViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            imageView.setImageResource(intent.getStringExtra("imageView")!!.toInt())
            textView.text = intent.getStringExtra("textView")
            textView2.text =intent.getStringExtra("textView2")

        }

    }
}