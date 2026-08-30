package com.linuxcommandlibrary.shared

/**
 * One attribution row on the license screen.
 *
 * Plain [List]s rather than ImmutableList throughout this file: these types cross the SKIE
 * framework boundary and have to bridge to Swift arrays.
 */
data class LicenseEntry(
    val name: String,
    val license: String,
    val copyright: String? = null,
    /** Project or license URL. Null renders a non-tappable informational row. */
    val url: String? = null,
)

data class LicenseGroup(val title: String, val entries: List<LicenseEntry>)

/**
 * Attribution for everything shipped inside the apps: our own license, the content sources, and
 * the third-party libraries linked into the binaries.
 *
 * Rendered by the Compose LicensesScreen and the SwiftUI LicensesView from this single source.
 * Keep [libraries] in sync with gradle/libs.versions.toml when runtime dependencies change -
 * only dependencies that actually ship in the Android/Desktop/iOS apps belong here, so the
 * :cli and :websiteBuilder ones (mordant, org.json, kotlinx.html) are deliberately absent.
 */
object Licenses {

    private const val APACHE_2 = "Apache License 2.0"

    val app = LicenseEntry(
        name = "Linux Command Library",
        license = APACHE_2,
        copyright = "Copyright (c) Simon Schubert",
        url = "https://github.com/SimonSchubert/LinuxCommandLibrary/blob/master/LICENSE",
    )

    private val content = LicenseGroup(
        title = "Content",
        entries = listOf(
            LicenseEntry(
                name = "Man pages",
                license = "Licensed by their respective authors",
                copyright = "Licence information is listed on each command page under Author, " +
                    "Copyright or Licence.",
            ),
            LicenseEntry(
                name = "App icon",
                license = "Designed by letsgokoyo",
                url = "https://letsgokoyo.com",
            ),
            LicenseEntry(
                name = "Material Design Icons",
                license = APACHE_2,
                copyright = "Copyright (c) Google",
                url = "https://github.com/google/material-design-icons",
            ),
            LicenseEntry(
                name = "Share Tech Mono",
                license = "SIL Open Font License 1.1",
                copyright = "Copyright (c) Carrois Apostrophe",
                url = "https://fonts.google.com/specimen/Share+Tech+Mono",
            ),
        ),
    )

    private val libraries = LicenseGroup(
        title = "Libraries",
        entries = listOf(
            LicenseEntry(
                name = "Kotlin",
                license = APACHE_2,
                copyright = "Copyright (c) JetBrains",
                url = "https://github.com/JetBrains/kotlin",
            ),
            LicenseEntry(
                name = "Compose Multiplatform",
                license = APACHE_2,
                copyright = "Copyright (c) JetBrains",
                url = "https://github.com/JetBrains/compose-multiplatform",
            ),
            LicenseEntry(
                name = "Material 3",
                license = APACHE_2,
                copyright = "Copyright (c) The Android Open Source Project",
                url = "https://github.com/androidx/androidx",
            ),
            LicenseEntry(
                name = "Navigation Compose",
                license = APACHE_2,
                copyright = "Copyright (c) The Android Open Source Project",
                url = "https://github.com/JetBrains/compose-multiplatform-core",
            ),
            LicenseEntry(
                name = "AndroidX",
                license = APACHE_2,
                copyright = "Copyright (c) The Android Open Source Project",
                url = "https://github.com/androidx/androidx",
            ),
            LicenseEntry(
                name = "Koin",
                license = APACHE_2,
                copyright = "Copyright (c) Kotzilla and contributors",
                url = "https://github.com/InsertKoinIO/koin",
            ),
            LicenseEntry(
                name = "kotlinx.coroutines",
                license = APACHE_2,
                copyright = "Copyright (c) JetBrains",
                url = "https://github.com/Kotlin/kotlinx.coroutines",
            ),
            LicenseEntry(
                name = "kotlinx.serialization",
                license = APACHE_2,
                copyright = "Copyright (c) JetBrains",
                url = "https://github.com/Kotlin/kotlinx.serialization",
            ),
            LicenseEntry(
                name = "kotlinx.collections.immutable",
                license = APACHE_2,
                copyright = "Copyright (c) JetBrains",
                url = "https://github.com/Kotlin/kotlinx.collections.immutable",
            ),
            LicenseEntry(
                name = "SKIE",
                license = APACHE_2,
                copyright = "Copyright (c) Touchlab",
                url = "https://github.com/touchlab/SKIE",
            ),
        ),
    )

    val groups: List<LicenseGroup> = listOf(content, libraries)
}
