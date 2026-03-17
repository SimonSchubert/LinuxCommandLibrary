# TAGLINE

View and manipulate the ARP cache

# TLDR

**Display ARP table in BSD style**

```arp -a```

**Display ARP table in numeric format without DNS resolution**

```arp -an```

**Display ARP table in default Linux format**

```arp -e```

**Add a static ARP entry**

```sudo arp -s [192.168.1.1] [00:11:22:33:44:55]```

**Delete an ARP entry**

```sudo arp -d [192.168.1.1]```

**Show entries for a specific interface**

```arp -i [eth0] -a```

**Load entries from a file**

```sudo arp -f [/etc/ethers]```

# SYNOPSIS

**arp** [**-a**] [**-d** _address_] [**-s** _address_ _hw_addr_] [**-i** _interface_] [_options_]

# DESCRIPTION

**arp** manipulates the system's ARP (Address Resolution Protocol) cache. ARP maps IPv4 addresses to MAC (hardware) addresses on a local network segment.

The ARP table is built dynamically as the system communicates, but entries can be manually added, deleted, or viewed for network troubleshooting.

# PARAMETERS

**-a**
> Display all entries in BSD style output format.

**-e**
> Display entries in default Linux style with fixed columns.

**-n**, **--numeric**
> Show numerical addresses instead of resolving hostnames.

**-d** _address_
> Delete an entry for the specified address. Requires root.

**-s** _address_ _hw_addr_
> Add a static ARP entry. Add **temp** to make it non-permanent.

**-i** _If_, **--device** _If_
> Limit display to a specific network interface.

**-D**, **--use-device**
> Use the hardware address of the specified interface instead of a hw_addr.

**-f** _filename_, **--file** _filename_
> Load address entries from a file (default: /etc/ethers).

**-v**, **--verbose**
> Verbose output.

**-H** _type_, **--hw-type** _type_
> Hardware type (ether, arcnet, pronet, ax25, netrom).

# CAVEATS

The arp command is deprecated in favor of **ip neigh** on modern Linux. Static entries do not survive reboots by default. ARP is only used for IPv4; IPv6 uses Neighbor Discovery Protocol (NDP).

# HISTORY

**arp** has been part of Unix networking since the early days of TCP/IP in the **1980s**. On Linux, it is part of the **net-tools** package, which is being superseded by **iproute2**.

# SEE ALSO

[ip-neighbour](/man/ip-neighbour)(8), [arping](/man/arping)(8), [arp-scan](/man/arp-scan)(1), [ifconfig](/man/ifconfig)(8), [ip](/man/ip)(8)
