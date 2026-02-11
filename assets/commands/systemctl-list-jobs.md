# TAGLINE

List pending systemd jobs

# TLDR

List **all** active jobs

```systemctl list-jobs```

Filter jobs for **specific unit**

```systemctl list-jobs [unit]```

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

**verify-active** - Checking if active

# CAVEATS

The job queue is usually empty on an idle system. Jobs appear briefly during state changes and may complete before the command output is displayed. Job IDs are used with `systemctl cancel`.

# HISTORY

The **list-jobs** subcommand provides visibility into systemd's internal job queue, useful for debugging stuck boots or understanding why services aren't starting.

# SEE ALSO

[systemctl-cancel](/man/systemctl-cancel)(1), [systemctl](/man/systemctl)(1)
