# TAGLINE

Test NAT traversal and external addressing

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

**stun** is a STUN (Session Traversal Utilities for NAT) client that queries STUN servers to determine NAT type and discover external addressing information. It sends binding requests to a STUN server and analyzes the responses to classify the NAT behavior of the network the client is behind.

The tool can identify various NAT types including full cone, restricted cone, port-restricted cone, and symmetric NAT. It also reports the external IP address and port mapping as seen by the STUN server, which is essential information for peer-to-peer connectivity.

This is useful for troubleshooting VoIP and SIP connectivity issues, diagnosing WebRTC connection failures, and understanding network topology. The NAT type directly affects whether peer-to-peer connections can be established, with symmetric NAT being the most restrictive.

# CAVEATS

STUN server required. Network dependent. UDP by default.

# HISTORY

**stun** is a STUN (Session Traversal Utilities for NAT) client for testing NAT behavior and discovering external addresses.

# SEE ALSO

[pystun3](/man/pystun3)(1), [nmap](/man/nmap)(1), [netcat](/man/netcat)(1)
