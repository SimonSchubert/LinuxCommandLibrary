# TAGLINE

View, tail, merge, and search log files

# TLDR

**Open and view a log file**

```tl [access.log]```

**Merge and view multiple logs by timestamp**

```tl [server.log] [app.log] --merge```

**Pipe live output into toolong**

```tail -f [/var/log/syslog] | tl```

**Tail a log file** (start at the end)

```tl --tail [access.log]```

# SYNOPSIS

**tl** [_options_] [_files_...]

# PARAMETERS

**--merge**
> Merge multiple log files by timestamp.

**--tail**
> Start at the end of the file.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**toolong** is a terminal application for viewing and analyzing log files, including JSONL. It can open multi-gigabyte files instantly, live-tail logs, auto-detect timestamps for merging multiple files, handle compressed .bz/.bz2 files, and syntax-highlight common log formats.

# HISTORY

**toolong** was created by **Will McGugan** (Textualize) and is written in **Python** using the Textual framework.

# SEE ALSO

[lnav](/man/lnav)(1), [less](/man/less)(1), [multitail](/man/multitail)(1)
