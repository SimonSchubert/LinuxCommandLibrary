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
            kotlin.srcDir(layout.buildDirectory.dir("generated/kotlin"))
        }
        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

// Task to generate Version.kt from libs.versions.toml, into the generated source dir
// registered on commonMain above.
val generateVersionFile =
    tasks.register("generateVersionFile") {
        val appVersion = libs.versions.appVersion.get()
        val outputDir = layout.buildDirectory.dir("generated/kotlin/com/linuxcommandlibrary/shared")

        inputs.property("appVersion", appVersion)
        outputs.dir(outputDir)

        doLast {
            val dir = outputDir.get().asFile
            dir.mkdirs()
            dir.resolve("Version.kt").writeText(
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
