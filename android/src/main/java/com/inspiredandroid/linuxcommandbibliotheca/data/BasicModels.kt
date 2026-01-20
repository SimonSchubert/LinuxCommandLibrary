package com.inspiredandroid.linuxcommandbibliotheca.data

data class BasicCategory(
    val id: String,    // filename without .md (e.g., "filesfolders")
    val title: String  // from H1 (e.g., "Files & Folders")
)

data class BasicGroup(
    val id: Long,            // hash of categoryId+description
    val description: String  // from H2 (e.g., "Create file")
)

data class BasicCommand(
    val id: Long,       // hash for stable ID
    val command: String, // e.g., "$ touch [fileName]"
    val mans: String     // e.g., "touch"
)
