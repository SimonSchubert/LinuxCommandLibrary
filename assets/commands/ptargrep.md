# TAGLINE

Apply pattern matching to the contents of files in a tar archive

# TLDR

**Search for a pattern and extract matching files**

```ptargrep "[pattern]" [archive.tar.gz]```

**List matching file paths without extracting**

```ptargrep --list-only "[pattern]" [archive.tar]```

**Case-insensitive search**

```ptargrep -i "[pattern]" [archive.tar.gz]```

**Extract matching files using basename only (ignore directory paths)**

```ptargrep --basename "[pattern]" [archive.tar]```

**Search multiple archives with verbose output**

```ptargrep -v "[pattern]" [archive1.tar.gz] [archive2.tar.bz2]```

# SYNOPSIS

**ptargrep** [_options_] _pattern_ _tar-file_ ...

# PARAMETERS

**-b**, **--basename**
> When extracting matching files, ignore the directory path from the archive and write to the current directory using only the basename. Files with identical names will overwrite each other.

**-i**, **--ignore-case**
> Case-insensitive pattern matching.

**-l**, **--list-only**
> Print the pathname of each matching file to stdout instead of extracting.

**-v**, **--verbose**
> Log debugging info to stderr.

**-?**, **--help**
> Display help documentation.

# DESCRIPTION

**ptargrep** allows you to apply pattern matching to the contents of files in a tar archive. The pattern is used as a Perl regular expression.

The default behavior is to extract each matching file from the archive. Use **--list-only** to only print pathnames of matching files instead.

Compressed archives (gzip, bzip2, xz) are handled automatically based on the file extension.

Multiple tar archive filenames can be specified and they will each be processed in turn.

# CAVEATS

Part of the Perl distribution (Archive::Tar module). Large archives may be slow to process. Memory usage can be high with large files since file contents are read into memory.

# HISTORY

**ptargrep** is distributed with Perl's **Archive::Tar** module. It provides grep-like functionality for archived content.

# SEE ALSO

[zgrep](/man/zgrep)(1), [tar](/man/tar)(1), [grep](/man/grep)(1), [perl](/man/perl)(1), [zipgrep](/man/zipgrep)(1)
