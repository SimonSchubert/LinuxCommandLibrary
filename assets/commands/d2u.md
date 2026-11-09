# TAGLINE

DOS to Unix line ending converter (Cygwin alias of dos2unix)

# TLDR

**Convert a file** from DOS to Unix line endings

```d2u [file.txt]```

**Convert multiple files**

```d2u [file1.txt] [file2.txt] [file3.txt]```

**Convert to a new file**, keeping the original

```d2u -n [input.txt] [output.txt]```

**Keep the original timestamp**

```d2u -k [file.txt]```

**Convert files quietly**

```d2u -q [file.txt]```

**Print information about line breaks** without converting

```d2u -i [file.txt]```

**Force conversion** of a file detected as binary

```d2u -f [file.txt]```

# SYNOPSIS

**d2u** [_options_] [_file_...] [**-n** _infile_ _outfile_ ...]

# PARAMETERS

_FILE_
> File(s) to convert. Converts in place by default.

**-n**, **--newfile** _infile_ _outfile_ ...
> New file mode: convert infile and write to outfile. File names must be given in pairs.

**-o**, **--oldfile** _file_ ...
> Old file (in-place) mode. This is the default.

**-O**, **--to-stdout**
> Write to standard output, like a Unix filter.

**-q**, **--quiet**
> Suppress all warnings and messages.

**-v**, **--verbose**
> Print extra verbose messages.

**-k**, **--keepdate**
> Keep the date stamp of the output file the same as the input file.

**-f**, **--force**
> Force conversion of binary files.

**-s**, **--safe**
> Skip binary files (default).

**-l**, **--newline**
> Add an additional newline: DOS line breaks are changed to two Unix line breaks.

**-e**, **--add-eol**
> Add a line break to the last line if there is none.

**-c**, **--convmode** _MODE_
> Conversion mode: ascii (default), 7bit, iso, or mac.

**-b**, **--keep-bom**
> Keep the Byte Order Mark.

**-m**, **--add-bom**
> Add a Byte Order Mark to the output.

**-r**, **--remove-bom**
> Remove the Byte Order Mark.

**-i**, **--info**[=_FLAGS_] _file_ ...
> Display file information (line break counts, BOM, text or binary). No conversion is done.

**-F**, **--follow-symlink**
> Follow symbolic links and convert the targets.

**-R**, **--replace-symlink**
> Replace symbolic links with the converted files.

**-S**, **--skip-symlink**
> Keep symbolic links and targets unchanged (default).

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**d2u** converts text files from DOS/Windows line endings (CRLF) to Unix line endings (LF). It is another name for **dos2unix**, shipped by the Cygwin dos2unix package for users accustomed to the old command. Any option of dos2unix applies.

The tool modifies files in place by default. It automatically detects binary files and skips them unless forced, and leaves non-regular files such as directories and FIFOs alone.

# CAVEATS

**d2u** is Cygwin-specific: on Linux use **dos2unix**, which does not install this name. There is no backup option; use **-n** to preserve the original. **-b** means keep BOM, not backup. In-place conversion cannot be undone. Newer options such as **-e** and **-O** need a recent dos2unix release.

# HISTORY

**d2u** began as a Cygwin alias in the **cygutils** package, a hardlink to its **conv** program. When Cygwin adopted the standalone dos2unix package in the 2010s, that package took over providing **d2u** and **u2d** for compatibility. dos2unix itself was modelled after the SunOS/Solaris tool of the same name.

# SEE ALSO

[dos2unix](/man/dos2unix)(1), [unix2dos](/man/unix2dos)(1), [u2d](/man/u2d)(1), [tr](/man/tr)(1)

# RESOURCES

```[Homepage](https://dos2unix.sourceforge.io/)```

```[Documentation](https://dos2unix.sourceforge.io/dos2unix/man1/dos2unix.htm)```

<!-- verified: 2026-11-09 -->
