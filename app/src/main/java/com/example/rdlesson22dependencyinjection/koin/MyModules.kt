package com.example.rdlesson22dependencyinjection.koin

import com.example.rdlesson22dependencyinjection.Repository
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

    val myModule = module{
        //for 1 module
        single {
            Retrofit.Builder()
                .baseUrl("https://api.coincap.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        single {
            Repository(get())
        }
        // for 2+ modules
        // factory {  }
    }