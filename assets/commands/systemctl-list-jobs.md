# TAGLINE

List pending systemd jobs

# TLDR

List **all** pending and running jobs

```systemctl list-jobs```

Filter jobs matching a **pattern**

```systemctl list-jobs [pattern]```

**Cancel** a specific job by ID

```systemctl cancel [job_id]```

# SYNOPSIS

**systemctl list-jobs** [_PATTERN_...]

# DESCRIPTION

**systemctl list-jobs** displays the queue of pending and running jobs in the systemd service manager. Jobs represent state change operations like starting, stopping, or reloading units.

The output shows the job ID, unit name, job type (start, stop, reload, etc.), and state (waiting, running). Jobs appear during boot or when multiple unit state changes are triggered.

# JOB TYPES

**start** - Starting a unit

**stop** - Stopping a unit

**reload** - Reloading configuration

**restart** - Restarting a unit

**try-restart** - Restarting a unit if active

**reload-or-restart** - Reloading or restarting a unit

**verify-active** - Checking if active

**nop** - No operation (used for ordering)

# CAVEATS

The job queue is usually empty on an idle system. Jobs appear briefly during state changes and may complete before the command output is displayed. Job IDs are used with `systemctl cancel`.

# HISTORY

The **list-jobs** subcommand provides visibility into systemd's internal job queue, useful for debugging stuck boots or understanding why services are not starting. It has been part of systemd since its initial release.

# SEE ALSO

[systemctl-cancel](/man/systemctl-cancel)(1), [systemctl](/man/systemctl)(1)
