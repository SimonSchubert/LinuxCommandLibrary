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
    FOLDER_LIST,
    FOLDER_PATH,
    HEALING,
    TRASH_ADD,
    ADD_USER,
    ADD_USER_GROUP,
    ARROW_CHECKOUT,
    BOT,
    CALENDAR,
    CANCEL,
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
    PRINT_ICON,
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
    REFRESH,
    REMOVE_USER_FROM_GROUP,
    REMOVE_GROUP,
    REPORT,
    SEARCH_SOURCE,
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

fun BasicGroup.getIconId(): AppIcon = when (description) {
    "Add repository source" -> AppIcon.ADD_RULE
    "Add existing user to group", "Add new user to group" -> AppIcon.ADD_USER_TO_GROUP
    "Upgrade installed packages" -> AppIcon.ARROW_UPWARD
    "Get the latest version of a repository" -> AppIcon.AVAILABLE_UPDATES
    "Laptop battery in percentage" -> AppIcon.BATTERY
    "Bluetooth MAC address", "Bluetooth name" -> AppIcon.BLUETOOTH
    "Start bluetooth service" -> AppIcon.BLUETOOTH_START
    "Change folder" -> AppIcon.CHANGE_FOLDER
    "Create file" -> AppIcon.CREATE_FILE
    "Create folder" -> AppIcon.CREATE_FOLDER
    "Delete", "Delete a branch", "Delete a file (force)", "Delete a remote branch", "Delete an entire directory (force)", "Delete the tag", "Remove a file from the working index (cached)", "Remove an entire directory from the working index (cached)", "Remove/Uninstall" -> AppIcon.DELETE
    "Delete file" -> AppIcon.DELETE_FILE
    "Delete folder" -> AppIcon.DELETE_FOLDER
    "Take screenshot of the desktop" -> AppIcon.DESKTOP
    "DNS lookup and display server answer" -> AppIcon.DNS
    "Rename group" -> AppIcon.EDIT_GROUP
    "CPU usage in percentage" -> AppIcon.ELECTRONICS
    "FInd all files which are accessed 7 days back", "File management", "Find all files which are greater than 10MB and less than 100MB", "Find files whose content was modified less than 60 minutes ago", "Find files whose status was changed less than 60 minutes ago", "Install from file", "Pull file", "Push file", "Search for pattern in file" -> AppIcon.FILE
    "Display file content" -> AppIcon.FILE_CONTENT
    "Copy file or folder" -> AppIcon.FILE_COPY
    "Install from repository" -> AppIcon.FILE_DOWNLOAD
    "Download file" -> AppIcon.FILE_DOWNLOAD_WHITE
    "Edit text file" -> AppIcon.FILE_EDIT
    "Create a physical link to file or folder" -> AppIcon.FILE_LINK
    "Move/Rename file or folder" -> AppIcon.FILE_MOVE
    "Set file permission" -> AppIcon.FILE_PERMISSION
    "Forensics", "Trace the path that a packet takes to its destination" -> AppIcon.FINGERPRINT
    "Exploitation tools" -> AppIcon.FLASH
    "List folder contents" -> AppIcon.FOLDER_LIST
    "Show current folder" -> AppIcon.FOLDER_PATH
    "Vulnerability analyses" -> AppIcon.HEALING
    "Click mouse", "Move mouse absolute", "Move mouse relative" -> AppIcon.MOUSE
    "Move file to trash" -> AppIcon.TRASH_ADD
    "Create user" -> AppIcon.ADD_USER
    "Create group" -> AppIcon.ADD_USER_GROUP
    "Checkout an existing branch", "Checkout and create a new branch with that name" -> AppIcon.ARROW_CHECKOUT
    "Trading bots", "AI Assistants" -> AppIcon.BOT
    "Show a small months calender" -> AppIcon.CALENDAR
    "Cancel printing job" -> AppIcon.CANCEL
    "Disable printer", "End session" -> AppIcon.PAUSE
    "Enable printer" -> AppIcon.PLAY
    "Read clipboard" -> AppIcon.CLIPBOARD
    "Wallets" -> AppIcon.WALLET
    "Navigation" -> AppIcon.COMPASS
    "Connect to host", "Run a command and exit", "SOCKS5 proxying", "TCP Port Forwarding", "X11 Session Forwarding" -> AppIcon.CONNECTED
    "Coding Agents" -> AppIcon.AGENT
    "Other stuff" -> AppIcon.CONSOLE
    "Clone an existing repository", "Insertion" -> AppIcon.COPY
    "Empty trash" -> AppIcon.DELETE_TRASH
    "Bootlog info" -> AppIcon.DOCUMENT
    "Change to previous directory" -> AppIcon.DOWNLOADS_FOLDER
    "Rename user" -> AppIcon.EDIT_USER
    "Make file executable " -> AppIcon.EXE
    "View file permission" -> AppIcon.FILE_PREVIEW
    "Block devices (except RAM disks) in a tree-like format" -> AppIcon.FLOW_CHART
    "Miners" -> AppIcon.GOLDEN_FEVER
    "Change group owner ship of file" -> AppIcon.GROUP_SELECTED
    "Editing" -> AppIcon.HAND_WITH_PEN
    "Disk usage info" -> AppIcon.STORAGE
    "Forget about files that were tracked but are now in .gitignore" -> AppIcon.DEFAULT_GROUP
    "Change to users home directory" -> AppIcon.DEFAULT_GROUP
    "Input/Ouput", "Input/Output", "Type keystroke", "Type text" -> AppIcon.KEYBOARD
    "Show size of all sub directories" -> AppIcon.KITCHEN_SCALES
    "Info about the linux system" -> AppIcon.LINUX
    "Merge changes into current branch" -> AppIcon.MERGE
    "Grant sudo privileges to an existing user" -> AppIcon.MODERATOR
    "Change to parent directory" -> AppIcon.MOTHER
    "Network interfaces" -> AppIcon.NETWORK
    "Initialize new version-controlled project" -> AppIcon.NEW
    "List all remote or local branches" -> AppIcon.NUMBERED_LIST
    "Ping to another device" -> AppIcon.PING_PONG
    "Add remote repository", "Create", "Create a new branch", "Create a tag", "Put", "Select" -> AppIcon.PLUS
    "Pretty print" -> AppIcon.PRINT_ICON
    "Print a file" -> AppIcon.PRINT_FILE
    "Delete user" -> AppIcon.REMOVE_USER
    "Buffers", "Multiple windows" -> AppIcon.RESTORE_WINDOW
    "List trash files" -> AppIcon.REUSE
    "PCI devices" -> AppIcon.ROOT_SERVER
    "Push tags", "Save changes to the repository", "Send local commits to the remote repository", "Store current work with untracked files" -> AppIcon.SAVE
    "Display and update information of files(like top)", "Get filesystem of partition" -> AppIcon.SHOW_PROPERTY
    "Update package lists" -> AppIcon.SYNCHRONIZE
    "Play text by computer voice" -> AppIcon.TALK
    "Coin tracker" -> AppIcon.TEACHER
    "Copy to clipboard" -> AppIcon.TREATMENT
    "Lock screen", "Turn off monitor" -> AppIcon.TV_OFF
    "Unlock screen" -> AppIcon.TV_ON
    "Undo the previous commit", "Unmount filesystem" -> AppIcon.UNDO
    "View owner and group of file" -> AppIcon.USER_FOLDER
    "Change owner of file", "Define the author email to be used for all commits", "Define the author name to be used for all commits" -> AppIcon.USER_CIRCLE
    "Bring stashed work back to the working directory", "Show the hostname of your box", "View printing queue" -> AppIcon.VISIBLE
    "Mount filesystem" -> AppIcon.WORK
    "Basic usage", "Current state of the repository", "Display printer status", "Helpful guides that come with Git", "Info", "Information gathering", "User information", "View package info" -> AppIcon.INFO_SMALL
    "External ip", "Release ip and get a new one from DHCP" -> AppIcon.IP_ADDRESS
    "List all groups" -> AppIcon.LIST_GROUPS
    "List network interfaces" -> AppIcon.LIST_INTERFACES
    "List open sockets" -> AppIcon.LIST_SOCKETS
    "List all users" -> AppIcon.LIST_USER
    "Sniffing/Spoofing" -> AppIcon.LOUPE
    "Memory information" -> AppIcon.MEMORY_SLOT
    "Shutdown the system" -> AppIcon.POWER
    "Web application analysis" -> AppIcon.PUBLIC
    "Reboot the system" -> AppIcon.REFRESH
    "Remove user from group" -> AppIcon.REMOVE_USER_FROM_GROUP
    "Delete group" -> AppIcon.REMOVE_GROUP
    "Reporting tools" -> AppIcon.REPORT
    "Find a file by name", "Find a package", "Find all path names containing a phrase", "Find location of binary/source/man files for a command", "Find phrase within file", "Find the path of an executable", "Search and replace", "Search for pattern in output of command" -> AppIcon.SEARCH
    "Telnet connection" -> AppIcon.SEARCH_SOURCE
    "Configure network interface" -> AppIcon.SETTINGS
    "Stop bluetooth service" -> AppIcon.STOP_BLUETOOTH
    "Stop wifi service" -> AppIcon.STOP_WIFI
    "Databases" -> AppIcon.STORAGE
    "Convert avi to animated gif", "Convert avi to flv", "Convert avi to mpg", "Convert mpg to avi", "Convert sound from a video to mp3", "Turn a video to images", "Turn images to a video sequence" -> AppIcon.SWITCH_VIDEO
    "Shutdown the system at specific time", "Uptime of machine" -> AppIcon.TIMER
    "USB devices" -> AppIcon.USB
    "Set user password" -> AppIcon.USER_PASSWORD
    "Get information about domain" -> AppIcon.VIP_LOOKUP
    "Mute volume" -> AppIcon.VOLUME_OFF
    "Play sound file in wav format", "The classical way to play a beep sound through the PC speakers" -> AppIcon.VOLUME_UP
    "Generate SSH key", "Get wifi password", "Password attacks" -> AppIcon.VPN_KEY
    "Take webcam photo" -> AppIcon.WEBCAM
    "Wireless attack" -> AppIcon.WIFI
    "Start wifi service" -> AppIcon.WIFI_START
    else -> AppIcon.CONSOLE
}

