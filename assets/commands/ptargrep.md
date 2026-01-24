# TLDR

**Search in tar archive**

```ptargrep [pattern] [archive.tar]```

**Case insensitive**

```ptargrep -i [pattern] [archive.tar.gz]```

**List matching files**

```ptargrep -l [pattern] [archive.tar]```

**Search gzipped archive**

```ptargrep [pattern] [archive.tar.gz]```

**Search bzip2 archive**

```ptargrep [pattern] [archive.tar.bz2]```

**Extract matching files**

```ptargrep --extract [pattern] [archive.tar]```

# SYNOPSIS

**ptargrep** [_-i_] [_-l_] [_--extract_] _pattern_ _archives_

# PARAMETERS

**-i**, **--ignore-case**
> Case insensitive matching.

**-l**, **--list-only**
> List matching files only.

**--extract**
> Extract matching files.

**--basename**
> Match against basename.

**--help**
> Show help.

# DESCRIPTION

**ptargrep** searches for patterns within tar archives. It examines file contents without full extraction.

Compressed archives are handled automatically. Gzip, bzip2, and xz compression supported.

Pattern matching uses Perl regular expressions. Full regex power is available.

List mode shows which files match. Useful for identifying relevant files.

Extract mode pulls matching files. Only files containing the pattern are extracted.

# CAVEATS

Part of Perl distribution. Large archives may be slow. Memory usage with large files.

# HISTORY

**ptargrep** is distributed with Perl's Archive::Tar module. It provides grep-like functionality for archived content.

# SEE ALSO

[zgrep](/man/zgrep)(1), [tar](/man/tar)(1), [grep](/man/grep)(1), [perl](/man/perl)(1)
