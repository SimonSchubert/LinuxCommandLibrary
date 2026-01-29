import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
}

group = "com.linuxcommandlibrary"

kotlin {
    androidTarget {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }
    jvm("desktop") {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "common"
            isStatic = true
        }
    }

    sourceSets {
        commonMain {
            dependencies {
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        androidMain {
            dependencies {
            }
        }
        val desktopMain by getting {
            dependencies {
            }
        }
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain.get())
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
    }
}

// Task to generate Version.kt from libs.versions.toml
val generateVersionFile by tasks.registering {
    val appVersion = libs.versions.appVersion.get()
    val outputDir = file("src/commonMain/kotlin/com/linuxcommandlibrary/shared")
    val outputFile = file("$outputDir/Version.kt")

    inputs.property("appVersion", appVersion)
    outputs.file(outputFile)

    doLast {
        outputDir.mkdirs()
        outputFile.writeText(
            """
            |package com.linuxcommandlibrary.shared
            |
            |object Version {
            |    const val appVersion = "$appVersion"
            |}
            |""".trimMargin()
        )
        println("Generated Version.kt with version $appVersion")
    }
}

// Make compilation depend on version generation
tasks.matching { it.name.contains("compileKotlin") || it.name.contains("Kotlin") && it.name.contains("compile") }.configureEach {
    dependsOn(generateVersionFile)
}

android {
    compileSdk = 36
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
