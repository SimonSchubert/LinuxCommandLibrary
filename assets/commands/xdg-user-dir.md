# TAGLINE

Find an XDG user directory path

# TLDR

Show **home** directory (default with no argument)

```xdg-user-dir```

Show the **Downloads** directory path

```xdg-user-dir DOWNLOAD```

Show the **Documents** directory path

```xdg-user-dir DOCUMENTS```

Show the **Desktop** directory path

```xdg-user-dir DESKTOP```

# SYNOPSIS

**xdg-user-dir** [_DIRECTORY_]

# PARAMETERS

**DESKTOP**
> Desktop directory

**DOWNLOAD**
> Downloads directory

**DOCUMENTS**
> Documents directory

**MUSIC**
> Music directory

**PICTURES**
> Pictures directory

**VIDEOS**
> Videos directory

**TEMPLATES**
> Templates directory

**PUBLICSHARE**
> Public share directory

**--help**
> Display help and exit

**--version**
> Show version information and exit

# DESCRIPTION

**xdg-user-dir** looks up the current path for an XDG user directory as defined in the user-dirs.dirs configuration file. These are the standard directories for common content types like documents, music, and downloads.

The paths are configured in **~/.config/user-dirs.dirs** and can be customized per user. The **XDG_CONFIG_HOME** environment variable determines where the configuration file is located.

# CAVEATS

Returns home directory if the requested directory is not configured or if an unknown directory name is given. Directory paths may not exist on the filesystem.

# SEE ALSO

[xdg-user-dirs-update](/man/xdg-user-dirs-update)(1), [xdg-open](/man/xdg-open)(1), [xdg-mime](/man/xdg-mime)(1)
