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

**cron** is the daemon that executes scheduled commands. **crontab** manages per-user cron tables. Jobs run at specified times, dates, or intervals for automated system maintenance.

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

# FILES

**/etc/crontab**: System crontab

**/etc/cron.d/**: System cron jobs

**/var/spool/cron/**: User crontabs

# CAVEATS

Jobs run with limited environment. Set PATH explicitly in crontab. Output mailed to user unless redirected. Use MAILTO="" to disable mail.

# SEE ALSO

[crontab](/man/crontab)(5), [at](/man/at)(1), [systemd.timer](/man/systemd.timer)(5)
