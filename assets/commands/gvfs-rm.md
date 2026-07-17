# TAGLINE

removes files using GVFS

# TLDR

**Remove file**

```gvfs-rm [file]```

**Remove remote file**

```gvfs-rm smb://server/share/file.txt```

**Force removal**

```gvfs-rm -f [file]```

# SYNOPSIS

**gvfs-rm** [_options_] _location_

# PARAMETERS

_LOCATION_
> File path or URI to remove.

**-f**, **--force**
> Ignore nonexistent and non-deletable files.

**-?**, **--help**
> Print a short help text and exit.

# DESCRIPTION

**gvfs-rm** removes files using GVFS. It can delete local files and files on remote servers accessed through GVFS backends.

The tool handles deletion across different protocols transparently. It works with SMB, FTP, SSH, and other GVFS-supported systems.

# CAVEATS

Part of the gvfs-bin command-line tools, deprecated in gvfs 1.31 (2016) and removed entirely in gvfs 1.38 (2018) in favor of the unified **gio** command (`gio remove`). Modern distributions no longer ship gvfs-rm. Deletes permanently rather than sending to trash; no recursive directory removal. Use **gvfs-trash** for recoverable deletion.

# HISTORY

**gvfs-rm** was part of GVFS's original gvfs-bin utilities, introduced for GNOME alongside GVFS in **2008** (GNOME 2.22). It has since been superseded by **gio remove**.

# SEE ALSO

[gio](/man/gio)(1), [rm](/man/rm)(1), [gvfs-trash](/man/gvfs-trash)(1)

# RESOURCES

```[Source code](https://gitlab.gnome.org/GNOME/gvfs)```

```[Homepage](https://wiki.gnome.org/Projects/gvfs)```

<!-- verified: 2026-07-17 -->
