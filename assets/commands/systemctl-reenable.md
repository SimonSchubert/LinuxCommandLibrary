# TAGLINE

Disable then re-enable a unit

# TLDR

**Re-enable** unit

```systemctl reenable [unit]```

Re-enable **multiple** units

```systemctl reenable [unit1 unit2 ...]```

Re-enable and **restart** if running

```systemctl reenable [unit] --now```

# SYNOPSIS

**systemctl reenable** [_OPTIONS_] _UNIT_...

# PARAMETERS

**--now**
> Also try-restart the unit afterwards, restarting it only if it is running

**--user**
> Operate on user units

# DESCRIPTION

**systemctl reenable** is equivalent to running `disable` followed by `enable`. It removes all existing symlinks for the unit and recreates them according to the current [Install] section in the unit file.

This is useful when a unit's [Install] section has changed (e.g., the targets it should be enabled for), as `enable` alone won't remove outdated symlinks. The manager configuration is reloaded automatically.

# CAVEATS

Unlike `enable`, this always recreates symlinks even if the unit is already enabled. Use when changing which targets a service belongs to. Takes unit names only, not paths. Without `--now`, a running unit is not restarted.

# HISTORY

The **reenable** subcommand provides a single command for updating enablement configuration when unit install targets change, avoiding the manual disable/enable sequence.

# SEE ALSO

[systemctl-enable](/man/systemctl-enable)(1), [systemctl-disable](/man/systemctl-disable)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
