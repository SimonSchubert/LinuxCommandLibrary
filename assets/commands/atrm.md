# TLDR

**Remove** scheduled job

```atrm [job_number]```

Remove **multiple** jobs

```atrm [1] [2] [3]```

# SYNOPSIS

**atrm** _job_ [_job_...]

# DESCRIPTION

**atrm** removes jobs from the at queue. Jobs are identified by their job numbers as shown by **atq**.

Users can only remove their own jobs; root can remove any job.

# PARAMETERS

**job**
> Job number(s) to remove

# CAVEATS

Cannot remove already-running jobs. Job numbers can be found with atq. Removal is immediate and cannot be undone.

# HISTORY

**atrm** is part of the at command suite for one-time job scheduling in Unix systems.

# SEE ALSO

[at](/man/at)(1), [atq](/man/atq)(1), [batch](/man/batch)(1)
