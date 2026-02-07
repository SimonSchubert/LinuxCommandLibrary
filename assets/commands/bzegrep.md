# TAGLINE

Search bzip2 files using extended regular expressions

# TLDR

**Search for an extended regex pattern in a bzip2 compressed file**

```bzegrep "[pattern]" [path/to/file.bz2]```

**Search case-insensitively**

```bzegrep -i "[pattern]" [path/to/file.bz2]```

**Print line numbers with matches**

```bzegrep -n "[pattern]" [path/to/file.bz2]```

**Search multiple compressed files**

```bzegrep "[pattern]" [file1.bz2] [file2.bz2]```

**Count matching lines**

```bzegrep -c "[pattern]" [path/to/file.bz2]```

**Search from stdin**

```bzcat [path/to/file.bz2] | bzegrep "[pattern]"```

# SYNOPSIS

**bzegrep** [_egrep_options_] [**-e**] _pattern_ [_filename..._]

# DESCRIPTION

**bzegrep** searches possibly bzip2-compressed files for lines matching an extended regular expression pattern. It transparently decompresses **.bz2** files before searching and passes all options directly to **egrep**.

If no file is specified, bzegrep reads from standard input, decompressing if necessary. This allows it to be used in pipelines with other bzip2 utilities.

The command is equivalent to running **bzgrep** but using **egrep** (extended grep) for pattern matching, supporting extended regular expression syntax including **+**, **?**, **|**, and parentheses for grouping.

# PARAMETERS

All **egrep** options are supported, including:

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

The **GREP** environment variable can be set to specify an alternate grep program. The file must be bzip2-compressed for transparent decompression; uncompressed files are searched directly.

# SEE ALSO

[bzgrep](/man/bzgrep)(1), [bzfgrep](/man/bzfgrep)(1), [egrep](/man/egrep)(1), [bzip2](/man/bzip2)(1), [bzcat](/man/bzcat)(1)
