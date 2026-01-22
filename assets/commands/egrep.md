# TLDR

**Search for pattern** in file

```egrep "[pattern]" [file.txt]```

**Search case-insensitive**

```egrep -i "[pattern]" [file.txt]```

**Search with line** numbers

```egrep -n "[pattern]" [file.txt]```

**Search recursively**

```egrep -r "[pattern]" [directory]```

**Search for multiple** patterns

```egrep "[pattern1|pattern2]" [file.txt]```

**Count matches**

```egrep -c "[pattern]" [file.txt]```

**Show only matching** filenames

```egrep -l "[pattern]" [*.txt]```

# SYNOPSIS

**egrep** [_options_] _pattern_ [_file_...]

# PARAMETERS

_PATTERN_
> Extended regular expression.

_FILE_
> File(s) to search.

**-i**
> Case-insensitive search.

**-n**
> Show line numbers.

**-r**, **-R**
> Recursive search.

**-l**
> Show only filenames.

**-c**
> Count matching lines.

**-v**
> Invert match (non-matching lines).

**-o**
> Show only matched parts.

**--help**
> Display help information.

# DESCRIPTION

**egrep** searches files for lines matching an extended regular expression pattern. It's equivalent to `grep -E` and supports ERE syntax including +, ?, |, and () without escaping.

Extended regular expressions are more readable than basic grep patterns for complex matches. Alternation (|), grouping (), and quantifiers work directly without backslashes.

egrep is deprecated in favor of `grep -E` but remains widely available for compatibility.

# CAVEATS

Deprecated - use grep -E. Behavior may vary between implementations. Large files may be slow. Binary files may produce garbage output.

# HISTORY

egrep was originally a separate program with extended regex support. Modern grep includes this functionality with the -E flag, making standalone egrep redundant but preserved for compatibility.

# SEE ALSO

[grep](/man/grep)(1), [fgrep](/man/fgrep)(1), [sed](/man/sed)(1), [awk](/man/awk)(1)
