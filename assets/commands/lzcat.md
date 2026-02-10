# TAGLINE

decompresses lzip files to standard output

# TLDR

**Decompress to stdout**

```lzcat [file.lz]```

**Decompress multiple files**

```lzcat [file1.lz] [file2.lz]```

**Decompress and pipe**

```lzcat [archive.tar.lz] | tar -xf -```

**Verbose output**

```lzcat -v [file.lz]```

# SYNOPSIS

**lzcat** [_options_] [_files_...]

# PARAMETERS

**-v**, **--verbose**
> Verbose output.

**-q**, **--quiet**
> Suppress warnings.

**-t**, **--test**
> Test integrity.

**--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**lzcat** decompresses lzip files to standard output. It's equivalent to "lzip -dc" and functions like zcat for gzip files.

lzcat is useful for viewing compressed files or piping decompressed data to other programs without creating intermediate files.

# EXAMPLE USAGE

```bash
# View compressed log
lzcat system.log.lz | less

# Extract tar archive
lzcat archive.tar.lz | tar xvf -

# Compare compressed files
diff <(lzcat file1.lz) <(lzcat file2.lz)
```

# CAVEATS

Only handles lzip format. For other formats use zcat, xzcat, bzcat. Cannot compress; use lzip for that.

# HISTORY

lzcat is part of the **lzip** package created by **Antonio Diaz Diaz** as a cleaner implementation of LZMA compression.

# SEE ALSO

[lzip](/man/lzip)(1), [zcat](/man/zcat)(1), [xzcat](/man/xzcat)(1), [bzcat](/man/bzcat)(1)
