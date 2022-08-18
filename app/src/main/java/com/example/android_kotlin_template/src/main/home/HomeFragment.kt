package com.example.android_kotlin_template.src.main.home

import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.android_kotlin_template.R
import com.example.android_kotlin_template.config.BaseFragment
import com.example.android_kotlin_template.databinding.FragmentHomeBinding
import com.example.android_kotlin_template.src.main.home.models.PostSignUpRequest
import com.example.android_kotlin_template.src.main.home.models.SignUpResponse
import com.example.android_kotlin_template.src.main.home.models.UserResponse

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::bind, R.layout.fragment_home), HomeFragmentInterface {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.homeBtnTryGetJwt.setOnClickListener {
            showLoadingDialog(requireContext())
            HomeService(this).tryGetUsers()
        }
        binding.homeBtnTryPostHttpMethod.setOnClickListener {
            val email = binding.homeEtId.text.toString()
            val password = binding.homeEtPw.text.toString()
            val postRequest = PostSignUpRequest(email = email, password = password,
                confirmPassword = password, nickname = "text", phoneNumber = "010-0000-0000")
            showLoadingDialog(requireContext())
            HomeService(this).tryPostSignUp(postRequest)
        }
    }

    override fun onGetUserSuccess(response: UserResponse) {
        dismissLoadingDialog()
        for (User in response.result){
            Log.d("HomeFragment", User.toString())
        }
        binding.homeBtnTryGetJwt.text = response.message
        showCustomToast("Get JWT 성공")
    }

    override fun onGetUserFailure(message: String) {
        dismissLoadingDialog()
        showCustomToast("오류 : $message")
    }

    override fun onPostSignUpSuccess(response: SignUpResponse) {
        dismissLoadingDialog()
        binding.homeBtnTryPostHttpMethod.text = response.message
        response.message?.let { showCustomToast(it) }
    }

    override fun onPostSignUpFailure(message: String) {
        dismissLoadingDialog()
        showCustomToast("오류 : $message")
    }
}