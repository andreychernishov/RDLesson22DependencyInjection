package com.example.rdlesson22dependencyinjection

import android.app.Application
import com.example.rdlesson22dependencyinjection.dagger.DaggerMyComponent
import com.example.rdlesson22dependencyinjection.dagger.MyComponent


class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        component = DaggerMyComponent.create()
    }

    companion object{
        lateinit var component: MyComponent
    }

}