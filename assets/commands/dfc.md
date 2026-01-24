# TLDR

**Display disk usage** with color-coded graph bars

```dfc```

**Show all filesystems** including pseudo and special

```dfc -a```

**Display in a specific unit** (K, M, G, T, P, E, Z, Y)

```dfc -u [G]```

**Show only specific filesystem types**

```dfc -t [ext4,btrfs]```

**Export output as CSV**

```dfc -e csv```

**Sort by filesystem name**

```dfc -s [name]```

**Hide specific columns**

```dfc -d [used,avail]```

**Display without colors**

```dfc -c never```

# SYNOPSIS

**dfc** [_-adfghilmnopqsTvwWX_] [_-c when_] [_-e format_] [_-s column_] [_-t types_] [_-u unit_] [_path ..._]

# PARAMETERS

**-a**
> Include all filesystems (pseudo, duplicate, inaccessible).

**-c** _when_
> Color mode: always, auto, or never.

**-d** _list_
> Hide specified columns (comma-separated).

**-e** _format_
> Export format: csv, html, json, or text.

**-f**
> Disable auto-scale, print in bytes.

**-g**
> Show graph only.

**-h**
> Display help.

**-i**
> Show information about inodes instead of disk space.

**-l**
> Show only local filesystems.

**-m**
> Use SI units (powers of 1000 instead of 1024).

**-n**
> Do not print header.

**-o**
> Show mount options.

**-p**
> Show percentage used only in the graph.

**-q**
> Hide the graph bar.

**-s** _column_
> Sort by column (name, type, used, avail, etc.).

**-t** _types_
> Filter by filesystem types (comma-separated).

**-T**
> Show filesystem type.

**-u** _unit_
> Force display unit (k, m, g, t, p, e, z, y, h).

**-w**
> Wide output (no column truncation).

**-W**
> Wide output for mount points.

**-X**
> Exclude pseudo filesystems.

# DESCRIPTION

**dfc** (disk free color) is an enhanced df command that displays filesystem disk space usage with color-coded bar graphs. It provides a more visual and readable alternative to the traditional df output.

The graph bars change color based on usage levels: typically green for low usage, yellow for moderate, and red for high usage. This visual representation makes it easy to quickly identify filesystems approaching capacity.

Output can be customized extensively through column selection, sorting, and filtering. The tool supports multiple export formats including CSV, JSON, and HTML for integration with other tools or reporting systems. Filesystem type filtering allows focusing on specific storage types.

Configuration options can be set in **~/.config/dfc/dfcrc** or **/etc/dfc.conf** for persistent preferences. Color thresholds and graph characters can be customized in the configuration file.

# CAVEATS

Colors require a terminal with color support. Very long mount point names may be truncated in default mode (use -W for full paths). Some virtual filesystems may show unexpected values. Graph width adapts to terminal width.

# HISTORY

**dfc** was created by Robin Hahling as a colorful, user-friendly replacement for the traditional df command. The project focuses on making disk space monitoring more visual and accessible. It's written in C and available in repositories of most major Linux distributions.

# SEE ALSO

[df](/man/df)(1), [du](/man/du)(1), [ncdu](/man/ncdu)(1), [dust](/man/dust)(1), [duf](/man/duf)(1)
