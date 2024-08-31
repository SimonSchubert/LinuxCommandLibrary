package com.inspiredandroid.linuxcommandbibliotheca

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createEmptyComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import androidx.preference.PreferenceManager
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.linuxcommandlibrary.shared.initDatabase
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

    private lateinit var scenario: ActivityScenario<MainActivity>

    @get:Rule
    val composeTestRule = createEmptyComposeRule()

    @Before
    fun setUp() {
        val context: Context = ApplicationProvider.getApplicationContext()
        initDatabase(context)

        // Clear bookmarks
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        prefs.edit().putString("KEY_BOOKMARKS", "").apply()
    }

    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        scenario = ActivityScenario.launch(intent)
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

        composeTestRule.onNodeWithContentDescription("Back").performClick()
        composeTestRule.onNodeWithContentDescription("TopAppBarTitle")
            .assertTextEquals("Commands")
    }

    @Test
    fun testCommandDetail() {
        openUrl("https://linuxcommandlibrary.com/man/2048")

        composeTestRule.onNodeWithContentDescription("TopAppBarTitle")
            .assertTextEquals("2048")
    }
}
