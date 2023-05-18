plugins {
    kotlin("multiplatform")
    application
}

group = "com.linuxcommandlibrary"
version = parent!!.version

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "17"
        }
        withJava()
        compilations {
            val main = getByName("main")
            tasks {
                register<Jar>("buildJar") {
                    group = "application"
                    dependsOn(build)

                    destinationDirectory.set(file("$projectDir/out"))
                    archiveFileName.set("linuxcommandlibrary.jar")

                    duplicatesStrategy = DuplicatesStrategy.INCLUDE
                    exclude("META-INF/*.RSA", "META-INF/*.SF","META-INF/*.DSA")

                    manifest {
                        attributes["Main-Class"] = "com.linuxcommandlibrary.desktop.ConsoleApplicationKt"
                    }
                    from(configurations.getByName("runtimeClasspath").map { if (it.isDirectory) it else zipTree(it) }, main.output.classesDirs)
                    archiveBaseName.set("${project.name}-fat2")
                }
            }
        }
    }

    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":common"))
            }
        }
        val jvmTest by getting
    }
}

tasks.processResources {
    val contents = "version=${version}"
    val file = File("cli/src/jvmMain/resources", "application.properties")
    file.writeText(contents)
}

application {
    mainClass.set("ConsoleApplicationKt")
}
