package com.linuxcommandlibrary.app.screenshots

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.navigationevent.NavigationEventDispatcher
import androidx.navigationevent.NavigationEventDispatcherOwner
import androidx.navigationevent.compose.LocalNavigationEventDispatcherOwner
import androidx.savedstate.SavedStateRegistry
import androidx.savedstate.SavedStateRegistryController
import androidx.savedstate.SavedStateRegistryOwner
import androidx.savedstate.compose.LocalSavedStateRegistryOwner

private class TestNavOwner :
    ViewModelStoreOwner,
    LifecycleOwner,
    SavedStateRegistryOwner,
    NavigationEventDispatcherOwner {
    override val viewModelStore: ViewModelStore = ViewModelStore()
    private val lifecycleRegistry = LifecycleRegistry(this)
    override val lifecycle: Lifecycle = lifecycleRegistry
    private val savedStateController = SavedStateRegistryController.create(this)
    override val savedStateRegistry: SavedStateRegistry = savedStateController.savedStateRegistry
    override val navigationEventDispatcher: NavigationEventDispatcher = NavigationEventDispatcher()

    init {
        savedStateController.performAttach()
        savedStateController.performRestore(null)
        lifecycleRegistry.currentState = Lifecycle.State.RESUMED
    }
}

@Composable
fun WithNavOwner(content: @Composable () -> Unit) {
    val owner = remember { TestNavOwner() }
    CompositionLocalProvider(
        LocalViewModelStoreOwner provides owner,
        LocalLifecycleOwner provides owner,
        LocalSavedStateRegistryOwner provides owner,
        LocalNavigationEventDispatcherOwner provides owner,
    ) {
        content()
    }
}
