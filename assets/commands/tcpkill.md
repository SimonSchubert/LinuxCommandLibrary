# TLDR

**Kill** connections by interface, host, and port

```tcpkill -i [eth1] host [192.95.4.27] and port [2266]```

# SYNOPSIS

**tcpkill** [_OPTIONS_] _EXPRESSION_

# PARAMETERS

**-i** _INTERFACE_
> Network interface to use

**-1** to **-9**
> Aggressiveness level (default: 3)

# DESCRIPTION

**tcpkill** terminates in-progress TCP connections by injecting TCP RST (reset) packets. It monitors traffic matching the specified filter expression and sends forged reset packets to both endpoints.

The filter expression uses libpcap syntax, allowing filtering by host, port, network, or any combination.

# CAVEATS

Requires root privileges. Part of the dsniff package. Only works on unencrypted connections visible on the network. May require multiple attempts for active connections. Use responsibly - unauthorized use may be illegal.

# HISTORY

**tcpkill** is part of the **dsniff** suite created by **Dug Song** for network auditing. It's used for security testing and emergency connection termination.

# SEE ALSO

[tcpdump](/man/tcpdump)(8), [dsniff](/man/dsniff)(8)
