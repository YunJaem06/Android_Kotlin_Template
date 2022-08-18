package com.example.android_kotlin_template.src.main.home.models

import com.example.android_kotlin_template.config.BaseResponse
import com.google.gson.annotations.SerializedName

data class SignUpResponse(
    @SerializedName("result") val result: ResultSignUp
) : BaseResponse()