# TAGLINE

opens files and URIs with their default applications (removed, use gio open)

# TLDR

**Open file with default app**

```gvfs-open [file.pdf]```

**Open URL**

```gvfs-open [https://example.com]```

**Open remote file**

```gvfs-open smb://server/share/document.docx```

**Open directory in file manager**

```gvfs-open [directory]```

**Modern equivalent**

```gio open [file.pdf]```

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

The tool handles local files, remote URIs, and URLs. Current **xdg-open** versions call **gio open** on GNOME and only fall back to **gvfs-open** when it is unavailable.

# CAVEATS

No longer shipped: removed from GVFS in version **1.37.2**. Use **gio open** or **xdg-open** on current systems.

# HISTORY

gvfs-open was part of the **GVFS** utilities. They were deprecated in GVFS **1.31.1** (2016) in favor of the **gio** tool added in GLib **2.50**, and removed in GVFS **1.37.2**.

# SEE ALSO

[gio](/man/gio)(1), [xdg-open](/man/xdg-open)(1), [open](/man/open)(1)

# RESOURCES

```[Source code](https://gitlab.gnome.org/GNOME/gvfs)```

```[Homepage](https://wiki.gnome.org/Projects/gvfs)```

<!-- verified: 2026-11-09 -->
