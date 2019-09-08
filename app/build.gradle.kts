buildscript {
    repositories {
        jcenter()
        mavenCentral()
        google()
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath("io.realm:realm-gradle-plugin:5.10.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.30")
        classpath("com.google.gms:google-services:4.2.0")
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

repositories {
    maven("https://maven.google.com")
}

android {
    compileSdkVersion(28)

    defaultConfig {
        applicationId = "com.inspiredandroid.linuxcommandbibliotheca"
        minSdkVersion(17)
        targetSdkVersion(28)
        versionCode = 64
        versionName = "2.0.2"

        resConfigs(listOf("en"))

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        getByName("debug") {
            isShrinkResources = true
            isMinifyEnabled = true
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
    implementation(project(":SharedCode"))
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation("org.jetbrains.anko:anko:0.10.8") {
        exclude(module = "kotlin-stdlib")
    }
    implementation("com.android.support.constraint:constraint-layout:1.1.3")
    implementation("com.android.support:support-annotations:28.0.0")
    implementation("com.android.support:appcompat-v7:28.0.0")
    implementation("com.android.support:design:28.0.0")
    implementation("com.android.support:recyclerview-v7:28.0.0")
    implementation("com.android.support:support-v4:28.0.0")
    implementation("com.android.support:support-vector-drawable:28.0.0")
    implementation("io.realm:android-adapters:3.1.0")
    implementation("com.futuremind.recyclerfastscroll:fastscroll:0.2.5")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("com.android.support.test:runner:1.0.2")
    androidTestImplementation("com.android.support.test:rules:1.0.2")
    androidTestImplementation("com.android.support:support-annotations:28.0.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.30")
}
