# TAGLINE

Acquire IPv4 link-local addresses automatically

# TLDR

**Start** the daemon on an interface to auto-configure an IPv4LL address

```avahi-autoipd [interface]```

**Run in background** (daemonize) after startup

```avahi-autoipd -D [interface]```

**Kill** a running daemon on an interface

```avahi-autoipd --kill [interface]```

**Refresh** and re-announce the acquired IP address

```avahi-autoipd --refresh [interface]```

**Check** if daemon is running on an interface

```avahi-autoipd --check [interface]```

**Wait** for successful IP acquisition before detaching

```avahi-autoipd --wait [interface]```

# SYNOPSIS

**avahi-autoipd** [_options_] _interface_

# PARAMETERS

**-D, --daemonize**
> Daemonize after startup; implies syslog logging

**-k, --kill**
> Terminate running daemon on specified interface

**-r, --refresh**
> Re-announce acquired IP address (equivalent to SIGHUP)

**-c, --check**
> Return 0 if daemon is running on interface

**-s, --syslog**
> Log to syslog instead of STDERR

**--debug**
> Enable verbose mode for detailed logging

**--no-drop-root**
> Retain root privileges (not recommended for security)

**--no-chroot**
> Skip chroot operation

**-S, --start=**_address_
> Acquire the specified IPv4LL address

**-w, --wait**
> Wait for successful IP acquisition before detaching

**--force-bind**
> Acquire IPv4LL address even if routable address is present

**--no-proc-title**
> Don't modify process name during operation

**-h, --help**
> Display help information

**-v, --version**
> Show version details

# DESCRIPTION

**avahi-autoipd** implements IPv4LL (_Dynamic Configuration of IPv4 Link-Local Addresses_), a protocol defined in **IETF RFC3927** for automatic IP address configuration from the link-local **169.254.0.0/16** range without requiring a central server.

Primarily intended for **ad-hoc networks** which lack a DHCP server, it serves as a core component of the **Zeroconf stack**. The daemon can operate standalone or integrate with DHCP clients as a fallback mechanism when DHCP is unavailable.

When started, **avahi-autoipd** probes the network for address conflicts, acquires an available link-local address, and continuously monitors for conflicts. Upon successful acquisition, it executes **/etc/avahi/avahi-autoipd.action** script to configure the network interface.

The daemon responds to signals: **SIGINT** and **SIGTERM** trigger shutdown, while **SIGHUP** forces re-announcement of the current IP address.

# CAVEATS

Link-local addresses (**169.254.0.0/16**) only enable communication within the same network segment—no routing to other networks. Won't assign addresses if a routable IP already exists unless **--force-bind** is used.

# HISTORY

Part of the **Avahi** project, developed as a free software implementation of Apple's Bonjour/Zeroconf protocols. IPv4LL support was standardized in **RFC3927** in **2005**, with **avahi-autoipd** emerging as a lightweight standalone implementation for Linux systems.

# SEE ALSO

[avahi-daemon](/man/avahi-daemon)(8), [dhclient](/man/dhclient)(8), [ip](/man/ip)(8), [ifconfig](/man/ifconfig)(8)
