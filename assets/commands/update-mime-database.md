# TLDR

**Update system MIME database**

```sudo update-mime-database /usr/share/mime```

**Update user MIME database**

```update-mime-database ~/.local/share/mime```

**Show version**

```update-mime-database -v```

**Display help**

```update-mime-database -h```

# SYNOPSIS

**update-mime-database** [_options_] _mime-dir_

# PARAMETERS

**-h**
> Display help and exit.

**-v**
> Display version and exit.

**-V**
> Verbose output during processing.

**-n**
> Only update if files have changed.

# DESCRIPTION

**update-mime-database** builds the shared MIME-Info database cache from XML source files. It scans the specified directory for MIME type definitions and compiles them into an optimized binary cache (mime.cache) for fast application access.

The database maps file patterns, magic bytes, and other characteristics to MIME types, enabling applications to correctly identify file types. System-wide definitions go in /usr/share/mime while user customizations use ~/.local/share/mime.

Package managers typically run this command automatically when installing software that provides new MIME type definitions. Manual execution is needed when adding custom MIME types.

# DIRECTORIES

**/usr/share/mime**: System-wide MIME database.

**/usr/share/mime/packages/**: Source XML files for MIME types.

**~/.local/share/mime**: User-specific MIME database.

# CAVEATS

Requires write permission to target directory. System directory updates need root privileges. Applications may need restart to recognize new types. Part of the shared-mime-info package.

# HISTORY

**update-mime-database** is part of the freedesktop.org shared-mime-info project, created to standardize MIME type handling across Linux desktop environments. Before this project, GNOME and KDE maintained separate incompatible MIME databases.

# SEE ALSO

[xdg-mime](/man/xdg-mime)(1), [file](/man/file)(1), [mimetype](/man/mimetype)(1)
