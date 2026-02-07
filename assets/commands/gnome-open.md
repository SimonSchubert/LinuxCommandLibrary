# TAGLINE

open files with associated GNOME applications (deprecated)

# TLDR

**Open file with default app**

```gnome-open [file.pdf]```

**Open URL**

```gnome-open [https://example.com]```

**Open directory**

```gnome-open [/path/to/directory]```

# SYNOPSIS

**gnome-open** _location_

# PARAMETERS

_LOCATION_
> File, URL, or directory to open.

**--help**
> Display help information.

# DESCRIPTION

**gnome-open** opens files, URLs, and directories with their associated applications. It uses GNOME's MIME type handling to determine the appropriate application.

The command is deprecated in favor of xdg-open or gio open, which provide cross-desktop functionality. It remains available for backward compatibility.

# CAVEATS

Deprecated; use xdg-open instead. GNOME-specific. May not work on other desktops.

# HISTORY

gnome-open was part of **GNOME** utilities but has been superseded by **xdg-open** for cross-desktop compatibility.

# SEE ALSO

[xdg-open](/man/xdg-open)(1), [gio](/man/gio)(1), [open](/man/open)(1)
