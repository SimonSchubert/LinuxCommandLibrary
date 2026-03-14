# TAGLINE

Xfce graphical file manager

# TLDR

Open **current** directory

```thunar```

Open a **specific** directory

```thunar [/path/to/directory]```

Open **bulk rename** utility

```thunar --bulk-rename```

Bulk rename specific **files**

```thunar --bulk-rename [file1] [file2] [file3]```

**Close** all Thunar windows

```thunar --quit```

# SYNOPSIS

**thunar** [_OPTIONS_] [_URI_...]

# PARAMETERS

**-B, --bulk-rename**
> Open the bulk rename utility. If URIs are specified, they are passed to the renamer.

**-q, --quit**
> Close all Thunar windows and terminate the daemon if running.

**--daemon**
> Run as a daemon in the background for faster startup of subsequent windows.

**--display** _DISPLAY_
> X display to use.

**-V, --version**
> Display version information and exit.

**-h, --help**
> Display help information and exit.

# DESCRIPTION

**thunar** is the graphical file manager for the Xfce desktop environment. It provides a clean, lightweight interface for browsing files and directories with support for custom actions, emblems, and plugins.

URIs may be specified as file: or trash: URIs, absolute paths, or paths relative to the current directory. If no URIs are specified, the current folder is opened.

The bulk rename utility allows renaming multiple files at once using patterns and templates.

# CAVEATS

Designed primarily for Xfce but works on other desktops. Some features like custom actions require configuration. Plugins extend functionality for archives, media, and more.

# HISTORY

**Thunar** was created by **Benedikt Meurer** for Xfce, replacing the older xffm file manager. It emphasizes speed and simplicity while providing essential file management features.

# SEE ALSO

[nautilus](/man/nautilus)(1), [dolphin](/man/dolphin)(1), [pcmanfm](/man/pcmanfm)(1), [nemo](/man/nemo)(1)
