# TAGLINE

Interactive grep with editor integration

# TLDR

**Search pattern**

```vgrep "[pattern]"```

**Search in directory**

```vgrep "[pattern]" [path]```

**Open results interactively**

```vgrep -s "[pattern]"```

**Show specific result**

```vgrep --show [index]```

**No git ignore**

```vgrep --no-git "[pattern]"```

# SYNOPSIS

**vgrep** [_-s_] [_--show index_] [_options_] _pattern_ [_path_]

# PARAMETERS

**-s**
> Interactive mode.

**--show** _INDEX_
> Show result by index.

**--no-git**
> Don't use gitignore.

**-n**
> Line numbers.

**-i**
> Case insensitive.

# DESCRIPTION

**vgrep** is a pager for grep results that assigns an index number to each match, allowing you to quickly open specific results in your editor by number. It respects .gitignore rules by default and provides both batch and interactive modes.

In interactive mode (**-s**), results can be browsed and opened directly. The **--show** flag opens a previously indexed result without re-running the search, making it efficient for navigating through matches in a codebase.

# CAVEATS

Go implementation. Editor config needed. Different from grep.

# HISTORY

**vgrep** was created for quickly searching code and opening results in an editor by index.

# SEE ALSO

[grep](/man/grep)(1), [rg](/man/rg)(1), [ag](/man/ag)(1)
