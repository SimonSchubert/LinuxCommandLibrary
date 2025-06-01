# Jetpack Compose Best Practices & Recommendations

This document summarizes the Jetpack Compose best practices applied during recent refactoring efforts and provides recommendations for ongoing development to ensure a performant, stable, and maintainable application.

## 1. Summary of Improvements Implemented

Several key areas of the application's Compose implementation were enhanced:

*   **Composable Stability:**
    *   Unstable lambdas passed as parameters to composables (e.g., `onNavigate` functions, `onClick` handlers) were stabilized using `remember` with appropriate keys. This prevents unnecessary recompositions of child composables when their lambda parameters are recreated by a parent, even if the lambda's underlying logic hasn't changed.

*   **Efficient Derived State Calculation:**
    *   The calculation of `isSearchVisible` in `MainActivity.kt`, which depends on other state variables (`searchTextValue` and `navBackStackEntry`), was optimized by replacing `remember { ... }` with `remember { derivedStateOf { ... } }`. `derivedStateOf` ensures that the derived state is only recalculated when its specific dependencies change, leading to more efficient state updates.

*   **Robust UI State Management:**
    *   ViewModels (`BasicGroupsViewModel`, `SearchViewModel`, `CommandDetailViewModel`) were refactored to expose UI state via a single `StateFlow<UiState>`.
    *   Dedicated `UiState` data classes (e.g., `BasicGroupsUiState`, `SearchUiState`, `CommandDetailUiState`) were introduced or updated to hold all relevant UI data for a given screen or component.
    *   These `UiState` objects now consistently use immutable collections (`kotlinx.collections.immutable.ImmutableList`, `kotlinx.collections.immutable.ImmutableMap`) for properties like lists of items or maps of collapsed states. This ensures that the state itself is immutable, making it easier to reason about, track changes, and prevent accidental modification outside of the ViewModel's defined update mechanisms.

## 2. Key Patterns Implemented

The refactoring efforts centered around establishing a clear and unidirectional data flow pattern:

*   **`ViewModel -> StateFlow<UiState> -> Composable` Pattern:**
    *   **ViewModel:** Owns and manages the mutable state. It performs business logic, data fetching, and updates the state.
    *   **`StateFlow<UiState>`:** The ViewModel exposes a single `StateFlow` (e.g., `val uiState = _uiState.asStateFlow()`) that emits instances of a dedicated `UiState` data class. This `StateFlow` acts as the single source of truth for the UI.
    *   **`UiState` Data Class:** This immutable data class encapsulates all information the Composable needs to render itself. It typically contains:
        *   Data to be displayed (e.g., `ImmutableList<Item>`).
        *   UI-specific state (e.g., `isLoading: Boolean`, `ImmutableMap<Long, Boolean>` for expanded/collapsed items).
        *   It is defined with `val` properties and uses immutable collections (e.g., `kotlinx.collections.immutable.ImmutableList`, `kotlinx.collections.immutable.ImmutableMap`) with default empty immutable collections (e.g., `persistentListOf()`).
    *   **Composable:** Observes the `StateFlow` using `collectAsState()` (e.g., `val state by viewModel.uiState.collectAsState()`). When the `UiState` changes, the Composable automatically recomposes with the new state, ensuring the UI reflects the latest data. Events from the UI (e.g., button clicks, search input) are sent to the ViewModel via public methods, which then updates the state, triggering the flow again.

    This pattern promotes:
    *   **Testability:** ViewModels are easily unit-testable as they don't have direct Android framework dependencies for state management.
    *   **Clarity:** A clear separation of concerns between UI presentation (Composables) and UI logic/state (ViewModels).
    *   **Maintainability:** State changes are centralized and predictable.
    *   **Lifecycle Awareness:** `StateFlow` and `collectAsState` handle lifecycle complexities automatically.

## 3. Recommendations for Ongoing Development

To maintain and further improve the quality of the Compose codebase, the following practices are recommended:

*   **Prioritize Immutability:**
    *   Continue to use `kotlinx.collections.immutable` (`ImmutableList`, `ImmutableMap`, etc.) for any collections within `UiState` objects or when passing collections as parameters to composables. This is crucial for Compose's skippability and performance.

*   **Write Small & Skippable Composables:**
    *   Break down complex UI into smaller, focused composables.
    *   Ensure parameters passed to these composables are stable (primitive types, immutable classes, stable lambdas, immutable collections). This allows Compose to skip recomposition if the inputs haven't changed.

*   **Use `key` in Lazy Lists:**
    *   Always provide a unique and stable `key` for items in `LazyColumn`, `LazyRow`, etc. (e.g., `items(items = data, key = { it.id }) { ... }`). This helps Compose efficiently track items, manage their state across recompositions (e.g., scroll position, item-specific states), and handle data changes correctly.

*   **Profile Regularly:**
    *   Utilize Android Studio's Layout Inspector and its Recomposition Tracker to identify unnecessary recompositions or performance bottlenecks in your UI.

*   **Leverage `derivedStateOf`:**
    *   When a piece of state is calculated based on one or more other state objects, use `derivedStateOf`. This ensures the derived value is only recomputed when its direct dependencies change.

*   **Stable Lambdas:**
    *   When passing lambdas as parameters to composables, ensure they are stable. Either:
        *   Wrap the lambda instance in `remember` at the call site: `onClick = remember(key1, key2) { { /* lambda body */ } }`.
        *   Pass a reference to a top-level function or a lambda held in a variable that is itself remembered and stable.

*   **Check Compose Compiler Metrics:**
    *   Enable and periodically review the Compose compiler metrics. These reports provide insights into the stability of your composables and parameters, helping you identify and fix sources of unnecessary recompositions.

*   **ViewModel Best Practices:**
    *   Keep ViewModels lean and focused on UI logic for a specific screen or feature. Avoid turning them into massive god-objects.
    *   Ensure ViewModels are correctly scoped to the lifecycle of the UI they support (e.g., using Koin's `viewModel()` or `koinViewModel()` for Activity/Fragment or navigation graph scoping).

*   **Testing:**
    *   **Unit Tests:** Continue writing comprehensive unit tests for ViewModels to cover all UI logic, state transformations, and interactions with data layers (using mocks/fakes for dependencies).
    *   **UI Tests (Composable Tests):** For critical UI components or user flows, consider writing UI tests using `androidx.compose.ui.test`. This allows you to verify that composables render correctly and respond to user interactions as expected.

By adhering to these practices, the team can build a robust, performant, and enjoyable-to-maintain Jetpack Compose application.
