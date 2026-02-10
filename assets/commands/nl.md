# TAGLINE

numbers lines from files or standard input

# TLDR

**Number non-blank lines** in a file

```nl [path/to/file]```

Read from **stdin**

```[command] | nl```

Number **all lines including blank** lines

```nl -b a [path/to/file]```

Number only lines matching a **regex pattern**

```nl -b p'[pattern]' [path/to/file]```

Use a specific **increment** for line numbering

```nl -i [increment] [path/to/file]```

Specify the line numbering **format** (right/left justified, with/without zeros)

```nl -n [rz|ln|rn]```

Specify the line numbering **width** (6 by default)

```nl -w [col_width] [path/to/file]```

Use a specific **separator** between numbers and lines

```nl -s "[separator]" [path/to/file]```

# SYNOPSIS

**nl** [_options_] [_file_]

# PARAMETERS

**-b, --body-numbering _style_**
> Numbering style: a (all), t (non-blank, default), n (none), p_regex_ (pattern)

**-i, --line-increment _n_**
> Increment for line numbers (default: 1)

**-n, --number-format _format_**
> Format: ln (left, no zeros), rn (right, no zeros), rz (right, with zeros)

**-w, --number-width _n_**
> Width of line number column (default: 6)

**-s, --number-separator _string_**
> String between number and line (default: TAB)

**-v, --starting-line-number _n_**
> First line number (default: 1)

**-d, --section-delimiter _chars_**
> Characters for logical page delimiters

# DESCRIPTION

**nl** numbers lines from files or standard input. By default, it numbers only non-blank lines, preserving blank lines in the output without numbers.

The command recognizes logical page sections (header, body, footer) delimited by special character sequences, allowing different numbering styles for each section. Most commonly, it's used simply to add line numbers to file contents.

Output format is customizable: numbers can be left or right justified, padded with spaces or zeros, and separated from text by any string.

# CAVEATS

Different from **cat -n**, which numbers all lines including blank ones. The logical page feature (sections) is rarely used but can cause unexpected behavior if input contains the delimiter characters (\\: by default).

# HISTORY

nl originated in System V Unix and is specified by POSIX. It has been part of the GNU coreutils since the project's inception.

# SEE ALSO

[cat](/man/cat)(1), [pr](/man/pr)(1), [head](/man/head)(1), [tail](/man/tail)(1)
