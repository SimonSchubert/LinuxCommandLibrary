# TAGLINE

lists files and directory contents using GVFS

# TLDR

**List directory**

```gvfs-ls [directory]```

**List remote directory**

```gvfs-ls smb://server/share/```

**Show hidden files**

```gvfs-ls -h [directory]```

**Long listing format**

```gvfs-ls -l [directory]```

**Show specific attributes**

```gvfs-ls -a [standard::name,standard::size] [directory]```

# SYNOPSIS

**gvfs-ls** [_options_] [_location_...]

# PARAMETERS

_LOCATION_
> File or directory path or URI (defaults to the current directory).

**-h**, **--hidden**
> Show hidden files.

**-l**, **--long**
> Long listing format.

**-a**, **--attributes** _ATTR_
> Show specific attributes, given as gvfs attribute names, a namespace, or `*` for all.

**-n**, **--nofollow-symlinks**
> Don't follow symlinks.

**--version**
> Display version information.

**--help**
> Display help information.

# DESCRIPTION

**gvfs-ls** lists information about the given locations, similar to the traditional **ls** utility but using GVFS locations instead of local files, so paths like smb://server/share/file.txt can be listed directly.

Attributes requested with **-a** can be gvfs attribute names (e.g. standard::icon), a namespace (e.g. unix), or a wildcard (*), with multiple values separated by commas.

# CAVEATS

Part of the gvfs-bin command-line tools, deprecated in gvfs 1.31 (2016) and removed entirely in gvfs 1.38 (2018) in favor of the unified **gio** command (`gio list`). Modern distributions no longer ship gvfs-ls. Requires a running GVFS daemon to reach non-local backends.

# HISTORY

**gvfs-ls** was part of GVFS's original gvfs-bin utilities, introduced for GNOME alongside GVFS in **2008** (GNOME 2.22) as a replacement for the older gnome-vfs library's tools. It has since been superseded by **gio list**.

# SEE ALSO

[gio](/man/gio)(1), [ls](/man/ls)(1), [gvfs-info](/man/gvfs-info)(1)

# RESOURCES

```[Source code](https://gitlab.gnome.org/GNOME/gvfs)```

```[Homepage](https://wiki.gnome.org/Projects/gvfs)```

<!-- verified: 2026-07-17 -->
