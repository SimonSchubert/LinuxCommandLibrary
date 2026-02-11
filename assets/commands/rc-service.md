# TAGLINE

Manage OpenRC init system services

# TLDR

Show service **status**

```rc-service [service] status```

**Start** a service

```sudo rc-service [service] start```

**Stop** a service

```sudo rc-service [service] stop```

**Restart** a service

```sudo rc-service [service] restart```

**Dry-run** a command

```sudo rc-service -Z [service] [command]```

**Resolve** service location

```sudo rc-service -r [service]```

# SYNOPSIS

**rc-service** [**-Z**|**--dry-run**] [**-r**|**--resolve**] _service_ _command_

# PARAMETERS

**-Z, --dry-run**
> Simulate command without executing

**-r, --resolve**
> Show service script location

**-l, --list**
> List all services

**-e, --exists**
> Check if service exists

**service**
> Service name

**command**
> start, stop, restart, status, or custom

# DESCRIPTION

**rc-service** controls OpenRC services. It locates service init scripts and runs them with the specified command. OpenRC is the init system used by Gentoo, Alpine, and some other distributions.

The tool provides a consistent interface for service management regardless of where service scripts are located in the system.

# CAVEATS

OpenRC-specific, not for systemd systems. Requires root for service control. Service scripts in /etc/init.d/. Custom commands depend on service implementation.

# HISTORY

**rc-service** is part of **OpenRC**, an init system created for Gentoo Linux. It provides dependency-based service management as an alternative to systemd.

# SEE ALSO

[rc-update](/man/rc-update)(8), [rc-status](/man/rc-status)(8), [openrc](/man/openrc)(8)
