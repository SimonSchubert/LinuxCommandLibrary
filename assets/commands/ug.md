# TAGLINE

Interactive ugrep pattern search alias

# TLDR

**Search pattern**

```ug "[pattern]" [file]```

**Search recursively**

```ug -r "[pattern]"```

**Case insensitive**

```ug -i "[pattern]" [file]```

**Show line numbers**

```ug -n "[pattern]" [file]```

**Interactive mode**

```ug -Q "[pattern]"```

**Count matches**

```ug -c "[pattern]" [file]```

# SYNOPSIS

**ug** [_-i_] [_-r_] [_-n_] [_-Q_] [_options_] _pattern_ [_files_]

# PARAMETERS

**-i**
> Case insensitive.

**-r**
> Recursive search.

**-n**
> Line numbers.

**-Q**
> Interactive query.

**-c**
> Count matches.

**-l**
> Files only.

# DESCRIPTION

**ug** is the interactive query alias for **ugrep**, a fast pattern search tool. When invoked as ug, it launches ugrep's interactive query UI by default, allowing real-time search refinement as you type the pattern.

The interactive mode displays results instantly and updates as the query changes, making it useful for exploratory code searching. It supports the same extensive feature set as ugrep including Boolean queries, fuzzy matching, and searching within archives.

See **ugrep** for full documentation of search options and capabilities.

# CAVEATS

Alias for ugrep. Features vary by build. Fast but different.

# HISTORY

**ug** is typically an alias or symlink to **ugrep**, a fast grep alternative with interactive features.

# SEE ALSO

[ugrep](/man/ugrep)(1), [grep](/man/grep)(1), [rg](/man/rg)(1)
