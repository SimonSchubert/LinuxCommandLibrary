# TAGLINE

Send signals to unit processes

# TLDR

Send **SIGTERM** to unit

```systemctl kill [unit]```

Send **specific signal**

```systemctl kill -s [SIGNAL] [unit]```

Send signal to **main process** only

```systemctl kill -s SIGHUP --kill-whom main [unit]```

**List** available signals

```systemctl kill -s help```

# SYNOPSIS

**systemctl kill** [_OPTIONS_] _PATTERN_...

# PARAMETERS

**-s, --signal=** _SIGNAL_
> Signal to send (name or number, default: SIGTERM)

**--kill-whom=** _WHO_
> Which processes to kill: main, control, or all (default: all)

**--user**
> Kill user service processes

# DESCRIPTION

**systemctl kill** sends a signal to one or more processes of a unit. By default, it sends SIGTERM to all processes in the unit's cgroup. This provides more control than `systemctl stop`, which follows the unit's configured stop behavior.

The `--kill-whom` option controls which processes receive the signal: main (the main process), control (control processes), or all (every process in the cgroup).

# CAVEATS

Bypasses the unit's configured ExecStop commands. Killing main process may leave child processes orphaned depending on unit configuration. SIGKILL cannot be caught or ignored by processes.

# HISTORY

The **kill** subcommand provides direct signal delivery to unit processes, useful when the normal stop procedure is insufficient or when specific signals are needed (like SIGHUP for config reload).

# SEE ALSO

[systemctl-stop](/man/systemctl-stop)(1), [kill](/man/kill)(1), [signal](/man/signal)(7)
