import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.sqldelight)
}

group = "com.linuxcommandlibrary"

kotlin {
    androidLibrary {
        namespace = "com.linuxcommandlibrary.shared"
        compileSdk = 35
        minSdk = 24
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
        lint {
            abortOnError = false
        }
    }
    jvm()

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
