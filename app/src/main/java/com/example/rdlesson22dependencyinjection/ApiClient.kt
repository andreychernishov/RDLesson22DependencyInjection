package com.example.rdlesson22dependencyinjection

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton
@Singleton
class ApiClient {
    val client = Retrofit.Builder()
        .baseUrl("https://api.coincap.io/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}