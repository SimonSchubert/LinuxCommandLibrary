# TLDR

**Split file into 1000-line pieces**

```split [file]```

**Split into pieces with custom prefix**

```split [file] [prefix_]```

**Split into specific number of lines**

```split -l [500] [file]```

**Split into specific size pieces**

```split -b [10M] [file]```

**Split into N equal pieces**

```split -n [5] [file]```

**Split with numeric suffixes**

```split -d [file]```

**Split with custom suffix length**

```split -a [4] [file]```

# SYNOPSIS

**split** [_options_] [_file_ [_prefix_]]

# PARAMETERS

**-l** _lines_, **--lines**=_lines_
> Put specified number of lines per output file

**-b** _size_, **--bytes**=_size_
> Put specified bytes per output file (K, M, G suffixes)

**-n** _chunks_, **--number**=_chunks_
> Generate specified number of output files

**-d**, **--numeric-suffixes**
> Use numeric suffixes instead of alphabetic

**-a** _N_, **--suffix-length**=_N_
> Generate suffixes of length N (default: 2)

**-e**, **--elide-empty-files**
> Do not generate empty output files with -n

**--verbose**
> Print message for each output file

**--additional-suffix**=_suf_
> Append additional suffix to file names

**-x**, **--hex-suffixes**
> Use hexadecimal suffixes

# DESCRIPTION

**split** divides a file into smaller pieces. By default, it creates files with 1000 lines each, named with a prefix (default: **x**) followed by a suffix (aa, ab, ac, ...).

The command is useful for breaking large files for transmission, processing, or storage limitations. It works with both text and binary files.

Size specifications accept suffixes: **K** (kilobytes), **M** (megabytes), **G** (gigabytes), and also **KB**, **MB**, **GB** for powers of 1000.

Split reads from stdin if no file is specified or if file is **-**.

# CAVEATS

The default 2-character suffix limits output to 676 files (aa-zz). Use **-a** to increase suffix length for more pieces, or **-d** for numeric suffixes.

When splitting binary files, use **-b** (bytes) not **-l** (lines) to avoid corruption at arbitrary byte boundaries.

To reassemble, use **cat prefix\*** > **original_file**. Ensure files are concatenated in correct alphabetical/numerical order.

# SEE ALSO

[csplit](/man/csplit)(1), [cat](/man/cat)(1), [head](/man/head)(1), [tail](/man/tail)(1)
