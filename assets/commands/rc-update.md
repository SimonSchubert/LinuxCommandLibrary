# TLDR

**List** enabled services

```rc-update```

List **all** services

```rc-update -v```

**Add** service to runlevel

```sudo rc-update add [service] [runlevel]```

**Delete** service from runlevel

```sudo rc-update del [service] [runlevel]```

Delete from **all** runlevels

```sudo rc-update -a del [service]```

# SYNOPSIS

**rc-update** [**-v**] [**add**|**del**] [**-a**] _service_ [_runlevel_]

# COMMANDS

**add**
> Add service to runlevel

**del, delete**
> Remove service from runlevel

**show**
> Show services in runlevels

# PARAMETERS

**-v, --verbose**
> Show all services including disabled

**-a, --all**
> Apply to all runlevels

**service**
> Service name

**runlevel**
> Target runlevel (default, boot, etc.)

# DESCRIPTION

**rc-update** manages which services start at which runlevels in OpenRC. Runlevels are named groups of services that start together, such as "default" for normal boot or "boot" for early boot services.

The tool creates and removes symlinks that control service startup, similar to how chkconfig works on SysV systems.

# CAVEATS

OpenRC-specific. Runlevel names vary by distribution. Common runlevels: boot, default, shutdown. Changes take effect on next boot or runlevel change.

# HISTORY

**rc-update** is part of **OpenRC**, the dependency-based init system primarily used on Gentoo and Alpine Linux.

# SEE ALSO

[rc-service](/man/rc-service)(8), [rc-status](/man/rc-status)(8), [openrc](/man/openrc)(8)
