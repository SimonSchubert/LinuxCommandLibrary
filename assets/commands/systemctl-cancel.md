# TAGLINE

Cancel pending systemd jobs

# TLDR

**Cancel** job by ID

```systemctl cancel [job_id]```

Cancel **multiple** jobs

```systemctl cancel [job_id1 job_id2 ...]```

Cancel **all** pending jobs

```systemctl cancel```

Cancel **user** job

```systemctl cancel [job_id] --user```

# SYNOPSIS

**systemctl cancel** [_JOB_...]

# PARAMETERS

**--user**
> Cancel jobs in the user service manager

**--system**
> Cancel jobs in the system manager (default)

# DESCRIPTION

**systemctl cancel** cancels one or more pending jobs in the systemd service manager. Jobs represent pending operations like starting, stopping, or restarting units. When called without arguments, all pending jobs are cancelled.

Job IDs can be found using `systemctl list-jobs`. Cancelling a job aborts the pending operation without affecting the current state of the unit.

# CAVEATS

Cannot cancel already completed jobs. Some jobs may have dependencies that restart them. Cancelling critical boot jobs may leave the system in an inconsistent state.

# HISTORY

The **cancel** subcommand is part of **systemctl** in the **systemd** project. It provides control over the job queue that manages unit state transitions.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-list-jobs](/man/systemctl-list-jobs)(1)
