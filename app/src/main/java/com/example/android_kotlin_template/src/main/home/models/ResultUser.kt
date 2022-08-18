package com.example.android_kotlin_template.src.main.home.models

import com.google.gson.annotations.SerializedName

data class ResultUser(
    @SerializedName("email") val email: String,
    @SerializedName("userId") val userId: Int
)