// import org.jetbrains.compose.compose

repositories {
    google()
}

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("com.squareup.sqldelight")
}

group = "com.linuxcommandlibrary"
version = "1.0"

kotlin {
    android()
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {

            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting {
            dependencies {
                api("androidx.appcompat:appcompat:1.5.1")
                api("androidx.core:core-ktx:1.9.0")
                implementation("com.squareup.sqldelight:android-driver:1.5.4")
            }
        }
        val desktopMain by getting {
            dependencies {
                implementation("com.squareup.sqldelight:sqlite-driver:1.5.4")
            }
            resources.setSrcDirs(listOf("../assets", "../cli/src/jvmMain/resources"))
        }
        val desktopTest by getting
    }
}


android {
    compileSdk = 33
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 24
        targetSdk = 33
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    lint {
        abortOnError = false
    }
    namespace = "com.linuxcommandlibrary.shared"
}

sqldelight {
    database("CommandDatabase") {
        packageName = "com.linuxcommandlibrary"
    }
}