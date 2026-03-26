# TAGLINE

Convert Unix line endings to classic Mac format

# TLDR

**Convert** a file to classic Mac line endings (CR) in place

```unix2mac [path/to/file]```

**Write** converted output to a new file

```unix2mac -n [path/to/file] [path/to/new_file]```

**Display** file information without converting

```unix2mac -i [path/to/file]```

**Convert and keep** the original file timestamp

```unix2mac -k [path/to/file]```

**Force conversion** of binary files

```unix2mac -f [path/to/file]```

# SYNOPSIS

**unix2mac** [_options_] [_file_...]

# PARAMETERS

**-n, --newfile** _INFILE_ _OUTFILE_
> Write to new file instead of modifying in place.

**-o, --oldfile** _FILE_
> In-place conversion (default mode).

**-i, --info** [_FLAGS_]
> Display file information without converting.

**-k, --keepdate**
> Keep output file date same as input.

**-f, --force**
> Force conversion of binary files.

**-s, --safe**
> Skip binary files (default).

**-b, --keep-bom**
> Keep Byte Order Mark.

**-m, --add-bom**
> Add UTF-8 Byte Order Mark.

**-r, --remove-bom**
> Remove Byte Order Mark.

**-q, --quiet**
> Quiet mode, suppress warnings.

**-v, --verbose**
> Display detailed conversion information.

**-l, --newline**
> Add additional newline.

**-F, --follow-symlink**
> Convert symbolic link targets.

# DESCRIPTION

**unix2mac** converts text files from Unix line ending format (LF) to classic Mac format (CR). This format was used by Mac OS 9 and earlier. Modern macOS uses Unix-style LF line endings.

The tool is primarily useful for compatibility with legacy Mac software or when working with files that specifically require CR line endings.

# CAVEATS

Classic Mac line endings (CR only) are rarely needed today as modern macOS uses LF. Binary files should not be processed. Part of the dos2unix package.

# SEE ALSO

[dos2unix](/man/dos2unix)(1), [unix2dos](/man/unix2dos)(1), [mac2unix](/man/mac2unix)(1), [iconv](/man/iconv)(1), [file](/man/file)(1)
