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

**pystun3** [_-H server_] [_-P port_] [_-i ip_] [_-p port_] [_-d_]

# PARAMETERS

**-H** _STUN_HOST_, **--stun-host** _STUN_HOST_
> STUN server hostname. If omitted, a built-in list of public servers is tried in turn until one responds.

**-P** _STUN_PORT_, **--stun-port** _STUN_PORT_
> STUN server port (default: 3478).

**-p** _SOURCE_PORT_, **--source-port** _SOURCE_PORT_
> Local port to listen on (default: 54320).

**-i** _SOURCE_IP_, **--source-ip** _SOURCE_IP_
> Local address to bind the client to (default: 0.0.0.0).

**-d**, **--debug**
> Enable debug logging.

**-h**, **--help**
> Show help and exit.

**--version**
> Show program version.

# DESCRIPTION

**pystun3** is a STUN (Session Traversal Utilities for NAT) client that discovers the type of NAT between a host and the internet. It prints three lines: **NAT Type**, **External IP** and **External Port**. Possible NAT types are Blocked, Open Internet, Full Cone, Symmetric UDP Firewall, Restric NAT, Restric Port NAT and Symmetric NAT (the misspelling is the program's literal output).

Understanding NAT type is essential for configuring VoIP, video conferencing, and peer-to-peer applications that require direct connections between hosts.

# CAVEATS

Implements the classic **RFC 3489** tests only, which need a server offering a second IP and port. Servers that only implement the newer STUN specification can give misleading results or **Blocked**. Several servers in the built-in list are old, so pass **-H** if every attempt fails. The upstream README still shows older long option names (**--host**, **--host-port**, **--interface**, **--port**); release 2.0.0 uses the names above.

# HISTORY

A chain of forks: the original **pystun** by gaohawk was taken over by jtriley, patched for Python 3 by zoumi, and finally forked by TalkIQ as **pystun3**. Version 2.0.0 was published in 2024.

# SEE ALSO

[stun](/man/stun)(1), [nmap](/man/nmap)(1), [netcat](/man/netcat)(1)

# RESOURCES

```[Source code](https://github.com/talkiq/pystun3)```

```[Homepage](https://pypi.org/project/pystun3/)```

<!-- verified: 2026-11-09 -->
