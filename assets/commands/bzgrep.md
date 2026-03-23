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

**bzgrep** [_grep-options_] [**-e**] _pattern_ [_filename_...]

# DESCRIPTION

**bzgrep** invokes grep on bzip2-compressed files. If no file is specified, standard input is decompressed if necessary and fed to grep. Otherwise the given files are uncompressed if necessary and fed to grep.

When invoked as **bzegrep** or **bzfgrep**, egrep or fgrep is used instead of grep. The grep program can also be overridden via the **GREP** environment variable.

# PARAMETERS

All options are passed directly to grep:

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

**-e** _pattern_
> Use pattern as the search pattern (useful for patterns starting with -)

**-H**
> Print filename

**-h**
> Suppress filename

# RELATED COMMANDS

**bzegrep**
> Extended regular expressions (egrep / grep -E)

**bzfgrep**
> Fixed strings (fgrep / grep -F)

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

# Override grep with fgrep
GREP=fgrep bzgrep string files
```

# CAVEATS

Slower than searching uncompressed files. Must decompress entire file to search. Cannot use grep's parallel features. Limited to bzip2 files only.

# HISTORY

**bzgrep** has been part of the bzip2 utilities since the suite's creation in **1996**.

# SEE ALSO

[grep](/man/grep)(1), [egrep](/man/egrep)(1), [fgrep](/man/fgrep)(1), [bzdiff](/man/bzdiff)(1), [bzmore](/man/bzmore)(1), [bzless](/man/bzless)(1), [bzip2](/man/bzip2)(1), [zgrep](/man/zgrep)(1)
