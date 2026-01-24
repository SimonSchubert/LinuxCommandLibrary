# TLDR

**View a gzip compressed file**

```zless [file.gz]```

**View a bzip2 compressed file**

```zless [file.bz2]```

**View an xz compressed file**

```zless [file.xz]```

**Search for a pattern** in compressed file

```zless [file.gz]```
then type **/[pattern]**

**View multiple compressed files**

```zless [file1.gz] [file2.gz]```

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

**zless** is a filter that allows viewing of compressed files using the **less** pager. It automatically detects and handles various compression formats including gzip (.gz), bzip2 (.bz2), xz (.xz), and lzma (.lzma).

The command provides the same interactive viewing experience as less, including forward and backward navigation, searching, and line jumping. Files are decompressed on the fly without creating temporary files.

zless can also handle uncompressed files, making it a versatile choice for viewing files regardless of their compression state.

# CAVEATS

zless cannot handle tarred files (tar.gz) - it will only decompress the gzip layer, not extract the tar archive. For tar archives, use **tar -tzf** to list or **tar -xzf** to extract. Performance may be slower than less for very large compressed files.

# HISTORY

zless is part of the **gzip** package and was created as a companion to the zcat and zmore utilities. It combines the decompression capabilities of gzip with the advanced paging features of **less**, which became the preferred pager over **more** due to its ability to scroll backward and search. The command is included in most Unix-like systems as part of the standard gzip distribution.

# SEE ALSO

[less](/man/less)(1), [zcat](/man/zcat)(1), [zmore](/man/zmore)(1), [zgrep](/man/zgrep)(1), [gzip](/man/gzip)(1)
