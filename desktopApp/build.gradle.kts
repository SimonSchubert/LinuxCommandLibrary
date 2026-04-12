import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.compose.desktop.application.tasks.AbstractProguardTask
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

group = "com.linuxcommandlibrary"
version = libs.versions.appVersion.get()

// Replace the ProGuard tool classpath with one that resolves kotlin-metadata-jvm
// at the Kotlin version we're building against. Compose Multiplatform 1.10.3 ships
// ProGuard 7.7.0 with kotlin-metadata-jvm 2.1.0 (caps at metadata format 2.2) which
// can't read `.kotlin_module` files from Kotlin 2.3.x builds, both ours and third
// party deps like koin-compose 4.2.0. Letting Gradle resolve both deps together
// avoids the split classpath we'd get from just prepending.
val proguardClasspath =
    configurations
        .detachedConfiguration(
            dependencies.create("com.guardsquare:proguard-gradle:7.7.0"),
            dependencies.create("org.jetbrains.kotlin:kotlin-metadata-jvm:${libs.versions.kotlin.get()}"),
        ).apply {
            resolutionStrategy.force("org.jetbrains.kotlin:kotlin-metadata-jvm:${libs.versions.kotlin.get()}")
            resolutionStrategy.force("org.jetbrains.kotlin:kotlin-stdlib:${libs.versions.kotlin.get()}")
        }

afterEvaluate {
    tasks.withType<AbstractProguardTask>().configureEach {
        proguardFiles.setFrom(proguardClasspath)
    }
}

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

        buildTypes.release.proguard {
            configurationFiles.from(project.file("desktop-rules.pro"))
            obfuscate.set(false)
            optimize.set(true)
        }

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
                val files =
                    targetDir
                        .listFiles { f -> f.extension == "md" }
                        ?.map { it.name }
                        ?.sorted() ?: emptyList()
                file("$targetDir/index.txt").writeText(files.joinToString("\n") + "\n")
            }
        }
    }
}

tasks.named("desktopProcessResources") {
    dependsOn("generateAssetIndexes")
}
