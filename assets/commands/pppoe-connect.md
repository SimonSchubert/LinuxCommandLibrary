# TLDR

**Start PPPoE connection**

```pppoe-connect```

**Connect with specific config**

```pppoe-connect [/etc/ppp/pppoe.conf]```

# SYNOPSIS

**pppoe-connect** [_config_]

# PARAMETERS

_CONFIG_
> Configuration file path.

# DESCRIPTION

**pppoe-connect** establishes PPPoE connection using config file. Wrapper script.

The tool initiates DSL connections. Uses pppoe-start configuration.

pppoe-connect starts DSL.

# CAVEATS

Requires configured pppoe.conf. Uses pppd internally.

# HISTORY

pppoe-connect is a **wrapper script** for PPPoE connection management.

# SEE ALSO

[pppoe](/man/pppoe)(8), [pppoe-setup](/man/pppoe-setup)(8), [pppoe-stop](/man/pppoe-stop)(8)

