package com.inspiredandroid.linuxcommandbibliotheca

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.activity.compose.setContent
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.platform.WindowInfo
import androidx.compose.ui.test.assertCountEquals
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onAllNodesWithContentDescription
import androidx.compose.ui.test.onAllNodesWithText
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.linuxcommandlibrary.app.App
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Test if deeplinks from/to website open correct screens. If test started the first time
 * "Always open urls with app" dialog has to be accepted. Or the app has to be signed with the
 * release key for autoVerify to take effect.
 */
@RunWith(AndroidJUnit4::class)
class ComposeDeeplinkTests {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Before
    fun setUp() {
        val context: Context = ApplicationProvider.getApplicationContext()

        // Clear bookmarks
        val prefs = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context)
        prefs.edit().putString("KEY_BOOKMARKS", "").apply()
    }

    private fun openUrl(url: String) {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            .setPackage(context.packageName)

        composeTestRule.activityRule.scenario.onActivity { activity ->
            activity.startActivity(intent)
        }
        composeTestRule.waitForIdle()
    }

    @Test
    fun testBasicCategories() {
        openUrl("https://linuxcommandlibrary.com/basics")

        composeTestRule.onNodeWithContentDescription("TopAppBarTitle")
            .assertTextEquals("Basics")
    }

    @Test
    fun testBasicCategory() {
        openUrl("https://linuxcommandlibrary.com/basic/usersgroups")

        composeTestRule.onNodeWithContentDescription("TopAppBarTitle")
            .assertTextEquals("Users & Groups")
    }

    @Test
    fun testTips() {
        openUrl("https://linuxcommandlibrary.com/tips")

        composeTestRule.onNodeWithContentDescription("TopAppBarTitle")
            .assertTextEquals("Tips")
    }

    @Test
    fun testCommandList() {
        openUrl("https://linuxcommandlibrary.com/")

        composeTestRule.onNodeWithContentDescription("TopAppBarTitle")
            .assertTextEquals("Commands")
    }

    @Test
    fun testCommandListDoesNotSelectFirstCommandOnExpandedLayout() {
        // Pretend the window is tablet sized so the two-pane list/detail layout is used.
        composeTestRule.runOnUiThread {
            composeTestRule.activity.setContent {
                val windowInfo = LocalWindowInfo.current
                val density = LocalDensity.current
                val expandedWindowInfo = remember(windowInfo, density) {
                    object : WindowInfo by windowInfo {
                        override val containerSize: IntSize
                            get() = with(density) { IntSize(1280.dp.roundToPx(), 800.dp.roundToPx()) }
                    }
                }
                CompositionLocalProvider(LocalWindowInfo provides expandedWindowInfo) {
                    App(initialDeeplink = "https://linuxcommandlibrary.com/")
                }
            }
        }

        // Wait for the command list to load before checking that nothing got selected.
        composeTestRule.waitUntil(timeoutMillis = 10_000) {
            composeTestRule.onAllNodesWithText("2048").fetchSemanticsNodes().isNotEmpty()
        }
        composeTestRule.waitForIdle()

        composeTestRule.onNodeWithText("Select a command").assertIsDisplayed()
        composeTestRule.onAllNodesWithContentDescription("Search in page")
            .assertCountEquals(0)
    }

    @Test
    fun testCommandDetail() {
        openUrl("https://linuxcommandlibrary.com/man/2048")

        composeTestRule.onNodeWithContentDescription("TopAppBarTitle")
            .assertTextEquals("2048")
    }
}
