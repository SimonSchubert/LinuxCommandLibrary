# TAGLINE

CLI tool for log stream splitting and visualization

# TLDR

**Split logs by patterns**

```tail -f [logfile] | logss -s "[pattern1]" -s "[pattern2]"```

**Write matched patterns to files**

```tail -f [logfile] | logss -s "[pattern]" -o [output.log]```

**Start in single view mode**

```tail -f [logfile] | logss -s "[pattern]" --single```

# SYNOPSIS

**logss** [_options_]

# PARAMETERS

**-s**, **--substring** _PATTERN_
> Specify a regex pattern to match and split logs by.

**-o**, **--output** _FILE_
> Write matched patterns to an output file.

**--single**
> Start in single view mode.

**-v**, **--vertical**
> Start in vertical view mode.

**-r**, **--render-speed** _MS_
> Specify render speed in milliseconds.

# DESCRIPTION

**logss** is a CLI/TUI tool for visualizing and splitting log streams in real time. It allows you to define multiple regex patterns and view matching log entries in separate panes, with automatic color coding and adjustable render speed.

The tool reads from stdin and distributes log lines to different views based on pattern matches, making it useful for monitoring multiple types of events in a single log stream.

# CAVEATS

Reads exclusively from stdin. Log sources must be piped into the tool.

# HISTORY

**logss** was created by **todoesverso** and is written in **Rust**.

# SEE ALSO

[grep](/man/grep)(1), [tail](/man/tail)(1), [multitail](/man/multitail)(1)
