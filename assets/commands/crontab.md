# TAGLINE

user cron table editor

# TLDR

**Edit** crontab

```crontab -e```

**List** cron jobs

```crontab -l```

**Remove** crontab

```crontab -r```

**Edit** specific user's crontab

```sudo crontab -e -u [username]```

# SYNOPSIS

**crontab** [_options_]

# DESCRIPTION

**crontab** manages scheduled tasks for users. It provides an interface to edit, list, and remove the cron table, which contains commands to be executed at specified times and dates. The cron daemon reads these tables and executes jobs at their scheduled times.

Each user can have their own crontab file, allowing for user-level task scheduling without requiring root privileges. The crontab command provides a safe way to edit these files, performing syntax validation and notifying the cron daemon of changes. Jobs can be scheduled to run at specific times, regular intervals, or special events like system startup.

# PARAMETERS

**-e**
> Edit crontab

**-l**
> List crontab

**-r**
> Remove crontab

**-u** _user_
> Specify user

**-i**
> Interactive mode (prompt before removing)

# CRONTAB FORMAT

```
* * * * * command
│ │ │ │ │
│ │ │ │ └── Day of week (0-7, Sunday = 0 or 7)
│ │ │ └──── Month (1-12)
│ │ └────── Day of month (1-31)
│ └──────── Hour (0-23)
└────────── Minute (0-59)
```

# SPECIAL CHARACTERS

***** - Any value
**,** - List (e.g., 1,3,5)
**-** - Range (e.g., 1-5)
**/** - Step (e.g., */5 = every 5)

# SPECIAL STRINGS

**@reboot** - Run at startup
**@yearly** / **@annually** - Once a year (0 0 1 1 *)
**@monthly** - Once a month (0 0 1 * *)
**@weekly** - Once a week (0 0 * * 0)
**@daily** / **@midnight** - Once a day (0 0 * * *)
**@hourly** - Once an hour (0 * * * *)

# CONFIGURATION

**/var/spool/cron/crontabs/[username]**
> User's crontab file (location varies by system). Edited via crontab -e, not directly.

# CAVEATS

Limited environment variables. No output unless redirected or mailed. Time is in server timezone. Requires cron daemon running. Jobs don't run if system is off. Syntax errors silently ignored. Use absolute paths. Check /var/log/cron or /var/log/syslog for errors.

# HISTORY

**cron** was created by Ken Thompson in **1975** for Unix Version 7, with the crontab interface added later to allow user-level scheduling.

# SEE ALSO

[cron](/man/cron)(8), [at](/man/at)(1), [systemd-timer](/man/systemd-timer)(5)
