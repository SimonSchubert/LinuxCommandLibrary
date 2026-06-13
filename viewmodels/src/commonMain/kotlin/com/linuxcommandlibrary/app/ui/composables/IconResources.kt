package com.linuxcommandlibrary.app.ui.composables

import com.linuxcommandlibrary.app.data.BasicCategory
import com.linuxcommandlibrary.app.data.BasicGroup

/**
 * Icon identifier enum for platform-specific icon loading.
 * This maps logical icon names to actual drawable resources on each platform.
 */
enum class AppIcon {
    // Navigation icons
    SEARCH,
    PUZZLE,
    IDEA,
    BOOKMARK,
    BOOKMARK_BORDER,
    ARROW_BACK,
    EXPAND_ALL,
    COLLAPSE_ALL,
    INFO,
    SHARE,
    GITHUB,

    // Category icons
    SYSTEM_TASK,
    SETTINGS,
    USER,
    FILE,
    PRINT,
    NETWORK_CARD,
    GIT,
    CONSOLE,
    VIDEO,
    PACKAGE,
    SKULL,
    CONTROLLER,
    TEXT,
    BITCOIN,
    MOUSE,
    JSON,
    FUN,
    AGENT,
    HAND_WITH_PEN,
    IMAGE,

    // Group icons - too many to list individually, using a fallback approach
    DEFAULT_GROUP,
    ADD_RULE,
    ADD_USER_TO_GROUP,
    ARROW_UPWARD,
    AVAILABLE_UPDATES,
    BATTERY,
    BLUETOOTH,
    BLUETOOTH_START,
    CHANGE_FOLDER,
    CREATE_FILE,
    CREATE_FOLDER,
    DELETE,
    DELETE_FILE,
    DELETE_FOLDER,
    DESKTOP,
    DNS,
    EDIT_GROUP,
    ELECTRONICS,
    FILE_CONTENT,
    FILE_COPY,
    FILE_DOWNLOAD,
    FILE_DOWNLOAD_WHITE,
    FILE_EDIT,
    FILE_LINK,
    FILE_MOVE,
    FILE_PERMISSION,
    FINGERPRINT,
    FLASH,
    FOLDER_BLACK,
    FOLDER_LIST,
    FOLDER_PATH,
    HEALING,
    HDD,
    HOME,
    TRASH_ADD,
    ADD_USER,
    ADD_USER_GROUP,
    ARROW_CHECKOUT,
    BOT,
    CALENDAR,
    CANCEL,
    CHECK,
    CODE,
    PAUSE,
    PLAY,
    CLIPBOARD,
    WALLET,
    COMPASS,
    CONNECTED,
    COPY,
    DELETE_TRASH,
    DOCUMENT,
    DOWNLOADS_FOLDER,
    EDIT_USER,
    EXE,
    FILE_PREVIEW,
    FLOW_CHART,
    GOLDEN_FEVER,
    GROUP_SELECTED,
    KEYBOARD,
    KEYBOARD_ALT,
    KITCHEN_SCALES,
    LINUX,
    MERGE,
    MODERATOR,
    MOTHER,
    NETWORK,
    NEW,
    NUMBERED_LIST,
    PING_PONG,
    PLUS,

    PRINT_FILE,
    REMOVE_USER,
    RESTORE_WINDOW,
    REUSE,
    ROOT_SERVER,
    SAVE,
    SHOW_PROPERTY,
    SYNCHRONIZE,
    TALK,
    TEACHER,
    TREATMENT,
    TV_OFF,
    TV_ON,
    UNDO,
    USER_FOLDER,
    USER_CIRCLE,
    VISIBLE,
    WORK,
    INFO_SMALL,
    IP_ADDRESS,
    LIST_GROUPS,
    LIST_INTERFACES,
    LIST_SOCKETS,
    LIST_USER,
    LOUPE,
    MEMORY_SLOT,
    POWER,
    PUBLIC,
    REDO,
    REFRESH,
    REMOTE,
    REMOVE_USER_FROM_GROUP,
    REMOVE_GROUP,
    REPORT,
    SEARCH_HISTORY,
    SEARCH_IN_FILE,
    SEARCH_SOURCE,
    SECURITY,
    STOP_BLUETOOTH,
    STOP_WIFI,
    STORAGE,
    SWITCH_VIDEO,
    TIMER,
    USB,
    USER_PASSWORD,
    VIP_LOOKUP,
    VOLUME_OFF,
    VOLUME_UP,
    VPN_KEY,
    WEBCAM,
    WIFI,
    WIFI_START,
}

fun BasicGroup.getIconId(categoryTitle: String): AppIcon = basicGroupIconsByCategory[categoryTitle]?.get(description)
    ?: BasicCategory(id = "", title = categoryTitle).getIconId()

fun BasicCategory.getIconId(): AppIcon = when (title) {
    "One-liners" -> AppIcon.HAND_WITH_PEN
    "System information" -> AppIcon.SYSTEM_TASK
    "System control" -> AppIcon.SETTINGS
    "Users & Groups" -> AppIcon.USER
    "Files & Folders" -> AppIcon.FILE
    "Printing" -> AppIcon.PRINT
    "Network" -> AppIcon.NETWORK_CARD
    "Search & Find" -> AppIcon.SEARCH
    "Git" -> AppIcon.GIT
    "SSH" -> AppIcon.VPN_KEY
    "Video & Audio" -> AppIcon.VIDEO
    "Package manager" -> AppIcon.PACKAGE
    "Text Processing" -> AppIcon.FILE_EDIT
    "Compression & Archiving" -> AppIcon.FILE_DOWNLOAD
    "Hacking tools" -> AppIcon.SKULL
    "Terminal games" -> AppIcon.CONTROLLER
    "Shell Scripting" -> AppIcon.CONSOLE
    "Tmux" -> AppIcon.RESTORE_WINDOW
    "Regular Expressions" -> AppIcon.LOUPE
    "VIM Text Editor", "Emacs Text Editor", "Nano Text Editor", "Pico Text Editor", "Micro Text Editor" -> AppIcon.TEXT
    "Cryptocurrencies" -> AppIcon.BITCOIN
    "Input" -> AppIcon.MOUSE
    "JSON" -> AppIcon.JSON
    "Fun" -> AppIcon.FUN
    "AI tools" -> AppIcon.AGENT
    "Backup & Imaging" -> AppIcon.SAVE
    "System Recovery" -> AppIcon.HEALING
    else -> AppIcon.MOUSE
}
