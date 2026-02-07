# TAGLINE

Browse for SSH and VNC servers on the local network

# TLDR

**Browse for SSH servers on local network**

```bssh```

**Browse in specific domain**

```bssh --domain [.local]```

**Force SSH server browsing only**

```bssh --ssh```

**Browse both SSH and VNC servers**

```bssh --shell```

# SYNOPSIS

**bssh** [_options_]

# DESCRIPTION

**bssh** is an Avahi service browser that discovers SSH servers on the local network using mDNS/DNS-SD (Zeroconf). It displays found servers in a GUI and launches ssh when a server is selected.

The tool is part of the Avahi Zeroconf suite for service discovery.

# PARAMETERS

**-s, --ssh**
> Browse for SSH servers only

**-v, --vnc**
> Browse for VNC servers only

**-S, --shell**
> Browse for both SSH and VNC servers

**-d, --domain** _domain_
> Browse in specified domain (default: .local)

**-h, --help**
> Show help

**-V, --version**
> Show version

# RELATED BINARIES

**bssh**
> Browse SSH servers (default behavior)

**bvnc**
> Browse VNC servers

**bshell**
> Browse both SSH and VNC servers

# REQUIREMENTS

Requires Avahi daemon running and gtk3, python-dbus, python-gobject dependencies. UDP port 5353 must be open for mDNS.

# PUBLISHING SSH SERVICE

To advertise your SSH server:

```cp /usr/share/doc/avahi/ssh.service /etc/avahi/services/```

# CAVEATS

Only discovers services advertised via mDNS on local network. Requires GUI environment. The "B" stands for "Browse", not Bluetooth.

# SEE ALSO

[avahi-browse](/man/avahi-browse)(1), [avahi-daemon](/man/avahi-daemon)(8), [ssh](/man/ssh)(1), [bvnc](/man/bvnc)(1)
