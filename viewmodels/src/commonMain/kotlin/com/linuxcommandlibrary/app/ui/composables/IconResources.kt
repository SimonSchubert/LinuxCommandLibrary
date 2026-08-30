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
    EXPAND_ALL,
    COLLAPSE_ALL,
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
    ADD_RULE,
    ARROW_UPWARD,
    BATTERY,
    BLUETOOTH,
    BLUETOOTH_START,
    CREATE_FILE,
    CREATE_FOLDER,
    DELETE,
    DELETE_FILE,
    DELETE_FOLDER,
    DESKTOP,
    DNS,
    ELECTRONICS,
    FILE_CONTENT,
    FILE_COPY,
    FILE_DOWNLOAD,
    FILE_DOWNLOAD_WHITE,
    FILE_EDIT,
    FILE_LINK,
    FILE_PERMISSION,
    FINGERPRINT,
    FLASH,
    FOLDER_BLACK,
    FOLDER_LIST,
    FOLDER_PATH,
    HEALING,
    HDD,
    HOME,
    ADD_USER,
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
    TV_OFF,
    UNDO,
    USER_CIRCLE,
    VISIBLE,
    WORK,
    INFO_SMALL,
    IP_ADDRESS,
    LIST_GROUPS,
    LIST_INTERFACES,
    LIST_SOCKETS,
    LIST_USER,
    MEMORY_SLOT,
    POWER,
    PUBLIC,
    REDO,
    REFRESH,
    REMOTE,
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
    VOLUME_UP,
    VPN_KEY,
    WEBCAM,
    WIFI,
    WIFI_START,

    // Material Symbols additions (purpose-fit basics group icons)
    NUMBERS,
    CALCULATE,
    SWAP_HORIZ,
    FIND_REPLACE,
    TRENDING_UP,
    SCHEDULE,
    HISTORY,
    QR_CODE,
    HARD_DRIVE,
    DIFFERENCE,
    RECORD,
    RECEIPT_LONG,
    CLOUD,
    ACCOUNT_TREE,
    INVENTORY,
    CONTENT_CUT,

    // Purpose-fit additions (semantic icon pass)
    MIC,
    SOUND_WAVE,
    LOCK,
    LOCK_OPEN,
    HIBERNATE,
    FILTER,
    MANAGE_SEARCH,
    FUZZY,
    TAG,
    CLICK,
    COLUMNS,
    SHUFFLE,
    SORT,
    QUOTE,
    BUG,
    DATABASE,
    FOLDER_ZIP,
    ARCHIVE,
    LINK_OFF,
    SPLIT,
    SCREENSHOT,
    TOGGLE_ON,
    SPEED,
    HTTP,
    PDF,
    CRON,
    HOURGLASS,
    THERMOSTAT,
    GIF,
    SMART_DISPLAY,
    BACKGROUND_TASK,
    TRAIN,
    SWITCH_ACCOUNT,
    SPLITSCREEN,
    RESIZE,
    ANCHOR,
    REGEX,
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
    "Regular Expressions" -> AppIcon.REGEX
    "VIM Text Editor", "Emacs Text Editor", "Nano Text Editor", "Pico Text Editor", "Micro Text Editor" -> AppIcon.TEXT
    "Cryptocurrencies" -> AppIcon.BITCOIN
    "Input" -> AppIcon.MOUSE
    "JSON" -> AppIcon.JSON
    "Fun" -> AppIcon.FUN
    "AI tools" -> AppIcon.BOT
    "Backup & Imaging" -> AppIcon.SAVE
    "System Recovery" -> AppIcon.HEALING
    else -> AppIcon.MOUSE
}
