package com.example.rdlesson22dependencyinjection.dagger

import com.example.rdlesson22dependencyinjection.MyViewModel
import dagger.Component

@Component(modules = [ApiClientModule::class,RepositoryModule::class])
interface MyComponent {

    fun inject(myViewModel: MyViewModel)
}