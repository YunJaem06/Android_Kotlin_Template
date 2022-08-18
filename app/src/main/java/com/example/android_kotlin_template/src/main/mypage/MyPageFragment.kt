package com.example.android_kotlin_template.src.main.mypage

import android.os.Bundle
import android.view.View
import com.example.android_kotlin_template.R
import com.example.android_kotlin_template.config.BaseFragment
import com.example.android_kotlin_template.databinding.FragmentMyPageBinding

class MyPageFragment : BaseFragment<FragmentMyPageBinding>(FragmentMyPageBinding::bind, R.layout.fragment_my_page) {

    private var mCount = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonChangeCounterText.setOnClickListener {
            binding.textViewCounter.text = resources.getString(R.string.my_page_tv_counter, ++mCount)
        }
    }
}