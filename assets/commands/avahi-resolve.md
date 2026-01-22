# TLDR

Resolve name to **IPv4**

```avahi-resolve -4 -n service.local```

Resolve **IP** to hostname

```avahi-resolve -v -a IP```

# SYNOPSIS

**avahi-resolve** [_OPTIONS_]

# DESCRIPTION

**avahi-resolve** translates between mDNS/DNS-SD hostnames and IP addresses using the Avahi daemon. It can resolve .local hostnames to IP addresses and perform reverse lookups.

# PARAMETERS

**-n, --name** _hostname_
> Resolve hostname to IP address

**-a, --address** _ip_
> Resolve IP address to hostname (reverse lookup)

**-4**
> Resolve to IPv4 addresses only

**-6**
> Resolve to IPv6 addresses only

**-v, --verbose**
> Enable verbose output

# CAVEATS

Only works with mDNS-enabled hosts (typically using .local domain). The Avahi daemon must be running. Network firewalls may block mDNS traffic (port 5353/UDP).

# HISTORY

**avahi-resolve** is part of the **Avahi** package, providing mDNS/DNS-SD name resolution on Linux.

# SEE ALSO

[avahi-browse](/man/avahi-browse)(1), [avahi-daemon](/man/avahi-daemon)(8)
