buildscript {
    repositories {
        jcenter()
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath("io.realm:realm-gradle-plugin:6.0.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.50")
    }
}

apply {
    plugin("realm-android")
}

plugins {
    id("com.android.application")
    id("kotlin-android")
    kotlin("android.extensions")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(29)

    defaultConfig {
        applicationId = "com.inspiredandroid.linuxcommandbibliotheca"
        minSdkVersion(17)
        targetSdkVersion(29)
        versionCode = 64
        versionName = "2.0.2"

        resConfigs(listOf("en"))

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        getByName("debug") {
            isShrinkResources = false
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
        getByName("release") {
            isShrinkResources = true
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    lintOptions {
        isWarningsAsErrors = true
        isAbortOnError = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation("org.jetbrains.anko:anko:0.10.8") {
        exclude(module = "kotlin-stdlib")
    }
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("androidx.annotation:annotation:1.1.0")
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("com.google.android.material:material:1.0.0")
    implementation("androidx.recyclerview:recyclerview:1.0.0")
    implementation("androidx.vectordrawable:vectordrawable:1.1.0")
    implementation("io.realm:android-adapters:3.1.0")
    implementation("com.futuremind.recyclerfastscroll:fastscroll:0.2.5")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.50")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test:runner:1.2.0")
    androidTestImplementation("androidx.test:rules:1.2.0")
    androidTestImplementation("androidx.annotation:annotation:1.1.0")
}
