package com.example.android_kotlin_template.src.main.home.models

import com.google.gson.annotations.SerializedName

data class ResultSignUp(
    @SerializedName("jwt") val jwt: String,
    @SerializedName("userId") val userId: Int
)