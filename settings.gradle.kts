pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS) // Enforce centralized repositories
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Linux Command Library"

include(":android", ":common", ":desktop", ":cli")
