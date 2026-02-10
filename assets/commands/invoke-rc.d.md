# TAGLINE

runs System V init scripts on Debian systems

# TLDR

**Start a service**

```sudo invoke-rc.d [service] start```

**Stop a service**

```sudo invoke-rc.d [service] stop```

**Restart a service**

```sudo invoke-rc.d [service] restart```

**Check service status**

```invoke-rc.d [service] status```

**Reload service config**

```sudo invoke-rc.d [service] reload```

# SYNOPSIS

**invoke-rc.d** [_options_] _name_ _action_

# PARAMETERS

_NAME_
> Init script name.

_ACTION_
> Action (start, stop, restart, reload, status).

**--quiet**
> Suppress output.

**--force**
> Ignore policy layer.

**--try-anyway**
> Try even if blocked.

**--query**
> Query action would be taken.

**--help**
> Display help information.

# DESCRIPTION

**invoke-rc.d** runs System V init scripts on Debian systems. It provides a standard interface respecting runlevel policy.

The tool checks policy-rc.d before executing actions. It's the recommended way to control services in maintainer scripts.

# CAVEATS

Debian/Ubuntu specific. Superseded by systemctl on systemd systems. Checks policy layer.

# HISTORY

invoke-rc.d was created for **Debian** to provide policy-compliant init script invocation, especially in package scripts.

# SEE ALSO

[service](/man/service)(8), [systemctl](/man/systemctl)(1), [update-rc.d](/man/update-rc.d)(8)
