# TLDR

**Send ICMP echo requests** to a target

```impacket-ping [192.168.1.100]```

**Ping with a specific source IP**

```impacket-ping -src [192.168.1.50] [192.168.1.100]```

# SYNOPSIS

**impacket-ping** [_-h_] [_-src IP_] _target_

# PARAMETERS

**-src** _IP_
> Source IP address to use for the ping packets

# DESCRIPTION

**impacket-ping** is a simple ICMP ping implementation using raw sockets via the Impacket library. It sends ICMP echo request packets to the specified target and reports responses.

Unlike the standard ping utility, this implementation uses Impacket's raw socket capabilities, which can be useful in environments where the standard ping may be restricted or when integration with other Impacket tools is desired.

# CAVEATS

Requires root/administrator privileges to create raw sockets. May be blocked by firewalls that filter ICMP traffic. For most use cases, the standard **ping** command is more feature-rich.

# HISTORY

Part of the **Impacket** library by SecureAuth. Included as a basic example of using Impacket's network protocol implementations for raw socket operations.

# SEE ALSO

[ping](/man/ping)(1), [impacket-ping6](/man/impacket-ping6)(1), [nmap](/man/nmap)(1)