fun BasicCategory.getIconId(): AppIcon = when (title) {
    "One-liners" -> AppIcon.HAND_WITH_PEN
    "System information" -> AppIcon.SYSTEM_TASK
    "System control" -> AppIcon.SETTINGS
    "Users & Groups" -> AppIcon.USER
    "Files & Folders" -> AppIcon.FILE
    "Printing" -> AppIcon.PRINT_ICON
    "Network" -> AppIcon.NETWORK_CARD
    "Search & Find" -> AppIcon.SEARCH
    "GIT" -> AppIcon.GIT
    "SSH" -> AppIcon.CONSOLE
    "Video & Audio" -> AppIcon.VIDEO
    "Package manager" -> AppIcon.PACKAGE
    "Hacking tools" -> AppIcon.SKULL
    "Terminal games" -> AppIcon.CONTROLLER
    "VIM Text Editor", "Emacs Text Editor", "Nano Text Editor", "Pico Text Editor", "Micro Text Editor" -> AppIcon.TEXT
    "Cryptocurrencies" -> AppIcon.BITCOIN
    "Input" -> AppIcon.MOUSE
    "JSON" -> AppIcon.JSON
    "Fun" -> AppIcon.FUN
    "AI tools" -> AppIcon.AGENT
    else -> AppIcon.MOUSE
}
