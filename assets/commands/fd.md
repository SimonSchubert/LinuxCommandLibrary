# TAGLINE

fast and user-friendly file finder

# TLDR

**Find files by** name

```fd [pattern]```

**Find with specific** extension

```fd -e [txt] [pattern]```

**Find in directory**

```fd [pattern] [directory]```

**Include hidden files**

```fd -H [pattern]```

**Execute command on** results

```fd [pattern] -x [command]```

# SYNOPSIS

**fd** [_options_] [_pattern_] [_path_...]

# PARAMETERS

_PATTERN_
> Search pattern (regex by default).

_PATH_
> Directory to search (default: current).

**-e** _EXT_, **--extension** _EXT_
> Filter by file extension.

**-t** _TYPE_, **--type** _TYPE_
> Filter by type: f (file), d (directory), l (symlink).

**-H**, **--hidden**
> Include hidden files.

**-I**, **--no-ignore**
> Don't respect .gitignore.

**-x** _CMD_, **--exec** _CMD_
> Execute command on each result.

**-X** _CMD_, **--exec-batch** _CMD_
> Execute command with all results.

**-d** _N_, **--max-depth** _N_
> Maximum search depth.

**--help**
> Display help information.

# DESCRIPTION

**fd** is a modern replacement for find, written in Rust. It provides intuitive syntax, colorful output, smart defaults, and significant performance improvements over traditional find.

By default, fd ignores hidden files and respects .gitignore patterns. It uses regex patterns rather than glob, provides parallel command execution, and produces human-friendly output.

fd aims to cover 80% of find use cases with simpler syntax while being faster through parallelization.

# CAVEATS

Regex by default (not glob). Ignores hidden and gitignored files by default. Not a complete find replacement.

# HISTORY

fd was created by **David Peter** as a simpler, faster alternative to find. Written in Rust, it emphasizes user experience with sensible defaults and modern terminal output.

# SEE ALSO

[find](/man/find)(1), [rg](/man/rg)(1), [locate](/man/locate)(1)
