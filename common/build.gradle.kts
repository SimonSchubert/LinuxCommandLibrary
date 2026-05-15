import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
}

group = "com.linuxcommandlibrary"

kotlin {
    android {
        namespace = "com.linuxcommandlibrary.shared"
        compileSdk =
            libs.versions.android.compileSdk
                .get()
                .toInt()
        minSdk =
            libs.versions.android.minSdk
                .get()
                .toInt()
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
        withHostTest {}
    }
    jvm("desktop") {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }

    listOf(
        iosArm64(),
        iosSimulatorArm64(),
    ).forEach {
        it.binaries.framework {
            baseName = "common"
            isStatic = true
        }
    }

    // Native CLI targets
    linuxX64()
    linuxArm64()
    macosX64()
    macosArm64()
    mingwX64()

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.kotlinx.collections.immutable)
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
            |    const val APP_VERSION = "$appVersion"
            |}
            |
            """.trimMargin(),
        )
        println("Generated Version.kt with version $appVersion")
    }
}

// Make compilation depend on version generation
tasks
    .matching {
        it.name.contains("compileKotlin") ||
            (it.name.contains("Kotlin") && it.name.contains("compile")) ||
            it.name == "compileAndroidMain"
    }.configureEach {
        dependsOn(generateVersionFile)
    }
