# TAGLINE

Manage PPP over Ethernet connections

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

**pppoe** is the user-space PPP over Ethernet client that establishes PPPoE sessions for DSL broadband connections. It handles the discovery and session phases of the PPPoE protocol, communicating with the ISP's access concentrator over a specified Ethernet interface.

The tool is typically invoked indirectly through **pppoe-connect** or **pppoe-start** wrapper scripts rather than called directly. It works in conjunction with **pppd** which handles the PPP negotiation once the Ethernet session is established.

# CAVEATS

Usually managed by pppoe-connect. Requires root.

# HISTORY

pppoe implements **PPP over Ethernet** for DSL connections.

# INSTALL

```apt: sudo apt install pppoe```

```dnf: sudo dnf install rp-pppoe```

```pacman: sudo pacman -S rp-pppoe```

```apk: sudo apk add rp-pppoe```

```zypper: sudo zypper install rp-pppoe```

```nix: nix profile install nixpkgs#rp-pppoe```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pppoe-connect](/man/pppoe-connect)(1), [pppoe-setup](/man/pppoe-setup)(8), [pppd](/man/pppd)(8)

