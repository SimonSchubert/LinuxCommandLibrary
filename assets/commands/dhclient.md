# TAGLINE

ISC DHCP client for dynamic network configuration

# TLDR

**Obtain IP address** for interface

```dhclient [eth0]```

**Release current lease**

```dhclient -r [eth0]```

**Release and obtain** new lease

```dhclient -r [eth0] && dhclient [eth0]```

**Run in foreground** with verbose output

```dhclient -d -v [eth0]```

**Use specific configuration** file

```dhclient -cf [/etc/dhcp/dhclient.conf] [eth0]```

**Contact specific DHCP server**

```dhclient -s [192.168.1.1] [eth0]```

# SYNOPSIS

**dhclient** [_options_] [_interface_...]

# PARAMETERS

_INTERFACE_
> Network interface(s) to configure.

**-r**
> Release the current lease.

**-d**
> Run in foreground (debug mode).

**-v**
> Verbose output.

**-cf** _FILE_
> Use specified configuration file.

**-lf** _FILE_
> Use specified lease file.

**-s** _ADDRESS_
> Specify DHCP server address to contact.

**-4**
> Use DHCPv4 only.

**-6**
> Use DHCPv6 only.

**--help**
> Display help information.

# CONFIGURATION

**/etc/dhcp/dhclient.conf**
> DHCP client configuration file. Controls request behavior, timeout values, and custom DHCP options.

**/var/lib/dhcp/dhclient.leases**
> Stores active and historical lease information for network interfaces.

# DESCRIPTION

**dhclient** is the Internet Systems Consortium DHCP client. It dynamically configures network interfaces by obtaining IP addresses, subnet masks, gateways, and DNS servers from DHCP servers.

The client implements the DHCP protocol, handling lease negotiation, renewal, and release. Configuration options in dhclient.conf allow customizing requests, including requesting specific options or addresses.

dhclient maintains lease information in lease files, allowing it to request the same address on reconnection. It can manage multiple interfaces simultaneously and supports both DHCPv4 and DHCPv6.

# CAVEATS

Requires root privileges. May conflict with network managers like NetworkManager. Lease files accumulate over time. Some options require server support.

# HISTORY

dhclient is part of the **ISC DHCP** package, originally developed by **Ted Lemon** at the Internet Systems Consortium. ISC DHCP has been the reference implementation of DHCP since the late 1990s, though it entered maintenance mode as newer implementations emerged.

# SEE ALSO

[dhcpcd](/man/dhcpcd)(8), [ip](/man/ip)(8), [ifconfig](/man/ifconfig)(8), [networkctl](/man/networkctl)(1)
