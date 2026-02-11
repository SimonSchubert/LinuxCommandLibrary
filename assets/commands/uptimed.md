# TAGLINE

Uptime record tracking daemon

# TLDR

**Start the daemon**

```sudo systemctl start uptimed```

**Enable at boot**

```sudo systemctl enable uptimed```

**View uptime records**

```uprecords```

**Show top 20 records**

```uprecords -m 20```

**Show downtime between reboots**

```uprecords -d```

**Show records in short format**

```uprecords -s```

# SYNOPSIS

**uptimed** [_options_]

**uprecords** [_options_]

# UPTIMED PARAMETERS

**-f** _file_
> Use specified configuration file.

**-p** _file_
> Use specified PID file.

**-d**
> Don't fork to background (debug mode).

# UPRECORDS PARAMETERS

**-m** _count_
> Show specified number of records.

**-d**
> Show downtime between reboots.

**-s**
> Short output format.

**-a**
> Show all records.

**-b**
> Sort by boot time.

**-w**
> Wide output format.

**-v**
> Display version.

# DESCRIPTION

**uptimed** is a daemon that tracks and records system uptime history. It maintains a database of boot sessions and their durations, allowing you to see historical uptime records for your system.

The companion **uprecords** command displays the recorded data in a ranked format, showing your system's longest uptimes. An arrow marks the current session's position in the rankings.

Configuration allows setting minimum uptime thresholds for records, milestone notifications, and email alerts when new records are achieved. The daemon uses boot time to distinguish between sessions.

# CONFIGURATION

Configuration file: /etc/uptimed.conf

**LOG_MINIMUM_UPTIME**: Minimum uptime to record (default: 1h).

**MILESTONE**: Define milestones like "7d:One week uptime".

**EMAIL**: Address for milestone notifications.

# CAVEATS

Only records uptimes after installation. Requires daemon to be running to track current session. System clock changes can affect accuracy. Email notifications require configured MTA.

# HISTORY

**uptimed** was created by Rob Kaper and is now maintained by Radek Podgorny. It was inspired by the 'ud' utility but uses a different design based on boot times rather than PID files to track sessions.

# SEE ALSO

[uptime](/man/uptime)(1), [last](/man/last)(1), [who](/man/who)(1)
