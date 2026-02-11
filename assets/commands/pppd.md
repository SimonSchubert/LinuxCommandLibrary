# TAGLINE

Point-to-Point Protocol connection daemon

# TLDR

**Start PPP connection**

```pppd [device] [speed]```

**Connect with options**

```pppd call [provider]```

**Debug mode**

```pppd debug [device] [speed]```

**Specify authentication**

```pppd user [username] password [password]```

# SYNOPSIS

**pppd** [_options_] [_device_] [_speed_]

# PARAMETERS

_DEVICE_
> Serial device.

_SPEED_
> Baud rate.

**call** _PROVIDER_
> Use provider config.

**debug**
> Enable debugging.

**user** _NAME_
> Username for auth.

**password** _PASS_
> Password for auth.

**noauth**
> Don't require auth.

# DESCRIPTION

**pppd** is the Point-to-Point Protocol daemon that establishes and manages PPP network connections over serial links, modems, and Ethernet. It handles link negotiation, authentication (PAP, CHAP, EAP), IP address assignment, and DNS configuration.

The daemon is typically invoked through helper scripts like **pon** or **pppoe-connect** rather than directly. Provider configuration files in **/etc/ppp/peers/** define connection parameters for different ISPs or VPN endpoints. Plugins extend functionality for PPPoE, RADIUS authentication, and other protocols.

# CONFIGURATION

**/etc/ppp/peers/**
> Provider configuration files defining connection parameters for each ISP or VPN endpoint. Invoked via `pppd call <provider>`.

**/etc/ppp/pap-secrets**, **/etc/ppp/chap-secrets**
> Authentication credential files for PAP and CHAP protocols, containing username, server, and password entries.

**/etc/ppp/options**
> Global default options applied to all PPP connections. Per-device options can be placed in **/etc/ppp/options.<device>**.

**/etc/ppp/ip-up**, **/etc/ppp/ip-down**
> Scripts executed when the PPP link comes up or goes down, used for routing, firewall, and DNS updates.

# CAVEATS

Requires root privileges. Complex configuration.

# HISTORY

pppd is the **standard PPP daemon** for Linux networking.

# SEE ALSO

[pon](/man/pon)(1), [poff](/man/poff)(1), [pppconfig](/man/pppconfig)(8)

