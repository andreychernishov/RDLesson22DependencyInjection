package com.example.rdlesson22dependencyinjection

import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
class Repository(private val client: ApiClient) {
    suspend fun getCurrencyByName(name: String): Response<BitcoinResponce>{
        val apiInterface = client.client.create(ApiInterface::class.java)
        return apiInterface.getCryptoByName(name)
    }
}