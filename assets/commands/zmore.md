# TLDR

**View a compressed file** one screen at a time

```zmore [file.gz]```

**View with a specific number** of lines per screen

```zmore -[20] [file.gz]```

**Display helpful prompts** instead of beeping on invalid keys

```zmore -d [file.gz]```

**Squeeze multiple blank lines** into one

```zmore -s [file.gz]```

**Start at first occurrence** of a pattern

```zmore +/[pattern] [file.gz]```

# SYNOPSIS

**zmore** [_-dfls_] [_+linenum_] [_+/pattern_] [_file ..._]

# PARAMETERS

**-_number_**
> Number of lines per screen

**-d**
> Display helpful messages instead of ringing bell on errors

**-f**
> Count logical lines rather than screen lines (long lines not folded)

**-l**
> Do not pause after form feed characters

**-s**
> Squeeze consecutive blank lines into one

**+_linenum_**
> Start at specified line number

**+/_pattern_**
> Start two lines before first match of pattern

# DESCRIPTION

**zmore** is a pager for viewing compressed text files one screen at a time. It works with files compressed using gzip, compress, or pack, and also handles uncompressed files.

If a file doesn't exist, zmore automatically looks for versions with .gz, .z, or .Z extensions. The command combines decompression with the more pager, displaying --More-- at the bottom of each screenful.

Press space to advance one screen, Enter for one line, or q to quit. When output is not a terminal, zmore behaves like zcat, decompressing to stdout.

# CAVEATS

zmore cannot scroll backward through files; use **zless** for bi-directional scrolling. On SSDs, repeatedly viewing compressed files causes minimal wear, but extracting files does. Set the PAGER environment variable to use an alternative pager like less.

# HISTORY

zmore was created as part of the **gzip** package in the early 1990s to provide convenient viewing of compressed files. It wraps the traditional more pager with on-the-fly decompression.

# SEE ALSO

[zless](/man/zless)(1), [zcat](/man/zcat)(1), [more](/man/more)(1), [gzip](/man/gzip)(1)
