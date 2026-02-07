# TAGLINE

Daemon that executes jobs scheduled with at

# TLDR

**Start the at daemon**

```atd```

**Run in foreground** for debugging

```atd -f```

**Run with debug messages** to stderr

```atd -d```

**Set minimum interval** between batch jobs (seconds)

```atd -b [120]```

**Process the queue once** and exit

```atd -s```

# SYNOPSIS

**atd** [**-d**] [**-f**] [**-s**] [**-l** _load_avg_] [**-b** _interval_]

# PARAMETERS

**-d**
> Debug mode; print errors to stderr instead of syslog (implies -f)

**-f**
> Run in foreground instead of daemonizing

**-s**
> Process the at/batch queue once and exit

**-l** _load_avg_
> Limit batch job execution to when system load is below this value (default: 1.5)

**-b** _interval_
> Minimum seconds between starting batch jobs (default: 60)

# DESCRIPTION

**atd** is the daemon that executes jobs scheduled with the **at** command. It runs in the background, periodically checking **/var/spool/at/** for pending jobs and executing them at their scheduled times.

Jobs are submitted using **at** for time-specific scheduling or **batch** for load-based execution. The daemon runs jobs on behalf of the user who scheduled them, inheriting their environment and permissions.

Access control is managed through **/etc/at.allow** and **/etc/at.deny**. If at.allow exists, only listed users can schedule jobs. If only at.deny exists, all users except those listed can schedule jobs. If neither exists, only root can use at.

Related commands:
- **at** - schedule a job for a specific time
- **atq** - list pending jobs
- **atrm** - remove a pending job
- **batch** - schedule a job for when system load permits

# CONFIGURATION

**/etc/at.allow**
> If this file exists, only users listed in it can schedule jobs with at.

**/etc/at.deny**
> Users listed in this file are denied access to at. Ignored if at.allow exists.

# CAVEATS

The atd spool directory (**/var/spool/at/**) does not work correctly when mounted via NFS, even with no_root_squash. Jobs inherit the environment from when they were scheduled, not the current environment. The daemon must be running for scheduled jobs to execute.

# HISTORY

The **at** command and its daemon have origins in early Unix systems, dating back to **Version 7 Unix** in **1979**. The concept of deferred command execution was part of the original Unix job control philosophy. The modern implementation includes the **batch** command for load-sensitive scheduling, making it useful for resource-intensive tasks that should run during low-usage periods.

# SEE ALSO

[at](/man/at)(1), [atq](/man/atq)(1), [atrm](/man/atrm)(1), [batch](/man/batch)(1), [cron](/man/cron)(8), [crontab](/man/crontab)(1)
