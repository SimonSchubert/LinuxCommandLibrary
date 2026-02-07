# TAGLINE

DOS to Unix line ending converter

# TLDR

**Convert a file** from DOS to Unix line endings

```d2u [file.txt]```

**Convert multiple files**

```d2u [file1.txt] [file2.txt] [file3.txt]```

**Convert and keep backup** of original

```d2u -b [file.txt]```

**Convert with custom backup** suffix

```d2u -b -e [.bak] [file.txt]```

**Preview conversion** without modifying file

```d2u -n [file.txt]```

**Convert files in place** silently

```d2u -q [file.txt]```

# SYNOPSIS

**d2u** [_options_] [_file_...]

# PARAMETERS

_FILE_
> File(s) to convert. Converts in place by default.

**-b**, **--backup**
> Keep backup of original file.

**-e** _SUFFIX_, **--extension** _SUFFIX_
> Backup file extension (default: .bak).

**-n**, **--dry-run**
> Show what would be done without changing files.

**-q**, **--quiet**
> Quiet mode, suppress output.

**-k**, **--keepdate**
> Preserve original file timestamp.

**-f**, **--force**
> Force conversion even on binary files.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**d2u** converts text files from DOS/Windows line endings (CRLF - Carriage Return + Line Feed) to Unix line endings (LF - Line Feed only). It is an alias or alternative name for the **dos2unix** utility.

The tool modifies files in place by default, making it convenient for batch conversion. It automatically detects binary files and skips them unless forced. Multiple files can be processed in a single command.

This conversion is commonly needed when transferring text files from Windows to Unix/Linux systems, or when working with files that have mixed line endings from version control systems.

# CAVEATS

Binary files may be corrupted if converted; the tool attempts to detect and skip them. In-place conversion without backup can lose original data. Some files may have intentional CRLF sequences that should not be converted.

# HISTORY

d2u is typically an alias for **dos2unix**, which has been a standard Unix utility for decades. The need for line ending conversion arose from the different conventions adopted by CP/M, DOS, and Unix in the late 1970s and 1980s.

# SEE ALSO

[dos2unix](/man/dos2unix)(1), [unix2dos](/man/unix2dos)(1), [u2d](/man/u2d)(1), [tr](/man/tr)(1)
