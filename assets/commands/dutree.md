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

**dutree** analyzes filesystem usage and displays colorful text-based trees showing disk space consumption. It provides a visual representation of directory sizes.

Written in Rust, it offers fast performance and intuitive output.

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
