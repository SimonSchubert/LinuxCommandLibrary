import org.jetbrains.kotlin.gradle.dsl.JvmTarget

repositories {
    google()
}

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("app.cash.sqldelight")
}

group = "com.linuxcommandlibrary"

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
            kotlin.srcDir(layout.buildDirectory.dir("generated/src/commonMain/kotlin"))
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
    databases {
        create("CommandDatabase") {
            packageName.set("com.linuxcommandlibrary")
        }
    }
}

class VersionGeneratorPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.afterEvaluate {
            val versionFile =
                layout.buildDirectory
                    .file("generated/src/commonMain/kotlin/com/linuxcommandlibrary/shared/Version.kt")
                    .get()
                    .asFile
            versionFile.parentFile?.mkdirs()
            versionFile.writeText(
                """
                package com.linuxcommandlibrary.shared

                object Version {
                    const val appVersion = "${libs.versions.appVersion.get()}"
                }
                """.trimIndent(),
            )
        }
    }
}

apply<VersionGeneratorPlugin>()
