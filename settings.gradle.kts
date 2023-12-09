pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {
        kotlin("multiplatform") version "1.9.21"
    }
}
rootProject.name = "Linux Command Library"


include(":android", ":common", ":desktop", ":cli")