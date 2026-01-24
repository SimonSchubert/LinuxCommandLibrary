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

**ugrep** searches text fast. It's a modern grep.

Interactive UI. Query mode.

Archive searching. ZIP, tar, etc.

Boolean queries. AND, OR, NOT.

Fuzzy matching. Approximate search.

# CAVEATS

Different from grep. More features. C++ implementation.

# HISTORY

**ugrep** was created as a fast, feature-rich grep replacement with interactive and fuzzy search capabilities.

# SEE ALSO

[grep](/man/grep)(1), [rg](/man/rg)(1), [ag](/man/ag)(1)
