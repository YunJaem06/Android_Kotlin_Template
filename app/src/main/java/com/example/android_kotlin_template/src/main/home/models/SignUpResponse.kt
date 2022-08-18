package com.example.android_kotlin_template.src.main.home.models

data class SignUpResponse(
    val code: Int,
    val isSuccess: Boolean,
    val message: String,
    val result: ResultSignUp
)