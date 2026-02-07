# TAGLINE

kernel ring buffer message viewer

# TLDR

Show **kernel messages**

```sudo dmesg```

Show kernel **error messages**

```sudo dmesg -l err```

**Follow** kernel messages in real-time

```sudo dmesg -w```

Show messages with **human-readable timestamps**

```sudo dmesg -T```

Show messages in **human-readable** form

```sudo dmesg -H```

**Colorize** output

```sudo dmesg -L```

Filter messages by **facility**

```sudo dmesg -f kern```

# SYNOPSIS

**dmesg** [_-l level_] [_-f facility_] [_-T_] [_-H_] [_-w_] [_-L_]

# DESCRIPTION

**dmesg** prints and controls the kernel ring buffer, which contains messages from the kernel including hardware detection, driver loading, and system events. It is essential for debugging hardware and driver issues.

# PARAMETERS

**-l, --level level**
> Restrict output to specified log levels (emerg, alert, crit, err, warn, notice, info, debug)

**-f, --facility facility**
> Restrict output to specified facilities (kern, user, mail, daemon, etc.)

**-T, --ctime**
> Print human-readable timestamps

**-H, --human**
> Enable human-readable output with colors and timestamps

**-w, --follow**
> Wait for new messages (like tail -f)

**-L, --color**
> Colorize output

**-c, --read-clear**
> Clear the ring buffer after printing

**-C, --clear**
> Clear the ring buffer without printing

**-n, --console-level level**
> Set level of messages printed to console

**-x, --decode**
> Decode facility and level to human-readable prefixes

# CAVEATS

Requires root privileges on most systems. The **-w**, **-T**, and **-H** options are available in kernels 3.5.0 and newer.

# HISTORY

Part of **util-linux** package. The kernel ring buffer has been part of Linux since early versions, providing essential diagnostic information.

# SEE ALSO

[journalctl](/man/journalctl)(1), [syslog](/man/syslog)(3), [tail](/man/tail)(1)
