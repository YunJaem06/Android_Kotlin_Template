package com.example.android_kotlin_template.config

import android.os.Bundle
import android.os.Message
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<B : ViewBinding>(private val inflater: (LayoutInflater) -> B) : AppCompatActivity() {

    protected lateinit var binding: B
    private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflater(layoutInflater)
        setContentView(binding.root)
    }

    fun showCustomToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}