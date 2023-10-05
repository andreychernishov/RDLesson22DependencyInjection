package com.example.rdlesson22dependencyinjection.dagger

import com.example.rdlesson22dependencyinjection.ApiClient
import com.example.rdlesson22dependencyinjection.Repository
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {
    @Provides
    fun getRepo(apiClient: ApiClient) = Repository(apiClient)
}