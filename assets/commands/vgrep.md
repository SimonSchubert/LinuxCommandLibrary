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

**vgrep** searches with editor integration. It opens results.

Index-based access. Select by number.

Editor integration. Open matches.

Interactive mode. Navigate results.

Git-aware. Respects .gitignore.

# CAVEATS

Go implementation. Editor config needed. Different from grep.

# HISTORY

**vgrep** was created for quickly searching code and opening results in an editor by index.

# SEE ALSO

[grep](/man/grep)(1), [rg](/man/rg)(1), [ag](/man/ag)(1)
