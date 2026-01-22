# TLDR

**List** pending jobs

```atq```

List jobs for **specific user**

```atq -u [username]```

Show **queue** details

```atq -q [a]```

# SYNOPSIS

**atq** [_-q queue_] [_-u user_]

# DESCRIPTION

**atq** lists jobs pending in the at queue. It shows job numbers, execution times, and queue designations for scheduled one-time jobs.

This is equivalent to **at -l**.

# PARAMETERS

**-q** _queue_
> Show jobs from specific queue (a-z, A-Z)

**-u** _user_
> Show jobs for specific user (root only)

# OUTPUT FORMAT

Each line shows:
- Job number
- Execution date and time
- Queue letter
- Username

# CAVEATS

Non-root users can only see their own jobs. Jobs are lost if atd daemon is not running. Past jobs that couldn't run are shown.

# HISTORY

**atq** is part of the at command suite, scheduling deferred command execution in Unix since the **1970s**.

# SEE ALSO

[at](/man/at)(1), [atrm](/man/atrm)(1), [atd](/man/atd)(8), [cron](/man/cron)(8)
