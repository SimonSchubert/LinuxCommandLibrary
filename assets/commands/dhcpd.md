# TAGLINE

ISC DHCP server daemon for IP address assignment

# TLDR

**Start DHCP server**

```sudo dhcpd```

**Start on specific interface**

```sudo dhcpd [eth0]```

**Start in foreground** (debug)

```sudo dhcpd -f -d```

**Test configuration file**

```sudo dhcpd -t```

**Use alternate config file**

```sudo dhcpd -cf [/path/to/dhcpd.conf]```

**Use alternate lease file**

```sudo dhcpd -lf [/path/to/dhcpd.leases]```

# SYNOPSIS

**dhcpd** [_options_] [_interfaces_]

# PARAMETERS

**-f**
> Run in foreground.

**-d**
> Log to stderr (implies -f).

**-t**
> Test configuration and exit.

**-T**
> Test lease file and exit.

**-cf** _file_
> Use alternate configuration file.

**-lf** _file_
> Use alternate lease database.

**-pf** _file_
> Use alternate PID file.

**-4** / **-6**
> Force IPv4 or IPv6 mode.

**-q**
> Quiet startup.

**--no-pid**
> Don't write PID file.

# CONFIGURATION

**/etc/dhcp/dhcpd.conf**:
```
subnet 192.168.1.0 netmask 255.255.255.0 {
  range 192.168.1.100 192.168.1.200;
  option routers 192.168.1.1;
  option domain-name-servers 8.8.8.8, 8.8.4.4;
  default-lease-time 600;
  max-lease-time 7200;
}

host server1 {
  hardware ethernet 00:11:22:33:44:55;
  fixed-address 192.168.1.10;
}
```

# DESCRIPTION

**dhcpd** is the Internet Systems Consortium (ISC) DHCP server daemon. It assigns IP addresses and network configuration to clients on local networks using the Dynamic Host Configuration Protocol.

The server maintains a lease database tracking which addresses are assigned to which clients. Configuration defines address pools, lease durations, and options like gateway, DNS servers, and domain names.

Static assignments can reserve specific addresses for known MAC addresses. The server can also provide PXE boot options, custom options for specific vendors, and failover configurations for high availability.

# CAVEATS

Requires root privileges and must bind to port 67. Lease file must be writable. Multiple DHCP servers on the same network cause conflicts unless configured for failover. IPv6 support (dhcpd -6) uses different configuration syntax.

# HISTORY

ISC DHCP was originally developed by **Ted Lemon** at the Internet Systems Consortium, with first release in **1997**. It became the reference DHCP implementation for Unix systems. ISC announced end-of-life for ISC DHCP in **2022**, recommending migration to **Kea**, the next-generation ISC DHCP server.

# SEE ALSO

[dhcpd.conf](/man/dhcpd.conf)(5), [dhcpd.leases](/man/dhcpd.leases)(5), [dhclient](/man/dhclient)(8), [kea-dhcp4](/man/kea-dhcp4)(8)
