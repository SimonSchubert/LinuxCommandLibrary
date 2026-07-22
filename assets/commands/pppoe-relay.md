# TAGLINE

Relay PPPoE traffic between interfaces

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

**pppoe-relay** forwards PPPoE discovery and session packets between network interfaces, acting as a relay agent between PPPoE clients and access concentrators on different network segments. This allows clients on one subnet to connect to a PPPoE server on another.

The relay listens on both server-side and client-side interfaces, transparently forwarding PPPoE control and data traffic. Multiple client interfaces can be specified to serve several network segments through a single access concentrator.

# CAVEATS

Requires multiple interfaces. Specialized use case.

# HISTORY

pppoe-relay provides **PPPoE packet relaying** between network segments.

# INSTALL

```apt: sudo apt install pppoe```

```dnf: sudo dnf install rp-pppoe```

```pacman: sudo pacman -S rp-pppoe```

```apk: sudo apk add rp-pppoe```

```zypper: sudo zypper install rp-pppoe```

```nix: nix profile install nixpkgs#rp-pppoe```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pppoe](/man/pppoe)(8), [pppoe-server](/man/pppoe-server)(8)

