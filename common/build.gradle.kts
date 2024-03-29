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
    androidTarget()
    jvm()

    sourceSets {
        commonMain {
            dependencies {
                implementation("com.squareup.sqldelight:runtime:1.5.5")
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        androidMain {
            dependencies {
                implementation("com.squareup.sqldelight:android-driver:1.5.5")
            }
        }
        jvmMain {
            dependencies {
                implementation("com.squareup.sqldelight:sqlite-driver:1.5.5")
            }
        }
    }
}

android {
    compileSdk = 34
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 24
        targetSdk = 34
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
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