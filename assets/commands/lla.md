# TAGLINE

Blazing fast ls replacement with superpowers

# TLDR

**List files** in the current directory

```lla```

**List files in long format**

```lla -l```

**List files as a tree**

```lla -t```

**List files in a table layout**

```lla -T```

**List files in a grid**

```lla -g```

# SYNOPSIS

**lla** [_options_] [_path_...]

# PARAMETERS

**-l**, **--long**
> Display in long format with detailed information.

**-t**, **--tree**
> Display as a tree structure.

**-T**, **--table**
> Display in table layout.

**-g**, **--grid**
> Display in grid layout.

**-s**, **--sort** _CRITERIA_
> Sort by criteria (name, size, date).

# DESCRIPTION

**lla** is a modern **ls** replacement built in Rust with multiple view modes (default, long, tree, table, grid), Git integration with status visualization, smart search with complex filtering patterns (OR, AND, NOT, XOR), regex support, and content search.

Additional features include a diff command for directory or file comparisons, timeline view, storage analysis, interactive directory navigation with bookmarks and history, size filters with human-readable units, and time filters supporting ISO dates and relative durations.

# CAVEATS

Some features like Git integration require a Git repository. Plugin ecosystem extends functionality but adds complexity.

# HISTORY

**lla** was created by **chaqchase** and is written in **Rust**.

# SEE ALSO

[ls](/man/ls)(1), [eza](/man/eza)(1), [lsd](/man/lsd)(1)
