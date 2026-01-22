# TLDR

**Search for a fixed string in a bzip2 compressed file**

```bzfgrep "[string]" [path/to/file.bz2]```

**Search case-insensitively**

```bzfgrep -i "[string]" [path/to/file.bz2]```

**Print line numbers with matches**

```bzfgrep -n "[string]" [path/to/file.bz2]```

**Search multiple compressed files**

```bzfgrep "[string]" [file1.bz2] [file2.bz2]```

**Count matching lines**

```bzfgrep -c "[string]" [path/to/file.bz2]```

# SYNOPSIS

**bzfgrep** [_fgrep_options_] [**-e**] _pattern_ [_filename..._]

# DESCRIPTION

**bzfgrep** searches possibly bzip2-compressed files for lines matching a fixed string pattern. It transparently decompresses **.bz2** files before searching and passes all options directly to **fgrep**.

Unlike **bzgrep** or **bzegrep**, bzfgrep interprets the pattern as a literal string rather than a regular expression. This makes it faster for simple string searches and avoids the need to escape special characters.

If no file is specified, bzfgrep reads from standard input, decompressing if necessary.

# PARAMETERS

All **fgrep** options are supported, including:

**-i**
> Case-insensitive matching

**-n**
> Print line numbers

**-c**
> Print only a count of matching lines

**-v**
> Invert match (show non-matching lines)

**-l**
> Print only filenames containing matches

**-e** _pattern_
> Specify the pattern (useful if pattern starts with -)

# CAVEATS

The **GREP** environment variable can be set to specify an alternate grep program. The pattern is treated as a fixed string, not a regular expression. For regex searches, use **bzgrep** or **bzegrep**.

# SEE ALSO

[bzgrep](/man/bzgrep)(1), [bzegrep](/man/bzegrep)(1), [fgrep](/man/fgrep)(1), [bzip2](/man/bzip2)(1)
