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

**pppoe-discovery** discovers PPPoE access concentrators. Diagnostic tool.

The tool finds available DSL endpoints. Network discovery.

pppoe-discovery finds servers.

# CAVEATS

Discovery only, no connection. Requires interface up.

# HISTORY

pppoe-discovery provides **PPPoE server discovery** functionality.

# SEE ALSO

[pppoe](/man/pppoe)(8), [pppoe-connect](/man/pppoe-connect)(8)

