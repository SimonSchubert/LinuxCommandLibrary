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

**-M**, **--machine** _container_
> Execute the operation on a local container

**-H**, **--host** _user@host_
> Execute the operation on a remote host over SSH

**--no-pager**
> Do not pipe output into a pager

# DESCRIPTION

**systemctl cancel** cancels one or more pending jobs in the systemd service manager. Jobs represent pending operations like starting, stopping, or restarting units. When called without arguments, all pending jobs are cancelled.

Job IDs can be found using `systemctl list-jobs`.

# CAVEATS

Cancelling removes a job from the queue if it has not started, but generally does not abort a job already being executed. Calling it without arguments during boot or shutdown also cancels jobs other units are waiting on.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-list-jobs](/man/systemctl-list-jobs)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
