# TAGLINE

modern disk usage and free space utility

# TLDR

**Show disk usage** for all mounted filesystems

```duf```

**Show only local filesystems**

```duf --only local```

**Show specific mount points**

```duf [/] [/home]```

**Show all filesystems** including special

```duf --all```

**Hide specific filesystem types**

```duf --hide-fs tmpfs,devtmpfs```

**Output as JSON**

```duf --json```

**Sort by usage percentage**

```duf --sort usage```

**Show inodes** instead of disk space

```duf --inodes```

# SYNOPSIS

**duf** [_options_] [_paths_...]

# DESCRIPTION

**duf** (Disk Usage/Free) is a modern replacement for the df command with a colorful, user-friendly terminal interface. It displays disk usage and free space for mounted filesystems in an organized table format.

The tool provides a clear visual representation with color-coded usage bars, making it easy to identify nearly-full filesystems at a glance. It groups filesystems by type (local, network, special) for better organization.

duf automatically handles various filesystem types and units, displaying sizes in human-readable format. It supports multiple output formats including JSON for scripting.

# PARAMETERS

**--all**
> Show all filesystems including pseudo.

**--only** _types_
> Show only specified filesystem types.

**--hide** _paths_
> Hide specific mount points.

**--hide-fs** _types_
> Hide specific filesystem types.

**--hide-mp** _paths_
> Hide mount points.

**--inodes**
> Show inode information.

**--json**
> Output as JSON.

**--output** _fields_
> Specify output columns.

**--sort** _field_
> Sort by field (size, used, avail, usage, inodes, type, mountpoint).

**--style** _style_
> Output style (unicode, ascii).

**--theme** _theme_
> Color theme (dark, light).

**--width** _n_
> Maximum output width.

# CAVEATS

Requires terminal with color support for best experience. Network filesystems may show stale information if unavailable. Some special filesystems may report unusual values. Root privileges may be needed to see all mount points.

# HISTORY

**duf** was created by **Christian Muehlhaeuser** in **2020** as a modern, user-friendly alternative to the traditional df command. Written in Go, it was designed to provide better visual output and easier interpretation of disk space information. The tool gained popularity quickly in the developer community for its clean interface and practical features.

# SEE ALSO

[df](/man/df)(1), [du](/man/du)(1), [ncdu](/man/ncdu)(1), [dust](/man/dust)(1)
