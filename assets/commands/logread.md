# TAGLINE

reads the logd ring buffer log on OpenWrt and similar embedded Linux systems

# TLDR

**Print** all log messages

```logread```

**Follow** log output in real-time

```logread -f```

Print **last N** messages

```logread -l [50]```

**Filter** messages by pattern

```logread -e [pattern]```

**Filter** by syslog priority

```logread -p [daemon.info]```

Print log and **follow** new messages

```logread -f -e [error]```

# SYNOPSIS

**logread** [_options_]

# DESCRIPTION

**logread** reads the logd ring buffer log on OpenWrt and similar embedded Linux systems. It provides access to system messages stored in memory rather than on disk.

# PARAMETERS

**-f**
> Follow log output in real-time (like tail -f).

**-l** _N_
> Print only the last N messages.

**-e** _PATTERN_
> Filter messages matching a keyword or pattern.

**-p** _FACILITY.LEVEL_
> Filter by syslog facility and priority (e.g., kern.err, daemon.info).

**-t**
> Include a human-readable timestamp with each message.

**-h**
> Display help information.

# CAVEATS

Specific to OpenWrt and BusyBox-based systems. Ring buffer has limited size; older messages are overwritten.

# SEE ALSO

[dmesg](/man/dmesg)(1), [journalctl](/man/journalctl)(1), [logger](/man/logger)(1)
