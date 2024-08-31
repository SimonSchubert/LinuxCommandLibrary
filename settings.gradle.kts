pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {
        kotlin("multiplatform") version "2.0.20"
    }
}
rootProject.name = "Linux Command Library"


include(":android", ":common", ":desktop", ":cli")