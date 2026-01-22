# TLDR

**Show** a summary of services and their status

```rc-status```

**Include** services in all runlevels in the summary

```rc-status -a```

**List** services that have crashed

```rc-status -c```

**List** manually started services

```rc-status -m```

**List** supervised services

```rc-status -S```

**Display** the current runlevel

```rc-status -r```

**List** all runlevels

```rc-status -l```

# SYNOPSIS

**rc-status** [_options_] [_runlevel_]

# PARAMETERS

**-a, --all**
> Show all services from all runlevels

**-c, --crashed**
> List services that have crashed

**-l, --list**
> List all defined runlevels

**-m, --manual**
> List manually started services

**-r, --runlevel**
> Display the current runlevel

**-s, --servicelist**
> Display service list for specified runlevel

**-S, --supervised**
> List supervised services

**-u, --unused**
> List services not assigned to any runlevel

# DESCRIPTION

**rc-status** displays information about OpenRC runlevels and service states. By default, it shows services in the current runlevel with their status (started, stopped, crashed, etc.).

The command is useful for system administration to quickly check which services are running, identify crashed services, or verify the current runlevel configuration.

# CAVEATS

Only available on systems using OpenRC as the init system (Gentoo, Alpine, Artix, etc.). Service status reflects the state according to OpenRC, which may differ from actual process state if services crash unexpectedly.

# SEE ALSO

[rc-service](/man/rc-service)(8), [rc-update](/man/rc-update)(8), [openrc](/man/openrc)(8)
