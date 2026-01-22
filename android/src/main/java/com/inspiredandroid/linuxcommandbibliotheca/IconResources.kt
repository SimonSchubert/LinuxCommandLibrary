package com.inspiredandroid.linuxcommandbibliotheca

import com.inspiredandroid.linuxcommandbibliotheca.data.BasicCategory
import com.inspiredandroid.linuxcommandbibliotheca.data.BasicGroup

fun BasicGroup.getIconResource(): Int = when (description) {
    "Add repository source" -> R.drawable.ic_add_rule
    "Add existing user to group", "Add new user to group" -> R.drawable.ic_add_user_to_group_white_48dp
    "Upgrade installed packages" -> R.drawable.ic_arrow_upward_black_24dp
    "Get the latest version of a repository" -> R.drawable.ic_available_updates
    "Laptop battery in percentage" -> R.drawable.ic_battery_90_black_24dp
    "Bluetooth MAC address", "Bluetooth name" -> R.drawable.ic_bluetooth_black_24dp
    "Start bluetooth service" -> R.drawable.ic_bluetooth_start
    "Change folder" -> R.drawable.ic_change_folder_white
    "Create file" -> R.drawable.ic_create_file_white
    "Create folder" -> R.drawable.ic_create_new_folder_white
    "Delete", "Delete a branch", "Delete a file (force)", "Delete a remote branch", "Delete an entire directory (force)", "Delete the tag", "Remove a file from the working index (cached)", "Remove an entire directory from the working index (cached)", "Remove/Uninstall" -> R.drawable.ic_delete_black_24dp
    "Delete file" -> R.drawable.ic_delete_file_white
    "Delete folder" -> R.drawable.ic_delete_folder_white_48dp
    "Take screenshot of the desktop" -> R.drawable.ic_desktop_windows_black_24dp
    "DNS lookup and display server answer" -> R.drawable.ic_dns_black_24dp
    "Rename group" -> R.drawable.ic_edit_group
    "CPU usage in percentage" -> R.drawable.ic_electronics
    "FInd all files which are accessed 7 days back", "File management", "Find all files which are greater than 10MB and less than 100MB", "Find files whose content was modified less than 60 minutes ago", "Find files whose status was changed less than 60 minutes ago", "Install from file", "Pull file", "Push file", "Search for pattern in file" -> R.drawable.ic_file
    "Display file content" -> R.drawable.ic_file_content_white
    "Copy file or folder" -> R.drawable.ic_file_copy_white_48dp
    "Install from repository" -> R.drawable.ic_file_download_black_24dp
    "Download file" -> R.drawable.ic_file_download_white
    "Edit text file" -> R.drawable.ic_file_edit_white_48dp
    "Create a physical link to file or folder" -> R.drawable.ic_file_link_white_48dp
    "Move/Rename file or folder" -> R.drawable.ic_file_move_white
    "Set file permission" -> R.drawable.ic_file_permission_white_48dp
    "Forensics", "Trace the path that a packet takes to its destination" -> R.drawable.ic_fingerprint_black_24dp
    "Exploitation tools" -> R.drawable.ic_flash_on_black_24dp
    "List folder contents" -> R.drawable.ic_folder_list_white
    "Show current folder" -> R.drawable.ic_folder_path_white
    "Vulnerability analyses" -> R.drawable.ic_healing_black_24dp
    "Click mouse", "Move mouse absolute", "Move mouse relative" -> R.drawable.ic_icon_mouse
    "Move file to trash" -> R.drawable.ic_icons8_add_trash
    "Create user" -> R.drawable.ic_icons8_add_user
    "Create group" -> R.drawable.ic_icons8_add_user_group
    "Checkout an existing branch", "Checkout and create a new branch with that name" -> R.drawable.ic_icons8_arrow
    "Trading bots" -> R.drawable.ic_icons8_bot
    "Show a small months calender" -> R.drawable.ic_icons8_calendar_1
    "Cancel printing job" -> R.drawable.ic_icons8_cancel
    "Disable printer", "End session" -> R.drawable.ic_icons8_circled_pause
    "Enable printer" -> R.drawable.ic_icons8_circled_play
    "Read clipboard" -> R.drawable.ic_icons8_clipboard
    "Wallets" -> R.drawable.ic_icons8_coin_wallet
    "Navigation" -> R.drawable.ic_icons8_compass
    "Connect to host", "Run a command and exit", "SOCKS5 proxying", "TCP Port Forwarding", "X11 Session Forwarding" -> R.drawable.ic_icons8_connected
    "Other stuff" -> R.drawable.ic_icons8_console
    "Clone an existing repository", "Insertion" -> R.drawable.ic_icons8_copy
    "Empty trash" -> R.drawable.ic_icons8_delete_trash
    "Bootlog info" -> R.drawable.ic_icons8_document
    "Change to previous directory" -> R.drawable.ic_icons8_downloads_folder
    "Rename user" -> R.drawable.ic_icons8_edit_user
    "Make file executable " -> R.drawable.ic_icons8_exe
    "View file permission" -> R.drawable.ic_icons8_file_preview
    "Block devices (except RAM disks) in a tree-like format" -> R.drawable.ic_icons8_flow_chart
    "Miners" -> R.drawable.ic_icons8_golden_fever
    "Change group owner ship of file" -> R.drawable.ic_icons8_group_foreground_selected
    "Editing" -> R.drawable.ic_icons8_hand_with_pen
    "Disk usage info" -> R.drawable.ic_icons8_hdd
    "Forget about files that were tracked but are now in .gitignore" -> R.drawable.ic_icons8_hide
    "Change to users home directory" -> R.drawable.ic_icons8_home
    "Input/Ouput", "Input/Output", "Type keystroke", "Type text" -> R.drawable.ic_icons8_keyboard
    "Show size of all sub directories" -> R.drawable.ic_icons8_kitchen_scales
    "Info about the linux system" -> R.drawable.ic_icons8_linux
    "Merge changes into current branch" -> R.drawable.ic_icons8_merge
    "Grant sudo privileges to an existing user" -> R.drawable.ic_icons8_moderator_male
    "Change to parent directory" -> R.drawable.ic_icons8_mother
    "Network interfaces" -> R.drawable.ic_icons8_network_card
    "Initialize new version-controlled project" -> R.drawable.ic_icons8_new
    "List all remote or local branches" -> R.drawable.ic_icons8_numbered_list
    "Ping to another device" -> R.drawable.ic_icons8_ping_pong
    "Add remote repository", "Create", "Create a new branch", "Create a tag", "Put", "Select" -> R.drawable.ic_icons8_plus
    "Pretty print" -> R.drawable.ic_icons8_print
    "Print a file" -> R.drawable.ic_icons8_print_file
    "Delete user" -> R.drawable.ic_icons8_remove_user_male
    "Buffers", "Multiple windows" -> R.drawable.ic_icons8_restore_window
    "List trash files" -> R.drawable.ic_icons8_reuse
    "PCI devices" -> R.drawable.ic_icons8_root_server
    "Push tags", "Save changes to the repository", "Send local commits to the remote repository", "Store current work with untracked files" -> R.drawable.ic_icons8_save
    "Display and update information of files(like top)", "Get filesystem of partition" -> R.drawable.ic_icons8_show_property
    "Update package lists" -> R.drawable.ic_icons8_synchronize
    "Play text by computer voice" -> R.drawable.ic_icons8_talk
    "Coin tracker" -> R.drawable.ic_icons8_teacher_hiring
    "Copy to clipboard" -> R.drawable.ic_icons8_treatment
    "Lock screen", "Turn off monitor" -> R.drawable.ic_icons8_tv_off
    "Unlock screen" -> R.drawable.ic_icons8_tv_on
    "Undo the previous commit", "Unmount filesystem" -> R.drawable.ic_icons8_undo
    "View owner and group of file" -> R.drawable.ic_icons8_user_folder
    "Change owner of file", "Define the author email to be used for all commits", "Define the author name to be used for all commits" -> R.drawable.ic_icons8_user_male_circle
    "Bring stashed work back to the working directory", "Show the hostname of your box", "View printing queue" -> R.drawable.ic_icons8_visible
    "Mount filesystem" -> R.drawable.ic_icons8_work
    "Basic usage", "Current state of the repository", "Display printer status", "Helpful guides that come with Git", "Info", "Information gathering", "User information", "View package info" -> R.drawable.ic_info_40dp
    "External ip", "Release ip and get a new one from DHCP" -> R.drawable.ic_ip_address
    "List all groups" -> R.drawable.ic_list_groups_white_48dp
    "List network interfaces" -> R.drawable.ic_list_interfaces_white_48dp
    "List open sockets" -> R.drawable.ic_list_sockets_white_48dp
    "List all users" -> R.drawable.ic_list_user_white_48dp
    "Sniffing/Spoofing" -> R.drawable.ic_loupe_black_24dp
    "Memory information" -> R.drawable.ic_memory_slot
    "Shutdown the system" -> R.drawable.ic_power_settings_new_black_24dp
    "Web application analysis" -> R.drawable.ic_public_black_24dp
    "Reboot the system" -> R.drawable.ic_refresh_black_24dp
    "Remove user from group" -> R.drawable.ic_remove_user_from_group_white_48dp
    "Delete group" -> R.drawable.ic_remove_user_group
    "Reporting tools" -> R.drawable.ic_report_black_24dp
    "Find a file by name", "Find a package", "Find all path names containing a phrase", "Find location of binary/source/man files for a command", "Find phrase within file", "Find the path of an executable", "Search and replace", "Search for pattern in output of command" -> R.drawable.ic_search_40dp
    "Telnet connection" -> R.drawable.ic_search_source_man_white_48dp
    "Configure network interface" -> R.drawable.ic_settings_black_24dp
    "Stop bluetooth service" -> R.drawable.ic_stop_bluetooth
    "Stop wifi service" -> R.drawable.ic_stop_wifi
    "Databases" -> R.drawable.ic_storage_black_24dp
    "Convert avi to animated gif", "Convert avi to flv", "Convert avi to mpg", "Convert mpg to avi", "Convert sound from a video to mp3", "Turn a video to images", "Turn images to a video sequence" -> R.drawable.ic_switch_video_white_48dp
    "Shutdown the system at specific time", "Uptime of machine" -> R.drawable.ic_timer_black_24dp
    "USB devices" -> R.drawable.ic_usb_black_48dp
    "Set user password" -> R.drawable.ic_user_password
    "Get information about domain" -> R.drawable.ic_vip_lookup_white_48dp
    "Mute volume" -> R.drawable.ic_volume_off_black_24dp
    "Play sound file in wav format", "The classical way to play a beep sound through the PC speakers" -> R.drawable.ic_volume_up_black_24dp
    "Generate SSH key", "Get wifi password", "Password attacks" -> R.drawable.ic_vpn_key_black_24dp
    "Take webcam photo" -> R.drawable.ic_webcam_white_48dp
    "Wireless attack" -> R.drawable.ic_wifi_black_24dp
    "Start wifi service" -> R.drawable.ic_wifi_start
    else -> R.drawable.ic_icons8_console
}

