# TAGLINE

manages MIME type associations in GNOME

# TLDR

**Show default handler**

```gvfs-mime --query [text/plain]```

**Set default handler**

```gvfs-mime --set [text/html] [firefox.desktop]```

**Query image handler**

```gvfs-mime --query [image/jpeg]```

# SYNOPSIS

**gvfs-mime** [_options_] _mimetype_ [_handler_]

# PARAMETERS

_MIMETYPE_
> MIME type to query or set.

_HANDLER_
> Desktop file for handler.

**--query**
> Query default handler.

**--set**
> Set default handler.

**--help**
> Display help information.

# DESCRIPTION

**gvfs-mime** manages MIME type associations in GNOME. It queries and sets default applications for opening different file types.

The tool modifies the user's MIME database to associate applications with content types. Changes affect how files are opened in GNOME.

# CAVEATS

Part of the gvfs-bin command-line tools, deprecated in gvfs 1.31 (2016) and removed entirely in gvfs 1.38 (2018) in favor of the unified **gio** command (`gio mime`). Modern distributions no longer ship gvfs-mime. GNOME specific; uses .desktop file IDs as handlers.

# HISTORY

**gvfs-mime** was part of GVFS's original gvfs-bin utilities, introduced for GNOME alongside GVFS in **2008** (GNOME 2.22). It has since been superseded by **gio mime**.

# SEE ALSO

[gio](/man/gio)(1), [xdg-mime](/man/xdg-mime)(1), [update-mime-database](/man/update-mime-database)(1)

# RESOURCES

```[Source code](https://gitlab.gnome.org/GNOME/gvfs)```

```[Homepage](https://wiki.gnome.org/Projects/gvfs)```

<!-- verified: 2026-07-17 -->
