# TLDR

**Start PPPoE server**

```pppoe-server -I [eth0]```

**Specify IP pool**

```pppoe-server -I [eth0] -L [10.0.0.1] -R [10.0.0.100-200]```

**Run with specific service name**

```pppoe-server -I [eth0] -S [myservice]```

# SYNOPSIS

**pppoe-server** [_options_]

# PARAMETERS

**-I** _INTERFACE_
> Listening interface.

**-L** _IP_
> Local IP address.

**-R** _RANGE_
> Remote IP range.

**-S** _NAME_
> Service name.

**-N** _NUM_
> Max sessions.

# DESCRIPTION

**pppoe-server** runs PPPoE access concentrator. Server component.

The tool accepts PPPoE client connections. DSL server functionality.

pppoe-server provides access.

# CAVEATS

Requires proper configuration. Usually combined with RADIUS.

# HISTORY

pppoe-server provides **PPPoE access concentrator** functionality.

# SEE ALSO

[pppoe](/man/pppoe)(8), [pppoe-relay](/man/pppoe-relay)(8), [pppd](/man/pppd)(8)

