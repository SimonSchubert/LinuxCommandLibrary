# TLDR

Check **enablement** state

```systemctl is-enabled [unit]```

Check **multiple** units

```systemctl is-enabled [unit1 unit2 ...]```

**Quiet** mode (exit code only)

```systemctl is-enabled [unit] -q```

Show **targets** and symlinks

```systemctl is-enabled [unit] -l```

# SYNOPSIS

**systemctl is-enabled** [_OPTIONS_] _UNIT_...

# PARAMETERS

**-q, --quiet**
> Suppress output, return only exit code

**-l, --full**
> Show installation targets and symlink paths

**--user**
> Check user units

# DESCRIPTION

**systemctl is-enabled** checks whether unit files are enabled to start at boot. It returns the enablement state: enabled, disabled, static, masked, generated, transient, indirect, or alias.

Exit code 0 indicates the unit is enabled or will start at boot via other means.

# ENABLEMENT STATES

**enabled** - Will start at boot

**disabled** - Won't start at boot

**static** - No install section, started as dependency only

**masked** - Completely blocked from starting

**indirect** - Enabled through another unit

# CAVEATS

"Enabled" means configured to start, not currently running. Use `is-active` to check runtime state. Static units have no [Install] section and can only be started as dependencies.

# HISTORY

The **is-enabled** subcommand provides a scriptable way to check boot configuration without parsing configuration files or symlinks directly.

# SEE ALSO

[systemctl-is-active](/man/systemctl-is-active)(1), [systemctl-enable](/man/systemctl-enable)(1), [systemctl-disable](/man/systemctl-disable)(1)
