# TAGLINE

Interactively configure PPPoE connection

# TLDR

**Configure PPPoE connection**

```pppoe-setup```

**Run interactive setup**

```pppoe-setup```

# SYNOPSIS

**pppoe-setup** [_options_]

# PARAMETERS

Interactive configuration tool.

# DESCRIPTION

**pppoe-setup** is an interactive script that guides the user through configuring a PPPoE DSL broadband connection. It prompts for the network interface, ISP username and password, DNS settings, and firewall options.

The configuration is saved to **/etc/ppp/pppoe.conf** and related files, which are then used by **pppoe-connect** and **pppoe-start** to establish the connection. Run this once during initial DSL setup or when changing ISP settings.

# CAVEATS

Interactive only. Creates /etc/ppp/pppoe.conf.

# HISTORY

pppoe-setup provides **interactive PPPoE** configuration for DSL connections.

# SEE ALSO

[pppoe](/man/pppoe)(8), [pppoe-connect](/man/pppoe-connect)(8), [pppoeconf](/man/pppoeconf)(8)

