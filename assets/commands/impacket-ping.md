# TAGLINE

simple ICMP ping implementation using raw sockets via the Impacket library

# TLDR

**Send ICMP echo requests** to a target from a specific source IP

```impacket-ping [192.168.1.50] [192.168.1.100]```

# SYNOPSIS

**impacket-ping** _source\_ip_ _destination\_ip_

# PARAMETERS

**source_ip**
> Source IP address to use for the outgoing ICMP echo request packets.

**destination_ip**
> Destination IP address to ping.

# DESCRIPTION

**impacket-ping** is a simple ICMP ping implementation using raw sockets via the Impacket library. It sends ICMP echo request packets to the specified destination and reports echo-reply responses. Both source and destination IP addresses are required positional arguments.

The script sends echo requests in a loop with a one-second interval and reports the sequence number of each reply. Unlike the standard ping utility, this implementation uses Impacket's raw socket capabilities, which can be useful in environments where the standard ping may be restricted or when integration with other Impacket tools is desired.

Note that a reply is not a definitive test of host availability, as the remote host may be up but configured to refuse ICMP probes.

# CAVEATS

Requires root/administrator privileges to create raw sockets. May be blocked by firewalls that filter ICMP traffic. Both source and destination IPs must be specified (there is no automatic source address detection). For most use cases, the standard **ping** command is more feature-rich.

# HISTORY

Part of the **Impacket** library, originally developed by SecureAuth (now maintained by Fortra). Included as a basic example of using Impacket's ImpactPacket and ImpactDecoder classes for raw socket operations. Authors: Gerardo Richarte and Javier Kohen.

# SEE ALSO

[ping](/man/ping)(1), [impacket-ping6](/man/impacket-ping6)(1), [nmap](/man/nmap)(1)
