# TLDR

Show **home** directory

```xdg-user-dir```

Show **specific** directory

```xdg-user-dir [DESKTOP|DOWNLOAD|TEMPLATES|PUBLICSHARE|DOCUMENTS|MUSIC|PICTURES|VIDEOS]```

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

# DESCRIPTION

**xdg-user-dir** retrieves the path of XDG user directories as defined in the user-dirs.dirs configuration file. These are the standard directories for common content types like documents, music, and downloads.

The paths are configured in ~/.config/user-dirs.dirs and can be customized per user.

# CAVEATS

Returns home directory if the requested directory is not configured. Directory paths may not exist on the filesystem.

# SEE ALSO

[xdg-user-dirs-update](/man/xdg-user-dirs-update)(1), [xdg-open](/man/xdg-open)(1)
