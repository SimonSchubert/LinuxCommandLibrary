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

Deprecated in favor of gio mime. GNOME specific. Uses desktop file names.

# HISTORY

gvfs-mime was developed as part of **GVFS** for GNOME, now largely replaced by the **gio** command.

# SEE ALSO

[gio](/man/gio)(1), [xdg-mime](/man/xdg-mime)(1), [update-mime-database](/man/update-mime-database)(1)
