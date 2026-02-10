# TAGLINE

filter for paging through text one screenful at a time

# TLDR

**Open a file** for paging

```more [path/to/file]```

**Start at a specific line**

```more +[line_number] [path/to/file]```

**Search for a string** before displaying

```more +/[pattern] [path/to/file]```

**Squeeze** multiple blank lines into one

```more -s [path/to/file]```

Set **lines per screen**

```more -n [20] [path/to/file]```

# SYNOPSIS

**more** [**-d**] [**-l**] [**-s**] [**-p**] [**-c**] [**-n** _lines_] [**+**_linenum_] [**+/**_pattern_] [_file_...]

# PARAMETERS

**-d, --silent**
> Display helpful prompts instead of ringing bell on errors

**-l, --logical**
> Do not pause after lines containing form feed characters

**-e, --exit-on-eof**
> Exit automatically at end of file

**-f, --no-pause**
> Count logical lines rather than screen lines

**-p, --print-over**
> Clear screen before displaying; do not scroll

**-c, --clean-print**
> Paint each screen from top, clearing remainder

**-s, --squeeze**
> Compress multiple consecutive blank lines into one

**-u, --plain**
> Suppress underlining

**-n _number_, --lines _number_**
> Specify number of lines per screenful

**+_number_**
> Start display at specified line number

**+/_pattern_**
> Search for pattern before displaying

# INTERACTIVE COMMANDS

**Space**
> Display next screenful

**Enter**
> Display next line

**d, ^D**
> Scroll forward half screen

**b, ^B**
> Skip backward one screenful

**/_pattern_**
> Search forward for pattern

**n**
> Repeat last search

**q, Q**
> Exit

**h, ?**
> Display help

**=**
> Display current line number

**v**
> Open editor at current line

**:n**
> Go to next file

**:p**
> Go to previous file

# DESCRIPTION

**more** is a filter for paging through text one screenful at a time. It displays file contents interactively, allowing forward navigation and searching through the text.

Commands follow vi conventions and can be preceded by numeric arguments. The pager reads from files or standard input, making it useful in pipelines.

# CAVEATS

The more command is considered primitive compared to **less**, which offers backward scrolling and more features. Consider using less for most purposes. The MORE environment variable can set default options.

# HISTORY

**more** was written by **Eric Shienbrood** at UC Berkeley in **1978** and was one of the first screen-oriented utilities. It became a standard Unix pager, though **less** (written by Mark Nudelman in 1983) has largely superseded it due to additional features.

# SEE ALSO

[less](/man/less)(1), [cat](/man/cat)(1), [head](/man/head)(1), [tail](/man/tail)(1)
