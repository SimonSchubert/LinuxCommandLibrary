# TAGLINE

Display OpenRC service and runlevel status

# TLDR

Summarize the services in the **current runlevel**

```rc-status```

Cover **every runlevel** at once

```rc-status --all```

Show only the services that have **crashed**

```rc-status --crashed```

Show services started **by hand** rather than by a runlevel

```rc-status --manual```

Show services under **supervision**

```rc-status --supervised```

Show services **not assigned to any runlevel**

```rc-status --unused```

Print just the **name of the current runlevel**

```rc-status --runlevel```

List the **runlevels that exist**

```rc-status --list```

List **every service**, whatever its state

```rc-status --servicelist```

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

# INSTALL

```apt: sudo apt install openrc```

```apk: sudo apk add openrc```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[rc-service](/man/rc-service)(8), [rc-update](/man/rc-update)(8), [openrc](/man/openrc)(8)
