# TAGLINE

Resolve IP addresses to hostnames via mDNS

# TLDR

This command is an alias of **avahi-resolve --address**.

**Resolve** an IP address to a hostname

```avahi-resolve-address [ip_address]```

**Resolve** several addresses at once

```avahi-resolve-address [ip1] [ip2]```

# SYNOPSIS

**avahi-resolve-address** [_OPTIONS_] _address_ ...

# DESCRIPTION

**avahi-resolve-address** resolves IP addresses to hostnames using mDNS/DNS-SD via the Avahi daemon. It is equivalent to running **avahi-resolve** with the **--address** flag.

# SEE ALSO

[avahi-resolve](/man/avahi-resolve)(1), [avahi-resolve-host-name](/man/avahi-resolve-host-name)(1), [avahi-browse](/man/avahi-browse)(1), [avahi-daemon](/man/avahi-daemon)(8)

# RESOURCES

```[Homepage](https://avahi.org/)```

```[Source code](https://github.com/avahi/avahi)```

<!-- verified: 2026-06-17 -->
