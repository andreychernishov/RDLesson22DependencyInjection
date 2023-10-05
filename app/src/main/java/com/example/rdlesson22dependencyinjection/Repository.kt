package com.example.rdlesson22dependencyinjection

import retrofit2.Response
import retrofit2.Retrofit

class Repository(private val client: Retrofit) {
    suspend fun getCurrencyByName(name: String): Response<BitcoinResponce>{
        val apiInterface = client.create(ApiInterface::class.java)
        return apiInterface.getCryptoByName(name)
    }
}