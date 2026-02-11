# TAGLINE

Lightweight namespace container

# TLDR

**Run** a command in a container

```systemd-nspawn -D [path/to/container_root]```

**Run** a full Linux OS in a container (boot)

```systemd-nspawn -b -D [path/to/container_root]```

**Run** the command as PID 2 using a stub init process

```systemd-nspawn -D [path/to/container_root] -a```

**Specify** the machine name and hostname

```systemd-nspawn -M [container_name] --hostname [hostname] -D [path/to/container_root]```

# SYNOPSIS

**systemd-nspawn** [_options_] [_command_] [_arguments_]

# PARAMETERS

**-D, --directory _path_**
> Root directory of the container

**-b, --boot**
> Boot the container's init system

**-M, --machine _name_**
> Set the machine name

**-a, --as-pid2**
> Run command as PID 2 with stub init

**--hostname _name_**
> Set the container hostname

**-u, --user _user_**
> Run as specified user

**--bind _src:dest_**
> Bind mount host path into container

**-n, --network-veth**
> Create a virtual Ethernet link

**--private-network**
> Disconnect from host network

# DESCRIPTION

**systemd-nspawn** spawns a command or full operating system in a lightweight container. It uses Linux namespaces and cgroups for isolation but is simpler than full container solutions like Docker.

The tool is useful for testing, building packages, and running isolated services. With **--boot**, it can run a complete init system, making it suitable for system containers.

# CAVEATS

Requires root privileges. The container filesystem must contain a complete OS or at least the required binaries. Network isolation requires additional configuration. Part of the systemd suite.

# SEE ALSO

[machinectl](/man/machinectl)(1), [systemd-detect-virt](/man/systemd-detect-virt)(1), [systemd-dissect](/man/systemd-dissect)(1), [chroot](/man/chroot)(1)
