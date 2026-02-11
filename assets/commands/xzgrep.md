# TAGLINE

Search xz compressed files with grep

# TLDR

**Search pattern in xz file**

```xzgrep "[pattern]" [file.xz]```

**Search recursively**

```xzgrep -r "[pattern]" [directory]```

**Count matches**

```xzgrep -c "[pattern]" [file.xz]```

**Show line numbers**

```xzgrep -n "[pattern]" [file.xz]```

# SYNOPSIS

**xzgrep** [_options_] _pattern_ [_files_...]

# PARAMETERS

**-i**
> Case insensitive.

**-n**
> Show line numbers.

**-c**
> Count matches.

**-l**
> List matching files.

**-r**
> Recursive search.

**-E**
> Extended regex (egrep).

**-F**
> Fixed strings (fgrep).

# DESCRIPTION

**xzgrep** searches xz compressed files. Decompresses and greps without creating temporary files. Supports all grep options and patterns.

# SEE ALSO

[xz](/man/xz)(1), [grep](/man/grep)(1), [zgrep](/man/zgrep)(1)

