package com.example.rdlesson22dependencyinjection

import android.app.Application
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MyApplication: Application() {

    lateinit var repo: Repository
    override fun onCreate() {
        super.onCreate()
        instance = this
        repo = Repository(getAppClient())
    }
    private fun getAppClient(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.coincap.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    companion object{
        private lateinit var instance: MyApplication
        fun getApp() = instance
    }
}