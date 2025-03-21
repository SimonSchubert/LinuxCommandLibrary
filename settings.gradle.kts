pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}
rootProject.name = "Linux Command Library"

include(":android", ":common", ":desktop", ":cli")
