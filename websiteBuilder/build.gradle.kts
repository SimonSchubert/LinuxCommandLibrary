plugins {
    kotlin("jvm")
}

group = "com.linuxcommandlibrary"
version = "1.0"

dependencies {
    implementation(project(":common"))
    implementation(libs.kotlinx.html.jvm)
    implementation(libs.json)
    implementation(libs.kotlinx.collections.immutable)
}

kotlin {
    compilerOptions {
        sourceSets["main"].apply {
            resources.srcDirs("../assets")
        }
    }
}

tasks.register<JavaExec>("runFdroidInfoBuilder") {
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.linuxcommandlibrary.desktop.FdroiInfoBuilderKt")
    workingDir = rootProject.projectDir
}

tasks.register<JavaExec>("runMarkdownBuilder") {
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.linuxcommandlibrary.desktop.MarkdownBuilderKt")
    workingDir = rootProject.projectDir
}

tasks.register<JavaExec>("runWebsiteBuilder") {
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.linuxcommandlibrary.desktop.WebsiteBuilderKt")
    workingDir = rootProject.projectDir
}
