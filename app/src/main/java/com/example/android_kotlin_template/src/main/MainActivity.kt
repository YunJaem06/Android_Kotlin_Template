package com.example.android_kotlin_template.src.main

import android.os.Bundle
import com.example.android_kotlin_template.R
import com.example.android_kotlin_template.config.BaseActivity
import com.example.android_kotlin_template.databinding.ActivityMainBinding
import com.example.android_kotlin_template.src.main.home.HomeFragment
import com.example.android_kotlin_template.src.main.mypage.MyPageFragment

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction().replace(R.id.main_frm, HomeFragment()).commitAllowingStateLoss()

        binding.mainBtmNav.run {
            setOnItemSelectedListener { item->
                when(item.itemId){
                    R.id.menu_main_home -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, HomeFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_main_my_page -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.menu_main_my_page, MyPageFragment())
                            .commitAllowingStateLoss()
                    }
                }
                true
            }
            selectedItemId = R.id.menu_main_home
        }

    }
}