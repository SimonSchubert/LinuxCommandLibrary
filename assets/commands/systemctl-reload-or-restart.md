# TLDR

**Reload or restart** unit

```systemctl reload-or-restart [unit]```

Reload or restart with **pattern**

```systemctl reload-or-restart [pattern]```

**Async** (no wait)

```systemctl reload-or-restart [unit] --no-block```

For **user** units

```systemctl reload-or-restart [unit] --user```

# SYNOPSIS

**systemctl reload-or-restart** [_OPTIONS_] _PATTERN_...

# PARAMETERS

**--no-block**
> Return immediately without waiting

**--user**
> Operate on user units

# DESCRIPTION

**systemctl reload-or-restart** attempts to reload a unit's configuration if the unit supports reloading, otherwise it restarts the unit. This is useful for applying configuration changes when you don't know if the service supports hot reloading.

If the unit supports `ExecReload=`, configuration is reloaded without interrupting the service. Otherwise, the unit is stopped and started again.

# CAVEATS

Reload only works if the unit has ExecReload defined. Restart causes brief service interruption. For units without reload support, this always restarts.

# HISTORY

The **reload-or-restart** subcommand provides a safe way to apply configuration changes without needing to know whether a service supports hot reloading.

# SEE ALSO

[systemctl-reload](/man/systemctl-reload)(1), [systemctl-restart](/man/systemctl-restart)(1), [systemctl-try-reload-or-restart](/man/systemctl-try-reload-or-restart)(1)
