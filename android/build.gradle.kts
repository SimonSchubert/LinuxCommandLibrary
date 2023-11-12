plugins {
    id("com.android.application")
    kotlin("android")
}

group = "com.inspiredandroid.linuxcommandbibliotheca"
version = parent!!.version

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))
    implementation("androidx.activity:activity-compose:1.8.0")
    implementation("androidx.compose.material:material:1.5.4")
    implementation("androidx.navigation:navigation-compose:2.7.5")
    implementation("com.google.accompanist:accompanist-appcompat-theme:0.32.0")
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.32.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")
    implementation("androidx.preference:preference:1.2.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.4")

    implementation("io.insert-koin:koin-core:3.5.0")
    implementation("io.insert-koin:koin-android:3.5.0")
    implementation("io.insert-koin:koin-androidx-compose:3.5.0")
    implementation("androidx.compose.foundation:foundation:1.5.4")

    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.5.4")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.5.4")
    debugImplementation("androidx.compose.ui:ui-tooling:1.5.4")
}

android {
    compileSdk = 34
    defaultConfig {
        applicationId = "com.inspiredandroid.linuxcommandbibliotheca"
        minSdk = 24
        targetSdk = 34
        versionCode = 85
        versionName = project.version.toString()
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("debug") {
            isMinifyEnabled = false
        }
    }

    sourceSets["main"].assets.setSrcDirs(listOf("../assets"))

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.4"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    lint {
        abortOnError = false
    }
    namespace = "com.inspiredandroid.linuxcommandbibliotheca"
}