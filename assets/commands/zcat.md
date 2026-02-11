# TAGLINE

View gzip-compressed file contents

# TLDR

**View contents** of a gzipped file

```zcat [file.gz]```

**View contents of multiple** gzipped files

```zcat [file1.gz] [file2.gz]```

**Pipe output** to another command

```zcat [file.gz] | grep "[pattern]"```

**Display with line numbers**

```zcat [file.gz] | nl```

**Check integrity** of a gzipped file

```zcat -t [file.gz]```

**View verbose information** about a gzipped file

```zcat -l [file.gz]```

# SYNOPSIS

**zcat** [_options_] [_file ..._]

# PARAMETERS

**-f**, **--force**
> Force decompression even if file has multiple links or output is to a terminal.

**-h**, **--help**
> Display help message and exit.

**-k**, **--keep**
> Keep input files (don't delete).

**-l**, **--list**
> List compressed and uncompressed file sizes and compression ratio.

**-q**, **--quiet**
> Suppress all warning messages.

**-r**, **--recursive**
> Operate recursively on directories.

**-t**, **--test**
> Test compressed file integrity without decompressing.

**-v**, **--verbose**
> Display filename and compression ratio for each file.

**-V**, **--version**
> Display version information and exit.

# DESCRIPTION

**zcat** decompresses gzip-compressed files and writes the uncompressed data to standard output, similar to **cat** for regular files. It is equivalent to **gunzip -c** or **gzip -dc**.

zcat can decompress files created by gzip, zip, compress, or pack. It recognizes compressed files by their magic number, not just the .gz extension, allowing decompression of files with non-standard names.

When reading from stdin, zcat will pass through data that is not in a recognized compressed format unchanged (acting like cat).

# CAVEATS

zcat only outputs to stdout; it cannot decompress files in place. For decompressing to files, use **gunzip** or **gzip -d**. On some systems, zcat may be installed as **gzcat** to avoid conflicts with the compress utility's zcat.

# HISTORY

zcat is part of the **gzip** package, originally written by **Jean-loup Gailly** and **Mark Adler**. gzip was first released in **1992** as a free replacement for the Unix compress utility, which was encumbered by patents on the LZW algorithm. The gzip package became a GNU project and is now a standard utility on Unix-like systems.

# SEE ALSO

[gzip](/man/gzip)(1), [gunzip](/man/gunzip)(1), [cat](/man/cat)(1), [zless](/man/zless)(1), [zgrep](/man/zgrep)(1)
