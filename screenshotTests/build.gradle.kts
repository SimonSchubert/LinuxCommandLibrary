plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.paparazzi)
}

kotlin {
    jvmToolchain(21)
}

android {
    namespace = "com.linuxcommandlibrary.app.screenshots"
    compileSdk =
        libs.versions.android.compileSdk
            .get()
            .toInt()

    defaultConfig {
        minSdk =
            libs.versions.android.minSdk
                .get()
                .toInt()
    }

    sourceSets {
        getByName("main") {
            assets.directories.add(
                "${project(":composeApp").projectDir}/build/generated/compose/resourceGenerator/preparedResources/commonMain",
            )
        }
    }
}

val preparePaparazzi by tasks.registering {
    dependsOn(":composeApp:prepareComposeResourcesTaskForCommonMain")
    dependsOn(":composeApp:copyNonXmlValueResourcesForCommonMain")
    dependsOn(":composeApp:convertXmlValueResourcesForCommonMain")
}

tasks
    .matching {
        it.name.startsWith("testDebug") ||
            (it.name.startsWith("merge") && it.name.endsWith("Assets"))
    }.configureEach {
        dependsOn(preparePaparazzi)
    }

tasks.withType<Test>().configureEach {
    reports.html.required.set(false)
}

val snapshotsDir = layout.projectDirectory.dir("src/test/snapshots/images")
val artDir = layout.projectDirectory.dir("../art")
val fastlanePhone = layout.projectDirectory.dir("../fastlane/metadata/android/en-US/images/phoneScreenshots")
val fastlaneTablet = layout.projectDirectory.dir("../fastlane/metadata/android/en-US/images/tenInchScreenshots")
val fastlaneSmallTablet = layout.projectDirectory.dir("../fastlane/metadata/android/en-US/images/sevenInchScreenshots")

tasks.register("updateScreenshots") {
    dependsOn("recordPaparazziDebug")

    val snapshotsDirFile = snapshotsDir.asFile
    val artDirFile = artDir.asFile
    val fastlanePhoneFile = fastlanePhone.asFile
    val fastlaneTabletFile = fastlaneTablet.asFile
    val fastlaneSmallTabletFile = fastlaneSmallTablet.asFile

    doLast {
        val phoneMap =
            mapOf(
                "screen01_openclaw" to "01",
                "screen02_tips" to "02",
                "screen03_systemInfo" to "03",
                "screen04_search" to "04",
                "screen05_basics" to "05",
                "screen06_commands" to "06",
            )

        val allSnapshots = snapshotsDirFile.listFiles()?.toList().orEmpty()

        fastlanePhoneFile.mkdirs()
        fastlaneTabletFile.mkdirs()
        fastlaneSmallTabletFile.mkdirs()

        phoneMap.forEach { (testName, fastlaneNumber) ->
            val phoneSnap =
                allSnapshots.firstOrNull { it.name.endsWith("_PhoneScreenshotTest_$testName.png") }
                    ?: error("Missing phone snapshot for $testName")
            phoneSnap.copyTo(fastlanePhoneFile.resolve("$fastlaneNumber.png"), overwrite = true)
            println("Phone -> fastlane/$fastlaneNumber.png")

            val tabletSnap =
                allSnapshots.firstOrNull { it.name.endsWith("_TabletScreenshotTest_$testName.png") }
                    ?: error("Missing tablet snapshot for $testName")
            tabletSnap.copyTo(fastlaneTabletFile.resolve("$fastlaneNumber.png"), overwrite = true)
            println("Tablet -> fastlane/$fastlaneNumber.png")

            val smallTabletSnap =
                allSnapshots.firstOrNull { it.name.endsWith("_SmallTabletScreenshotTest_$testName.png") }
                    ?: error("Missing 7\" tablet snapshot for $testName")
            smallTabletSnap.copyTo(fastlaneSmallTabletFile.resolve("$fastlaneNumber.png"), overwrite = true)
            println("7\" Tablet -> fastlane/$fastlaneNumber.png")
        }

        // README art: phone 01,02 -> screen-android-{1,2}.png; tablet 01,02 -> screen-tablet-{1,2}.png
        fastlanePhoneFile.resolve("01.png").copyTo(artDirFile.resolve("screen-android-1.png"), overwrite = true)
        fastlanePhoneFile.resolve("02.png").copyTo(artDirFile.resolve("screen-android-2.png"), overwrite = true)
        fastlaneTabletFile.resolve("01.png").copyTo(artDirFile.resolve("screen-tablet-1.png"), overwrite = true)
        fastlaneTabletFile.resolve("02.png").copyTo(artDirFile.resolve("screen-tablet-2.png"), overwrite = true)
        println("README art images updated")
    }
}

dependencies {
    implementation(project(":composeApp"))
    testImplementation(libs.compose.runtime)
    testImplementation(libs.compose.material3)
    testImplementation(libs.compose.foundation)
    testImplementation(libs.compose.ui)
    testImplementation(libs.compose.components.resources)
    testImplementation(libs.kotlinx.collections.immutable)
    testImplementation(libs.koin.core)
    testImplementation(libs.koin.compose)
    testImplementation(libs.androidx.lifecycle.viewmodel.compose)
    testImplementation(libs.androidx.lifecycle.runtime.compose)
    testImplementation(libs.androidx.savedstate.compose)
}
