# TAGLINE

client component of port knocking

# TLDR

**Knock** on ports with specified protocol

```knock [hostname] [port]:tcp```

Knock using **UDP**

```knock -u [hostname] [port]```

Force **IPv4** or **IPv6**

```knock -4 [hostname] [port]```

Display **verbose** output

```knock -v [hostname] [port]```

# SYNOPSIS

**knock** [_options_] _hostname_ _port_[:_protocol_]...

# PARAMETERS

**-u**, **--udp**
> Use UDP instead of TCP

**-4**
> Force IPv4

**-6**
> Force IPv6

**-v**, **--verbose**
> Display verbose information

**-d**, **--delay** _MS_
> Delay between knocks in milliseconds

# DESCRIPTION

**knock** is the client component of port knocking. Port knocking is a security technique where a firewall opens specific ports only after receiving a predefined sequence of connection attempts ("knocks") on closed ports.

The client sends packets to the specified ports in sequence. When the server (knockd) detects the correct sequence, it executes configured commands, typically to open a firewall port for the client's IP address.

# CAVEATS

Port sequence must be kept secret. Network issues can cause knock sequences to fail. Not a replacement for proper authentication but an additional security layer.

# HISTORY

Port knocking emerged as a security technique in the early **2000s** to hide services from port scanners. The knock/knockd implementation is one of the most widely used port knocking solutions.

# SEE ALSO

[knockd](/man/knockd)(1), [iptables](/man/iptables)(8), [nmap](/man/nmap)(1)
