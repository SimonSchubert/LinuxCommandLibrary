# TAGLINE

Check if units are running

# TLDR

Check if unit is **active**

```systemctl is-active [unit]```

Check **multiple** units

```systemctl is-active [unit1 unit2 ...]```

**Quiet** mode (exit code only)

```systemctl is-active [unit] -q```

Check **user** unit

```systemctl is-active [unit] --user```

# SYNOPSIS

**systemctl is-active** [_OPTIONS_] _PATTERN_...

# PARAMETERS

**-q, --quiet**
> Suppress output, return only exit code

**--user**
> Check user units

**--system**
> Check system units (default)

# DESCRIPTION

**systemctl is-active** checks whether one or more units are currently active (running). It prints the active state and returns exit code 0 if at least one unit is active.

Possible states include: active, inactive, activating, deactivating, failed. For multiple units, each state is printed on a separate line.

# EXIT STATUS

Returns **0** if at least one unit is active, **non-zero** otherwise. This makes it useful in shell scripts for conditional logic based on service state.

# CAVEATS

Only checks current runtime state, not enablement. A unit can be enabled but not active, or active but not enabled. Use `is-enabled` to check the boot configuration.

# HISTORY

The **is-active** subcommand provides a scriptable way to query service state, replacing parsing of `systemctl status` output.

# SEE ALSO

[systemctl-is-enabled](/man/systemctl-is-enabled)(1), [systemctl-status](/man/systemctl-status)(1), [systemctl](/man/systemctl)(1)
