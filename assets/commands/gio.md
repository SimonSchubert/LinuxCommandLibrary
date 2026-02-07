# TAGLINE

GNOME file operations utility supporting local and virtual filesystems

# TLDR

**Open** a file with the default application

```gio open [path/to/file]```

**List** files in a directory

```gio list [path/to/directory]```

Show **information** about a file

```gio info [path/to/file]```

**Copy** a file

```gio copy [path/to/source] [path/to/destination]```

Send a file to the **trash** (reversible)

```gio trash [path/to/file]```

**Launch** an application from a .desktop file

```gio launch [path/to/file].desktop```

# SYNOPSIS

**gio** _command_ [_arguments_]

# PARAMETERS

**open** _FILE_
> Open file with default application

**list** _DIR_
> List contents of directory

**info** _FILE_
> Display information about a file

**copy** _SRC_ _DEST_
> Copy files

**move** _SRC_ _DEST_
> Move files

**trash** _FILE_
> Move file to trash

**remove** _FILE_
> Delete file permanently

**cat** _FILE_
> Display file contents

**launch** _DESKTOP_
> Launch application from .desktop file

**mime** _FILE_
> Get or set MIME type handler

**mount** _LOCATION_
> Mount a location

# DESCRIPTION

**gio** is the GIO command-line tool for file operations in GNOME-based systems. It provides a unified interface for both local files and virtual filesystems (GVfs), including network locations, trash, and removable media.

Unlike standard Unix commands, **gio** integrates with GNOME's infrastructure, respecting desktop settings for default applications, trash behavior, and virtual filesystem mounts. It can access locations like **smb://**, **sftp://**, **mtp://**, and **trash://**.

# CAVEATS

Requires GLib and GVfs to be properly installed. Some virtual filesystem operations require the gvfsd daemon running. Performance may be slower than native commands for local file operations.

# HISTORY

gio was introduced in GLib 2.50 (**2016**) as a unified command-line interface for GIO operations, consolidating various gvfs-* utilities into a single tool with subcommands.

# SEE ALSO

[xdg-open](/man/xdg-open)(1), [gvfs](/man/gvfs)(7), [nautilus](/man/nautilus)(1)
