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
            // Local so the action doesn't capture the script object (configuration cache).
            fun escapeKotlinString(s: String): String =
                s
                    .replace("$", "\${'$'}")
                    .replace("\"\"\"", "\"\"\${'\"'}")

            val outDir = outputDir.get().asFile
            outDir.mkdirs()

            // Generate commands data
            val commandsDir = assetsDir.resolve("commands")
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
                outDir.resolve(chunkFileName).writeText(sb.toString())
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
            outDir.resolve("CommandsIndex.kt").writeText(commandsIndexSb.toString())

            // Generate basics data
            val basicsDir = assetsDir.resolve("basics")
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
            outDir.resolve("BasicsData.kt").writeText(basicsSb.toString())

            // Generate tips data
            val tipsFile = assetsDir.resolve("tips.md")
            val tipsContent = tipsFile.readText()
            val escapedTips = escapeKotlinString(tipsContent)

            val tipsSb = StringBuilder()
            tipsSb.appendLine("package com.linuxcommandlibrary.nativecli.data.generated")
            tipsSb.appendLine()
            tipsSb.appendLine("internal val tipsData: String = \"\"\"$escapedTips\"\"\"")
            outDir.resolve("TipsData.kt").writeText(tipsSb.toString())

            println("Generated embedded assets: ${commandFiles.size} commands, ${basicFiles.size} basics, 1 tips file")
        }
    }

// Make compilation depend on asset generation
tasks.matching { it.name.contains("compileKotlin") || (it.name.contains("Kotlin") && it.name.contains("compile")) }.configureEach {
    dependsOn(generateEmbeddedAssets)
}
