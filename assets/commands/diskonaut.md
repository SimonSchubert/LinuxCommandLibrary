# TLDR

**Analyze current directory**

```diskonaut```

**Analyze specific directory**

```diskonaut [/path/to/directory]```

**Show apparent size** instead of disk usage

```diskonaut --apparent-size [directory]```

**Ignore hidden files**

```diskonaut --ignore-hidden [directory]```

# SYNOPSIS

**diskonaut** [_options_] [_path_]

# PARAMETERS

_PATH_
> Directory to analyze (defaults to current directory).

**--apparent-size**
> Show apparent file size instead of disk usage.

**--ignore-hidden**
> Ignore hidden files and directories.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**diskonaut** is a terminal-based disk space navigator that displays directory sizes in an interactive treemap visualization. It allows exploring disk usage with keyboard navigation to quickly identify space-consuming directories and files.

The treemap view represents directories as nested rectangles proportional to their size, providing an intuitive visual overview of disk space distribution. Navigation allows drilling into directories and viewing detailed size information.

diskonaut is written in Rust and designed for performance, capable of quickly analyzing large directory trees while maintaining a responsive interface.

# CAVEATS

Requires terminal with sufficient size for meaningful visualization. Very deep directory structures may be difficult to navigate. Initial scan of large filesystems takes time.

# HISTORY

diskonaut was created as a modern, terminal-based alternative to graphical disk usage analyzers. Written in Rust, it combines the accessibility of TUI applications with visual treemap representations popular in GUI tools.

# SEE ALSO

[ncdu](/man/ncdu)(1), [du](/man/du)(1), [duf](/man/duf)(1), [dust](/man/dust)(1)
