# TAGLINE

Change the mDNS hostname advertised on the network

# TLDR

**Set the mDNS hostname**

```avahi-set-host-name [newhost]```

**Set hostname with verbose output**

```avahi-set-host-name -v [newhost]```

# SYNOPSIS

**avahi-set-host-name** _hostname_

# DESCRIPTION

**avahi-set-host-name** changes the mDNS hostname advertised by the Avahi daemon. This allows you to change how your system appears on the local network without modifying system hostname files.

The change is immediate and affects service discovery on the local network.

# PARAMETERS

_hostname_
> The new mDNS hostname to advertise. Will be published as _hostname_.local on the network.

**-v**, **--verbose**
> Enable verbose mode.

**-V**, **--version**
> Show version information.

**-h**, **--help**
> Show help.

# CAVEATS

Requires avahi-daemon running. This operation is usually privileged. Does not change the system hostname (use **hostname** or **hostnamectl** for that). Changes are not persistent across daemon restarts. Hostname must be a valid DNS name.

# HISTORY

**avahi-set-host-name** is part of the Avahi suite, a free Zeroconf/Bonjour implementation started by Lennart Poettering around **2005**.

# SEE ALSO

[avahi-daemon](/man/avahi-daemon)(8), [avahi-resolve](/man/avahi-resolve)(1), [hostname](/man/hostname)(1), [hostnamectl](/man/hostnamectl)(1)
