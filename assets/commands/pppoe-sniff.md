# TAGLINE

Capture PPPoE packets for debugging

# TLDR

**Sniff PPPoE traffic**

```pppoe-sniff -I [eth0]```

**Verbose output**

```pppoe-sniff -I [eth0] -V```

# SYNOPSIS

**pppoe-sniff** [_options_]

# PARAMETERS

**-I** _INTERFACE_
> Network interface.

**-V**
> Verbose output.

# DESCRIPTION

**pppoe-sniff** captures and displays PPPoE discovery and session packets on a network interface for diagnostic purposes. It shows PADI, PADO, PADR, PADS, and PADT packets exchanged between PPPoE clients and access concentrators.

This tool is useful for troubleshooting PPPoE connection failures by verifying that discovery packets are being sent and responses received. The verbose mode provides additional detail about packet contents.

# CAVEATS

Requires root privileges. Debugging tool only.

# HISTORY

pppoe-sniff provides **PPPoE traffic analysis** for troubleshooting.

# SEE ALSO

[pppoe](/man/pppoe)(8), [pppoe-discovery](/man/pppoe-discovery)(8), [tcpdump](/man/tcpdump)(1)

