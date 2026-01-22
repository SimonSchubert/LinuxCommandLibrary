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

**gvfs-open** _location_

# PARAMETERS

_LOCATION_
> File, directory, or URI to open.

**--help**
> Display help information.

# DESCRIPTION

**gvfs-open** opens files and URIs with their default applications. It uses GVFS and MIME type associations to determine the appropriate application.

The tool handles local files, remote URIs, and URLs. It's the command-line equivalent of double-clicking in GNOME file manager.

gvfs-open opens files with default apps.

# CAVEATS

Deprecated in favor of gio open. GNOME specific. Requires proper MIME associations.

# HISTORY

gvfs-open was developed as part of **GVFS** for GNOME, now largely replaced by the **gio** and **xdg-open** commands.

# SEE ALSO

[gio](/man/gio)(1), [xdg-open](/man/xdg-open)(1), [open](/man/open)(1)
