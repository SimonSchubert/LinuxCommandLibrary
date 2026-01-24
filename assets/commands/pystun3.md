# TLDR

**Check NAT type**

```pystun3```

**Use specific STUN server**

```pystun3 -H [stun.example.com]```

**Specify source port**

```pystun3 -p [54320]```

**Use specific interface**

```pystun3 -i [192.168.1.100]```

**Verbose output**

```pystun3 -v```

**JSON output**

```pystun3 --json```

# SYNOPSIS

**pystun3** [_-H server_] [_-p port_] [_-i ip_] [_options_]

# PARAMETERS

**-H** _HOST_
> STUN server hostname.

**-p** _PORT_
> Source port.

**-i** _IP_
> Source IP address.

**-v**
> Verbose output.

**--json**
> JSON output format.

**-P** _PORT_
> STUN server port.

# DESCRIPTION

**pystun3** tests NAT type. It uses STUN protocol.

Determines NAT characteristics. Full cone, symmetric, etc.

Shows external IP address. Mapped address from STUN.

Useful for VoIP/P2P setup. Identifies connectivity issues.

Python 3 compatible. Modern STUN client.

# CAVEATS

Requires network access. STUN server must be reachable. NAT types vary.

# HISTORY

**pystun3** is a Python 3 port of pystun, implementing STUN (Session Traversal Utilities for NAT) client functionality.

# SEE ALSO

[stun](/man/stun)(1), [nmap](/man/nmap)(1), [netcat](/man/netcat)(1)
