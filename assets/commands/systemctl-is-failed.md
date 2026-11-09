# TAGLINE

Check if units have failed

# TLDR

Check for **any failed** units

```systemctl is-failed```

Check if **specific unit** failed

```systemctl is-failed [unit]```

Check **multiple units**

```systemctl is-failed [unit1 unit2 ...]```

**Quiet** mode (exit code only)

```systemctl is-failed -q [unit]```

Check **user** unit

```systemctl is-failed --user [unit]```

# SYNOPSIS

**systemctl is-failed** [_OPTIONS_] [_PATTERN_...]

# DESCRIPTION

**systemctl is-failed** checks if one or more systemd units have failed. It returns exit code 0 if any specified unit is in a failed state, useful for scripting and monitoring. Unless `--quiet` is given, the unit or system state is also printed.

# PARAMETERS

**PATTERN**
> Unit names or patterns to check (checks the whole system if omitted)

**-q, --quiet**
> Suppress output, only return exit code

**--user**
> Check user units instead of system units

# CAVEATS

Exit code 0 means at least one unit is failed; non-zero (typically 1) means no failures or unit not found. Without arguments, checks for any failed units or ordering cycles, matching the "degraded" state of `is-system-running`.

# HISTORY

**systemctl is-failed** is part of **systemd**, providing status checking commands for scripting and automation.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-is-active](/man/systemctl-is-active)(1), [systemctl-status](/man/systemctl-status)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
