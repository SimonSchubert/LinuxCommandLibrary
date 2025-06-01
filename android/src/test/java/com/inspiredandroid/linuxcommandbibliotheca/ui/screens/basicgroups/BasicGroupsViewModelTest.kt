package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.basicgroups

import app.cash.turbine.test
import com.linuxcommandlibrary.shared.databaseHelper
import databases.BasicGroup
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkObject
import io.mockk.unmockkObject
import kotlinx.collections.immutable.persistentListOf
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
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
class BasicGroupsViewModelTest {

    private val testDispatcher = StandardTestDispatcher()

    @Before
    fun setUp() {
        Dispatchers.setMain(testDispatcher)
        mockkObject(databaseHelper) // Assuming databaseHelper is an object
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
        unmockkObject(databaseHelper)
    }

    @Test
    fun `init populates basicGroups and initializes empty collapsedMap`() = runTest {
        val categoryId = 1L
        val mockGroups = listOf(
            BasicGroup(1L, "Group 1", categoryId, 0, "icon1"),
            BasicGroup(2L, "Group 2", categoryId, 0, "icon2")
        )
        every { databaseHelper.getBasicGroupsByQuery(categoryId) } returns mockGroups

        val viewModel = BasicGroupsViewModel(categoryId)

        viewModel.uiState.test {
            val state = awaitItem()
            assertEquals(mockGroups.size, state.basicGroups.size)
            assertEquals("Group 1", state.basicGroups[0].description)
            assertTrue(state.collapsedMap.isEmpty())
            cancelAndIgnoreRemainingEvents()
        }
    }

    @Test
    fun `toggleCollapse updates collapsedMap correctly`() = runTest {
        val categoryId = 1L
        every { databaseHelper.getBasicGroupsByQuery(categoryId) } returns emptyList()

        val viewModel = BasicGroupsViewModel(categoryId)
        val groupId = 123L

        // Initial state
        assertFalse(viewModel.isGroupCollapsed(groupId))

        // Toggle once
        viewModel.toggleCollapse(groupId)
        testDispatcher.scheduler.runCurrent() // Advance time for the update to process
        assertTrue(viewModel.uiState.value.collapsedMap.getOrDefault(groupId, false))
        assertTrue(viewModel.isGroupCollapsed(groupId))

        // Toggle again
        viewModel.toggleCollapse(groupId)
        testDispatcher.scheduler.runCurrent() // Advance time
        assertFalse(viewModel.uiState.value.collapsedMap.getOrDefault(groupId, false))
        assertFalse(viewModel.isGroupCollapsed(groupId))
    }

    @Test
    fun `toggleCollapse only affects the specified group`() = runTest {
        val categoryId = 1L
        every { databaseHelper.getBasicGroupsByQuery(categoryId) } returns emptyList()

        val viewModel = BasicGroupsViewModel(categoryId)
        val groupId1 = 1L
        val groupId2 = 2L

        // Collapse group 1
        viewModel.toggleCollapse(groupId1)
        testDispatcher.scheduler.runCurrent()

        assertTrue(viewModel.uiState.value.collapsedMap.getOrDefault(groupId1, false))
        assertFalse(viewModel.uiState.value.collapsedMap.getOrDefault(groupId2, false))

        // Collapse group 2
        viewModel.toggleCollapse(groupId2)
        testDispatcher.scheduler.runCurrent()

        assertTrue(viewModel.uiState.value.collapsedMap.getOrDefault(groupId1, false)) // Should still be true
        assertTrue(viewModel.uiState.value.collapsedMap.getOrDefault(groupId2, false))
    }

    @Test
    fun `isGroupCollapsed returns correct state`() = runTest {
        val categoryId = 1L
        every { databaseHelper.getBasicGroupsByQuery(categoryId) } returns emptyList()
        val viewModel = BasicGroupsViewModel(categoryId)
        val groupId = 1L

        assertFalse(viewModel.isGroupCollapsed(groupId)) // Default

        viewModel.toggleCollapse(groupId)
        testDispatcher.scheduler.runCurrent()
        assertTrue(viewModel.isGroupCollapsed(groupId))

        viewModel.toggleCollapse(groupId)
        testDispatcher.scheduler.runCurrent()
        assertFalse(viewModel.isGroupCollapsed(groupId))
    }

    @Test
    fun `init with empty groups results in empty basicGroups list`() = runTest {
        val categoryId = 1L
        every { databaseHelper.getBasicGroupsByQuery(categoryId) } returns emptyList()

        val viewModel = BasicGroupsViewModel(categoryId)

        viewModel.uiState.test {
            val state = awaitItem()
            assertTrue(state.basicGroups.isEmpty())
            assertTrue(state.collapsedMap.isEmpty())
            cancelAndIgnoreRemainingEvents()
        }
    }
}
