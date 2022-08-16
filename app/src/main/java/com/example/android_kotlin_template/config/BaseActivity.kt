package com.example.android_kotlin_template.config

import android.content.Context
import android.os.Bundle
import android.os.Message
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.example.android_kotlin_template.util.LoadingDialog

abstract class BaseActivity<B : ViewBinding>(private val inflater: (LayoutInflater) -> B) : AppCompatActivity() {

    protected lateinit var binding: B
    private set
    lateinit var mLoadingDialog: LoadingDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflater(layoutInflater)
        setContentView(binding.root)
    }

    fun showLoadingDialog(context: Context){
        mLoadingDialog = LoadingDialog(context)
        mLoadingDialog.show()
    }
    fun dismissLoadingDialog(){
        if (mLoadingDialog.isShowing){
            mLoadingDialog.dismiss()
        }
    }

    fun showCustomToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}