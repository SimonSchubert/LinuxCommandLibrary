# TAGLINE

List pending jobs in the at queue

# TLDR

**List** pending jobs

```atq```

List jobs in a **specific queue**

```atq -q [a]```

Custom **time format** for listed jobs

```atq -o [%Y-%m-%d %H:%M]```

# SYNOPSIS

**atq** [_-V_] [_-q queue_] [_-o fmt_]

# DESCRIPTION

**atq** lists jobs pending in the at queue. It shows job numbers, execution times, and queue designations for scheduled one-time jobs.

This is equivalent to **at -l**.

# PARAMETERS

**-q** _queue_
> Show only jobs in the specified queue. A queue designation consists of a single letter (a-z or A-Z). The default queue for **at** jobs is **a** and for **batch** jobs is **b**.

**-o** _fmt_
> Use the specified **strftime**-style format for the date and time shown in the listing.

**-V**
> Print the version number to standard error and exit.

# OUTPUT FORMAT

Each line shows the job number, the scheduled execution date and time, the queue letter, and the owning username.

# CAVEATS

Non-root users can only see their own jobs; the superuser sees everyone's jobs. Jobs do not run while the **atd** daemon is not running, and past jobs that could not run are still listed until removed.

# HISTORY

**atq** is part of the at command suite, scheduling deferred command execution in Unix since the **1970s**.

# SEE ALSO

[at](/man/at)(1), [atrm](/man/atrm)(1), [atd](/man/atd)(8), [cron](/man/cron)(8)

# RESOURCES

```[Source code](https://salsa.debian.org/debian/at)```

<!-- verified: 2026-06-17 -->
