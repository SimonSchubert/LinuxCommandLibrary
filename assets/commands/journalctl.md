# TAGLINE

queries and displays messages from the systemd journal

# TLDR

Show all messages with **priority level 3** (errors) from this boot

```journalctl -b -p 3```

**Follow** new messages (like tail -f)

```journalctl -n 50 -f```

Show all messages by a **specific unit**

```journalctl -u [unit]```

Filter messages within a **time range**

```journalctl -S yesterday -U today```

Show all messages by a **specific process**

```journalctl _PID=[pid]```

**Delete** journal logs older than 2 days

```journalctl --vacuum-time 2d```

Show messages by a specific **executable**

```journalctl [path/to/executable]```

# SYNOPSIS

**journalctl** [_-b_] [_-p priority_] [_-u unit_] [_-n lines_] [_-f_] [_-S since_] [_-U until_]

# DESCRIPTION

**journalctl** queries and displays messages from the systemd journal. The journal stores log data from the kernel, system services, and applications in a structured, indexed format.

# PARAMETERS

**-b, --boot**
> Show messages from current boot (or specified boot)

**-p, --priority level**
> Filter by priority (0=emerg to 7=debug, or names)

**-u, --unit unit**
> Show messages from specified systemd unit

**-n, --lines n**
> Show the most recent n lines

**-f, --follow**
> Follow new messages as they appear

**-S, --since time**
> Show entries after specified time

**-U, --until time**
> Show entries before specified time

**-k, --dmesg**
> Show kernel messages only

**-r, --reverse**
> Reverse output (newest first)

**-o, --output format**
> Output format (short, verbose, json, cat, etc.)

**--vacuum-time time**
> Remove journal files older than time

**--vacuum-size size**
> Reduce journal to specified size

**--disk-usage**
> Show current disk usage of journal

**_PID=pid**
> Filter by process ID

**_SYSTEMD_UNIT=unit**
> Filter by systemd unit

# CAVEATS

Journal files are stored in /var/log/journal/ (persistent) or /run/log/journal/ (volatile). Some options require root privileges.

# HISTORY

Part of **systemd**, introduced in **2010** by Lennart Poettering. Replaces traditional syslog for systems using systemd.

# SEE ALSO

[dmesg](/man/dmesg)(1), [systemctl](/man/systemctl)(1), [systemd](/man/systemd)(1)
