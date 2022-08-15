package com.inspiredandroid.linuxcommandbibliotheca

import android.content.Context
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.preference.PreferenceManager
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.initDatabase
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Test for navigation, search and booksmarks. More tests to come
 */
@RunWith(AndroidJUnit4::class)
class ComposeScreenshots {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setUp() {
        val context: Context = ApplicationProvider.getApplicationContext()
        initDatabase(context)

        // Clear bookmarks
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        prefs.edit().putString("KEY_BOOKMARKS", "").apply()

        composeTestRule.setContent { LinuxApp() }
    }

    /**
     * Click though BottomNavigationBar and assert that TopAppBar titles are correct
     */
    @Test
    fun testBottomNavigation() {
        composeTestRule.onNodeWithText("Tips").performClick()
        composeTestRule.onNodeWithContentDescription("TopAppBarTitle").assertTextEquals("Tips")
        composeTestRule.onNodeWithText("Commands").performClick()
        composeTestRule.onNodeWithContentDescription("Back").performClick()
        composeTestRule.onNodeWithContentDescription("TopAppBarTitle").assertTextEquals("Commands")
        composeTestRule.onNodeWithText("Basics").performClick()
        composeTestRule.onNodeWithContentDescription("TopAppBarTitle").assertTextEquals("Basics")
    }

    /**
     * Test if info is shown when search for a command that doesn't exist and if command description
     * is shown when search for an existing command
     */
    @Test
    fun testSearch() {
        composeTestRule.onNodeWithText("Commands").performClick()

        // Search for a command that doesn't exist
        composeTestRule.onNodeWithContentDescription("SearchField")
            .performTextInput("CommandThatDoesn'tExist")
        composeTestRule.onNodeWithText("404 command not found").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("SearchField").performTextClearance()

        // Search for an existing command
        val firstCommand = databaseHelper.getCommand("2048")!!
        composeTestRule.onNodeWithContentDescription("SearchField")
            .performTextInput(firstCommand.name)
        composeTestRule.onNodeWithText(firstCommand.description).assertIsDisplayed()
    }

    /**
     * Test if bookmarks in command detail and command list are shown correctly
     */
    @Test
    fun testBookmarks() {
        val firstCommand = databaseHelper.getCommands().first()

        composeTestRule.onNodeWithText("Commands").performClick()

        // Search for first command and go to command detail screen
        composeTestRule.onNodeWithContentDescription("SearchField")
            .performTextInput(firstCommand.name)
        composeTestRule.onNodeWithText(firstCommand.description).performClick()

        // Click bookmark icon and check if icon/contentDescription changed
        composeTestRule.onNodeWithContentDescription("Bookmark").performClick()
        composeTestRule.onNodeWithContentDescription("Bookmarked").assertIsDisplayed()

        // Go back to search/list and check if bookmark icon is visible
        composeTestRule.onNodeWithContentDescription("Back").performClick()
        composeTestRule.onNodeWithContentDescription("Bookmarked").assertIsDisplayed()
    }

    @Test
    fun testBasicsScreen() {
        val firstBasicCategory = databaseHelper.getBasics().first()

        // Click on first category
        composeTestRule.onNodeWithText(firstBasicCategory.title).performClick()
        composeTestRule.onNodeWithContentDescription("TopAppBarTitle")
            .assertTextEquals(firstBasicCategory.title)

        val basicGroup = databaseHelper.getBasicGroups(firstBasicCategory.id).first()

        // Click on first group
        composeTestRule.onNodeWithText(basicGroup.description).performClick()

        // Check if commands of group expanded and therefore share icon(s) are visible
        composeTestRule.onAllNodesWithContentDescription("Share").assertAny(isEnabled())
    }

}