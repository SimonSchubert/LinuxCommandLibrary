# TAGLINE

basic packet capture tool using Impacket's raw socket capabilities

# TLDR

**Capture network packets** on an interface

```sudo impacket-sniff [eth0]```

**Sniff with a filter expression**

```sudo impacket-sniff -filter '[tcp port 80]' [eth0]```

# SYNOPSIS

**impacket-sniff** [_-h_] [_-filter FILTER_] _interface_

# PARAMETERS

**-filter** _FILTER_
> BPF filter expression to limit captured packets

# DESCRIPTION

**impacket-sniff** is a basic packet capture tool using Impacket's raw socket capabilities. It captures network traffic on the specified interface and displays packet information.

The tool provides a simple way to observe network traffic using Impacket's protocol parsing, which can be useful for debugging or understanding network communications during security assessments.

# CAVEATS

Requires root/administrator privileges for raw socket access. For production packet capture needs, tools like **tcpdump** or **Wireshark** offer more features. The interface must be in a state that allows promiscuous mode.

# HISTORY

Part of the **Impacket** library by SecureAuth. Included as a demonstration of Impacket's packet capture and parsing capabilities using Python.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [impacket-sniffer](/man/impacket-sniffer)(1), [tshark](/man/tshark)(1)
