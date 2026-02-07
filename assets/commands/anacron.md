# TAGLINE

Run periodic jobs on systems not running continuously

# TLDR

**Run** anacron jobs now

```sudo anacron -n```

Run in **foreground**

```sudo anacron -d```

**Test** run (don't execute jobs)

```anacron -T```

Force run regardless of **timestamps**

```sudo anacron -f```

Use **specific config** file

```sudo anacron -t [/etc/anacrontab]```

# SYNOPSIS

**anacron** [_-s_] [_-f_] [_-n_] [_-d_] [_-t anacrontab_] [_-T_]

# DESCRIPTION

**anacron** is a cron-like job scheduler that doesn't assume the computer is running continuously. It's ideal for laptops and desktop machines that aren't powered on 24/7, ensuring periodic jobs run even if the scheduled time was missed.

Unlike cron, which runs jobs at specific times, anacron runs jobs based on periods (daily, weekly, monthly) and tracks the last run date. If a job's period has elapsed since the last run, it executes the job.

# PARAMETERS

**-f**
> Force execution ignoring timestamps

**-n**
> Run jobs now, ignoring delays

**-d**
> Run in foreground (no daemon)

**-s**
> Serialize job execution (sequential)

**-T**
> Test configuration file syntax only

**-t** _file_
> Use alternate anacrontab file

**-S** _dir_
> Use alternate spool directory

**-u**
> Update timestamps only, don't run jobs

# CONFIGURATION

**/etc/anacrontab**
> Defines periodic jobs with their period in days, delay in minutes, identifier, and command to execute.

**/var/spool/anacron/**
> Timestamp files tracking the last execution date of each job.

# CAVEATS

Runs as root by default; user-level jobs require additional configuration. Job delay settings are randomized to avoid resource spikes. Not suitable for time-critical tasks.

# HISTORY

**anacron** was created by Christian Schwarz and first released in **1998** to address cron's unsuitability for machines that aren't always on. Most modern Linux distributions include it alongside traditional cron.

# SEE ALSO

[cron](/man/cron)(8), [crontab](/man/crontab)(1), [systemd.timer](/man/systemd.timer)(5)
