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

**tspin** highlights log files. It colorizes output.

Automatic detection. Log format recognition.

Syntax highlighting. Colored output.

Follow mode. Real-time monitoring.

JSON support. Structured logs.

# CAVEATS

Rust implementation. Config for custom formats. Terminal colors needed.

# HISTORY

**tspin** was created as a log file highlighter to make logs more readable with automatic format detection.

# SEE ALSO

[less](/man/less)(1), [lnav](/man/lnav)(1), [tail](/man/tail)(1)
