# TLDR

**List** services with addresses

```avahi-browse -a -r -l```

List for **scripts** (parsable)

```avahi-browse -a -t -p```

List **domains**

```avahi-browse -D```

Search specific **domain**

```avahi-browse -a --domain=example.local```

# SYNOPSIS

**avahi-browse** [_OPTIONS_] [_SERVICE-TYPE_]

# DESCRIPTION

**avahi-browse** displays services and hosts exposed on the local network via mDNS/DNS-SD (Multicast DNS Service Discovery). It is compatible with Apple's Bonjour/Zeroconf protocol.

# PARAMETERS

**-a, --all**
> Show all services

**-r, --resolve**
> Resolve discovered services to addresses and ports

**-l, --ignore-local**
> Ignore services on the local machine

**-t, --terminate**
> Terminate after dumping a list (don't wait for more)

**-p, --parsable**
> Output in parsable format for scripts

**-D, --browse-domains**
> Browse for domains instead of services

**--domain** _domain_
> Limit search to a specific domain

**-v, --verbose**
> Enable verbose output

# CAVEATS

Requires the Avahi daemon to be running. Services must be advertised via mDNS to be discovered. Network configuration and firewall settings may affect discovery.

# HISTORY

**avahi-browse** is part of the **Avahi** package, providing mDNS/DNS-SD service discovery on Linux, compatible with Apple's Bonjour.

# SEE ALSO

[avahi-resolve](/man/avahi-resolve)(1), [avahi-daemon](/man/avahi-daemon)(8)
