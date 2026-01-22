# TLDR

List the **name and status** of all services

```service --status-all```

**Start/Stop/Restart/Reload** a service

```service [service_name] [start|stop|restart|reload]```

Do a **full restart** (runs script twice with stop and start)

```service [service_name] --full-restart```

Show the **current status** of a service

```service [service_name] status```

# SYNOPSIS

**service** _script_ _command_ [_options_]

**service** **--status-all**

# PARAMETERS

**--status-all**
> List status of all services

_script_
> Service name (script in /etc/init.d/)

**start**
> Start the service

**stop**
> Stop the service

**restart**
> Stop and start the service

**reload**
> Reload service configuration

**status**
> Show service status

**--full-restart**
> Perform full stop then start sequence

# DESCRIPTION

**service** is a wrapper for init scripts in /etc/init.d/, providing a consistent interface to manage SysV init services. It automatically handles environment sanitization and path normalization for init script execution.

On systemd systems, service typically redirects commands to systemctl for backward compatibility. It remains useful for managing traditional init scripts and provides a familiar interface for administrators.

# CAVEATS

On systemd systems, **systemctl** is preferred. Not all init scripts implement all commands (reload may not be available). The service command requires root privileges for most operations.

# HISTORY

Introduced in **Debian** and adopted by other distributions as a standard interface for SysV init scripts. With the transition to systemd, service became a compatibility wrapper that translates commands to systemctl where appropriate.

# SEE ALSO

[systemctl](/man/systemctl)(1), [chkconfig](/man/chkconfig)(8), [update-rc.d](/man/update-rc.d)(8)
