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
    implementation("androidx.activity:activity-compose:1.7.1")
    implementation("androidx.compose.material:material:1.4.3")
    implementation("androidx.navigation:navigation-compose:2.5.3")
    implementation("com.google.accompanist:accompanist-appcompat-theme:0.30.1")
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.30.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")
    implementation("androidx.preference:preference:1.2.0")
    implementation("androidx.compose.ui:ui-tooling-preview:1.4.3")

    implementation("io.insert-koin:koin-core:3.4.0")
    implementation("io.insert-koin:koin-android:3.4.0")
    implementation("io.insert-koin:koin-androidx-compose:3.4.4")
    implementation("androidx.compose.foundation:foundation:1.4.3")

    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.4.3")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.4.3")
    debugImplementation("androidx.compose.ui:ui-tooling:1.4.3")
}

android {
    compileSdk = 33
    defaultConfig {
        applicationId = "com.inspiredandroid.linuxcommandbibliotheca"
        minSdk = 24
        targetSdk = 33
        versionCode = 80
        versionName = project.version.toString()
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
        kotlinCompilerExtensionVersion = "1.4.7"
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