import org.jetbrains.kotlin.gradle.dsl.JvmTarget

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools:sdk-common:31.10.0")
    }
}

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kotlin.serialization)
}

group = "com.linuxcommandlibrary"

kotlin {
    android {
        namespace = "com.linuxcommandlibrary.app"
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
        androidResources {
            enable = true
        }
    }

    jvm("desktop") {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                api(project(":viewmodels"))
                api(project(":ai"))
                implementation(libs.compose.runtime)
                implementation(libs.compose.foundation)
                implementation(libs.compose.material3)
                implementation(libs.compose.material3.adaptive.navigation.suite)
                implementation(libs.compose.material3.adaptive)
                implementation(libs.compose.material3.adaptive.layout)
                implementation(libs.compose.material3.adaptive.navigation)
                implementation(libs.compose.ui)
                implementation(libs.compose.ui.backhandler)
                implementation(libs.compose.components.resources)
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
    }
}

composeCompiler {
    stabilityConfigurationFiles.add(project.layout.projectDirectory.file("stability_config.conf"))
}

compose.resources {
    publicResClass = true
    packageOfResClass = "com.linuxcommandlibrary.app.resources"
    generateResClass = always
}

// Convert /icons/*.svg into Android Vector Drawable XMLs for Compose Resources.
// Android's painterResource cannot load SVG, only XML drawables. The iOS Asset Catalog
// is regenerated separately by :viewmodels:syncIconImageSets (which feeds the Xcode build).
// Generated XMLs in composeResources/drawable are gitignored build artifacts.
val convertIconsToVectorDrawables by tasks.registering {
    val srcDir = rootProject.file("icons")
    val xmlOutDir = file("src/commonMain/composeResources/drawable")

    inputs.dir(srcDir)
    // xmlOutDir intentionally omitted from outputs — it also contains tracked raster files
    // (webp/png) that this task must not touch.

    doLast {
        xmlOutDir.mkdirs()
        val svgs = srcDir.listFiles { f -> f.extension == "svg" }?.sortedBy { it.name } ?: emptyList()
        val sourceNames = svgs.map { it.nameWithoutExtension }.toSet()
        var failed = 0

        svgs.forEach { svg ->
            val xmlOut = xmlOutDir.resolve("${svg.nameWithoutExtension}.xml")
            val errors =
                xmlOut.outputStream().use { out ->
                    com.android.ide.common.vectordrawable.Svg2Vector
                        .parseSvgToXml(svg.toPath(), out)
                }
            if (errors.isNotEmpty()) {
                logger.warn("[convertIcons] ${svg.name}: $errors")
                if (errors.contains("ERROR", ignoreCase = true)) failed++
            }
        }

        // Prune XMLs whose source SVG was deleted.
        xmlOutDir.listFiles { f -> f.extension == "xml" }?.forEach { f ->
            if (f.nameWithoutExtension !in sourceNames) {
                f.delete()
                logger.lifecycle("[convertIcons] removed stale: ${f.name}")
            }
        }

        logger.lifecycle("[convertIcons] generated ${svgs.size} XML drawables" + if (failed > 0) " ($failed failed)" else "")
    }
}

tasks
    .matching {
        val n = it.name
        n.startsWith("prepareComposeResourcesTask") ||
            n.startsWith("generateResourceAccessors") ||
            n.startsWith("generateActualResourceCollectors") ||
            n.startsWith("generateExpectResourceCollectors") ||
            n.startsWith("convertXmlValueResources") ||
            n.startsWith("copyNonXmlValueResources")
    }.configureEach {
        dependsOn(convertIconsToVectorDrawables)
    }

// Task to regenerate assets/commands/index.txt from the .md files in that directory
tasks.register("updateCommandIndex") {
    val commandsDir = file("${rootProject.projectDir}/assets/commands")
    val indexFile = file("$commandsDir/index.txt")

    inputs.dir(commandsDir)
    outputs.file(indexFile)

    doLast {
        val entries =
            commandsDir
                .listFiles { f -> f.extension == "md" }
                ?.map { it.name }
                ?.sorted()
                ?: emptyList()
        indexFile.writeText(entries.joinToString("\n") + "\n")
        println("Updated commands/index.txt with ${entries.size} entries")
    }
}
