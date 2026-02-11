# TAGLINE

Search inside ZIP archives

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

**zipgrep** searches for text patterns inside ZIP archives without requiring manual extraction. It works as a shell wrapper around **unzip** and **egrep**, piping decompressed file contents through pattern matching to display results in a familiar grep-like format.

Pattern matching supports extended regular expressions through egrep. The output shows the matching filename and line for each hit, similar to running grep on extracted contents. Optional member arguments restrict the search to specific files within the archive.

Standard grep options like **-i** for case-insensitive matching, **-n** for line numbers, **-c** for match counts, and **-l** for listing matching filenames are all supported. zipgrep is part of the Info-ZIP suite of utilities.

# CAVEATS

Shell wrapper around unzip/egrep. May be slow on large archives. Part of Info-ZIP.

# HISTORY

**zipgrep** is part of **Info-ZIP** utilities. It provides grep functionality for ZIP contents.

# SEE ALSO

[unzip](/man/unzip)(1), [grep](/man/grep)(1), [zgrep](/man/zgrep)(1)
