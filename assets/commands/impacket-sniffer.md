# TAGLINE

network packet sniffer built on Impacket's protocol parsing libraries

# TLDR

**Capture and analyze network traffic**

```sudo impacket-sniffer [eth0]```

**Sniff packets with BPF filter**

```sudo impacket-sniffer -filter '[host 192.168.1.100]' [eth0]```

# SYNOPSIS

**impacket-sniffer** [_-h_] [_-filter FILTER_] _interface_

# PARAMETERS

**-filter** _FILTER_
> BPF filter expression to limit captured packets

# DESCRIPTION

**impacket-sniffer** is a network packet sniffer built on Impacket's protocol parsing libraries. Similar to impacket-sniff, it captures and displays network traffic but may provide different output formatting or protocol decoding.

This tool leverages Impacket's extensive protocol implementations to parse and display captured packets in a readable format, useful for network analysis during security assessments.

# CAVEATS

Requires root/administrator privileges for raw socket access. For comprehensive packet analysis, dedicated tools like **Wireshark** or **tcpdump** are more appropriate. May not capture all packet types depending on interface configuration.

# HISTORY

Part of the **Impacket** library by SecureAuth. Demonstrates Impacket's capabilities for network traffic capture and protocol analysis in Python.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [impacket-sniff](/man/impacket-sniff)(1), [ngrep](/man/ngrep)(1)
