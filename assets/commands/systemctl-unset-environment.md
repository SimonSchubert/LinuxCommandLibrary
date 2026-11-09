# TAGLINE

Remove service manager environment variables

# TLDR

**Unset** environment variable

```systemctl unset-environment [VAR]```

Unset **multiple** variables

```systemctl unset-environment [VAR1 VAR2 ...]```

Unset in **user** manager

```systemctl unset-environment [VAR] --user```

Unset only if it has a **specific value**

```systemctl unset-environment [VAR=value]```

# SYNOPSIS

**systemctl unset-environment** _VARIABLE_[=_VALUE_]...

# PARAMETERS

**--user**
> Unset in user service manager environment

**--system**
> Unset in system manager environment (default)

# DESCRIPTION

**systemctl unset-environment** removes environment variables from the systemd service manager's environment. This undoes the effect of `systemctl set-environment`.

Services started after the unset will not receive the removed variables. If a value is given, the variable is only removed when it has that value.

# CAVEATS

Only affects services started after the change. Already running services keep their environment. Changes are temporary and lost on reboot. Cannot unset variables defined in manager configuration files or by generators.

# HISTORY

The **unset-environment** subcommand complements `set-environment`, providing complete runtime control over the service manager's environment.

# SEE ALSO

[systemctl-set-environment](/man/systemctl-set-environment)(1), [systemctl-show-environment](/man/systemctl-show-environment)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
