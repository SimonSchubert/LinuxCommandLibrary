package com.inspiredandroid.linuxcommandbibliotheca

import androidx.navigation.NavBackStackEntry

fun NavBackStackEntry.getCategoryId(): String? {
    return arguments?.getString("categoryId")?.takeIf { it.isNotEmpty() }
        ?: arguments?.getString("categoryName")  // For deep links
}
