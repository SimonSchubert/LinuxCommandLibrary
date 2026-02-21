# TAGLINE

Pattern-matching text search utility

# TLDR

**Search for pattern in file**

```grep [pattern] [file]```

**Case insensitive search**

```grep -i [pattern] [file]```

**Recursive search in directory**

```grep -r [pattern] [directory]```

**Show line numbers**

```grep -n [pattern] [file]```

**Invert match (exclude pattern)**

```grep -v [pattern] [file]```

**Extended regex**

```grep -E '[regex]' [file]```

**Count matches**

```grep -c [pattern] [file]```

# SYNOPSIS

**grep** [_options_] _pattern_ [_files_]

# PARAMETERS

_PATTERN_
> Regular expression pattern to match.

_FILES_
> Files to search.

**-i**, **--ignore-case**
> Case insensitive matching.

**-v**, **--invert-match**
> Select non-matching lines.

**-r**, **--recursive**
> Search directories recursively.

**-n**, **--line-number**
> Show line numbers.

**-c**, **--count**
> Print match count only.

**-l**, **--files-with-matches**
> Print only filenames.

**-E**, **--extended-regexp**
> Use extended regex.

**-F**, **--fixed-strings**
> Match literal strings.

**-o**, **--only-matching**
> Print only matched parts.

**-A** _NUM_
> Print NUM lines after match.

**-B** _NUM_
> Print NUM lines before match.

**-C** _NUM_
> Print NUM lines of context.

**--color**
> Highlight matches.

**--help**
> Display help information.

# DESCRIPTION

**grep** searches files for lines matching a regular expression pattern. It is one of the most fundamental Unix utilities, named for g/re/p (global regular expression print) from the ed editor.

The tool supports basic and extended regular expressions, recursive directory searching, and various output formats. It can search multiple files, show context around matches, and highlight results with color.

# CAVEATS

Basic vs extended regex syntax differences. Binary files may produce unexpected output. Large files may be slow without optimizations.

# HISTORY

grep was created by **Ken Thompson** at **Bell Labs** in **1973**. It was inspired by the g/re/p command in ed. GNU grep is the most widely used implementation today.

# SEE ALSO

[egrep](/man/egrep)(1), [fgrep](/man/fgrep)(1), [rg](/man/rg)(1), [ack](/man/ack)(1), [sed](/man/sed)(1)
