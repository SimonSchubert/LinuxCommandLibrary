# TAGLINE

CLI tool for real-time log aggregation and analysis

# TLDR

**Open the setup screen** to configure a log stream interactively

```logria```

**Stream logs from a command**

```logria -e "[tail -f /var/log/syslog]"```

**Stream logs from a command** with history cache disabled

```logria -e "[command]" -t```

**Print current configuration paths**

```logria -p```

# SYNOPSIS

**logria** [_options_]

# PARAMETERS

**-e**, **--exec** _COMMAND_
> Execute a command and stream its output.

**-t**, **--no-history-tape**
> Disable command history disk cache.

**-m**, **--mindless**
> Disable variable polling rate based on incoming message rate.

**-d**, **--docs**
> Print documentation.

**-p**, **--paths**
> Print current configuration paths.

**-h**, **--help**
> Print help information.

**-V**, **--version**
> Print version information.

# DESCRIPTION

**logria** is a CLI tool for real-time log aggregation that allows you to filter, parse, and aggregate live data streams from shell commands. It supports regex filtering, user-defined parsing rules with aggregation methods, and session saving.

You can watch live logs from multiple processes and filter them for specific events, replace regex or filter patterns without killing the process or losing the stream history, and parse logs using custom rules.

# CAVEATS

Best suited for text-based log formats. Does not have a dedicated file input flag; use `-e "tail -f file"` to stream from files. Complex aggregation rules require manual configuration.

# HISTORY

**logria** was created by **ReagentX** and is written in **Rust** (with an earlier Python proof of concept).

# SEE ALSO

[lnav](/man/lnav)(1), [tail](/man/tail)(1), [grep](/man/grep)(1), [multitail](/man/multitail)(1)
