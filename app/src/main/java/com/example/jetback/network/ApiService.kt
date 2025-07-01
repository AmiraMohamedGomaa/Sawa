package com.example.jetback.data.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("character/{ids}")
    suspend fun getRandomCharacters(@Path("ids") id: String = "1"): Response<Any>
}
