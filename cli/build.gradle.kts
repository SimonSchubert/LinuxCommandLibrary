plugins {
    kotlin("jvm")
}

group = "com.linuxcommandlibrary"
version = parent!!.version

dependencies {
    implementation(project(":common"))
    implementation(libs.sqldelight.sqlite.driver)
}

kotlin {
    compilerOptions {
        sourceSets["main"].apply {
            resources.srcDirs("../assets")
        }
    }
}

val createJar =
    tasks.register("createJar", Jar::class) {
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

tasks.processResources {
    val contents = "version=$version"
    val file = File("cli/src/main/resources", "application.properties")
    file.writeText(contents)
}
