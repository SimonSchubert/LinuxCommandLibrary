# TAGLINE

Control client for the BIRD routing daemon

# TLDR

**Show** protocols

```birdc show protocols```

**Show** routes

```birdc show route```

**Show** protocol details

```birdc show protocols all [bgp1]```

**Reload** configuration

```birdc configure```

**Disable** protocol

```birdc disable [bgp1]```

# SYNOPSIS

**birdc** [_options_] [_command_]

# DESCRIPTION

**birdc** is the client for the BIRD routing daemon. It connects to the BIRD daemon via a control socket and allows querying routing information, managing protocols, and reconfiguring the daemon.

The tool is the primary interface for monitoring and controlling BIRD.

# PARAMETERS

**-s** _socket_
> Control socket path

**-r**
> Restricted mode

# COMMON COMMANDS

**show protocols** [**all**] [_name_]
> Display routing protocols status

**show route** [**all**]
> Display routing table

**show interfaces**
> Show network interfaces

**show status**
> Show daemon status

**configure** [_file_]
> Reload configuration

**enable** _protocol_
> Enable protocol

**disable** _protocol_
> Disable protocol

**restart** _protocol_
> Restart protocol

**down**
> Shut down BIRD daemon

# WORKFLOW

```bash
# Show all protocols
birdc show protocols

# Detailed protocol info
birdc show protocols all bgp1

# Show routing table
birdc show route

# Show specific route
birdc show route for 192.0.2.0/24

# Reload config
birdc configure

# Restart BGP session
birdc restart bgp1
```

# INTERACTIVE MODE

```bash
# Start interactive session
birdc

bird> show protocols
bird> show route all
bird> exit
```

# CONFIGURATION

**/etc/bird/bird.conf**
> Main configuration file for the BIRD routing daemon that birdc controls.

# CAVEATS

Requires BIRD daemon running. Socket permissions may restrict access. Some commands need privileges. Configuration errors can disrupt routing. Changes are immediate (no confirmation).

# HISTORY

**birdc** has been part of the BIRD suite since its creation in **1998** as the control interface for the routing daemon.

# SEE ALSO

[bird](/man/bird)(8), [bgpctl](/man/bgpctl)(8), [vtysh](/man/vtysh)(1)
