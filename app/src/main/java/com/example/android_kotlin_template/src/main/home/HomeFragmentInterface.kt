package com.example.android_kotlin_template.src.main.home

import com.example.android_kotlin_template.src.main.home.models.SignUpResponse
import com.example.android_kotlin_template.src.main.home.models.UserResponse

interface HomeFragmentInterface {

    fun onGetUserSuccess(response: UserResponse)

    fun onGetUserFailure(message: String)

    fun onPostSignUpSuccess(response: SignUpResponse)

    fun onPostSignUpFailure(message: String)

}