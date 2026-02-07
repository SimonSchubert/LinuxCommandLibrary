# TAGLINE

Change the mDNS hostname advertised on the network

# TLDR

**Set** mDNS hostname

```avahi-set-host-name [newhost]```

# SYNOPSIS

**avahi-set-host-name** _hostname_

# DESCRIPTION

**avahi-set-host-name** changes the mDNS hostname advertised by the Avahi daemon. This allows you to change how your system appears on the local network without modifying system hostname files.

The change is immediate and affects service discovery on the local network.

# PARAMETERS

This command takes a single argument - the new hostname to advertise.

# WORKFLOW

The hostname will be advertised as _hostname_.local on the network. Other devices can reach your system using this name.

# CAVEATS

Requires avahi-daemon running. Does not change the system hostname (see hostname command). Changes may not persist after daemon restart. Hostname must be valid DNS name.

# HISTORY

**avahi-set-host-name** is part of the Avahi suite, a free Zeroconf/Bonjour implementation started by Lennart Poettering around **2005**.

# SEE ALSO

[avahi-daemon](/man/avahi-daemon)(8), [hostname](/man/hostname)(1), [hostnamectl](/man/hostnamectl)(1)
