import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

group = "com.linuxcommandlibrary"
version = parent!!.version

kotlin {
    // Linux targets
    linuxX64()
    linuxArm64()

    // macOS targets
    macosX64()
    macosArm64()

    // Windows target
    mingwX64()

    targets.withType<KotlinNativeTarget> {
        binaries {
            executable {
                entryPoint = "com.linuxcommandlibrary.nativecli.main"
                baseName = "lcl"
            }
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":common"))
                implementation(libs.mordant)
            }
            kotlin.srcDir(layout.buildDirectory.dir("generated/kotlin"))
        }
        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        // Platform-specific source sets
        val linuxMain by creating {
            dependsOn(commonMain.get())
        }
        val linuxX64Main by getting {
            dependsOn(linuxMain)
        }
        val linuxArm64Main by getting {
            dependsOn(linuxMain)
        }

        val macosMain by creating {
            dependsOn(commonMain.get())
        }
        val macosX64Main by getting {
            dependsOn(macosMain)
        }
        val macosArm64Main by getting {
            dependsOn(macosMain)
        }

        val mingwMain by creating {
            dependsOn(commonMain.get())
        }
        val mingwX64Main by getting {
            dependsOn(mingwMain)
        }
    }
}

// Task to generate embedded assets as Kotlin source files
val generateEmbeddedAssets =
    tasks.register("generateEmbeddedAssets") {
        val assetsDir = file("../assets")
        val outputDir = layout.buildDirectory.dir("generated/kotlin/com/linuxcommandlibrary/nativecli/data/generated")

        inputs.dir(assetsDir)
        outputs.dir(outputDir)

        doLast {
            val outDir = outputDir.get().asFile
            outDir.mkdirs()

            // Generate commands data
            val commandsDir = file("../assets/commands")
            val commandFiles = commandsDir.listFiles { f -> f.extension == "md" }?.sortedBy { it.name } ?: emptyList()

            // Split commands into chunks to avoid compiler limits (100 commands per chunk)
            val chunkSize = 100
            val commandChunks = commandFiles.chunked(chunkSize)

            commandChunks.forEachIndexed { chunkIndex, chunk ->
                val chunkFileName = "CommandsChunk$chunkIndex.kt"
                val sb = StringBuilder()
                sb.appendLine("package com.linuxcommandlibrary.nativecli.data.generated")
                sb.appendLine()
                sb.appendLine("internal val commandsChunk$chunkIndex: Map<String, String> = mapOf(")

                chunk.forEach { file ->
                    val name = file.nameWithoutExtension
                    val content = file.readText()
                    val escapedContent = escapeKotlinString(content)
                    sb.appendLine("    \"$name\" to \"\"\"$escapedContent\"\"\",")
                }

                sb.appendLine(")")
                file("$outDir/$chunkFileName").writeText(sb.toString())
            }

            // Generate commands index
            val commandsIndexSb = StringBuilder()
            commandsIndexSb.appendLine("package com.linuxcommandlibrary.nativecli.data.generated")
            commandsIndexSb.appendLine()
            commandsIndexSb.appendLine("internal val allCommands: Map<String, String> by lazy {")
            commandsIndexSb.appendLine("    buildMap {")
            commandChunks.forEachIndexed { chunkIndex, _ ->
                commandsIndexSb.appendLine("        putAll(commandsChunk$chunkIndex)")
            }
            commandsIndexSb.appendLine("    }")
            commandsIndexSb.appendLine("}")
            commandsIndexSb.appendLine()
            commandsIndexSb.appendLine("internal val commandNames: List<String> by lazy {")
            commandsIndexSb.appendLine("    allCommands.keys.sorted()")
            commandsIndexSb.appendLine("}")
            file("$outDir/CommandsIndex.kt").writeText(commandsIndexSb.toString())

            // Generate basics data
            val basicsDir = file("../assets/basics")
            val basicFiles = basicsDir.listFiles { f -> f.extension == "md" }?.sortedBy { it.name } ?: emptyList()

            val basicsSb = StringBuilder()
            basicsSb.appendLine("package com.linuxcommandlibrary.nativecli.data.generated")
            basicsSb.appendLine()
            basicsSb.appendLine("internal val basicsData: Map<String, String> = mapOf(")

            basicFiles.forEach { file ->
                val id = file.nameWithoutExtension
                val content = file.readText()
                val escapedContent = escapeKotlinString(content)
                basicsSb.appendLine("    \"$id\" to \"\"\"$escapedContent\"\"\",")
            }

            basicsSb.appendLine(")")
            file("$outDir/BasicsData.kt").writeText(basicsSb.toString())

            // Generate tips data
            val tipsFile = file("../assets/tips.md")
            val tipsContent = tipsFile.readText()
            val escapedTips = escapeKotlinString(tipsContent)

            val tipsSb = StringBuilder()
            tipsSb.appendLine("package com.linuxcommandlibrary.nativecli.data.generated")
            tipsSb.appendLine()
            tipsSb.appendLine("internal val tipsData: String = \"\"\"$escapedTips\"\"\"")
            file("$outDir/TipsData.kt").writeText(tipsSb.toString())

            println("Generated embedded assets: ${commandFiles.size} commands, ${basicFiles.size} basics, 1 tips file")
        }
    }

fun escapeKotlinString(s: String): String =
    s
        .replace("$", "\${'$'}")
        .replace("\"\"\"", "\"\"\${'\"'}")

// Make compilation depend on asset generation
tasks.matching { it.name.contains("compileKotlin") || (it.name.contains("Kotlin") && it.name.contains("compile")) }.configureEach {
    dependsOn(generateEmbeddedAssets)
}
