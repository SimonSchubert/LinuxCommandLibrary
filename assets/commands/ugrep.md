# TAGLINE

Ultra-fast grep with interactive query mode

# TLDR

**Search pattern**

```ugrep "[pattern]" [file]```

**Recursive search**

```ugrep -r "[pattern]"```

**Interactive mode**

```ugrep -Q "[pattern]"```

**Search archives**

```ugrep -z "[pattern]" [archive.zip]```

**Boolean query**

```ugrep "[word1] AND [word2]"```

**Fuzzy matching**

```ugrep -Z "[pattern]" [file]```

# SYNOPSIS

**ugrep** [_-r_] [_-Q_] [_-z_] [_-Z_] [_options_] _pattern_ [_files_]

# PARAMETERS

**-r**
> Recursive.

**-Q**
> Interactive TUI.

**-z**
> Search archives.

**-Z**
> Fuzzy matching.

**-i**
> Case insensitive.

**--bool**
> Boolean queries.

# DESCRIPTION

**ugrep** is a high-performance text search tool designed as a modern replacement for grep with extended capabilities. It provides an interactive query mode with real-time results, Boolean search operators (AND, OR, NOT), fuzzy matching for approximate patterns, and the ability to search inside compressed archives and binary files.

The tool is grep-compatible and supports POSIX, Perl, and fixed-string pattern syntax. It can search recursively through directories with file type filtering, output results in various formats including JSON and CSV, and display context around matches.

Archive searching handles ZIP, tar, gzip, bzip2, and other compressed formats transparently. The interactive query UI (invoked via the **ug** alias) allows refining searches in real time.

# CAVEATS

Different from grep. More features. C++ implementation.

# HISTORY

**ugrep** was created as a fast, feature-rich grep replacement with interactive and fuzzy search capabilities.

# SEE ALSO

[grep](/man/grep)(1), [rg](/man/rg)(1), [ag](/man/ag)(1)
