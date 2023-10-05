plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    //for dagger
//    id("com.google.devtools.ksp")

    //for Hilt
    id("org.jetbrains.kotlin.kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.rdlesson22dependencyinjection"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.rdlesson22dependencyinjection"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    //retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    //coroutine
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
    //viewmodel lifecycle
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    //Koin
    //implementation("io.insert-koin:koin-android:3.5.0")

    //Dagger
//    implementation("com.google.dagger:dagger:2.48")
//    ksp("com.google.dagger:dagger-compiler:2.48")

    //Hilt
    implementation("com.google.dagger:hilt-android:2.46.1")
    kapt("com.google.dagger:hilt-compiler:2.46.1")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

kapt{
    correctErrorTypes = true
}