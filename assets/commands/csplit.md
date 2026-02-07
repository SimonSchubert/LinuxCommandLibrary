# TAGLINE

split files by context patterns

# TLDR

Split a file starting second part at **line 10**

```csplit [path/to/file] 10```

Split a file into **three parts** at lines 7 and 23

```csplit [path/to/file] 7 23```

Start a new part at **every 5th line**

```csplit [path/to/file] 5 {*}```

Split every 5th line, **ignoring division errors**

```csplit -k [path/to/file] 5 {*}```

Use a **custom prefix** for output files

```csplit [path/to/file] 5 -f [prefix]```

Split above first line matching a **regex**

```csplit [path/to/file] /[regex]/```

# SYNOPSIS

**csplit** [_options_] _file_ _pattern_...

# DESCRIPTION

**csplit** splits a file into pieces based on context (line numbers or patterns). It generates files named xx00, xx01, etc. by default.

Unlike split which divides by size, csplit divides by content structure, making it useful for splitting log files, configuration files, or documents at specific boundaries.

# PARAMETERS

**-f, --prefix** _prefix_
> Use specified prefix instead of 'xx'

**-k, --keep-files**
> Don't remove output files on error

**-n, --digits** _digits_
> Number of digits in output filename

**-s, --quiet**
> Don't print byte counts

**{n}**
> Repeat previous pattern n times

**{*}**
> Repeat previous pattern as many times as possible

# CAVEATS

Part of GNU coreutils. Without -k, output files are deleted if an error occurs. Pattern repetition with {*} will fail if the pattern doesn't divide the file evenly (use -k to keep partial output).

# SEE ALSO

[split](/man/split)(1), [cut](/man/cut)(1), [head](/man/head)(1)
