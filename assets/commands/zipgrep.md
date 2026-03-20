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

**List matching files only**

```zipgrep -l [pattern] [archive.zip]```

**Search but exclude files in subdirectories**

```zipgrep [pattern] [archive.zip] *.[ch] -x */*```

# SYNOPSIS

**zipgrep** [_egrep_options_] _pattern_ _file_[_.zip_] [_file(s)_] [**-x** _xfile(s)_]

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
> Specific files within the archive to search.

**-x** _xfile(s)_
> Exclude specified archive members from processing. Wildcards match directory separators.

# DESCRIPTION

**zipgrep** searches for text patterns inside ZIP archives without requiring manual extraction. It works as a shell wrapper around **unzip** and **egrep**, piping decompressed file contents through pattern matching to display results in a familiar grep-like format.

Pattern matching supports extended regular expressions through egrep. The output shows the matching filename and line for each hit, similar to running grep on extracted contents. Optional member arguments restrict the search to specific files within the archive.

All options before the ZIP archive filename are passed to egrep, so standard grep options like **-i** for case-insensitive matching, **-n** for line numbers, **-c** for match counts, and **-l** for listing matching filenames are all supported. If the literal filename is not found, the suffix .zip is appended. zipgrep is part of the Info-ZIP suite of utilities.

# CAVEATS

Shell wrapper around unzip/egrep. May be slow on large archives. Part of Info-ZIP.

# HISTORY

**zipgrep** is part of **Info-ZIP** utilities. It provides grep functionality for ZIP contents.

# SEE ALSO

[unzip](/man/unzip)(1), [grep](/man/grep)(1), [zgrep](/man/zgrep)(1)
