# TAGLINE

executes System V style init script actions

# TLDR

**Start a service**

```sudo invoke-rc.d [service] start```

**Stop a service**

```sudo invoke-rc.d [service] stop```

**Restart a service**

```sudo invoke-rc.d [service] restart```

**Check service status**

```invoke-rc.d [service] status```

**Reload service configuration**

```sudo invoke-rc.d [service] reload```

**Query whether an action would be allowed** by the policy layer

```invoke-rc.d --query [service] start```

# SYNOPSIS

**invoke-rc.d** [_--quiet_] [_--force_] [_--try-anyway_] [_--disclose-deny_] [_--query_] [_--no-fallback_] _name_ _action_ [_init script parameters..._]

# PARAMETERS

_NAME_
> Name of the init script in /etc/init.d/.

_ACTION_
> Action to perform: start, stop, restart, reload, force-reload, force-stop, try-restart, or status.

**--quiet**
> Suppress warnings and informational messages.

**--force**
> Try to run the init script regardless of policy and init script subsystem errors. Use in maintainer scripts is discouraged.

**--try-anyway**
> Try to run the init script if a non-fatal error is detected.

**--disclose-deny**
> Return status code 101 instead of 0 if the action is denied by the policy layer.

**--query**
> Query what action would be taken without executing it. Returns status codes 100-106. Implies --disclose-deny and --no-fallback.

**--no-fallback**
> Ignore any fallback action requests by the policy layer.

**--help**
> Display help information.

# DESCRIPTION

**invoke-rc.d** executes System V style init script actions on Debian-based systems. It provides a standard interface that respects runlevel constraints and local policies set by the system administrator via policy-rc.d.

The tool checks /usr/sbin/policy-rc.d before executing actions. It is the recommended way to control services in package maintainer scripts, as it properly handles policy restrictions that may be in place (such as in chroot environments or containers).

# CAVEATS

Debian/Ubuntu specific. On systemd systems, invoke-rc.d redirects to systemctl. The policy-rc.d mechanism allows administrators to block service actions, which is commonly used in Docker containers to prevent services from starting during package installation.

# HISTORY

invoke-rc.d was created for **Debian** to provide policy-compliant init script invocation, especially in package maintainer scripts.

# SEE ALSO

[service](/man/service)(8), [systemctl](/man/systemctl)(1), [update-rc.d](/man/update-rc.d)(8)
