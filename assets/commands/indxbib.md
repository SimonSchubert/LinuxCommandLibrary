# TLDR

**Build bibliography index**

```indxbib [database.bib]```

**Index multiple files**

```indxbib [file1.bib] [file2.bib]```

**Specify output base**

```indxbib -o [index] [database.bib]```

**Set common words file**

```indxbib -c [common.txt] [database.bib]```

# SYNOPSIS

**indxbib** [_options_] _file_...

# PARAMETERS

**-o** _NAME_
> Output index base name.

**-c** _FILE_
> Common words file to ignore.

**-h** _N_
> Minimum word length to index.

**-i** _STRING_
> Characters to ignore in index keys.

**-l** _N_
> Maximum keys per record.

**--help**
> Display help information.

# DESCRIPTION

**indxbib** creates inverted indexes for bibliographic databases. These indexes enable fast lookups by lkbib and refer.

The tool processes refer-format bibliography files. The generated index files have extensions .ia, .ib, .ic.

indxbib indexes bibliography databases.

# CAVEATS

Part of groff. Works with refer-format files. Index files are binary.

# HISTORY

indxbib is part of the **groff** document formatting system, derived from traditional Unix refer tools.

# SEE ALSO

[refer](/man/refer)(1), [lkbib](/man/lkbib)(1), [lookbib](/man/lookbib)(1), [groff](/man/groff)(1)
