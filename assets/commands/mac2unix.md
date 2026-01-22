# TLDR

Convert **file** line endings

```mac2unix [path/to/file]```

Create **new file** with Unix endings

```mac2unix -n [path/to/file] [path/to/new_file]```

Display **file info**

```mac2unix -i [path/to/file]```

Handle **BOM** (Byte Order Mark)

```mac2unix --keep-bom [path/to/file]```

# SYNOPSIS

**mac2unix** [_options_] [_file_...]

# DESCRIPTION

**mac2unix** converts macOS-style line endings (CR) to Unix-style line endings (LF). It is part of the dos2unix package and handles text file format conversions.

# PARAMETERS

**-n, --newfile SRC DST**
> Write output to new file

**-i, --info**
> Display file information

**--keep-bom**
> Keep Byte Order Mark

**--add-bom**
> Add Byte Order Mark

**--remove-bom**
> Remove Byte Order Mark

**-k, --keepdate**
> Keep original file date

**-q, --quiet**
> Quiet mode

# CAVEATS

Classic Mac OS (pre-OS X) used CR line endings. Modern macOS uses Unix LF endings. Only needed for legacy files.

# SEE ALSO

[dos2unix](/man/dos2unix)(1), [unix2dos](/man/unix2dos)(1), [unix2mac](/man/unix2mac)(1)
