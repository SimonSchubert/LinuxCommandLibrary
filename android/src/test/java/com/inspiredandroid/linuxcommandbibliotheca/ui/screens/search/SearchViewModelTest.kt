package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.search

import app.cash.turbine.test
import com.linuxcommandlibrary.shared.databaseHelper
import databases.BasicGroup
import databases.Command
import io.mockk.coEvery
import io.mockk.mockkObject
import io.mockk.unmockkObject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class SearchViewModelTest {

    private val testDispatcher = StandardTestDispatcher()

    @Before
    fun setUp() {
        Dispatchers.setMain(testDispatcher)
        mockkObject(databaseHelper)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
        unmockkObject(databaseHelper)
    }

    @Test
    fun `init creates empty state`() = runTest {
        val viewModel = SearchViewModel()
        viewModel.uiState.test {
            val state = awaitItem()
            assertTrue(state.filteredCommands.isEmpty())
            assertTrue(state.filteredBasicGroups.isEmpty())
            assertTrue(state.collapsedMap.isEmpty())
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun `search updates filteredCommands and filteredBasicGroups`() = runTest {
        val searchText = "test"
        val mockCommands = listOf(Command(1L, 0L, "cmd1", "desc1"))
        val mockBasicGroups = listOf(BasicGroup(1L, "Group 1", 0L, 0, "icon1"))

        coEvery { databaseHelper.getCommandsByQuery(searchText) } returns mockCommands
        coEvery { databaseHelper.getBasicGroupsByQuery(searchText) } returns mockBasicGroups

        val viewModel = SearchViewModel()
        viewModel.search(searchText)
        testDispatcher.scheduler.advanceUntilIdle() // Ensure coroutines complete

        viewModel.uiState.test {
            val state = expectMostRecentItem() // Get the latest state
            assertEquals(1, state.filteredCommands.size)
            assertEquals("cmd1", state.filteredCommands[0].name)
            assertEquals(1, state.filteredBasicGroups.size)
            assertEquals("Group 1", state.filteredBasicGroups[0].description)
            assertTrue(state.collapsedMap.isEmpty()) // Should not change
        }
    }

    @Test
    fun `search with blank text clears results`() = runTest {
        // Populate with some initial data
        val initialSearchText = "test"
        val mockCommands = listOf(Command(1L, 0L, "cmd1", "desc1"))
        val mockBasicGroups = listOf(BasicGroup(1L, "Group 1", 0L, 0, "icon1"))
        coEvery { databaseHelper.getCommandsByQuery(initialSearchText) } returns mockCommands
        coEvery { databaseHelper.getBasicGroupsByQuery(initialSearchText) } returns mockBasicGroups

        val viewModel = SearchViewModel()
        viewModel.search(initialSearchText)
        testDispatcher.scheduler.advanceUntilIdle()

        // Ensure initial data is there
        var latestState = viewModel.uiState.value
        assertFalse(latestState.filteredCommands.isEmpty())
        assertFalse(latestState.filteredBasicGroups.isEmpty())

        // Search with blank text
        viewModel.search("   ") // Blank text
        testDispatcher.scheduler.advanceUntilIdle()

        latestState = viewModel.uiState.value
        assertTrue(latestState.filteredCommands.isEmpty())
        assertTrue(latestState.filteredBasicGroups.isEmpty())
    }

    @Test
    fun `search cancels previous search`() = runTest {
        val searchText1 = "search1"
        val searchText2 = "search2"

        coEvery { databaseHelper.getCommandsByQuery(searchText1) } coAnswers {
            delay(500) // Simulate long running search
            listOf(Command(1L, 0L, "cmd1_from_search1", "desc1"))
        }
        coEvery { databaseHelper.getBasicGroupsByQuery(searchText1) } returns emptyList()

        coEvery { databaseHelper.getCommandsByQuery(searchText2) } returns listOf(Command(2L, 0L, "cmd2_from_search2", "desc2"))
        coEvery { databaseHelper.getBasicGroupsByQuery(searchText2) } returns emptyList()

        val viewModel = SearchViewModel()

        viewModel.search(searchText1)
        testDispatcher.scheduler.advanceTimeBy(100) // Start search1 but don't let it finish

        viewModel.search(searchText2) // This should cancel search1
        testDispatcher.scheduler.advanceUntilIdle() // Let search2 complete

        val state = viewModel.uiState.value
        assertEquals(1, state.filteredCommands.size)
        assertEquals("cmd2_from_search2", state.filteredCommands[0].name) // Only results from search2
    }

    @Test
    fun `toggleCollapse updates collapsedMap correctly`() = runTest {
        val viewModel = SearchViewModel()
        val groupId = 123L

        assertFalse(viewModel.isGroupCollapsed(groupId))

        viewModel.toggleCollapse(groupId)
        testDispatcher.scheduler.runCurrent()
        assertTrue(viewModel.uiState.value.collapsedMap.getOrDefault(groupId, false))
        assertTrue(viewModel.isGroupCollapsed(groupId))

        viewModel.toggleCollapse(groupId)
        testDispatcher.scheduler.runCurrent()
        assertFalse(viewModel.uiState.value.collapsedMap.getOrDefault(groupId, false))
        assertFalse(viewModel.isGroupCollapsed(groupId))

        // Ensure search results are not affected
        assertTrue(viewModel.uiState.value.filteredCommands.isEmpty())
        assertTrue(viewModel.uiState.value.filteredBasicGroups.isEmpty())
    }

    @Test
    fun `isGroupCollapsed returns correct state`() = runTest {
        val viewModel = SearchViewModel()
        val groupId = 1L

        assertFalse(viewModel.isGroupCollapsed(groupId)) // Default

        viewModel.toggleCollapse(groupId)
        testDispatcher.scheduler.runCurrent()
        assertTrue(viewModel.isGroupCollapsed(groupId))
    }
}
