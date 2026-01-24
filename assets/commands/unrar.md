# TLDR

**Extract archive**

```unrar x [archive.rar]```

**Extract to directory**

```unrar x [archive.rar] [destination/]```

**Extract without paths**

```unrar e [archive.rar]```

**List contents**

```unrar l [archive.rar]```

**Test archive**

```unrar t [archive.rar]```

**Extract with password**

```unrar x -p[password] [archive.rar]```

**Extract and overwrite**

```unrar x -o+ [archive.rar]```

# SYNOPSIS

**unrar** _command_ [_-switches_] _archive_ [_files_] [_destination_]

# COMMANDS

**x**
> Extract with full paths.

**e**
> Extract without paths.

**l**, **v**
> List contents.

**t**
> Test archive.

**p**
> Print to stdout.

# PARAMETERS

**-p** [_PASSWORD_]
> Password.

**-o+**
> Overwrite existing.

**-o-**
> Skip existing.

**-or**
> Rename existing.

**-y**
> Yes to all queries.

**-x** _PATTERN_
> Exclude files.

**-n** _PATTERN_
> Include only files.

**-v**
> List verbosely.

**-c-**
> Disable comments.

**-id**
> Disable messages.

**-kb**
> Keep broken files.

# DESCRIPTION

**unrar** extracts RAR archives. It supports all RAR versions including RAR5 with its improved compression.

Extract with paths (x) recreates the directory structure. Extract without paths (e) puts all files in the destination.

Multi-volume archives are handled automatically. Provide the first volume and subsequent parts are found.

Password protection on both files and headers is supported. Without correct password, even filenames may be hidden.

Testing verifies archive integrity without extracting. This confirms the archive isn't corrupted.

The tool handles recovery records. Slightly damaged archives may still extract if recovery data exists.

# CAVEATS

Read-only - can't create RAR archives (need rar). Freeware but not open-source. Some distributions have free alternatives.

# HISTORY

**unrar** is developed by **RARLAB** (Eugene Roshal). It's provided as freeware for extracting RAR archives. Creating archives requires the commercial rar program.

# SEE ALSO

[rar](/man/rar)(1), [7z](/man/7z)(1), [unzip](/man/unzip)(1), [tar](/man/tar)(1)
