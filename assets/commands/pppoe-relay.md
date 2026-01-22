# TLDR

**Start PPPoE relay**

```pppoe-relay -S [eth0] -C [eth1]```

**Relay with multiple interfaces**

```pppoe-relay -S [eth0] -C [eth1] -C [eth2]```

**Run in foreground**

```pppoe-relay -n -S [eth0] -C [eth1]```

# SYNOPSIS

**pppoe-relay** [_options_]

# PARAMETERS

**-S** _INTERFACE_
> Server-side interface.

**-C** _INTERFACE_
> Client-side interface.

**-n**
> Don't fork to background.

**-i**
> Ignore PADI if no AC.

# DESCRIPTION

**pppoe-relay** relays PPPoE traffic between interfaces. Bridge tool.

The tool forwards PPPoE packets. Connects separate networks.

pppoe-relay bridges PPPoE.

# CAVEATS

Requires multiple interfaces. Specialized use case.

# HISTORY

pppoe-relay provides **PPPoE packet relaying** between network segments.

# SEE ALSO

[pppoe](/man/pppoe)(8), [pppoe-server](/man/pppoe-server)(8)

