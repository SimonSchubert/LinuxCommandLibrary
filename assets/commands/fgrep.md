# TAGLINE

fixed-string search without regex

# TLDR

**Search for literal** string

```fgrep "[search string]" [file.txt]```

**Search multiple files**

```fgrep "[pattern]" [file1.txt] [file2.txt]```

**Case insensitive search**

```fgrep -i "[pattern]" [file.txt]```

**Show line numbers**

```fgrep -n "[pattern]" [file.txt]```

**Recursive search**

```fgrep -r "[pattern]" [directory]```

# SYNOPSIS

**fgrep** [_options_] _pattern_ [_files_...]

# PARAMETERS

_PATTERN_
> Fixed string to search for.

_FILES_
> Files to search.

**-i**, **--ignore-case**
> Case insensitive matching.

**-n**, **--line-number**
> Show line numbers.

**-r**, **--recursive**
> Search directories recursively.

**-l**, **--files-with-matches**
> Show only filenames.

**-c**, **--count**
> Count matching lines.

**-v**, **--invert-match**
> Show non-matching lines.

**--help**
> Display help information.

# DESCRIPTION

**fgrep** searches for fixed strings rather than regular expressions. It's equivalent to grep -F and is faster when searching for literal text without regex metacharacters.

The tool treats the pattern as a plain string, so characters like ., *, and [ have no special meaning. This makes it ideal for searching log files, code, or any text containing regex metacharacters.

fgrep is particularly useful when the search pattern comes from user input or variables that might contain special characters.

# CAVEATS

No regex support by design. Deprecated in favor of grep -F. Multiple patterns require -f option.

# HISTORY

fgrep (fast grep) originated in **Unix Version 7** as an optimized grep variant for literal strings. Modern implementations typically link to grep with the -F flag.

# SEE ALSO

[grep](/man/grep)(1), [egrep](/man/egrep)(1), [rg](/man/rg)(1)
