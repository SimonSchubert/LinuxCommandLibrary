# TAGLINE

Search bzip2 compressed files for patterns

# TLDR

**Search** in compressed file

```bzgrep ["pattern"] [file.bz2]```

**Case-insensitive** search

```bzgrep -i ["error"] [log.bz2]```

**Count** matches

```bzgrep -c ["pattern"] [file.bz2]```

**Show** line numbers

```bzgrep -n ["pattern"] [file.bz2]```

# SYNOPSIS

**bzgrep** [_grep-options_] [_pattern_] [_file_...]

# DESCRIPTION

**bzgrep** searches for patterns in bzip2-compressed files without decompressing them to disk. It's a wrapper around grep that transparently handles .bz2 files.

The tool provides the same functionality as grep but for compressed files.

# PARAMETERS

Supports standard grep options:

**-i**
> Case-insensitive search

**-v**
> Invert match

**-n**
> Show line numbers

**-c**
> Count matches

**-l**
> List matching files

**-H**
> Print filename

**-h**
> Suppress filename

# RELATED COMMANDS

**bzegrep**
> Extended regular expressions (grep -E)

**bzfgrep**
> Fixed strings (grep -F)

# WORKFLOW

```bash
# Search for pattern
bzgrep "error" logfile.bz2

# Case-insensitive
bzgrep -i "warning" logfile.bz2

# Multiple files
bzgrep "pattern" *.bz2

# With context
bzgrep -C 3 "error" logfile.bz2

# Count occurrences
bzgrep -c "error" logfile.bz2
```

# CAVEATS

Slower than searching uncompressed files. Must decompress entire file to search. Cannot use grep's parallel features. Limited to bzip2 files only.

# HISTORY

**bzgrep** has been part of the bzip2 utilities since the suite's creation in **1996**.

# SEE ALSO

[grep](/man/grep)(1), [bzcat](/man/bzcat)(1), [zgrep](/man/zgrep)(1)
