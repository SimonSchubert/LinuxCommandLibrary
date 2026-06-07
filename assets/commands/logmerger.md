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

**Add line numbers** in the interactive browser

```logmerger --line_numbers [file1.log] [file2.log]```

# SYNOPSIS

**logmerger** [_options_] _files_...

# PARAMETERS

_FILES_
> One or more log files to merge. Files ending in **.gz**, **.csv**, **.jsonl**, or **.pcap** (experimental) are read accordingly.

**-i**, **--interactive**
> Show the merged output in the interactive TUI browser. This is the default.

**--inline**
> Display the merged log data as an inline merge to stdout instead of opening the TUI.

**-o**, **--output** _FILE_
> Save the merged output to a file. Use **-** for stdout; files ending in **.md** are written as a Markdown table.

**-s**, **--start** _TIME_
> Start of the time window to select for merging.

**-e**, **--end** _TIME_
> End of the time window to select for merging.

**-ac**, **--autoclip**
> Clip merging to the time range of the logs in the first log file.

**--ignore_non_timestamped**
> Ignore log lines that do not have a timestamp instead of attaching them to the previous entry.

**-w**, **--width** _WIDTH_
> Total screen width to use for interactive mode.

**-ln**, **--line_numbers**
> Add a line-number column to the output.

**-enc**, **--encoding** _ENCODING_
> Encoding to use when reading the log files.

**--timestamp_format** _FORMAT_
> One or more custom strptime-style timestamp formats to recognize.

# DESCRIPTION

**logmerger** is a TUI utility for viewing a merged display of multiple log files, correlated by timestamp. It reads plain text logs, gzip-compressed logs (**.gz**), CSV (**.csv**) and JSONL (**.jsonl**) files, and has experimental support for packet capture (**.pcap**) files.

Log entries from the various files are sorted by their timestamps and presented in a unified, color-coded display where each file gets its own column for easy identification. Many common timestamp formats are detected automatically; additional formats can be supplied with **--timestamp_format**.

# CAVEATS

Relies on recognizable timestamps in each log file for accurate merging. Lines without a timestamp are attached to the preceding entry unless **--ignore_non_timestamped** is given. pcap support requires the optional dependency, installed with `pip install logmerger[pcap]`.

# HISTORY

**logmerger** is an open-source tool written in **Python** by **Paul McGuire** (ptmcg) and distributed on PyPI as the **logmerger** package (`pip install logmerger`).

# SEE ALSO

[lnav](/man/lnav)(1), [tail](/man/tail)(1), [sort](/man/sort)(1)
