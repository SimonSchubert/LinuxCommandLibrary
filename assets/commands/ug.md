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

**ug** is ugrep alias. It searches text patterns.

Fast searching. Optimized engine.

Interactive mode. Query UI.

Multiple formats. Text, binary, archive.

grep compatible. Similar options.

# CAVEATS

Alias for ugrep. Features vary by build. Fast but different.

# HISTORY

**ug** is typically an alias or symlink to **ugrep**, a fast grep alternative with interactive features.

# SEE ALSO

[ugrep](/man/ugrep)(1), [grep](/man/grep)(1), [rg](/man/rg)(1)
