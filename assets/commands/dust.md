# TAGLINE

intuitive disk usage analyzer with visualization

# TLDR

**Show disk usage** of current directory

```dust```

**Show disk usage** with depth limit

```dust -d [2]```

**Show disk usage** of specific directory

```dust [/path/to/directory]```

**Show disk usage** including hidden files

```dust -H```

**Show only files** (not directories)

```dust -f```

**Show apparent size** instead of disk usage

```dust -s```

**Reverse sort order** (smallest first)

```dust -r```

**Show disk usage** without percentages

```dust -p```

# SYNOPSIS

**dust** [_options_] [_paths_...]

# DESCRIPTION

**dust** (du + rust) is a modern, intuitive disk usage analyzer that shows the size of directories and files in a tree structure. It provides a visual representation with percentage bars, making it easy to identify large files and directories.

Unlike traditional du, dust displays results in a tree format with visual size indicators, automatically limiting depth for readable output. It defaults to showing the largest items first and includes a percentage column showing relative sizes.

The tool is written in Rust for performance and handles large directory trees efficiently with parallel processing.

# PARAMETERS

**-d** _n_, **--depth** _n_
> Maximum depth to display.

**-n** _num_
> Number of items to show.

**-r**, **--reverse**
> Reverse sort order.

**-s**, **--apparent-size**
> Show apparent size instead of disk usage.

**-f**, **--files-only**
> Only show files, not directories.

**-H**, **--no-hidden**
> Exclude hidden files.

**-p**, **--no-percent-bars**
> Hide percentage bars.

**-c**, **--no-colors**
> Disable colored output.

**-b**, **--no-bars**
> Hide bars entirely.

**-i**, **--ignore-directory** _name_
> Ignore specified directory.

**-x**, **--one-filesystem**
> Stay on one filesystem.

**-j**, **--threads** _n_
> Number of threads to use.

# CAVEATS

Results may differ from du due to block size vs apparent size differences. Very large directory trees may take time to scan. Requires terminal with color support for best visualization. Symlinks are not followed by default.

# HISTORY

**dust** was created by **Andy Boot** in **2018** as a Rust-based alternative to du with better visualization. It was designed to address common complaints about du's output format and difficulty in interpreting results. The project gained popularity as part of the wave of Rust-based CLI tool replacements for traditional Unix utilities.

# SEE ALSO

[du](/man/du)(1), [ncdu](/man/ncdu)(1), [duf](/man/duf)(1), [df](/man/df)(1)
