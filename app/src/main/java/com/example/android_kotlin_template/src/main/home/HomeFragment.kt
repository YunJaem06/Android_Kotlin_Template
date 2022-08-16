package com.example.android_kotlin_template.src.main.home

import android.os.Bundle
import android.view.View
import com.example.android_kotlin_template.R
import com.example.android_kotlin_template.config.BaseFragment
import com.example.android_kotlin_template.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::bind, R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}