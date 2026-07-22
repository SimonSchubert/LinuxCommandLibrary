# TAGLINE

networkManager system tray applet

# TLDR

**Start network manager applet**

```nm-applet```

**Start for indicator style**

```nm-applet --indicator```

**Start with debug output**

```nm-applet --debug```

# SYNOPSIS

**nm-applet** [_options_]

# PARAMETERS

**--indicator**
> Use indicator (appindicator) style.

**--debug**
> Enable debug output.

**--help**
> Display help information.

# DESCRIPTION

**nm-applet** is the NetworkManager system tray applet. Provides GUI for network management.

The tool shows network status. Allows connecting to WiFi and VPN.

# CAVEATS

Requires NetworkManager. Desktop environment dependent. System tray needed.

# HISTORY

nm-applet is part of **NetworkManager**, providing graphical network management for Linux desktops.

# INSTALL

```apt: sudo apt install network-manager-applet```

```dnf: sudo dnf install network-manager-applet```

```pacman: sudo pacman -S network-manager-applet```

```apk: sudo apk add network-manager-applet```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[nmcli](/man/nmcli)(1), [nmtui](/man/nmtui)(1), [NetworkManager](/man/NetworkManager)(1)

