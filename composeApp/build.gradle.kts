import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kotlin.serialization)
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
        iosSimulatorArm64(),
    ).forEach {
        it.binaries.framework {
            baseName = "ComposeApp"
            isStatic = true
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":common"))
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.materialIconsExtended)
                implementation(compose.ui)
                implementation(compose.components.resources)
                implementation(libs.kotlinx.coroutines.core)
                implementation(libs.kotlinx.collections.immutable)
                implementation(libs.koin.core)
                implementation(libs.koin.compose)
                implementation(libs.navigation.compose)
                implementation(libs.kotlinx.serialization.core)
            }
        }

        androidMain {
            dependencies {
                implementation(libs.koin.android)
                implementation(libs.koin.androidx.compose)
                implementation(libs.androidx.activity.compose)
                implementation(libs.androidx.preference)
            }
        }

        val desktopMain by getting {
            dependencies {
                implementation(compose.desktop.currentOs)
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

android {
    compileSdk = 36
    namespace = "com.linuxcommandlibrary.app"
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    sourceSets["main"].assets.setSrcDirs(listOf("../assets"))
}

compose.resources {
    publicResClass = true
    packageOfResClass = "com.linuxcommandlibrary.app.resources"
    generateResClass = always
}

// Task to update iOS Info.plist with the app version from libs.versions.toml
tasks.register("updateIosVersion") {
    val appVersion = libs.versions.appVersion.get()
    val infoPlistFile = file("${rootProject.projectDir}/iosApp/iosApp/Info.plist")

    inputs.property("appVersion", appVersion)
    outputs.file(infoPlistFile)

    doLast {
        if (infoPlistFile.exists()) {
            var content = infoPlistFile.readText()
            // Update CFBundleShortVersionString
            content =
                content.replace(
                    Regex("<key>CFBundleShortVersionString</key>\\s*<string>[^<]*</string>"),
                    "<key>CFBundleShortVersionString</key>\n\t<string>$appVersion</string>",
                )
            infoPlistFile.writeText(content)
            println("Updated iOS Info.plist with version $appVersion")
        }
    }
}

// Make iOS framework tasks depend on updateIosVersion
tasks.matching { it.name.contains("link") && it.name.contains("Ios") }.configureEach {
    dependsOn("updateIosVersion")
}
