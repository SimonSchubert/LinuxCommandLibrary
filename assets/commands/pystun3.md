# TAGLINE

Discover NAT type using STUN protocol

# TLDR

**Check NAT type**

```pystun3```

**Use specific STUN server**

```pystun3 -H [stun.example.com]```

**Specify source port**

```pystun3 -p [54320]```

**Use specific interface**

```pystun3 -i [192.168.1.100]```

**Enable debug logging**

```pystun3 -d```

**Specify STUN server port**

```pystun3 -H [stun.example.com] -P [3478]```

# SYNOPSIS

**pystun3** [_-H server_] [_-p port_] [_-i ip_] [_options_]

# PARAMETERS

**-H** _STUN_HOST_, **--host** _STUN_HOST_
> STUN server hostname.

**-P** _STUN_PORT_, **--host-port** _STUN_PORT_
> STUN server port (default: 3478).

**-p** _SOURCE_PORT_, **--port** _SOURCE_PORT_
> Source port to listen on (default: 54320).

**-i** _SOURCE_IP_, **--interface** _SOURCE_IP_
> Network interface for client (default: 0.0.0.0).

**-d**, **--debug**
> Enable debug logging.

**--version**
> Show program version.

# DESCRIPTION

**pystun3** is a STUN (Session Traversal Utilities for NAT) client that discovers the type of NAT between a host and the internet. It communicates with a STUN server to determine the NAT classification (full cone, restricted cone, port restricted, or symmetric) and reports the external IP address and mapped port.

Understanding NAT type is essential for configuring VoIP, video conferencing, and peer-to-peer applications that require direct connections between hosts. The tool can target specific STUN servers and bind to particular network interfaces.

# CAVEATS

Requires network access. STUN server must be reachable. NAT types vary.

# HISTORY

**pystun3** is a Python 3 port of pystun, implementing STUN (Session Traversal Utilities for NAT) client functionality.

# SEE ALSO

[stun](/man/stun)(1), [nmap](/man/nmap)(1), [netcat](/man/netcat)(1)
