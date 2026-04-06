# TAGLINE

Simple packet sniffer using raw sockets from the Impacket library

# TLDR

**Sniff default protocols (ICMP, TCP, UDP)**

```sudo impacket-sniffer```

**Sniff specific protocols**

```sudo impacket-sniffer [icmp] [tcp]```

**Sniff only UDP traffic**

```sudo impacket-sniffer [udp]```

# SYNOPSIS

**impacket-sniffer** [_protocol_ ...]

# PARAMETERS

_protocol_
> One or more protocol names to sniff (e.g., icmp, tcp, udp). Any name recognized by **socket.getprotobyname()** is valid. When no protocols are specified, defaults to icmp, tcp, and udp.

# DESCRIPTION

**impacket-sniffer** is a simple packet sniffer that uses raw sockets to listen for packets matching specified protocols. It opens a raw socket for each protocol, uses **select()** to monitor incoming packets, and decodes them using Impacket's **ImpactDecoder.IPDecoder** for display.

Unlike **tcpdump**, this tool does not accept an interface argument or BPF filter expressions. It listens on all available interfaces via raw sockets and filters only by protocol type.

# CAVEATS

Requires root/administrator privileges for raw socket access. Does not support interface selection or BPF filters. For comprehensive packet analysis, dedicated tools like **Wireshark** or **tcpdump** are more appropriate.

# HISTORY

Part of the **Impacket** library, originally by SecureAuth (now maintained by Fortra). Demonstrates Impacket's capabilities for network traffic capture and protocol decoding in Python.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [impacket-sniff](/man/impacket-sniff)(1), [tshark](/man/tshark)(1), [ngrep](/man/ngrep)(1)
