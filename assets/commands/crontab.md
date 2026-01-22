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

**crontab** manages scheduled tasks for users. It edits the cron table, which contains commands to be executed at specified times and dates. Cron is essential for automated system maintenance, backups, and recurring tasks.

The command interfaces with the cron daemon to schedule jobs.

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

# EXAMPLES

```bash
# Run every minute
* * * * * /path/to/script.sh

# Run at 2:30 AM every day
30 2 * * * /path/to/backup.sh

# Run every Monday at 9 AM
0 9 * * 1 /path/to/weekly-task.sh

# Run on first of month at midnight
0 0 1 * * /path/to/monthly-report.sh

# Run every 5 minutes
*/5 * * * * /path/to/check.sh

# Run every weekday at 6 PM
0 18 * * 1-5 /path/to/workday-task.sh

# Run at startup
@reboot /path/to/startup-script.sh
```

# ENVIRONMENT

Cron runs with minimal environment. Set explicitly:
```
PATH=/usr/local/bin:/usr/bin:/bin
SHELL=/bin/bash

0 2 * * * /path/to/script.sh
```

# WORKFLOW

```bash
# Edit crontab
crontab -e

# Add job (opens editor)
0 2 * * * /home/user/backup.sh

# List current jobs
crontab -l

# Save crontab to file
crontab -l > my-crontab.txt

# Load from file
crontab my-crontab.txt

# Remove all jobs
crontab -r
```

# CAVEATS

Limited environment variables. No output unless redirected or mailed. Time is in server timezone. Requires cron daemon running. Jobs don't run if system is off. Syntax errors silently ignored. Use absolute paths. Check /var/log/cron or /var/log/syslog for errors.

# HISTORY

**cron** was created by Ken Thompson in **1975** for Unix Version 7, with the crontab interface added later to allow user-level scheduling.

# SEE ALSO

[cron](/man/cron)(8), [at](/man/at)(1), [systemd-timer](/man/systemd-timer)(5)
