# TAGLINE

manages networks for LXD containers

# TLDR

List **all networks**

```lxc network list```

Show network **configuration**

```lxc network show [network_name]```

**Attach** container to network

```lxc network attach [network_name] [container_name]```

**Create** new network

```lxc network create [network_name]```

Set **bridge interface**

```lxc network set [network_name] bridge.external_interfaces eth0```

**Disable NAT**

```lxc network set [network_name] ipv4.nat false```

# SYNOPSIS

**lxc network** _command_ [_options_]

# DESCRIPTION

**lxc network** manages networks for LXD containers. It can create, configure, and attach networks to containers, supporting bridges, VLANs, and various network configurations.

# SUBCOMMANDS

**list**
> List available networks

**show NAME**
> Show network configuration

**create NAME**
> Create new managed network

**delete NAME**
> Delete network

**attach NAME CONTAINER**
> Attach container to network

**detach NAME CONTAINER**
> Detach container from network

**set NAME KEY VALUE**
> Set network configuration

# SEE ALSO

[lxc](/man/lxc)(1), [lxc-start](/man/lxc-start)(1)
