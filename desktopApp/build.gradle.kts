import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

// Force consistent Skiko version to resolve native library conflicts
configurations.all {
    resolutionStrategy {
        force("org.jetbrains.skiko:skiko-awt-runtime-macos-arm64:0.9.4.2")
    }
}

group = "com.linuxcommandlibrary"
version = libs.versions.appVersion.get()

kotlin {
    jvm("desktop") {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }

    sourceSets {
        val desktopMain by getting {
            dependencies {
                implementation(project(":composeApp"))
                implementation(project(":common"))
                implementation(compose.desktop.currentOs)
                implementation(libs.koin.core)
                implementation(libs.kotlinx.coroutines.core)
            }

            resources.srcDirs("../assets")
        }
    }
}

compose.desktop {
    application {
        mainClass = "com.linuxcommandlibrary.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb, TargetFormat.Rpm, TargetFormat.AppImage)
            packageName = "LinuxCommandLibrary"
            packageVersion = libs.versions.appVersion.get()

            macOS {
                iconFile.set(project.file("icon.icns"))
            }
            windows {
                iconFile.set(project.file("icon.ico"))
            }
            linux {
                iconFile.set(project.file("icon.png"))
                modules("jdk.security.auth")
            }
        }
    }
}

// Generate index files for asset directories
tasks.register("generateAssetIndexes") {
    doLast {
        val assetsDir = file("../assets")
        listOf("commands", "basics").forEach { dir ->
            val targetDir = file("$assetsDir/$dir")
            if (targetDir.exists()) {
                val files = targetDir.listFiles()?.map { it.name }?.sorted() ?: emptyList()
                file("$targetDir/index.txt").writeText(files.joinToString("\n"))
            }
        }
    }
}

tasks.named("desktopProcessResources") {
    dependsOn("generateAssetIndexes")
}
