# TAGLINE

Clear failed unit states

# TLDR

Reset **all** failed units

```systemctl reset-failed```

Reset **specific** unit

```systemctl reset-failed [unit]```

Reset **multiple** units

```systemctl reset-failed [unit1 unit2 ...]```

# SYNOPSIS

**systemctl reset-failed** [_PATTERN_...]

# DESCRIPTION

**systemctl reset-failed** clears the "failed" state from one or more units, resetting their state counters. Without arguments, it resets all failed units.

Failed units remain in that state until manually reset, appearing in `systemctl list-units` and `systemctl --failed`. This command clears those failure records so the unit can be started fresh.

# CAVEATS

Does not fix the underlying cause of failure. The unit may fail again when started. Use after investigating and fixing the root cause of the failure.

# HISTORY

The **reset-failed** subcommand provides a way to acknowledge and clear failed unit states, enabling restart attempts and cleaning up the failure list after issues are resolved.

# SEE ALSO

[systemctl-status](/man/systemctl-status)(1), [systemctl-restart](/man/systemctl-restart)(1), [systemctl](/man/systemctl)(1)
