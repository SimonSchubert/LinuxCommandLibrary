# TAGLINE

stops a running Linux container

# TLDR

**Stop** container

```sudo lxc-stop [container_name]```

Display **help**

```lxc-stop --help```

# SYNOPSIS

**lxc-stop** **-n** _name_ [_options_]

# DESCRIPTION

**lxc-stop** stops a running Linux container. It sends SIGPWR and SIGKILL signals to gracefully shut down the container's init process.

# PARAMETERS

**-n, --name NAME**
> Container name

**-k, --kill**
> Kill container immediately (SIGKILL)

**-W, --nowait**
> Don't wait for shutdown

**-t, --timeout SECONDS**
> Shutdown timeout before kill

**-r, --reboot**
> Reboot instead of stop

**-?, --help**
> Display help information

# CAVEATS

Requires root privileges. Graceful shutdown may take time. Use --kill for immediate termination.

# SEE ALSO

[lxc-start](/man/lxc-start)(1), [lxc-destroy](/man/lxc-destroy)(1), [lxc-info](/man/lxc-info)(1)
