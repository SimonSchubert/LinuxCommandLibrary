# TAGLINE

Browse for VNC servers on the local network

# TLDR

**Browse for VNC servers on local network**

```bvnc```

**Browse in specific domain**

```bvnc --domain [.local]```

**Force VNC server browsing only**

```bvnc --vnc```

**Browse both SSH and VNC servers**

```bvnc --shell```

# SYNOPSIS

**bvnc** [_options_]

# DESCRIPTION

**bvnc** is an Avahi service browser that discovers VNC servers on the local network using mDNS/DNS-SD (Zeroconf). It displays found servers in a GUI and launches vncviewer when a server is selected.

The tool is part of the Avahi Zeroconf suite for service discovery.

# PARAMETERS

**-v, --vnc**
> Browse for VNC servers only

**-s, --ssh**
> Browse for SSH servers only

**-S, --shell**
> Browse for both SSH and VNC servers

**-d, --domain** _domain_
> Browse in specified domain (default: .local)

**-h, --help**
> Show help

**-V, --version**
> Show version

# RELATED BINARIES

**bvnc**
> Browse VNC servers (default behavior)

**bssh**
> Browse SSH servers

**bshell**
> Browse both VNC and SSH servers

# REQUIREMENTS

Requires Avahi daemon running and gtk3, python-dbus, python-gobject dependencies. UDP port 5353 must be open for mDNS.

# PUBLISHING VNC SERVICE

To advertise your VNC server, create a service file in /etc/avahi/services/ with service type **_rfb._tcp** and your VNC port number.

# CAVEATS

Only discovers services advertised via mDNS on local network. Requires GUI environment and vncviewer installed.

# SEE ALSO

[avahi-browse](/man/avahi-browse)(1), [bssh](/man/bssh)(1), [vncviewer](/man/vncviewer)(1), [avahi-daemon](/man/avahi-daemon)(8)
