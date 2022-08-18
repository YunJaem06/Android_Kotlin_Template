package com.example.android_kotlin_template.src.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.android_kotlin_template.R
import com.example.android_kotlin_template.config.BaseActivity
import com.example.android_kotlin_template.databinding.ActivityMainBinding
import com.example.android_kotlin_template.src.main.home.HomeFragment
import com.example.android_kotlin_template.src.main.mypage.MyPageFragment

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction().add(R.id.main_frm, HomeFragment()).commit()

        binding.mainBtmNav.setOnItemSelectedListener {
            replaceFragment(
                when(it.itemId){
                    R.id.menu_main_home -> HomeFragment()
                    else -> MyPageFragment()
                }
            )
            true
        }

    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.main_frm, fragment).commit()
    }
}