# TLDR

**Search for pattern**

```pt [pattern]```

**Search in specific directory**

```pt [pattern] [path]```

**Search specific file types**

```pt --type=[go] [pattern]```

**Case insensitive search**

```pt -i [pattern]```

**Show only filenames**

```pt -l [pattern]```

# SYNOPSIS

**pt** [_options_] _pattern_ [_path_]

# PARAMETERS

_PATTERN_
> Search pattern.

_PATH_
> Search path.

**-i**
> Case insensitive.

**-l**
> Files only.

**--type** _TYPE_
> File type filter.

**-w**
> Word match.

**-C** _N_
> Context lines.

# DESCRIPTION

**pt** is the Platinum Searcher. Fast code search tool.

The tool searches source code quickly. Similar to ag.

pt searches code.

# CAVEATS

Written in Go. Respects .gitignore.

# HISTORY

pt was created as a **fast code search** tool written in Go.

# SEE ALSO

[ag](/man/ag)(1), [rg](/man/rg)(1), [grep](/man/grep)(1)

