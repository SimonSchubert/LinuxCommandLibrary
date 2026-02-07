# TAGLINE

trace file access events in real-time

# TLDR

Print file access events on **all** filesystems

```sudo fatrace```

Limit to specific **program** name

```sudo fatrace [-C|--command] [program_name]```

Print events on **current mount** only

```sudo fatrace [-c|--current-mount]```

Add **timestamps** to output

```sudo fatrace [-t|--timestamp]```

# SYNOPSIS

**fatrace** [_options_]

# DESCRIPTION

**fatrace** reports file access events from the kernel's fanotify interface. It shows which processes are accessing which files in real-time.

Useful for debugging, security monitoring, and understanding application file access patterns.

# PARAMETERS

**-C, --command** _name_
> Only report for specific command

**-c, --current-mount**
> Only report current mount

**-t, --timestamp**
> Add timestamps

**-p, --pid** _pid_
> Filter by process ID

**-f, --filter** _types_
> Filter event types (R, W, O, C)

# CAVEATS

Requires root privileges. Uses fanotify which requires Linux 2.6.37+. May impact system performance on busy systems.

# SEE ALSO

[inotifywait](/man/inotifywait)(1), [lsof](/man/lsof)(8), [strace](/man/strace)(1)
