# TLDR

**Start PPPoE connection**

```pppoe -I [eth0]```

**Debug mode**

```pppoe -I [eth0] -D [/tmp/pppoe.log]```

**Specify AC name**

```pppoe -I [eth0] -A [ac_name]```

# SYNOPSIS

**pppoe** [_options_]

# PARAMETERS

**-I** _INTERFACE_
> Ethernet interface.

**-D** _FILE_
> Debug log file.

**-A** _NAME_
> Access concentrator name.

**-S** _NAME_
> Service name.

**-T** _SECONDS_
> Timeout.

# DESCRIPTION

**pppoe** manages PPP over Ethernet connections. DSL client component.

The tool establishes PPPoE sessions. For broadband connections.

pppoe handles DSL links.

# CAVEATS

Usually managed by pppoe-connect. Requires root.

# HISTORY

pppoe implements **PPP over Ethernet** for DSL connections.

# SEE ALSO

[pppoe-connect](/man/pppoe-connect)(1), [pppoe-setup](/man/pppoe-setup)(8), [pppd](/man/pppd)(8)

