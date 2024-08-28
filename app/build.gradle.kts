
plugins {
    id("com.android.application")
    
}

android {
    ndkVersion = "24.0.8215888"
    namespace = "com.ndk.ndkdemo1"
    compileSdk = 33
    
    defaultConfig {
        applicationId = "com.ndk.ndkdemo1"
        minSdk = 16
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        
        vectorDrawables { 
            useSupportLibrary = true
        }
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
        
    }
    
    externalNativeBuild{
        cmake{
            path = file("src/cpp/CMakeLists.txt")
        }
    }
    
}

dependencies {


    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
}
