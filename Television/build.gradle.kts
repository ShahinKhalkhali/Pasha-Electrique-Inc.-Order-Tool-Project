plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.television"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.television"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.leanback:leanback:1.0.0")
    implementation("com.github.bumptech.glide:glide:4.11.0")
    implementation("androidx.fragment:fragment:1.7.0-alpha06")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
}