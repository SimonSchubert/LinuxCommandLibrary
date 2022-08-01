plugins {
    kotlin("multiplatform")
    application
}

group = "com.linuxcommandlibrary"
version = "1.0"


kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
        withJava()
        compilations {
            val main = getByName("main")
            tasks {
                register<Jar>("buildFatJar2") {
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

application {
    mainClass.set("ConsoleApplicationKt")
}
