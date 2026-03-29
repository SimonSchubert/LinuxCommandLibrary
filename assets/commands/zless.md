# TAGLINE

View compressed files with less pager

# TLDR

**View a gzip compressed file**

```zless [file.gz]```

**View multiple compressed files sequentially**

```zless [file1.gz] [file2.gz]```

**Search for a pattern inside a compressed file**

```zless [file.gz]```

then type **/**_pattern_ and press **Enter**

**Jump to the last line of a compressed file**

```zless [file.gz]```

then press **G**

# SYNOPSIS

**zless** [_file ..._]

# PARAMETERS

All parameters and commands available in **less** are also available in zless, including:

**Space**
> Scroll forward one screen.

**b**
> Scroll backward one screen.

**/**_pattern_
> Search forward for pattern.

**?**_pattern_
> Search backward for pattern.

**n**
> Repeat previous search.

**N**
> Repeat previous search in reverse direction.

**g**
> Go to first line.

**G**
> Go to last line.

**q**
> Quit.

**h**
> Display help.

# DESCRIPTION

**zless** is part of the **gzip** package. It works by setting `LESSOPEN` to pipe files through `gzip -cdfq` before passing them to **less**. This handles gzip (.gz) compressed files, as well as uncompressed files (gzip passes them through unchanged).

The command provides the same interactive viewing experience as less, including forward and backward navigation, searching, and line jumping. Files are decompressed on the fly without creating temporary files.

For broader format support (bzip2, xz, zstd, etc.), use **less** with **lesspipe** configured as the `LESSOPEN` preprocessor instead.

# CAVEATS

zless is a gzip-specific tool and does not natively support bzip2, xz, lzma, or other formats. For those, use **less** with **lesspipe** or pipe via the appropriate decompressor (e.g. `xz -dc file.xz | less`). For tar.gz archives, zless will only decompress the gzip layer and display the raw tar data; use **tar -tzf** to list contents instead. zless cannot read compressed data from standard input; files must be given as arguments.

# HISTORY

zless is part of the **gzip** package and was created as a companion to the zcat and zmore utilities. It combines the decompression capabilities of gzip with the advanced paging features of **less**, which became the preferred pager over **more** due to its ability to scroll backward and search. The command is included in most Unix-like systems as part of the standard gzip distribution.

# SEE ALSO

[less](/man/less)(1), [zcat](/man/zcat)(1), [zmore](/man/zmore)(1), [zgrep](/man/zgrep)(1), [gzip](/man/gzip)(1)
