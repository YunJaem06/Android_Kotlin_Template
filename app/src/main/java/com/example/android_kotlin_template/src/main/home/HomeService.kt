package com.example.android_kotlin_template.src.main.home

import com.example.android_kotlin_template.config.ApplicationClass
import com.example.android_kotlin_template.src.main.home.models.PostSignUpRequest
import com.example.android_kotlin_template.src.main.home.models.SignUpResponse
import com.example.android_kotlin_template.src.main.home.models.UserResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeService(val homeFragmentInterface: HomeFragmentInterface) {

    fun tryGetUsers(){
        val homeRetrofitInterface = ApplicationClass.sRetrofit.create(HomeRetrofitInterface::class.java)
        homeRetrofitInterface.getUser().enqueue(object : Callback<UserResponse>{
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                homeFragmentInterface.onGetUserSuccess(response.body() as UserResponse)
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                homeFragmentInterface.onGetUserFailure(t.message ?: "통신 오류")
            }

        })
    }

    fun tryPostSignUp(postSignUpRequest: PostSignUpRequest){
        val homeRetrofitInterface = ApplicationClass.sRetrofit.create(HomeRetrofitInterface::class.java)
        homeRetrofitInterface.postSignUp(postSignUpRequest).enqueue(object : Callback<SignUpResponse>{
            override fun onResponse(call: Call<SignUpResponse>, response: Response<SignUpResponse>) {
                homeFragmentInterface.onPostSignUpSuccess(response.body() as SignUpResponse)
            }

            override fun onFailure(call: Call<SignUpResponse>, t: Throwable) {
                homeFragmentInterface.onPostSignUpFailure(t.message ?: "통신 오류")
            }

        })
    }

}