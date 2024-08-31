plugins {
    kotlin("jvm")
}

group = "com.linuxcommandlibrary"
version = "1.0"

dependencies {
    implementation(project(":common"))
    implementation(libs.kotlinx.html.jvm)
    implementation(libs.json)
    implementation(libs.sqldelight.sqlite.driver)
    implementation(libs.kotlinx.coroutines.core)
}

kotlin {
    compilerOptions {
        sourceSets["main"].apply {
            resources.srcDirs("../assets")
        }
    }
}