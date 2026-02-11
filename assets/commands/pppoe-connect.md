# TAGLINE

Establish PPPoE DSL connection

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

**pppoe-connect** is a wrapper script that establishes a PPPoE (PPP over Ethernet) connection using the settings defined in a configuration file, typically **/etc/ppp/pppoe.conf**. It coordinates between the pppoe client and pppd daemon to bring up a DSL broadband connection.

The script reads connection parameters including interface, authentication credentials, and PPP options from the config file. It is the counterpart to **pppoe-stop** for terminating the connection.

# CAVEATS

Requires configured pppoe.conf. Uses pppd internally.

# HISTORY

pppoe-connect is a **wrapper script** for PPPoE connection management.

# SEE ALSO

[pppoe](/man/pppoe)(8), [pppoe-setup](/man/pppoe-setup)(8), [pppoe-stop](/man/pppoe-stop)(8)

