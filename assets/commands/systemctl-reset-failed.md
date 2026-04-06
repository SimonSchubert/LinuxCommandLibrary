# TAGLINE

Clear failed unit states

# TLDR

Reset **all** failed units

```systemctl reset-failed```

Reset a **specific** unit

```systemctl reset-failed [unit]```

Reset **multiple** units

```systemctl reset-failed [unit1 unit2 ...]```

**List** failed units first, then reset them

```systemctl --failed```

# SYNOPSIS

**systemctl reset-failed** [_PATTERN_...]

# DESCRIPTION

**systemctl reset-failed** clears the "failed" state from one or more units, resetting their state counters. Without arguments, it resets all failed units.

When a unit fails (process exits with a non-zero code, terminates abnormally, or times out), it enters the "failed" state with its exit code and status recorded. This state persists until the unit is restarted or explicitly reset with this command.

In addition to clearing the failed state, this command also resets:

- The **start rate limit counter** for all unit types (reset to zero).
- The **restart counter** for service units (reset to zero).

This is particularly useful when a unit has hit its start rate limit and systemd refuses to restart it. Running **reset-failed** resets the counter and allows the unit to be started again immediately.

# CAVEATS

Does not fix the underlying cause of failure. The unit may fail again when started. Use after investigating and fixing the root cause of the failure.

# HISTORY

The **reset-failed** subcommand provides a way to acknowledge and clear failed unit states, enabling restart attempts and cleaning up the failure list after issues are resolved.

# SEE ALSO

[systemctl-status](/man/systemctl-status)(1), [systemctl-restart](/man/systemctl-restart)(1), [systemctl-start](/man/systemctl-start)(1), [systemctl](/man/systemctl)(1), [journalctl](/man/journalctl)(1)
