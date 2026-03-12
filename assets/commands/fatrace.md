# TAGLINE

trace file access events in real-time

# TLDR

Print file access events on **all** filesystems

```sudo fatrace```

Limit to a specific **command** name

```sudo fatrace -C [program_name]```

Print events on **current mount** only

```sudo fatrace -c```

Add **timestamps** to output

```sudo fatrace -t```

Show only **read and write** events

```sudo fatrace -f RW```

Stop after **10 seconds** and write to file

```sudo fatrace -s [10] -o [output.log]```

# SYNOPSIS

**fatrace** [_options_]

# DESCRIPTION

**fatrace** reports file access events from the kernel's fanotify interface. It shows which processes are accessing which files in real-time, helping identify processes causing unnecessary disk activity or wake-ups.

Useful for debugging, security monitoring, and understanding application file access patterns.

# PARAMETERS

**-c**, **--current-mount**
> Only record events on the partition/mount of the current directory.

**-C**, **--command** _COMMAND_
> Show only events for this command name.

**-f**, **--filter** _TYPES_
> Show only the given event types: C (close), R (read), O (open), W (write), D (delete), + (create), < (move).

**-o**, **--output** _FILE_
> Write events to the given file instead of standard output.

**-p**, **--ignore-pid** _PID_
> Ignore events for this process ID. Can be specified multiple times.

**-s**, **--seconds** _SECONDS_
> Stop after the given number of seconds.

**-t**, **--timestamp**
> Add timestamps to events. Specify twice for epoch format.

**-h**, **--help**
> Print help and exit.

# CAVEATS

Requires root privileges. Uses fanotify which requires Linux 2.6.37+. May impact system performance on busy systems.

# SEE ALSO

[inotifywait](/man/inotifywait)(1), [lsof](/man/lsof)(8), [strace](/man/strace)(1)
