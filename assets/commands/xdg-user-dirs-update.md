# TLDR

**Change** XDG's DESKTOP directory to a specified directory

```xdg-user-dirs-update --set DESKTOP "/[path/to/directory]"```

**Write** the result to a dry-run file instead of user-dirs.dirs

```xdg-user-dirs-update --dummy-output "[path/to/dry_run_file]" --set [xdg_user_directory] "/[path/to/directory]"```

# SYNOPSIS

**xdg-user-dirs-update** [_options_]

# PARAMETERS

**--set _name_ _path_**
> Set a specific user directory

**--dummy-output _file_**
> Write to specified file instead of user-dirs.dirs

**--force**
> Force update even if directories exist

# DESCRIPTION

**xdg-user-dirs-update** updates the XDG user directories configuration. XDG user directories are special folders like Desktop, Documents, Downloads, Music, Pictures, and Videos.

The configuration is stored in **~/.config/user-dirs.dirs** and defines where applications should look for user content directories.

Valid directory names include: DESKTOP, DOWNLOAD, TEMPLATES, PUBLICSHARE, DOCUMENTS, MUSIC, PICTURES, VIDEOS.

# CAVEATS

Changing directories doesn't move existing content. Applications may need to be restarted to recognize changes. The specified paths must be absolute. Part of the xdg-user-dirs package.

# SEE ALSO

[xdg-user-dir](/man/xdg-user-dir)(1), [user-dirs.dirs](/man/user-dirs.dirs)(5)
