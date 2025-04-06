import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
    id("com.github.ben-manes.versions") version "0.52.0"
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.spotless)
}

buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath(libs.kotlin.gradle.plugin)
        classpath(libs.gradle)
        classpath(libs.gradle.plugin)
    }
}

group = "com.inspiredandroid"
version = "3.3.4"

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.withType<DependencyUpdatesTask> {
    rejectVersionIf {
        isNonStable(candidate.version)
    }
}

configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    kotlin {
        target("**/*.kt")
        ktlint()
            .editorConfigOverride(
                mapOf(
                    "ktlint_standard_no-wildcard-imports" to "disabled",
                    "ktlint_standard_package-name" to "disabled",
                    "ktlint_standard_function-naming" to "disabled",
                    "ktlint_standard_discouraged-comment-location" to "disabled",
                ),
            )
    }
    kotlinGradle {
        target("**/*.gradle.kts")
        ktlint()
    }
}

fun isNonStable(version: String): Boolean {
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { version.uppercase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    val isStable = stableKeyword || regex.matches(version)
    return isStable.not()
}
