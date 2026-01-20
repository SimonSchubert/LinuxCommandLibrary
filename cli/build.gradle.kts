plugins {
    kotlin("jvm")
}

group = "com.linuxcommandlibrary"
version = parent!!.version

dependencies {
    implementation(project(":common"))
}

kotlin {
    compilerOptions {
        sourceSets["main"].apply {
            resources.srcDirs("../assets", layout.buildDirectory.dir("generated/resources"))
        }
    }
}

// Generate index files listing all commands and basics
val generateIndexFiles = tasks.register("generateIndexFiles") {
    val assetsDir = file("../assets")
    val outputDir = layout.buildDirectory.dir("generated/resources")

    inputs.dir(assetsDir)
    outputs.dir(outputDir)

    doLast {
        val outDir = outputDir.get().asFile
        outDir.mkdirs()

        // Generate commands index
        val commandsDir = file("../assets/commands")
        val commandsIndex = commandsDir.listFiles { f -> f.extension == "md" }
            ?.map { it.nameWithoutExtension }
            ?.sorted()
            ?.joinToString("\n") ?: ""
        file("${outDir}/commands.index").writeText(commandsIndex)

        // Generate basics index
        val basicsDir = file("../assets/basics")
        val basicsIndex = basicsDir.listFiles { f -> f.extension == "md" }
            ?.map { it.nameWithoutExtension }
            ?.sorted()
            ?.joinToString("\n") ?: ""
        file("${outDir}/basics.index").writeText(basicsIndex)
    }
}

tasks.named("processResources") {
    dependsOn(generateIndexFiles)
}

val createJar =
    tasks.register("createJar", Jar::class) {
        dependsOn(generateIndexFiles)
        archiveBaseName.set("MyApplication")
        from(sourceSets["main"].output)

        archiveFileName.set("linuxcommandlibrary.jar")
        manifest {
            attributes["Main-Class"] = "com.linuxcommandlibrary.cli.ConsoleApplicationKt"
        }
        from(configurations.getByName("runtimeClasspath").map { if (it.isDirectory) it else zipTree(it) })

        duplicatesStrategy = DuplicatesStrategy.INCLUDE
        exclude("META-INF/*.RSA", "META-INF/*.SF", "META-INF/*.DSA")
    }
