# TAGLINE

opens files and URIs with their default applications

# TLDR

**Open file with default app**

```gvfs-open [file.pdf]```

**Open URL**

```gvfs-open [https://example.com]```

**Open remote file**

```gvfs-open smb://server/share/document.docx```

**Open directory in file manager**

```gvfs-open [directory]```

# SYNOPSIS

**gvfs-open** [_OPTION..._] [_FILE..._]

# PARAMETERS

_FILE_
> File, directory, or URI to open.

**-h**, **--help**
> Display help information.

**--version**
> Show version number and exit.

# DESCRIPTION

**gvfs-open** opens files with the default application registered to handle files of that type. It obtains MIME type information from the shared-mime-info database, and the default handler is stored per-user in `$XDG_DATA_HOME/applications/mimeapps.list`.

The tool handles local files, remote URIs, and URLs. When a running GNOME session is detected, `xdg-open` actually calls `gvfs-open` internally.

# CAVEATS

Deprecated in favor of gio open. GNOME specific. Requires proper MIME associations.

# HISTORY

gvfs-open was developed as part of **GVFS** for GNOME, now largely replaced by the **gio** and **xdg-open** commands.

# SEE ALSO

[gio](/man/gio)(1), [xdg-open](/man/xdg-open)(1), [open](/man/open)(1)
