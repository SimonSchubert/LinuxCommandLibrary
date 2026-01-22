# TLDR

**Print** the log

```logread```

Print **last N** messages

```logread -l [n]```

**Filter** by pattern

```logread -e [pattern]```

**Follow** log in real-time

```logread -f```

Display **help**

```logread -h```

# SYNOPSIS

**logread** [_options_]

# DESCRIPTION

**logread** reads the logd ring buffer log on OpenWrt and similar embedded Linux systems. It provides access to system messages stored in memory rather than on disk.

# PARAMETERS

**-l N**
> Print last N messages

**-e PATTERN**
> Filter messages by keyword or regex

**-f**
> Follow log output in real-time

**-h**
> Display help information

# CAVEATS

Specific to OpenWrt and BusyBox-based systems. Ring buffer has limited size; older messages are overwritten.

# SEE ALSO

[dmesg](/man/dmesg)(1), [journalctl](/man/journalctl)(1), [syslog](/man/syslog)(3)
