plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)
}

group = "com.inspiredandroid.linuxcommandbibliotheca"

dependencies {
    implementation(project(":common"))
    implementation(project(":composeApp"))
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.activity.compose)
    implementation(libs.accompanist.appcompat.theme)
    implementation(libs.accompanist.systemuicontroller)

    implementation(libs.koin.core)
    implementation(libs.koin.android)
    implementation(libs.koin.androidx.compose)

    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    androidTestImplementation(libs.androidx.preference)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
    debugImplementation(libs.androidx.compose.ui.tooling)
}

android {
    compileSdk = 36
    defaultConfig {
        applicationId = "com.inspiredandroid.linuxcommandbibliotheca"
        minSdk = 24
        targetSdk = 36
        versionCode =
            libs.versions.androidVersionCode
                .get()
                .toInt()
        versionName = libs.versions.appVersion.get()
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    signingConfigs {
        create("release") {
            val ksFile = System.getenv("KEYSTORE_FILE")
            if (ksFile != null) {
                storeFile = file(ksFile)
                storePassword = System.getenv("KEYSTORE_PASSWORD")
                keyAlias = System.getenv("KEY_ALIAS")
                keyPassword = System.getenv("KEYSTORE_PASSWORD")
            }
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
            )
            signingConfig =
                if (System.getenv("KEYSTORE_FILE") != null) {
                    signingConfigs.getByName("release")
                } else {
                    signingConfigs.getByName("debug")
                }
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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlin {
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
        }
    }
    lint {
        abortOnError = false
    }
    namespace = "com.inspiredandroid.linuxcommandbibliotheca"
}
