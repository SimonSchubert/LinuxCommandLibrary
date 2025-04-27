package com.inspiredandroid.linuxcommandbibliotheca

import android.content.Context
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_YES
import androidx.appcompat.app.AppCompatDelegate.setDefaultNightMode
import androidx.compose.ui.graphics.asAndroidBitmap
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.junit4.createEmptyComposeRule
import androidx.preference.PreferenceManager
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.linuxcommandlibrary.shared.copyDatabase
import com.linuxcommandlibrary.shared.initDatabase
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.java.KoinJavaComponent.inject
import java.io.FileOutputStream

/**
 * Take screenshots of Phone and Tablet.
 * Phone = Pixel 2 1080x1920
 * Tablet 7" = Nexus 7 1200x1920
 *
 * Pull images from device to art folder for readme:
 * run pull_screenshots.sh
 */
@RunWith(AndroidJUnit4::class)
class ComposeScreenshots {

    private lateinit var scenario: ActivityScenario<MainActivity>

    @get:Rule
    val composeTestRule = createEmptyComposeRule()

    @Before
    fun setUp() {
        val context: Context = ApplicationProvider.getApplicationContext()
        copyDatabase(context)
        initDatabase(context)

        val dataManager: com.inspiredandroid.linuxcommandbibliotheca.DataManager by inject(com.inspiredandroid.linuxcommandbibliotheca.DataManager::class.java)
        dataManager.updateDatabaseVersion()

        // Clear bookmarks
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        prefs.edit().putString("KEY_BOOKMARKS", "").apply()

        // Clear files folder
        InstrumentationRegistry.getInstrumentation().targetContext.filesDir.listFiles()?.forEach {
            it.deleteRecursively()
        }
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun takeTabletLightAndDarkScreenshots() {
        takeTabletScreenshots("")
        scenario = ActivityScenario.launch(MainActivity::class.java)
        scenario.onActivity {
            setDefaultNightMode(MODE_NIGHT_YES)
        }
        takeTabletScreenshots("-dark")
    }

    private fun takeTabletScreenshots(prefix: String) {
        // Tips
        composeTestRule.onNodeWithText("Tips").performClick()
        composeTestRule.takeScreenshot("screen-1-tablet$prefix.png")

        // Basics
        composeTestRule.onNodeWithText("Basics").performClick()
        composeTestRule.takeScreenshot("screen-2-tablet$prefix.png")
    }

    @Test
    fun takePhoneLightAndDarkScreenshots() {
        takePhoneScreenshots("")
        scenario = ActivityScenario.launch(MainActivity::class.java)
        scenario.onActivity {
            setDefaultNightMode(MODE_NIGHT_YES)
        }
        takePhoneScreenshots("-dark")
    }

    private fun takePhoneScreenshots(prefix: String) {
        // Command list
        composeTestRule.onNodeWithText("Commands").performClick()

        composeTestRule.onNodeWithContentDescription("Search").performClick()
        composeTestRule.onNodeWithContentDescription("SearchField")
            .performTextInput("mk")

        composeTestRule.takeScreenshot("screen-4$prefix.png")

        // Command detail
        composeTestRule.onNodeWithText("mkdir").performClick()
        composeTestRule.onNodeWithText("SYNOPSIS").performClick()
        composeTestRule.onNodeWithText("DESCRIPTION").performClick()
        composeTestRule.takeScreenshot("screen-1$prefix.png")

        // Basics
        composeTestRule.onNodeWithText("Basics").performClick()
        composeTestRule.onNodeWithText("System information").performClick()
        composeTestRule.takeScreenshot("screen-3$prefix.png")

        // Tips
        composeTestRule.onNodeWithText("Tips").performClick()
        composeTestRule.onNodeWithContentDescription("Scroll")
            .performScrollToNode(hasText("$ [command] --help"))
        composeTestRule.takeScreenshot("screen-2$prefix.png")
    }

    private fun ComposeTestRule.takeScreenshot(file: String) {
        // TODO: Find better way to wait for animations to finish
        runBlocking {
            delay(1000L)
        }
        onRoot()
            .captureToImage()
            .asAndroidBitmap()
            .save(file)
    }

    private fun Bitmap.save(file: String) {
        val path = InstrumentationRegistry.getInstrumentation().targetContext.filesDir.canonicalPath
        FileOutputStream("$path/$file").use { out ->
            compress(Bitmap.CompressFormat.PNG, 100, out)
        }
    }
}
