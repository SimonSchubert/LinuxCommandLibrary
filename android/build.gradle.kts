plugins {
    id("org.jetbrains.compose") version "1.1.1"
    id("com.android.application")
    kotlin("android")
}

group = "com.inspiredandroid.linuxcommandbibliotheca"
version = "1.0"

repositories {
    jcenter()
}

dependencies {
    implementation(project(":common"))
    implementation("androidx.activity:activity-compose:1.5.0")
    implementation("androidx.compose.material:material:1.1.1")
    implementation("androidx.navigation:navigation-compose:2.5.0")
    implementation("com.google.accompanist:accompanist-appcompat-theme:0.23.1")
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.23.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.5.0")
    implementation("androidx.preference:preference:1.2.0")
}

android {
    compileSdkVersion(33)
    defaultConfig {
        applicationId = "com.inspiredandroid.linuxcommandbibliotheca"
        minSdkVersion(24)
        targetSdkVersion(33)
        versionCode = 69
        versionName = "3.0.0"
    }

    sourceSets["main"].assets.setSrcDirs(listOf("../assets"))

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
        getByName("debug") {
            isMinifyEnabled = false
        }
    }

    lint {
        isAbortOnError = false
    }
}