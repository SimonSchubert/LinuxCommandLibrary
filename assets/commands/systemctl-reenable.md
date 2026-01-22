# TLDR

**Re-enable** unit

```systemctl reenable [unit]```

Re-enable **multiple** units

```systemctl reenable [unit1 unit2 ...]```

Re-enable and **start** immediately

```systemctl reenable [unit] --now```

# SYNOPSIS

**systemctl reenable** [_OPTIONS_] _UNIT_...

# PARAMETERS

**--now**
> Also start the unit after re-enabling

**--user**
> Operate on user units

# DESCRIPTION

**systemctl reenable** is equivalent to running `disable` followed by `enable`. It removes all existing symlinks for the unit and recreates them according to the current [Install] section in the unit file.

This is useful when a unit's [Install] section has changed (e.g., the targets it should be enabled for), as `enable` alone won't update existing symlinks.

# CAVEATS

Unlike `enable`, this always recreates symlinks even if the unit is already enabled. Use when changing which targets a service belongs to.

# HISTORY

The **reenable** subcommand provides a single command for updating enablement configuration when unit install targets change, avoiding the manual disable/enable sequence.

# SEE ALSO

[systemctl-enable](/man/systemctl-enable)(1), [systemctl-disable](/man/systemctl-disable)(1), [systemctl](/man/systemctl)(1)
