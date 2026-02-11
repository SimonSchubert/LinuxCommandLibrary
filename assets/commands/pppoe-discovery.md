# TAGLINE

Discover PPPoE access concentrators

# TLDR

**Discover PPPoE servers**

```pppoe-discovery -I [eth0]```

**Verbose discovery**

```pppoe-discovery -I [eth0] -V```

**Specify service name**

```pppoe-discovery -I [eth0] -S [service]```

# SYNOPSIS

**pppoe-discovery** [_options_]

# PARAMETERS

**-I** _INTERFACE_
> Network interface.

**-V**
> Verbose output.

**-S** _NAME_
> Service name filter.

**-A** _NAME_
> AC name filter.

# DESCRIPTION

**pppoe-discovery** sends PPPoE Active Discovery Initiation (PADI) packets on a network interface to find available PPPoE access concentrators. It reports the names and services offered by any responding concentrators without actually establishing a connection.

This diagnostic tool is useful for verifying that a DSL modem or network is properly configured and that the ISP's access concentrator is reachable before attempting a full PPPoE connection.

# CAVEATS

Discovery only, no connection. Requires interface up.

# HISTORY

pppoe-discovery provides **PPPoE server discovery** functionality.

# SEE ALSO

[pppoe](/man/pppoe)(8), [pppoe-connect](/man/pppoe-connect)(8)

