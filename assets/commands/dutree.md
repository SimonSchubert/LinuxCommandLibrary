# TAGLINE

colorful disk usage tree visualizer

# TLDR

Show **graphical tree** of current directory

```dutree```

Show **specific directory**

```dutree [path/to/directory]```

**Aggregate** items smaller than size

```dutree --aggr [number]K```

Show subdirectories up to **specific depth**

```dutree --depth [depth]```

**Skip directories** for fast overview

```dutree --files-only```

**Exclude hidden** files

```dutree --no-hidden```

# SYNOPSIS

**dutree** [_options_] [_path_]

# DESCRIPTION

**dutree** is a disk usage analyzer that presents filesystem information as a colorful, hierarchical tree structure. Unlike traditional du output, dutree provides an intuitive visual representation that makes it easy to identify space-consuming directories at a glance.

The tool uses color coding and tree branches to show the relationship between directories and their contents, with file sizes displayed prominently. It automatically aggregates small items below a threshold to keep the output readable and focused on the largest space consumers.

Written in Rust for performance, dutree handles large directory trees efficiently. The default depth limit of 1 prevents overwhelming output, but can be adjusted for deeper analysis. The tool is particularly useful for quick space audits and identifying directories suitable for cleanup.

# PARAMETERS

**--aggr** _size_
> Aggregate items smaller than size (K, M, G)

**--depth** _n_
> Maximum depth (default: 1)

**--files-only**
> Skip directories

**--no-hidden**
> Exclude hidden files

**-x, --exclude** _pattern_
> Exclude files matching pattern

# CAVEATS

Requires terminal with color support for best visualization. Large directories may take time to scan.

# SEE ALSO

[du](/man/du)(1), [ncdu](/man/ncdu)(1), [dust](/man/dust)(1)
