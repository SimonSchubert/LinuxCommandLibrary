# TAGLINE

Generate summary reports from audit logs

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

Report on **failed** events only

```sudo aureport -au --failed --summary```

# SYNOPSIS

**aureport** [_OPTIONS_]

# DESCRIPTION

**aureport** generates summary reports from the Linux audit logs. It provides overviews of various event types including logins, authentication, files, syscalls, and anomalies.

# PARAMETERS

**-au, --auth**
> Report on authentication attempts.

**-l, --login**
> Report on login events.

**-s, --syscall**
> Report on syscall events.

**-x, --executable**
> Report on executable events.

**-f, --file**
> Report on files and AF_UNIX sockets.

**-u, --user**
> Report on user events.

**-c, --config**
> Report on configuration changes.

**-ts, --start** _time_
> Start time for the report. Accepts keywords such as now, recent, today, yesterday, this-week, and boot.

**-te, --end** _time_
> End time for the report. Accepts the same keywords as **-ts**.

**-t, --log**
> Report the start and end times of each audit log file.

**--success**
> Process only successful events.

**--failed**
> Process only failed events.

**--summary**
> Include summary totals for the selected report.

**-i, --interpret**
> Interpret numeric entities (UIDs, syscalls, and so on) into human-readable names.

# CONFIGURATION

**/etc/audit/auditd.conf**
> Main audit daemon configuration, controls log file location, size, and rotation.

**/etc/audit/audit.rules**
> Defines which events the audit system logs. Determines what data is available for reporting.

# CAVEATS

Requires root privileges. Reports are generated from available audit logs, so completeness depends on what has been logged. Use time filters for large log files.

# HISTORY

**aureport** is part of the **audit** package, providing reporting capabilities for the Linux Audit Framework.

# SEE ALSO

[ausearch](/man/ausearch)(8), [auditctl](/man/auditctl)(8), [auditd](/man/auditd)(8)

# RESOURCES

```[Source code](https://github.com/linux-audit/audit-userspace)```

<!-- verified: 2026-06-17 -->
