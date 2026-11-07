# TAGLINE

report NetworkManager state and devices (obsolete)

# TLDR

**Show NetworkManager state, devices and wireless networks**

```nm-tool```

**Modern equivalent: show device status**

```nmcli device show```

# SYNOPSIS

**nm-tool**

# DESCRIPTION

**nm-tool** prints a report about NetworkManager: its overall state, every network device with its driver, state and hardware address, the active connection, IPv4 settings (address, gateway, DNS) and, for Wi-Fi adapters, the list of visible access points.

It takes no options; running it prints the full report.

# CAVEATS

Removed from NetworkManager in version **0.9.10** (2014). It is not available on any current distribution; use **nmcli** (for example **nmcli general status**, **nmcli device show** or **nmcli device wifi list**) instead.

# HISTORY

**nm-tool** shipped with NetworkManager 0.6 through 0.9.8 as its first command-line reporting tool. It was superseded by **nmcli**, introduced in NetworkManager 0.8.1, which can also modify connections.

# SEE ALSO

[nmcli](/man/nmcli)(1), [nmtui](/man/nmtui)(1), [nm-applet](/man/nm-applet)(1), [NetworkManager](/man/NetworkManager)(8)

# RESOURCES

```[Source code](https://gitlab.freedesktop.org/NetworkManager/NetworkManager)```

```[Homepage](https://networkmanager.dev/)```

<!-- verified: 2026-11-07 -->
