# TAGLINE

Fast source code search tool in Go

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

**pt** (the Platinum Searcher) is a fast code search tool written in Go, similar to **ag** (The Silver Searcher) and **ack**. It recursively searches directory trees for text patterns, automatically skipping files listed in **.gitignore** and other VCS ignore files.

The tool is designed for searching source code in large projects. It supports filtering by file type, word-boundary matching, and context display around matches. Being written in Go gives it good cross-platform support with a single static binary.

# CAVEATS

Written in Go. Respects .gitignore.

# HISTORY

pt was created as a **fast code search** tool written in Go.

# SEE ALSO

[ag](/man/ag)(1), [rg](/man/rg)(1), [grep](/man/grep)(1)

