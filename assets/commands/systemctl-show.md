# TLDR

Show **manager** properties

```systemctl show```

Show **user** manager properties

```systemctl show --user```

Show **unit** properties

```systemctl show [unit]```

Show **specific** properties

```systemctl show [unit] -p [Wants,Conflicts,...]```

Include **empty** properties

```systemctl show -a```

# SYNOPSIS

**systemctl show** [_OPTIONS_] [_PATTERN_...|_JOB_...]

# PARAMETERS

**--user**
> Show user service manager properties

**-a, --all**
> Include empty properties

**-p, --property=** _NAME_
> Show only specified properties

**--no-pager**
> Disable pager

# DESCRIPTION

**systemctl show** displays properties of units, jobs, or the service manager itself in a machine-readable format. Without arguments, it shows properties of the service manager.

The output is suitable for parsing by scripts. Use `systemctl status` for human-readable output.

# COMMON PROPERTIES

**ActiveState** - Current state (active, inactive, failed)

**LoadState** - Load state (loaded, not-found, error)

**MainPID** - Main process ID

**ExecMainStartTimestamp** - Start time

# CAVEATS

Output format is key=value pairs. Some properties may be empty. For human-readable format, use `systemctl status` instead.

# HISTORY

The **show** subcommand provides machine-parseable property access, enabling scripted queries and monitoring integration.

# SEE ALSO

[systemctl-status](/man/systemctl-status)(1), [systemctl-set-property](/man/systemctl-set-property)(1), [systemctl](/man/systemctl)(1)
