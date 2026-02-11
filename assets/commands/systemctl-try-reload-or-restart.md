# TAGLINE

Reload or restart running units only

# TLDR

**Reload or restart** unit (if running)

```systemctl try-reload-or-restart [unit]```

Reload or restart **multiple** units

```systemctl try-reload-or-restart [unit1 unit2 ...]```

Reload or restart by **pattern**

```systemctl try-reload-or-restart '[pattern]'```

# SYNOPSIS

**systemctl try-reload-or-restart** _PATTERN_...

# DESCRIPTION

**systemctl try-reload-or-restart** attempts to reload configuration for running units if they support reloading, otherwise restarts them. Unlike `reload-or-restart`, this command only affects units that are currently active.

If a unit is not running, no action is taken. This is useful for applying configuration changes without starting stopped services.

# CAVEATS

Does nothing for inactive units. Reload only works if the unit has ExecReload defined. If reload isn't supported, the unit is restarted.

# ALIASES

This command has several aliases: `condreload`, `force-reload`, `reload-or-try-restart`.

# HISTORY

The **try-reload-or-restart** subcommand provides the safest way to apply configuration changes to services, avoiding unintended service starts.

# SEE ALSO

[systemctl-reload-or-restart](/man/systemctl-reload-or-restart)(1), [systemctl-reload](/man/systemctl-reload)(1), [systemctl-restart](/man/systemctl-restart)(1)
