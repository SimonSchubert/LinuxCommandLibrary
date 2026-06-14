# TAGLINE

Userspace ARP cache daemon with persistent storage.

# TLDR

**Start** the ARP daemon on an interface, using a database file

```sudo arpd -b [/var/lib/arpd/arpd.db] [eth0]```

Also **actively resolve** addresses (send up to N broadcast queries)

```sudo arpd -a [3] -b [/var/lib/arpd/arpd.db] [eth0]```

**Dump** the ARP database to standard output and exit

```arpd -l -b [/var/lib/arpd/arpd.db]```

**Suppress** kernel broadcast queries (let arpd do the asking)

```sudo arpd -k [eth0]```

# SYNOPSIS

**arpd** [_-lkh?_] [_-a N_] [_-b dbase_] [_-B number_] [_-f file_] [_-p interval_] [_-n time_] [_-R rate_] [_interface ..._]

# DESCRIPTION

**arpd** is a userspace ARP daemon that collects ARP information and stores it in a database. It can answer ARP requests from the kernel cache, reducing ARP traffic on large networks.

The daemon maintains a persistent ARP database that survives reboots, improving network performance and reducing broadcast traffic.

# PARAMETERS

**-l**
> Dump the arpd database (interface index, IP address, MAC address) to standard output and exit

**-a** _N_
> Actively send broadcast ARP queries, making up to _N_ attempts before marking a host dead (otherwise arpd only listens passively)

**-b** _file_
> Location of the database file (default: **/var/lib/arpd/arpd.db**)

**-f** _file_
> Read and preload the database from a text file in the format produced by **-l**

**-k**
> Suppress broadcast ARP queries sent by the kernel, so arpd performs the negotiation itself

**-n** _time_
> Timeout of the negative cache in seconds (default: 60)

**-p** _interval_
> Interval in seconds between polls of the kernel ARP table (default: 30)

**-R** _rate_
> Maximum steady rate of broadcasts sent by arpd, in packets per second (default: 1)

**-B** _number_
> Number of broadcasts arpd may send back to back (default: 3)

**interface**
> Network interface(s) to monitor

# CAVEATS

Rarely needed on modern networks. May cause issues if the ARP cache becomes stale. Typically only useful on very large layer-2 networks. To use arpd, the kernel must be configured to push unresolved addresses to it via **app_solicit** in **/proc/sys/net/ipv4/neigh/**_iface_**/**.

# HISTORY

**arpd** is part of the **iproute2** package, providing userspace ARP table management for specialized networking scenarios.

# SEE ALSO

[arp](/man/arp)(8), [ip-neighbour](/man/ip-neighbour)(8)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/network/iproute2/iproute2.git)```

<!-- verified: 2026-06-15 -->
