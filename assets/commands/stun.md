# TLDR

**Test NAT type**

```stun [stun.example.com]```

**Use specific port**

```stun -p [3478] [stun.example.com]```

**Verbose output**

```stun -v [stun.example.com]```

**Local port binding**

```stun -L [54321] [stun.example.com]```

# SYNOPSIS

**stun** [_-p port_] [_-L localport_] [_-v_] _server_

# PARAMETERS

**-p** _PORT_
> Server port.

**-L** _PORT_
> Local port.

**-v**
> Verbose mode.

**-t**
> TCP mode.

**-h**
> Show help.

# DESCRIPTION

**stun** tests NAT traversal. It queries STUN servers.

NAT type detection. Full cone, symmetric, etc.

External IP discovery. Mapped address.

Port mapping. External port.

VoIP troubleshooting. SIP connectivity.

# CAVEATS

STUN server required. Network dependent. UDP by default.

# HISTORY

**stun** is a STUN (Session Traversal Utilities for NAT) client for testing NAT behavior and discovering external addresses.

# SEE ALSO

[pystun3](/man/pystun3)(1), [nmap](/man/nmap)(1), [netcat](/man/netcat)(1)
