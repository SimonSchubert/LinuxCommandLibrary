# TAGLINE

CLI and TUI debugger for JSON logs

# TLDR

**Stream and debug JSON logs**

```logshark```

**Pipe logs from a command**

```cat [logfile.json] | logshark```

# SYNOPSIS

**logshark** [_options_]

# DESCRIPTION

**logshark** is a command-line tool for debugging JSON logs. It integrates with Beats and Logstash to provide real-time log analysis, featuring JSON formatting, pretty printing with syntax highlighting, and event metrics.

The TUI mode allows navigating through a list of log entries with colorful formatting, making it easier to debug and analyze structured log data from Elastic Stack and similar logging pipelines.

# CAVEATS

Designed specifically for JSON-formatted logs. Non-JSON log formats are not supported.

# HISTORY

**logshark** was created by **ugosan** and is written in **Go**.

# SEE ALSO

[jq](/man/jq)(1), [lnav](/man/lnav)(1), [loggo](/man/loggo)(1)
