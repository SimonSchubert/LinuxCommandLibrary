# TAGLINE

colorful disk usage tree visualizer

# TLDR

Show **graphical tree** of current directory

```dutree```

Show **specific directory**

```dutree [path/to/directory]```

**Aggregate** items smaller than a threshold

```dutree -a [10]M```

Show subdirectories up to **specific depth**

```dutree -d [2]```

**Skip directories** for fast overview

```dutree -f```

**Exclude hidden** files

```dutree -H```

**Exclude** files matching a pattern

```dutree -x "*.log"```

**Summary** of total size only

```dutree -s```

# SYNOPSIS

**dutree** [_options_] [_path_]

# DESCRIPTION

**dutree** is a disk usage analyzer that presents filesystem information as a colorful, hierarchical tree structure. Unlike traditional du output, dutree provides an intuitive visual representation that makes it easy to identify space-consuming directories at a glance.

The tool uses color coding and tree branches to show the relationship between directories and their contents, with file sizes displayed prominently. It can aggregate small items below a configurable threshold to keep the output readable and focused on the largest space consumers.

Written in Rust for performance, dutree handles large directory trees efficiently. The depth can be limited with **-d** to prevent overwhelming output. The tool is particularly useful for quick space audits and identifying directories suitable for cleanup.

# PARAMETERS

**-a**, **--aggr** _size_
> Aggregate items smaller than size (e.g., 1K, 10M, 1G).

**-d**, **--depth** _n_
> Maximum directory depth to display.

**-f**, **--files-only**
> Skip directories, show only files.

**-H**, **--no-hidden**
> Exclude hidden files and directories.

**-x**, **--exclude** _pattern_
> Exclude files matching glob pattern.

**-s**, **--summary**
> Show only total size.

**-b**, **--bytes**
> Print raw byte sizes instead of human-readable format.

# CAVEATS

Requires terminal with color support for best visualization. Large directories may take time to scan.

# SEE ALSO

[du](/man/du)(1), [dust](/man/dust)(1), [ncdu](/man/ncdu)(1), [tree](/man/tree)(1)
