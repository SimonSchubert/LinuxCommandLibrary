# TAGLINE

Userspace ARP cache daemon with persistent storage.

# TLDR

**Start** ARP daemon

```sudo arpd -a [1] -b [/var/lib/arpd/arpd.db] [eth0]```

Run in **foreground**

```sudo arpd -l [eth0]```

# SYNOPSIS

**arpd** [_-a neighbors_] [_-b database_] [_-k_] [_-l_] _interface_

# DESCRIPTION

**arpd** is a userspace ARP daemon that collects ARP information and stores it in a database. It can answer ARP requests from the kernel cache, reducing ARP traffic on large networks.

The daemon maintains a persistent ARP database that survives reboots, improving network performance and reducing broadcast traffic.

# PARAMETERS

**-a** _n_
> Neighbors cache size

**-b** _file_
> Database file path

**-k**
> Kernel mode (use kernel ARP cache)

**-l**
> Don't daemonize (foreground)

**-n** _time_
> Negative cache timeout

**interface**
> Network interface to monitor

# CAVEATS

Rarely needed on modern networks. May cause issues if ARP cache becomes stale. Typically only useful on very large layer 2 networks.

# HISTORY

**arpd** is part of the iproute2 package, providing userspace ARP table management for specialized networking scenarios.

# SEE ALSO

[arp](/man/arp)(8), [ip-neighbour](/man/ip-neighbour)(8)
