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

**pppoe-sniff** captures PPPoE packets for debugging. Diagnostic tool.

The tool monitors PPPoE traffic. Troubleshooting helper.

pppoe-sniff captures packets.

# CAVEATS

Requires root privileges. Debugging tool only.

# HISTORY

pppoe-sniff provides **PPPoE traffic analysis** for troubleshooting.

# SEE ALSO

[pppoe](/man/pppoe)(8), [pppoe-discovery](/man/pppoe-discovery)(8), [tcpdump](/man/tcpdump)(1)

