# TAGLINE

Log file syntax highlighter and viewer

# TLDR

**View log file**

```tspin [logfile.log]```

**Tail and highlight**

```tspin -f [logfile.log]```

**Read from stdin**

```cat [log] | tspin```

**No pager**

```tspin --no-pager [logfile.log]```

# SYNOPSIS

**tspin** [_-f_] [_--no-pager_] [_options_] [_file_]

# PARAMETERS

**-f**
> Follow mode.

**--no-pager**
> Disable pager.

**--config** _FILE_
> Config file.

**--help**
> Show help.

# DESCRIPTION

**tspin** is a log file viewer that automatically applies syntax highlighting to make logs more readable. It detects common log formats and colorizes elements like timestamps, log levels, IP addresses, URLs, and JSON structures without requiring manual configuration.

Follow mode (**-f**) monitors log files in real time, highlighting new entries as they appear, similar to **tail -f** but with color. The tool can also read from standard input via pipes, integrating into existing logging pipelines.

A built-in pager allows scrolling through log files interactively. Custom highlighting rules can be defined through a configuration file for non-standard log formats.

# CAVEATS

Rust implementation. Config for custom formats. Terminal colors needed.

# HISTORY

**tspin** was created as a log file highlighter to make logs more readable with automatic format detection.

# SEE ALSO

[less](/man/less)(1), [lnav](/man/lnav)(1), [tail](/man/tail)(1)
