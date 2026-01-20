package com.inspiredandroid.linuxcommandbibliotheca.data

data class BasicCategory(
    /** filename without .md (e.g., "filesfolders") */
    val id: String,
    /** from H1 (e.g., "Files & Folders") */
    val title: String,
)

data class BasicGroup(
    /** hash of categoryId+description */
    val id: Long,
    /** from H2 (e.g., "Create file") */
    val description: String,
)

data class BasicCommand(
    /** hash for stable ID */
    val id: Long,
    /** e.g., "$ touch [fileName]" */
    val command: String,
    /** e.g., "touch" */
    val mans: String,
)
