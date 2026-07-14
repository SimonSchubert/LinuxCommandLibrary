import java.io.File

plugins {
    alias(libs.plugins.spotless)
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.compose.multiplatform) apply false
    alias(libs.plugins.paparazzi) apply false
}

group = "com.inspiredandroid"

// Discover swiftformat in the usual Homebrew locations. Skip Swift formatting
// silently on machines that don't have it (e.g. Linux CI doing Android-only builds).
val swiftformatPath: String? =
    listOf(
        "/opt/homebrew/bin/swiftformat",
        "/usr/local/bin/swiftformat",
    ).firstOrNull { File(it).exists() }

// Regenerates assets/{commands,basics}/index.txt, the file list every AssetReader loads at
// runtime. The index is committed because the Xcode build copies assets/ as a folder reference
// and never runs Gradle, so this is a maintenance task: run it after adding or removing a .md
// file, then commit the result. Only the .md files are declared as inputs; the index lives in
// the same directory and would otherwise dirty the task's own input snapshot.
tasks.register("generateAssetIndexes") {
    val assetDirs = listOf("commands", "basics").map { file("assets/$it") }

    inputs.files(assetDirs.map { fileTree(it) { include("*.md") } })
    outputs.files(assetDirs.map { it.resolve("index.txt") })

    doLast {
        assetDirs.forEach { dir ->
            val names = dir.listFiles { f -> f.extension == "md" }?.map { it.name }?.sorted() ?: emptyList()
            dir.resolve("index.txt").writeText(names.joinToString("\n") + "\n")
            logger.lifecycle("Updated ${dir.name}/index.txt with ${names.size} entries")
        }
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

    if (swiftformatPath != null) {
        format("swift") {
            target("iosApp/**/*.swift")
            targetExclude("iosApp/**/.build/**", "iosApp/**/Pods/**", "iosApp/**/build/**")
            nativeCmd(
                "swiftformat",
                swiftformatPath,
                emptyList(),
            )
        }
    } else {
        logger.lifecycle(
            "Spotless: swiftformat not found in /opt/homebrew/bin or /usr/local/bin — Swift formatting skipped. " +
                "Install with: brew install swiftformat",
        )
    }
}
