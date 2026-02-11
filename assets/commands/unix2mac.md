# TAGLINE

Convert Unix line endings to classic Mac format

# TLDR

**Change** the line endings of a file to macOS-style

```unix2mac [path/to/file]```

**Create** a copy with macOS-style line endings

```unix2mac -n [path/to/file] [path/to/new_file]```

**Display** file information

```unix2mac -i [path/to/file]```

**Keep/add/remove** Byte Order Mark

```unix2mac --keep-bom|--add-bom|--remove-bom [path/to/file]```

# SYNOPSIS

**unix2mac** [_options_] [_file_...]

# PARAMETERS

**-n, --newfile _infile_ _outfile_**
> Write to new file instead of modifying in place

**-i, --info _flags_**
> Display file information (line endings, BOM)

**-k, --keepdate**
> Keep output file date same as input

**--keep-bom**
> Keep Byte Order Mark

**--add-bom**
> Add Byte Order Mark

**--remove-bom**
> Remove Byte Order Mark

**-q, --quiet**
> Quiet mode, suppress warnings

# DESCRIPTION

**unix2mac** converts text files from Unix line ending format (LF) to classic Mac format (CR). This format was used by Mac OS 9 and earlier. Modern macOS uses Unix-style LF line endings.

The tool is primarily useful for compatibility with legacy Mac software or when working with files that specifically require CR line endings.

# CAVEATS

Classic Mac line endings (CR only) are rarely needed today as modern macOS uses LF. Binary files should not be processed. Part of the dos2unix package.

# SEE ALSO

[dos2unix](/man/dos2unix)(1), [unix2dos](/man/unix2dos)(1), [mac2unix](/man/mac2unix)(1)
