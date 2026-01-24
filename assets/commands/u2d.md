# TLDR

**Convert a file** from Unix to DOS line endings

```u2d [path/to/file]```

**Convert multiple files**

```u2d [file1] [file2] [file3]```

**Convert and preserve modification date**

```u2d -k [path/to/file]```

**Convert only if file appears to be text** (skip binaries)

```u2d -s [path/to/file]```

**Convert and write to a new file**

```u2d -n [input_file] [output_file]```

# SYNOPSIS

**u2d** [**-k**] [**-s**] [**-n** _infile_ _outfile_] [_file_...]

# PARAMETERS

**-k**, **--keepdate**
> Keep the original modification date of the file after conversion.

**-o**, **--oldfile**
> Convert file in place, overwriting the original. This is the default behavior.

**-n**, **--newfile** _infile_ _outfile_
> Write converted output to a new file instead of modifying the original.

**-s**, **--safe**
> Skip conversion of binary files to prevent corruption.

**-q**, **--quiet**
> Quiet mode. Suppress informational messages.

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**u2d** (Unix to DOS) converts text files from Unix-style line endings to DOS/Windows-style line endings. Unix files use a single line feed character (LF, \n) for line breaks, while DOS/Windows files use a carriage return followed by a line feed (CRLF, \r\n).

The command is typically a symbolic link or alias to **unix2dos**. It processes files in place by default, replacing the original file with the converted version. Multiple files can be specified on the command line for batch conversion.

This conversion is necessary when transferring text files between Unix/Linux and Windows systems, as many Windows applications expect CRLF line endings and may display or process files incorrectly if they contain only LF terminators.

# CAVEATS

Converting binary files will corrupt them. Use the **-s** option to skip binary files automatically, or ensure you only convert text files. The conversion modifies files in place by default; use **-n** to preserve originals. Some distributions may not include u2d; use unix2dos or install the dos2unix package.

# HISTORY

Line ending conversion utilities have existed since the early days of file transfers between Unix and DOS systems in the **1980s**. The **dos2unix/unix2dos** package providing u2d and d2u was originally written for SunOS/Solaris and has been ported to various Unix-like systems. Multiple implementations exist with varying names including todos/fromdos, flip, and endlines.

# SEE ALSO

[d2u](/man/d2u)(1), [dos2unix](/man/dos2unix)(1), [unix2dos](/man/unix2dos)(1), [tr](/man/tr)(1), [sed](/man/sed)(1)
