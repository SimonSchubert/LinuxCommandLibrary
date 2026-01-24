# TLDR

**Search in ZIP**

```zipgrep [pattern] [archive.zip]```

**Search specific file**

```zipgrep [pattern] [archive.zip] [file.txt]```

**Case insensitive**

```zipgrep -i [pattern] [archive.zip]```

**Show line numbers**

```zipgrep -n [pattern] [archive.zip]```

**Count matches**

```zipgrep -c [pattern] [archive.zip]```

**List matching files**

```zipgrep -l [pattern] [archive.zip]```

# SYNOPSIS

**zipgrep** [_-i_] [_-n_] [_-c_] [_-l_] _pattern_ _zipfile_ [_members_]

# PARAMETERS

**-i**
> Case insensitive.

**-n**
> Show line numbers.

**-c**
> Count matches.

**-l**
> List files only.

**-h**
> No filename prefix.

**-v**
> Invert match.

_pattern_
> Search pattern.

_members_
> Specific files.

# DESCRIPTION

**zipgrep** searches inside ZIP archives. It greps without extracting.

Pattern matching uses egrep. Regular expressions supported.

File specification limits search. Only named members searched.

Output shows file and match. Like grep on extracted contents.

Useful for large archives. No extraction needed.

# CAVEATS

Shell wrapper around unzip/egrep. May be slow on large archives. Part of Info-ZIP.

# HISTORY

**zipgrep** is part of **Info-ZIP** utilities. It provides grep functionality for ZIP contents.

# SEE ALSO

[unzip](/man/unzip)(1), [grep](/man/grep)(1), [zgrep](/man/zgrep)(1)
