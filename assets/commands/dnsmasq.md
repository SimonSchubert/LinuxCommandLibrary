# TLDR

**Start dnsmasq** as DNS forwarder

```dnsmasq```

**Start with specific config file**

```dnsmasq -C [/etc/dnsmasq.conf]```

**Run in foreground** with debug output

```dnsmasq -d```

**Test configuration** syntax

```dnsmasq --test```

**Start with DHCP** for a subnet

```dnsmasq --dhcp-range=[192.168.1.50,192.168.1.150,12h]```

**Start as authoritative** for a domain

```dnsmasq --local=/[mydomain.local]/```

**Block ads** using hosts file

```dnsmasq --addn-hosts=[/etc/hosts.ads]```

# SYNOPSIS

**dnsmasq** [_options_]

# DESCRIPTION

**dnsmasq** is a lightweight DNS forwarder and DHCP server designed for small networks. It provides DNS caching, DHCP, TFTP, and PXE boot services in a single, efficient package.

As a DNS server, dnsmasq forwards queries to upstream servers and caches responses, reducing latency and bandwidth. It reads /etc/hosts for local name resolution and supports custom local domains. It can also provide DNS-based ad blocking.

The DHCP server provides dynamic and static address assignment with support for BOOTP, PXE, and TFTP for network booting. dnsmasq is commonly used in routers, embedded systems, and as a local development DNS/DHCP solution.

# PARAMETERS

**-d**
> Debug mode, foreground, log to stderr.

**-k**
> Keep in foreground, don't daemonize.

**-C** _file_
> Use specified configuration file.

**--test**
> Check configuration syntax.

**-p** _port_
> Listen on specified DNS port.

**-a** _address_
> Listen on specified address.

**--dhcp-range=** _range_
> Enable DHCP with address range.

**--dhcp-host=** _config_
> Static DHCP assignment.

**-h**, **--no-hosts**
> Don't read /etc/hosts.

**-H**, **--addn-hosts=** _file_
> Additional hosts file.

**--local=** _domain_
> Answer authoritatively for domain.

**--server=** _address_
> Upstream DNS server.

**--cache-size=** _n_
> DNS cache size (default 150).

**--log-queries**
> Log DNS queries.

# CAVEATS

Only one DNS/DHCP server should run on each interface. Conflicts with systemd-resolved on some systems (disable or configure to coexist). DHCP requires appropriate network permissions. Large networks may need a full-featured DHCP server.

# HISTORY

**dnsmasq** was created by **Simon Kelley** in **2000** as a simple DNS forwarder for dial-up connections. It evolved to include DHCP and became popular in embedded Linux systems, routers (OpenWrt, DD-WRT), and development environments. The project remains actively maintained and is included in most Linux distributions.

# SEE ALSO

[named](/man/named)(8), [dhcpd](/man/dhcpd)(8), [systemd-resolved](/man/systemd-resolved)(8), [hosts](/man/hosts)(5)
