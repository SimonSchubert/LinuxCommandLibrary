# TAGLINE

disk usage display with color-coded graphs

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

**Sort output** by filesystem name

```dfc -q [name]```

**Show used size** and mount options

```dfc -d -o```

**Display without colors**

```dfc -c never```

# SYNOPSIS

**dfc** [_-abdfhilmMnosTvwW_] [_-c when_] [_-e format_] [_-p fsname_] [_-q sortby_] [_-t fstype_] [_-u unit_]

# PARAMETERS

**-a**
> Show all filesystems (do not omit any).

**-b**
> Do not show the graph bar.

**-c** _when_
> Color mode: always, auto, or never.

**-d**
> Show used size.

**-e** _format_
> Export to format: csv, html, json, tex, or text.

**-f**
> Override auto-adjust behavior by forcing information to be displayed.

**-h**
> Display help.

**-i**
> Show information about inodes instead of disk space.

**-l**
> Show only local filesystems.

**-m**
> Use SI units (powers of 1000 instead of 1024).

**-M**
> Do not print "mounted on".

**-n**
> Do not print header.

**-o**
> Show mount options.

**-p** _fsname_
> Filter by filesystem name (prefix with - to exclude).

**-q** _sortby_
> Sort output by: name, type, or mount.

**-s**
> Sum the total usage.

**-t** _fstype_
> Filter by filesystem types (comma-separated, prefix with - to exclude).

**-T**
> Show filesystem type.

**-u** _unit_
> Force display unit (h, b, k, m, g, t, p, e, z, y).

**-w**
> Use a wider bar for the graph.

**-W**
> Wide path name (avoid truncation of mount points).

# DESCRIPTION

**dfc** (disk free color) is an enhanced df command that displays filesystem disk space usage with color-coded bar graphs. It provides a more visual and readable alternative to the traditional df output.

The graph bars change color based on usage levels: typically green for low usage, yellow for moderate, and red for high usage. This visual representation makes it easy to quickly identify filesystems approaching capacity.

Output can be customized extensively through column selection, sorting, and filtering. The tool supports multiple export formats including CSV, JSON, and HTML for integration with other tools or reporting systems. Filesystem type filtering allows focusing on specific storage types.

Configuration options can be set in **~/.config/dfc/dfcrc** or **/etc/dfc.conf** for persistent preferences. Color thresholds and graph characters can be customized in the configuration file.

# CAVEATS

Colors require a terminal with color support. Very long mount point names may be truncated in default mode (use -W for full paths). Some virtual filesystems may show unexpected values. Graph width adapts to terminal width.

# HISTORY

**dfc** was created by Robin Hahling as a colorful, user-friendly replacement for the traditional df command. The project focuses on making disk space monitoring more visual and accessible. It's written in C and available in repositories of most major Linux distributions.

# INSTALL

```apt: sudo apt install dfc```

```dnf: sudo dnf install dfc```

```pacman: sudo pacman -S dfc```

```apk: sudo apk add dfc```

```zypper: sudo zypper install dfc```

```brew: brew install dfc```

```nix: nix profile install nixpkgs#dfc```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[df](/man/df)(1), [du](/man/du)(1), [ncdu](/man/ncdu)(1), [dust](/man/dust)(1), [duf](/man/duf)(1)

# RESOURCES

```[Source code](https://github.com/rolinh/dfc)```

<!-- verified: 2026-07-11 -->
