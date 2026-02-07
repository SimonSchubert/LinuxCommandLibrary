# TAGLINE

wrap input lines to fit within specified width

# TLDR

**Fold** lines to a specific width (default: 80 columns)

```fold -w [60] [path/to/file]```

Fold lines and **break at spaces** (word boundaries)

```fold -s -w [60] [path/to/file]```

Count width in **bytes** instead of columns

```fold -b -w [60] [path/to/file]```

Count width in **characters** instead of columns

```fold -c -w [60] [path/to/file]```

Fold **stdin** input

```echo "long line of text" | fold -w [40]```

# SYNOPSIS

**fold** [_options_] [_file..._]

# PARAMETERS

**-w, --width** _width_
> Use specified width instead of default 80 columns

**-s, --spaces**
> Break at spaces (word boundaries) within the width limit

**-b, --bytes**
> Count bytes rather than columns

**-c, --characters**
> Count characters rather than columns

**--help**
> Display help and exit

**--version**
> Output version information and exit

# DESCRIPTION

**Fold** wraps each input line to fit within a specified width, writing the result to standard output. By default, it counts columns and folds at exactly 80 characters, which may split words in the middle.

The **-s** option improves readability by breaking lines at the rightmost space within the width limit, preserving whole words when possible. Without a file argument (or with **-**), fold reads from standard input.

Width counting differs between modes: **columns** (default) accounts for tab expansion and multibyte characters, **-b** counts raw bytes, and **-c** counts characters regardless of display width.

# CAVEATS

Without **-s**, fold breaks lines exactly at the specified width, potentially splitting words. Tab characters are expanded to spaces before counting columns, which may produce unexpected results. For more sophisticated text formatting with paragraph handling, consider **fmt** instead.

# HISTORY

The **fold** command originated in early Unix systems and was standardized in POSIX. The GNU version, written by **David MacKenzie**, is part of the **coreutils** package and includes extensions like the **-c** character counting option not found in all implementations.

# SEE ALSO

[fmt](/man/fmt)(1), [pr](/man/pr)(1), [cut](/man/cut)(1)
