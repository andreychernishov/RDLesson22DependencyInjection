package com.example.rdlesson22dependencyinjection.dagger

import com.example.rdlesson22dependencyinjection.ApiClient
import dagger.Module
import dagger.Provides

@Module
class ApiClientModule {
    @Provides
    fun getApiClient():ApiClient = ApiClient()
}