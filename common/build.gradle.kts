import org.jetbrains.kotlin.gradle.dsl.JvmTarget

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

    androidTarget {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.runtime)
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        androidMain {
            dependencies {
                implementation(libs.sqldelight.android.driver)
            }
        }
        jvmMain {
            dependencies {
                implementation(libs.sqldelight.sqlite.driver)
            }
        }
    }
}

android {
    compileSdk = 35
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 24
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
