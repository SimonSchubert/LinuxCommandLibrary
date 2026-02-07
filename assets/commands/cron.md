# TAGLINE

time-based job scheduler daemon

# TLDR

**Edit crontab**

```crontab -e```

**List cron jobs**

```crontab -l```

**Remove crontab**

```crontab -r```

**Edit another user's crontab**

```sudo crontab -u [user] -e```

**Install crontab from file**

```crontab [crontab.txt]```

# SYNOPSIS

**crontab** [_options_] [_file_]

**cron** [_options_]

# DESCRIPTION

**cron** is the daemon that executes scheduled commands. **crontab** manages per-user cron tables. Together they provide time-based job scheduling for automated system maintenance, backups, log rotation, and recurring tasks.

The cron daemon starts at boot and runs continuously, waking up every minute to check all crontab files for jobs that need execution. Each user can have their own crontab file, and the system has crontabs for system-wide maintenance. Jobs run in the background without user interaction, making cron essential for Unix/Linux system administration.

# CRONTAB OPTIONS

**-e**
> Edit crontab

**-l**
> List crontab

**-r**
> Remove crontab

**-u** _user_
> Operate on user's crontab (requires root)

**-i**
> Prompt before removal

# CRON DAEMON OPTIONS

**-n**
> Run in foreground

**-m** _command_
> Mail command (or "off" to disable)

**-s**
> Log to syslog

**-p**
> Accept any user crontab

# CRONTAB SYNTAX

```
* * * * * command
│ │ │ │ │
│ │ │ │ └─ Day of week (0-7, Sun=0 or 7)
│ │ │ └─── Month (1-12)
│ │ └───── Day of month (1-31)
│ └─────── Hour (0-23)
└───────── Minute (0-59)
```

# SPECIAL STRINGS

**@reboot**: Run at startup

**@hourly**: 0 * * * *

**@daily**: 0 0 * * *

**@weekly**: 0 0 * * 0

**@monthly**: 0 0 1 * *

**@yearly**: 0 0 1 1 *

# CONFIGURATION

**/etc/crontab**
> System-wide crontab file with additional user field for running jobs as specific users.

**/etc/cron.d/**
> Directory containing system crontab files in the same format as /etc/crontab.

**/var/spool/cron/**
> Directory containing per-user crontab files managed via the crontab command.

# CAVEATS

Jobs run with limited environment. Set PATH explicitly in crontab. Output mailed to user unless redirected. Use MAILTO="" to disable mail.

# SEE ALSO

[crontab](/man/crontab)(5), [at](/man/at)(1), [systemd.timer](/man/systemd.timer)(5)
