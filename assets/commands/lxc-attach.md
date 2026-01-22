# TLDR

**Attach** to container

```sudo lxc-attach [container_name]```

Display **help**

```lxc-attach --help```

# SYNOPSIS

**lxc-attach** [_options_] **-n** _container_

# DESCRIPTION

**lxc-attach** starts a process inside a running LXC container, effectively attaching a shell or running a command within the container's namespace.

# PARAMETERS

**-n, --name NAME**
> Container name

**-e, --elevated-privileges**
> Don't drop capabilities

**-a, --arch ARCH**
> Set architecture

**-s, --namespaces PID|MNT|...**
> Attach to specific namespaces only

**-- COMMAND**
> Command to run inside container

**-?, --help**
> Display help information

# CAVEATS

Requires root privileges. Container must be running. Part of LXC (not LXD).

# SEE ALSO

[lxc](/man/lxc)(1), [lxc-start](/man/lxc-start)(1), [lxc-stop](/man/lxc-stop)(1)
