# TLDR

**Display** ARP table

```arp -a```

Display in **numeric** format

```arp -n```

**Add** static ARP entry

```sudo arp -s [192.168.1.1] [00:11:22:33:44:55]```

**Delete** ARP entry

```sudo arp -d [192.168.1.1]```

Show entries for **specific interface**

```arp -i [eth0]```

# SYNOPSIS

**arp** [_-a_] [_-d address_] [_-s address hw_addr_] [_-i interface_] [_options_]

# DESCRIPTION

**arp** manipulates the system's ARP (Address Resolution Protocol) cache. ARP maps IP addresses to MAC (hardware) addresses on a local network segment.

The ARP table is built dynamically as the system communicates, but entries can be manually added, deleted, or viewed for network troubleshooting.

# PARAMETERS

**-a**
> Display all entries (BSD style)

**-n**, **--numeric**
> Show numeric addresses (no DNS lookup)

**-d** _address_
> Delete entry for address

**-s** _address_ _hw_addr_
> Add static entry

**-i** _interface_
> Limit to specific interface

**-D**
> Use device's hardware address

**-v**, **--verbose**
> Verbose output

**-H** _type_, **--hw-type** _type_
> Hardware type (ether, arcnet, etc.)

# CAVEATS

The arp command is deprecated in favor of **ip neigh** on modern Linux. Static entries don't survive reboots by default. ARP is only used for IPv4; IPv6 uses Neighbor Discovery.

# HISTORY

**arp** has been part of Unix networking since the early days of TCP/IP in the **1980s**. On Linux, it's part of net-tools, which is being replaced by iproute2.

# SEE ALSO

[ip-neighbour](/man/ip-neighbour)(8), [arping](/man/arping)(8), [arp-scan](/man/arp-scan)(1)
