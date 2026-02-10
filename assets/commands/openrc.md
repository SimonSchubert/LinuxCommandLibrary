# TAGLINE

service manager for OpenRC-based systems, providing an alternative to systemd

# TLDR

Change to a **specific runlevel**

```sudo openrc [runlevel_name]```

Change to a runlevel, but **don't stop any existing services**

```sudo openrc -n [runlevel_name]```

# SYNOPSIS

**openrc** [_options_] [_runlevel_]

# PARAMETERS

**-n, --no-stop**
> Don't stop any services when changing runlevels

**-o, --override**
> Override the next runlevel to go to when leaving single user

**-s, --service**
> Run the service specified with the rest of the arguments

**-S, --sys**
> Run the service as if in /etc/init.d

# DESCRIPTION

**openrc** is the service manager for OpenRC-based systems, providing an alternative to systemd for managing system services and runlevels. It's the default init system on Gentoo, Alpine Linux, and other distributions.

OpenRC uses the concept of runlevels (similar to SysV init) to group services that should run together. Common runlevels include **default** (normal operation), **boot** (essential services), **single** (single-user mode), and **shutdown**.

Services are managed through scripts in **/etc/init.d/** and configured using **rc-update** to add or remove them from runlevels.

# CAVEATS

Runlevel changes may stop services in the current runlevel that aren't in the target. Use **-n** to preserve running services. OpenRC is not compatible with systemd; distributions use one or the other.

# SEE ALSO

[rc-status](/man/rc-status)(8), [rc-update](/man/rc-update)(8), [rc-service](/man/rc-service)(8)
