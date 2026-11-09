# TAGLINE

List pending systemd jobs

# TLDR

List **all** pending and running jobs

```systemctl list-jobs```

Filter jobs matching a **pattern**

```systemctl list-jobs [pattern]```

Show which jobs are **blocking** each job

```systemctl list-jobs --before```

Show which jobs are **waiting on** each job

```systemctl list-jobs --after```

List jobs of the **user** service manager

```systemctl --user list-jobs```

**Cancel** a specific job by ID

```systemctl cancel [job_id]```

# SYNOPSIS

**systemctl list-jobs** [_OPTIONS_] [_PATTERN_...]

# PARAMETERS

**--after**
> For each job, show which other jobs are waiting for it.

**--before**
> For each job, show which other jobs it is waiting for.

**--user**
> Query the user service manager.

**--no-legend**
> Do not print the header and footer.

**--no-pager**
> Do not pipe output into a pager.

# DESCRIPTION

**systemctl list-jobs** displays the queue of pending and running jobs in the systemd service manager. Jobs represent state change operations like starting, stopping, or reloading units.

The output shows the job ID, unit name, job type, and state (waiting or running). Job types are **start**, **stop**, **reload**, **restart**, **try-restart**, **try-reload**, **reload-or-start**, **verify-active** and **nop**. Combine **--after** and **--before** to see the whole dependency picture, useful for debugging stuck boots.

# CAVEATS

The job queue is usually empty on an idle system. Jobs appear briefly during state changes and may complete before the command output is displayed.

# SEE ALSO

[systemctl-cancel](/man/systemctl-cancel)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
