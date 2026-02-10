# TAGLINE

preserves the first line of a file while passing the remaining lines through

# TLDR

**Sort file keeping header**

```keep-header [file] -- sort```

**Filter with grep keeping header**

```keep-header [file] -- grep [pattern]```

**Pipe through multiple commands**

```keep-header [file] -- sort | head -20```

# SYNOPSIS

**keep-header** _file_ **--** _command_ [_args_...]

# DESCRIPTION

**keep-header** preserves the first line (header) of a file while passing the remaining lines through another command. Useful for processing CSV or TSV files where you want to sort or filter data without losing column headers.

# SEE ALSO

[head](/man/head)(1), [tail](/man/tail)(1), [sort](/man/sort)(1)

