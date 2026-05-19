# TAGLINE

Search xz files with extended regex

# TLDR

**Search** an xz/lzma file using extended regex

```xzegrep "[pattern]" [file.xz]```

**Case-insensitive** search

```xzegrep -i "[pattern]" [file.xz]```

**Search recursively** through compressed files

```xzegrep -r "[pattern]" [directory]```

**Show only matching files**, not lines

```xzegrep -l "[pattern]" [*.xz]```

**Show line numbers** of matches

```xzegrep -n "[pattern]" [file.xz]```

**Print N lines of context** around each match

```xzegrep -C [3] "[pattern]" [file.xz]```

# SYNOPSIS

**xzegrep** [_grep-options_] _pattern_ [_file_...]

# PARAMETERS

**-i**, **--ignore-case**
> Ignore case distinctions.

**-l**, **--files-with-matches**
> Print only the names of files containing matches.

**-n**, **--line-number**
> Prefix each line with its line number.

**-c**, **--count**
> Print only the count of matching lines per file.

**-v**, **--invert-match**
> Select non-matching lines.

**-h**, **--no-filename**
> Suppress filename prefix in output.

**-H**, **--with-filename**
> Always print filename prefix.

**-r**, **--recursive**
> Recursively search directories.

**-A** _N_ / **-B** _N_ / **-C** _N_
> Print N lines after / before / around each match.

**-q**, **--quiet**
> Suppress all normal output; exit 0 if any line matches.

# DESCRIPTION

**xzegrep** invokes **grep -E** on the decompressed contents of files compressed with **xz**, **lzma**, **gzip**, or **bzip2** (detected by extension). It is the **xz**-utils wrapper equivalent to **zegrep** for gzip files: a convenience shortcut for **xzgrep -E**, taking an extended regular expression and forwarding all other arguments to **grep**.

If no file is given, xzegrep reads from standard input. Most options accepted by **grep** can be passed through.

# CAVEATS

The whole file must be decompressed in memory or piped, so searching very large archives is not faster than running **xz -dc | grep -E** manually. On many distributions **xzegrep** is being deprecated in favour of **xzgrep -E**.

# SEE ALSO

[xzgrep](/man/xzgrep)(1), [xz](/man/xz)(1), [egrep](/man/egrep)(1), [grep](/man/grep)(1)

