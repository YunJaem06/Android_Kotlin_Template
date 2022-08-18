package com.example.android_kotlin_template.src.main.home

import com.example.android_kotlin_template.src.main.home.models.UserResponse
import retrofit2.Call
import retrofit2.http.GET

interface HomeRetrofitInterface {
    @GET("/template/users")
    fun getUser() : Call<UserResponse>
}