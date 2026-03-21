# TAGLINE

Update XDG user directory configuration

# TLDR

**Change** XDG's DESKTOP directory to a specified directory

```xdg-user-dirs-update --set DESKTOP "/[path/to/directory]"```

**Set** the DOWNLOAD directory to a custom path

```xdg-user-dirs-update --set DOWNLOAD "/[path/to/downloads]"```

**Write** the result to a dry-run file instead of user-dirs.dirs

```xdg-user-dirs-update --dummy-output "[path/to/dry_run_file]" --set [xdg_user_directory] "/[path/to/directory]"```

**Force** a complete reset of the user directory configuration

```xdg-user-dirs-update --force```

# SYNOPSIS

**xdg-user-dirs-update** [_OPTION..._] [_--set NAME PATH..._]

# PARAMETERS

**--set** _NAME_ _PATH_
> Set a specific user directory. NAME must be one of DESKTOP, DOWNLOAD, TEMPLATES, PUBLICSHARE, DOCUMENTS, MUSIC, PICTURES, or VIDEOS. PATH must be absolute.

**--dummy-output** _PATH_
> Write the configuration to PATH instead of the default configuration file. No directories are created when using this option.

**--force**
> Force a complete reset of existing configuration. Recreates directories instead of resetting to HOME and always recreates the locale file.

**--help**
> Print help output and exit.

# DESCRIPTION

**xdg-user-dirs-update** updates the current state of the user's user-dirs.dirs file. If none existed before, one is created based on system default values. XDG user directories are special folders like Desktop, Documents, Downloads, Music, Pictures, and Videos.

The configuration is stored in **~/.config/user-dirs.dirs** and defines where applications should look for user content directories. A **user-dirs.locale** file is also created on first run to track which locale was used for directory name translations.

This command is normally run automatically at the start of a user session. Directories pointing to non-existent locations are reset to the user's home directory.

# CAVEATS

Changing directories doesn't move existing content. Applications may need to be restarted to recognize changes. The specified paths must be absolute. Part of the xdg-user-dirs package.

# SEE ALSO

[xdg-user-dir](/man/xdg-user-dir)(1), [xdg-open](/man/xdg-open)(1), [xdg-mime](/man/xdg-mime)(1), [xdg-settings](/man/xdg-settings)(1)
