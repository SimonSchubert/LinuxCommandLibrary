# TLDR

**Restart** unit if running

```systemctl try-restart [unit]```

Restart **multiple** units if running

```systemctl try-restart [unit1 unit2 ...]```

Restart by **pattern** if running

```systemctl try-restart '[pattern]'```

# SYNOPSIS

**systemctl try-restart** _PATTERN_...

# DESCRIPTION

**systemctl try-restart** restarts one or more units only if they are currently running. If a unit is not active, no action is taken.

This is useful for restarting services after configuration changes without accidentally starting services that were intentionally stopped.

# CAVEATS

Does nothing for inactive units. Unlike `restart`, this won't start a stopped service. For units not currently running, the command succeeds without action.

# ALIASES

This command is also known as `condrestart`.

# HISTORY

The **try-restart** subcommand provides safe restart operations that respect the current service state, avoiding unintended service starts.

# SEE ALSO

[systemctl-restart](/man/systemctl-restart)(1), [systemctl-try-reload-or-restart](/man/systemctl-try-reload-or-restart)(1), [systemctl](/man/systemctl)(1)
