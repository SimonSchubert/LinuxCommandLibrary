# TAGLINE

Search xz compressed files with grep

# TLDR

**Search for a pattern in an xz-compressed file**

```xzgrep "[pattern]" [file.xz]```

**Search case-insensitively**

```xzgrep -i "[pattern]" [file.xz]```

**Count matching lines**

```xzgrep -c "[pattern]" [file.xz]```

**Show line numbers with matches**

```xzgrep -n "[pattern]" [file.xz]```

**List files containing a match**

```xzgrep -l "[pattern]" [*.xz]```

**Search using extended regular expressions**

```xzgrep -E "[regex_pattern]" [file.xz]```

# SYNOPSIS

**xzgrep** [_options_] _pattern_ [_files_...]

# PARAMETERS

**-i**
> Case insensitive search.

**-n**
> Show line numbers.

**-c**
> Count matching lines.

**-l**
> List only filenames containing matches.

**-v**
> Invert match (show non-matching lines).

**-E**
> Use extended regular expressions (like egrep).

**-F**
> Use fixed strings instead of regular expressions (like fgrep).

**-h**
> Suppress filename prefix on output.

**-H**
> Always print filename prefix.

# DESCRIPTION

**xzgrep** searches xz, lzma, and lzip compressed files for lines matching a pattern. It decompresses the data on the fly and passes it to grep, without creating temporary files on disk. All standard grep options are supported. Also available as **xzegrep** and **xzfgrep** variants.

# SEE ALSO

[xz](/man/xz)(1), [grep](/man/grep)(1), [zgrep](/man/zgrep)(1), [lzgrep](/man/lzgrep)(1)
