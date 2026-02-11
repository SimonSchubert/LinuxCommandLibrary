# TAGLINE

Display recorded kernel trace data

# TLDR

Display **recorded** trace

```sudo trace-cmd report```

Display trace for specific **CPU**

```sudo trace-cmd report --cpu [cpu_number]```

# SYNOPSIS

**trace-cmd report** [_OPTIONS_] [_FILE_]

# PARAMETERS

**--cpu** _NUMBER_
> Display trace for specific CPU only

**-i** _FILE_
> Read trace from specified file

# DESCRIPTION

**trace-cmd report** displays recorded trace events from a trace.dat file (or specified file). It parses the binary trace data and presents it in human-readable format.

The output shows timestamps, CPU numbers, process information, and trace events in chronological order. Filtering options allow focusing on specific CPUs or event types.

# CAVEATS

Requires matching kernel version for proper symbol resolution. Large trace files may take time to process. Some events require debug information for full interpretation.

# SEE ALSO

[trace-cmd](/man/trace-cmd)(1), [trace-cmd-list](/man/trace-cmd-list)(1), [trace-cmd-record](/man/trace-cmd-record)(1)
