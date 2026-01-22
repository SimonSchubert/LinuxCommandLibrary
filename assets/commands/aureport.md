# TLDR

Show **summary** of events

```sudo aureport```

Report on **logins**

```sudo aureport -l```

Report on **syscalls**

```sudo aureport -s```

Report on **executables**

```sudo aureport -x```

Report for **time range**

```sudo aureport -ts start_time -te end_time```

List **audit files** and time range

```sudo aureport -t```

# SYNOPSIS

**aureport** [_OPTIONS_]

# DESCRIPTION

**aureport** generates summary reports from the Linux audit logs. It provides overviews of various event types including logins, authentication, files, syscalls, and anomalies.

# PARAMETERS

**-l, --login**
> Report on login events

**-s, --syscall**
> Report on syscall events

**-x, --executable**
> Report on executable events

**-f, --file**
> Report on file events

**-u, --user**
> Report on user events

**-ts, --start** _time_
> Start time for report

**-te, --end** _time_
> End time for report

**-t, --log-time**
> List audit files and their time ranges

**--summary**
> Include summary statistics

**-i, --interpret**
> Interpret numeric values to names

# CAVEATS

Requires root privileges. Reports are generated from available audit logs, so completeness depends on what has been logged. Use time filters for large log files.

# HISTORY

**aureport** is part of the **audit** package, providing reporting capabilities for the Linux Audit Framework.

# SEE ALSO

[ausearch](/man/ausearch)(8), [auditctl](/man/auditctl)(8), [auditd](/man/auditd)(8)
