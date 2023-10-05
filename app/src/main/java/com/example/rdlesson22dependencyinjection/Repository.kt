package com.example.rdlesson22dependencyinjection

import retrofit2.Response

class Repository(private val client: ApiClient) {
    suspend fun getCurrencyByName(name: String): Response<BitcoinResponce>{
        val apiInterface = client.client.create(ApiInterface::class.java)
        return apiInterface.getCryptoByName(name)
    }
}