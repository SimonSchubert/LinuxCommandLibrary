import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.skie)
}

group = "com.linuxcommandlibrary"

kotlin {
    android {
        namespace = "com.linuxcommandlibrary.app.viewmodels"
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
            baseName = "ComposeApp"
            isStatic = true
            export(project(":common"))
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                api(project(":common"))
                api(libs.kotlinx.coroutines.core)
                api(libs.kotlinx.collections.immutable)
                api(libs.koin.core)
            }
        }

        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        androidMain {
            dependencies {
                implementation(libs.androidx.preference)
                implementation(libs.koin.android)
            }
        }

        val desktopMain by getting {
            dependencies {
            }
        }
    }
}

// Regenerate iOS Asset Catalog imagesets whenever /icons/ changes.
// Runs scripts/svg_to_imageset.py which builds iosApp/iosApp/Assets.xcassets/Icons/
val syncIconImageSets by tasks.registering(Exec::class) {
    val scriptFile = rootProject.file("scripts/svg_to_imageset.py")
    val sourceDir = rootProject.file("icons")
    val outputDir = rootProject.file("iosApp/iosApp/Assets.xcassets/Icons")
    inputs.file(scriptFile)
    inputs.dir(sourceDir)
    outputs.dir(outputDir)
    commandLine("python3", scriptFile.absolutePath, sourceDir.absolutePath, outputDir.absolutePath)
}

// Update iOS Info.plist with the app version from libs.versions.toml
tasks.register("updateIosVersion") {
    val appVersion = libs.versions.appVersion.get()
    val infoPlistFile = file("${rootProject.projectDir}/iosApp/iosApp/Info.plist")

    inputs.property("appVersion", appVersion)
    outputs.file(infoPlistFile)

    doLast {
        if (infoPlistFile.exists()) {
            var content = infoPlistFile.readText()
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

// Tie iOS framework link to imageset sync + version update
tasks.matching { it.name.startsWith("link") && it.name.contains("Ios") }.configureEach {
    dependsOn(syncIconImageSets)
    dependsOn("updateIosVersion")
}
