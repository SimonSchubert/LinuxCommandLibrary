# TAGLINE

Add and remove services to and from a runlevel

# TLDR

**List enabled services and their runlevels**

```rc-update```

**List all services including disabled ones**

```rc-update -v```

**Show services in a specific runlevel**

```rc-update show [default]```

**Add a service to a runlevel**

```sudo rc-update add [service] [default]```

**Delete a service from a runlevel**

```sudo rc-update del [service] [default]```

**Delete a service from all runlevels**

```sudo rc-update -a del [service]```

# SYNOPSIS

**rc-update** [_options_] [**add**|**del**|**show**] [_service_] [_runlevel_...]

# PARAMETERS

**add**
> Add a service to the specified runlevel, or the current runlevel if none is given.

**del**, **delete**
> Remove a service from the specified runlevel, or the current runlevel if none is given.

**show**
> Show all enabled services and the runlevels they belong to.

**-a**, **--all**
> Apply the operation to all runlevels.

**-s**, **--stack**
> Stack a runlevel instead of a service (advanced usage).

**-u**, **--update**
> Force an update of the dependency tree.

**-v**, **--verbose**
> Show all services, including those that are disabled.

# DESCRIPTION

**rc-update** manages which services start at which runlevels in OpenRC. Runlevels are named groups of services that start together, such as **boot** for early boot services, **default** for normal operation, and **shutdown** for system shutdown.

All services must reside in **/etc/init.d** or **/usr/local/etc/init.d** and conform to the OpenRC runscript standard. The tool creates and removes symbolic links in **/etc/runlevels/** to control which services start at each runlevel.

# CAVEATS

OpenRC-specific; not applicable to systemd-based distributions. Runlevel names vary by distribution. Services added to the **boot** runlevel must exist in **/etc/init.d**. Changes take effect on the next boot or runlevel change.

# HISTORY

**rc-update** is part of **OpenRC**, the dependency-based init system primarily used on Gentoo and Alpine Linux as an alternative to systemd.

# SEE ALSO

[rc-service](/man/rc-service)(8), [rc-status](/man/rc-status)(8), [openrc](/man/openrc)(8)
