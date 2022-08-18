package com.example.android_kotlin_template.src.main.home.models

import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("code") val code: Int,
    @SerializedName("isSuccess") val isSuccess: Boolean,
    @SerializedName("message") val message: String,
    @SerializedName("result") val result: ArrayList<ResultUser>
)