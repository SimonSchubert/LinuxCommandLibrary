# TAGLINE

Convert Unix line endings to DOS format

# TLDR

**Convert a file** from Unix to DOS line endings

```u2d [path/to/file]```

**Convert multiple files**

```u2d [file1] [file2] [file3]```

**Convert and preserve modification date**

```u2d -k [path/to/file]```

**Force conversion of files detected as binary**

```u2d -f [path/to/file]```

**Convert and write to a new file**

```u2d -n [input_file] [output_file]```

# SYNOPSIS

**u2d** [**-k**] [**-f**] [**-n** _infile_ _outfile_] [_file_...]

# PARAMETERS

**-k**, **--keepdate**
> Keep the original modification date of the file after conversion.

**-o**, **--oldfile**
> Convert file in place, overwriting the original. This is the default behavior.

**-n**, **--newfile** _infile_ _outfile_
> Write converted output to a new file instead of modifying the original.

**-s**, **--safe**
> Skip binary files. This is the default behavior.

**-f**, **--force**
> Force conversion of binary files.

**-q**, **--quiet**
> Quiet mode. Suppress informational messages.

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**u2d** (Unix to DOS) converts text files from Unix-style line endings to DOS/Windows-style line endings. Unix files use a single line feed character (LF, \n) for line breaks, while DOS/Windows files use a carriage return followed by a line feed (CRLF, \r\n).

The options on this page are those of **unix2dos** from the dos2unix package, which processes files in place by default. Multiple files can be specified on the command line for batch conversion.

This conversion is necessary when transferring text files between Unix/Linux and Windows systems, as many Windows applications expect CRLF line endings and may display or process files incorrectly if they contain only LF terminators.

# CAVEATS

The dos2unix package installs **unix2dos** and does not document a u2d command, so u2d exists only where it has been set up as a link or alias; use unix2dos otherwise. Binary files are skipped by default, and **-f** overrides this and can corrupt them. Conversion modifies files in place by default; use **-n** to preserve originals.

# HISTORY

Line ending conversion utilities have existed since the early days of file transfers between Unix and DOS systems. The **dos2unix** package was modelled after the SunOS/Solaris tool of the same name, with Benjamin Lin among its authors and Erwin Waterlander as maintainer.

# SEE ALSO

[d2u](/man/d2u)(1), [dos2unix](/man/dos2unix)(1), [unix2dos](/man/unix2dos)(1), [tr](/man/tr)(1), [sed](/man/sed)(1)

# RESOURCES

```[Homepage](https://waterlander.net/dos2unix/)```

```[Documentation](https://dos2unix.sourceforge.io/dos2unix/man1/dos2unix.htm)```

<!-- verified: 2026-11-09 -->