fun BasicCategory.getIconResource(): Int = when (title) {
    "One-liners" -> R.drawable.ic_icons8_hand_with_pen
    "System information" -> R.drawable.ic_icon_system_task
    "System control" -> R.drawable.ic_settings_black_40dp
    "Users & Groups" -> R.drawable.ic_icon_user
    "Files & Folders" -> R.drawable.ic_file
    "Printing" -> R.drawable.ic_icons8_print
    "Network" -> R.drawable.ic_network_card_40dp
    "Search & Find" -> R.drawable.ic_search_40dp
    "GIT" -> R.drawable.ic_icon_git
    "SSH" -> R.drawable.ic_icons8_console
    "Video & Audio" -> R.drawable.ic_video_trimming_40dp
    "Package manager" -> R.drawable.ic_package_40
    "Hacking tools" -> R.drawable.ic_icon_skull
    "Terminal games" -> R.drawable.ic_icon_controller
    "VIM Texteditor", "Emacs Texteditor", "Nano Texteditor", "Pico Texteditor", "Micro Texteditor" -> R.drawable.ic_icons8_text
    "Crypto currencies" -> R.drawable.ic_icon_bitcoin
    "Input" -> R.drawable.ic_icon_mouse
    "JSON" -> R.drawable.ic_icon_json
    "Fun" -> R.drawable.ic_icon_fun
    "Coding Agents" -> R.drawable.ic_agent
    else -> R.drawable.ic_icon_mouse
}
