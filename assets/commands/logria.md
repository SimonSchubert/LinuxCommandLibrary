# TAGLINE

CLI tool for real-time log aggregation and analysis

# TLDR

**Stream logs from a command**

```logria -e "[command]"```

**Stream logs from a file**

```logria -f [path/to/logfile]```

# SYNOPSIS

**logria** [_options_]

# PARAMETERS

**-e**, **--exec** _COMMAND_
> Execute a command and stream its output.

**-f**, **--file** _FILE_
> Stream logs from a file.

# DESCRIPTION

**logria** is a CLI tool for real-time log aggregation that allows you to filter, parse, and aggregate live data streams from shell commands and files. It supports regex filtering, user-defined parsing rules with aggregation methods, and session saving.

You can watch live logs from multiple processes and filter them for specific events, replace regex or filter patterns without killing the process or losing the stream history, and parse logs using custom rules.

# CAVEATS

Best suited for text-based log formats. Complex aggregation rules require manual configuration.

# HISTORY

**logria** was created by **ReagentX** and is written in **Rust** (with an earlier Python proof of concept).

# SEE ALSO

[lnav](/man/lnav)(1), [tail](/man/tail)(1), [grep](/man/grep)(1)
