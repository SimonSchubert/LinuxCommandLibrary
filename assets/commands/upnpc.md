# TAGLINE

Configure UPnP port forwarding on routers

# TLDR

**Forward** external port to local

```upnpc -a [192.168.0.1] 8080 80 tcp```

**Delete** port forwarding

```upnpc -d 80 tcp```

Get **device** information

```upnpc -s```

**List** existing redirections

```upnpc -l```

# SYNOPSIS

**upnpc** [_OPTIONS_] [_COMMAND_]

# PARAMETERS

**-a** _IP_ _INTERNAL_PORT_ _EXTERNAL_PORT_ _PROTOCOL_
> Add port mapping

**-d** _EXTERNAL_PORT_ _PROTOCOL_
> Delete port mapping

**-s**
> Show UPnP device information

**-l**
> List existing port redirections

# DESCRIPTION

**upnpc** configures port forwarding rules on a router using the UPnP (Universal Plug and Play) protocol. It allows applications to automatically set up port forwarding without manual router configuration.

The tool can add, remove, and list port mappings, as well as query information about UPnP-enabled devices on the network.

# CAVEATS

Router must support and have UPnP enabled. Some ISP routers disable UPnP for security. Port mappings may be temporary. UPnP has security implications.

# HISTORY

**upnpc** is part of the **miniupnpc** library, providing command-line access to UPnP Internet Gateway Device functionality.

# INSTALL

```apt: sudo apt install miniupnpc```

```dnf: sudo dnf install miniupnpc```

```pacman: sudo pacman -S miniupnpc```

```apk: sudo apk add miniupnpc```

```zypper: sudo zypper install miniupnpc```

```brew: brew install miniupnpc```

```nix: nix profile install nixpkgs#miniupnpc```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[iptables](/man/iptables)(8)
