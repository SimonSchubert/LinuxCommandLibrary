# TAGLINE

Check unit boot enablement state

# TLDR

Check **enablement** state

```systemctl is-enabled [unit]```

Check **multiple** units

```systemctl is-enabled [unit1 unit2 ...]```

**Quiet** mode (exit code only)

```systemctl is-enabled [unit] -q```

Show installation **targets**

```systemctl is-enabled [unit] -l```

# SYNOPSIS

**systemctl is-enabled** [_OPTIONS_] _UNIT_...

# PARAMETERS

**-q, --quiet**
> Suppress output, return only exit code

**-l, --full**
> Do not truncate output; also show installation targets in the output

**--system**
> Check system units (default)

**--user**
> Check user units

# DESCRIPTION

**systemctl is-enabled** checks whether unit files are enabled to start at boot. It returns the enablement state: enabled, disabled, static, masked, generated, transient, indirect, or alias.

The exit code is 0 if at least one of the units is enabled, non-zero otherwise. The states enabled, enabled-runtime, alias, static, indirect, generated and transient return 0; disabled, linked and masked return a value above 0; not-found returns 4.

# ENABLEMENT STATES

**enabled** - Will start at boot

**enabled-runtime** - Enabled transiently via /run/systemd/system/

**disabled** - Won't start at boot

**static** - No install section, started as dependency only

**masked** - Completely blocked from starting

**masked-runtime** - Masked transiently via /run/systemd/system/

**linked** - Made available through a symlink to a unit file (**linked-runtime** when transient)

**indirect** - Enabled through another unit

**generated** - Generated dynamically by a generator tool

**alias** - Name is an alias for another unit

**transient** - Created dynamically with the runtime API

**not-found** - The unit file does not exist

# CAVEATS

"Enabled" means configured to start, not currently running. Use `is-active` to check runtime state. Static units have no [Install] section and can only be started as dependencies.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-is-active](/man/systemctl-is-active)(1), [systemctl-enable](/man/systemctl-enable)(1), [systemctl-disable](/man/systemctl-disable)(1), [systemctl-status](/man/systemctl-status)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
