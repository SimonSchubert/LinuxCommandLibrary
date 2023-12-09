plugins {
    kotlin("jvm")
}

group = "com.linuxcommandlibrary"
version = "1.0"

dependencies {
    implementation(project(":common"))
    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.9.1")
    implementation("org.json:json:20231013")
    implementation("com.squareup.sqldelight:sqlite-driver:1.5.5")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
}

kotlin {
    compilerOptions {
        sourceSets["main"].apply {
            resources.srcDirs("../assets")
        }
    }
}