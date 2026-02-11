# TAGLINE

Bulk rename files with patterns

# TLDR

**Search and replace** in filenames

```rnm -ss [old] -rs [new] [directory]```

Use **literal** strings (no regex)

```rnm -ssf [old] -rs [new] [files]```

Add **auto-increment** index

```rnm -i 1 -inc 1 -rs [_] [files]```

Rename from **name list** file

```rnm -ns/f [names.txt] [files]```

Rename **files only** (not directories)

```rnm -fo -ss [pattern] -rs [replacement] [files]```

Sort by **modification time**

```rnm -s/mt -ss [pattern] -rs [replacement] [files]```

**Simulate** without changes

```rnm -sim -ss [pattern] -rs [replacement] [files]```

**Undo** last operation

```rnm -u```

# SYNOPSIS

**rnm** [**-ss** _pattern_] [**-rs** _replacement_] [**-sim**] [**-fo**] [_files_...]

# PARAMETERS

**-ss _pattern_**
> Search string/regex

**-ssf _string_**
> Fixed (literal) search string

**-rs _replacement_**
> Replacement string

**-i _start_**
> Starting index for numbering

**-inc _step_**
> Index increment value

**-ns/f _file_**
> Name list file

**-fo**
> Files only (ignore directories)

**-sim**
> Simulation mode (dry run)

**-u**
> Undo last operation

**-s/mt**
> Sort by modification time

# DESCRIPTION

**rnm** is a powerful bulk rename utility supporting regex, indexing, and name list files. It can rename files based on patterns, add sequential numbers, or use predefined name lists.

The tool includes simulation mode for previewing changes and undo functionality for reverting mistakes. It handles complex renaming scenarios with fine-grained control.

# CAVEATS

Regex mode is default; use -ssf for literal strings. Undo only works for the last operation. Test with -sim first on important files.

# HISTORY

**rnm** was created by **Md Jahidul Hamid** (neurobin) as a comprehensive bulk rename solution with features missing from simpler rename tools.

# SEE ALSO

[rename](/man/rename)(1), [mmv](/man/mmv)(1), [prename](/man/prename)(1)
