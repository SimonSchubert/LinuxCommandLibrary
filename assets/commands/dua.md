# TAGLINE

fast parallel disk usage analyzer

# TLDR

**Analyze current directory**

```dua```

**Analyze specific path**

```dua [/path/to/directory]```

**Interactive mode**

```dua i```

**Interactive with specific path**

```dua i [/path/to/directory]```

**Show apparent size** instead of disk usage

```dua -A [/path/to/directory]```

**Use specific number of threads**

```dua -t [4] [/path/to/directory]```

**Show all files** (not just directories)

```dua -f [/path/to/directory]```

**Show version**

```dua --version```

# SYNOPSIS

**dua** [_options_] [_path_...]

**dua** **i** [_options_] [_path_...]

# COMMANDS

**i**, **interactive**
> Start interactive mode.

**aggregate** [_path_...]
> Default mode, show sizes.

# PARAMETERS

**-A**, **--apparent-size**
> Show apparent size instead of disk usage.

**-t**, **--threads** _count_
> Number of threads for traversal.

**-f**, **--format** _type_
> Size format: metric, binary, bytes, GB, GiB, MB, MiB.

**--ignore-dirs**
> Don't cross filesystem boundaries.

**-l**, **--count-hard-links**
> Count hard-linked files multiple times.

**--stay-on-filesystem**
> Don't cross mount points.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# INTERACTIVE KEYS

**j**/**k** or **Down**/**Up**
> Navigate entries.

**Enter** or **l**
> Enter directory.

**u** or **h**
> Go up to parent.

**o**
> Open in file manager.

**d**
> Mark for deletion.

**Space**
> Toggle expansion.

**s**
> Sort by size.

**r**
> Refresh.

**g**
> Go to top.

**G**
> Go to bottom.

**Ctrl+c** or **q**
> Quit.

# DESCRIPTION

**dua** (Disk Usage Analyzer) is a fast disk space analyzer with an optional interactive interface. It scans directories and displays sizes.

Default mode shows aggregate sizes for paths. Interactive mode (**dua i**) provides a navigable tree view for exploring disk usage.

Multi-threaded traversal makes dua faster than traditional du on SSDs and parallel filesystems. Thread count auto-detects but can be overridden.

Apparent size (**-A**) shows actual file content size. Without it, dua shows disk usage which includes filesystem overhead and sparse file handling.

In interactive mode, mark files for deletion with **d** and confirm before quitting. This enables cleaning up large files directly from the interface.

# CAVEATS

Deletion in interactive mode is permanent (no trash). Scanning very large filesystems takes time despite parallelism. Apparent vs disk size can differ significantly for sparse files.

# HISTORY

dua was created by **Sebastian Thiel** (Byron) and first released around **2019**. Written in Rust, it was designed as a fast, user-friendly alternative to du and ncdu. The project emphasizes performance through parallel traversal and provides both CLI and TUI interfaces. It's part of a broader suite of Rust file utilities.

# SEE ALSO

[du](/man/du)(1), [ncdu](/man/ncdu)(1), [dust](/man/dust)(1), [gdu](/man/gdu)(1)
