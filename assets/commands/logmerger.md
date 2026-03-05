# TAGLINE

View multiple log files with merged timeline

# TLDR

**Merge and view log files** interactively

```logmerger [file1.log] [file2.log]```

**Merge logs inline** to stdout

```logmerger --inline [file1.log] [file2.log]```

**Merge logs within a time window**

```logmerger --start "[timestamp]" --end "[timestamp]" [file1.log] [file2.log]```

**Write merged output** to a file

```logmerger -o [output.log] [file1.log] [file2.log]```

# SYNOPSIS

**logmerger** [_options_] _files_...

# PARAMETERS

**--inline**
> Output merged logs to stdout instead of the TUI.

**-o**, **--output** _FILE_
> Write merged output to a file.

**--start** _TIMESTAMP_
> Start time for filtering log entries.

**--end** _TIMESTAMP_
> End time for filtering log entries.

# DESCRIPTION

**logmerger** is a TUI utility for viewing a merged display of multiple log files, correlated by timestamp. It supports compressed text log files (.gz), CSV files, and has experimental support for packet capture files.

Log entries from various files are sorted by their timestamps and presented in a unified, color-coded display where each file gets a distinct color for easy identification.

# CAVEATS

Relies on consistent timestamp formats across log files for accurate merging. Log files without timestamps cannot be merged.

# HISTORY

**logmerger** was created by **ptmcg** and is written in **Python**.

# SEE ALSO

[lnav](/man/lnav)(1), [tail](/man/tail)(1), [sort](/man/sort)(1)
