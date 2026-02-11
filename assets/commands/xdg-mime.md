# TAGLINE

Query and manage MIME type associations

# TLDR

**Display** the MIME type of a file

```xdg-mime query filetype [path/to/file]```

**Display** the default application for opening PNGs

```xdg-mime query default image/png```

**Display** the default application for a file's MIME type

```xdg-mime query default $(xdg-mime query filetype [path/to/file])```

**Set** an application as default for specific MIME types

```xdg-mime default [imv.desktop] image/png image/jpeg```

# SYNOPSIS

**xdg-mime** _command_ [_arguments_]

# PARAMETERS

**query filetype _file_**
> Display the MIME type of a file

**query default _mimetype_**
> Display the default application for a MIME type

**default _application_ _mimetype_...**
> Set default application for MIME types

**install _mimetypes-file_**
> Install a MIME type definition

**uninstall _mimetypes-file_**
> Uninstall a MIME type definition

# DESCRIPTION

**xdg-mime** queries and manages MIME types according to the XDG (freedesktop.org) standard. It can detect file types, query default applications, and set application associations.

The tool integrates with the desktop environment's MIME type handling, storing user preferences in **~/.config/mimeapps.list**.

# CAVEATS

Application associations use .desktop file names. Changes may require restarting applications to take effect. Works with XDG-compliant desktop environments.

# SEE ALSO

[xdg-open](/man/xdg-open)(1), [xdg-settings](/man/xdg-settings)(1), [update-mime-database](/man/update-mime-database)(1)
