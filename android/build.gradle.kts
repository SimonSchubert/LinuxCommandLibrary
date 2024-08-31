plugins {
    id("com.android.application")
    kotlin("android")
    alias(libs.plugins.compose.compiler)
}

group = "com.inspiredandroid.linuxcommandbibliotheca"
version = parent!!.version

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.material)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.accompanist.appcompat.theme)
    implementation(libs.accompanist.systemuicontroller)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.preference)
    implementation(libs.androidx.ui.tooling.preview)

    implementation(libs.koin.core)
    implementation(libs.koin.android)
    implementation(libs.koin.androidx.compose)
    implementation(libs.androidx.foundation)

    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.test.manifest)
    debugImplementation(libs.androidx.ui.tooling)
}

android {
    compileSdk = 34
    defaultConfig {
        applicationId = "com.inspiredandroid.linuxcommandbibliotheca"
        minSdk = 24
        targetSdk = 34
        versionCode = 86
        versionName = project.version.toString()
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
        getByName("debug") {
            isMinifyEnabled = false
        }
    }

    sourceSets["main"].assets.setSrcDirs(listOf("../assets"))

    buildFeatures {
        compose = true
        buildConfig = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.15"
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
