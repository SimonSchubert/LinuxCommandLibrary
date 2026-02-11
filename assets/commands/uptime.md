# TAGLINE

Show system uptime and load averages

# TLDR

**Show system uptime** and load averages

```uptime```

**Show uptime in pretty format**

```uptime -p```

**Show when the system was booted**

```uptime -s```

# SYNOPSIS

**uptime** [_options_]

# PARAMETERS

**-p**, **--pretty**
> Show uptime in human-readable format

**-s**, **--since**
> Show date and time when system started (yyyy-mm-dd HH:MM:SS)

**-h**, **--help**
> Display help message

**-V**, **--version**
> Display version information

# OUTPUT FORMAT

Default output shows:
- Current time
- System uptime (days, hours, minutes)
- Number of logged-in users
- Load averages for 1, 5, and 15 minutes

Example: `14:30:05 up 7 days, 3:42, 2 users, load average: 0.15, 0.20, 0.18`

# DESCRIPTION

**uptime** displays how long the system has been running, the number of users currently logged in, and the system load averages for the past 1, 5, and 15 minutes.

Load averages represent the average number of processes waiting for CPU time. On a single-CPU system, a load of 1.0 means the CPU is fully utilized. On a 4-CPU system, a load of 4.0 indicates full utilization. Values above the CPU count suggest processes are waiting for CPU time.

The command reads from **/proc/uptime** for system uptime and **/var/run/utmp** for user information. It is part of the procps-ng package.

# CAVEATS

Load averages include processes waiting for I/O, not just CPU-bound processes, which can make interpretation less straightforward. The user count reflects logged-in sessions, including multiple terminals for the same user. System time resets on reboot; for historical uptime tracking, use external monitoring tools.

# HISTORY

The uptime command originated in early Unix systems, providing a quick way to check system health. It became part of standard Unix utilities and is included in all Unix-like systems. The load average concept was introduced in BSD Unix. On Linux, uptime is part of the **procps** (later **procps-ng**) package that provides utilities for examining the **/proc** filesystem.

# SEE ALSO

[w](/man/w)(1), [top](/man/top)(1), [who](/man/who)(1), [last](/man/last)(1)
