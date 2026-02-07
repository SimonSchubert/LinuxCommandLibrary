# TAGLINE

fast and user-friendly file finder

# TLDR

**Find files by name**

```fdfind [pattern]```

**Find with extension**

```fdfind -e [txt] [pattern]```

**Find directories only**

```fdfind -t d [pattern]```

**Find files only**

```fdfind -t f [pattern]```

**Search hidden files**

```fdfind -H [pattern]```

**Search specific directory**

```fdfind [pattern] [/path/to/search]```

**Execute command on results**

```fdfind [pattern] -x [command]```

**Case-sensitive search**

```fdfind -s [Pattern]```

# SYNOPSIS

**fdfind** [_options_] [_pattern_] [_path_...]

# PARAMETERS

**-e**, **--extension** _ext_
> Filter by extension.

**-t**, **--type** _type_
> Filter by type (f, d, l, x).

**-H**, **--hidden**
> Include hidden files.

**-I**, **--no-ignore**
> Don't respect ignore files.

**-s**, **--case-sensitive**
> Case-sensitive search.

**-x**, **--exec** _cmd_
> Execute command on each result.

**-X**, **--exec-batch** _cmd_
> Execute command with all results.

**-d**, **--max-depth** _num_
> Maximum search depth.

**-E**, **--exclude** _pattern_
> Exclude pattern.

# DESCRIPTION

**fdfind** (or fd) is a simple, fast, and user-friendly alternative to find, written in Rust. It uses regex patterns by default and respects .gitignore files, making it ideal for searching code repositories.

The command provides colorful output, sensible defaults that ignore hidden and gitignored files, and parallel execution for better performance. On Debian-based systems, the binary is named fdfind to avoid conflicts with another package.

# CAVEATS

Uses regex patterns by default, not glob syntax. Ignores hidden and .gitignore files unless explicitly enabled. May not cover all find use cases.

# SEE ALSO

[find](/man/find)(1), [ripgrep](/man/ripgrep)(1)
