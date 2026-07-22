# TAGLINE

Resolve hostnames to IP addresses via mDNS

# TLDR

This command is an alias of **avahi-resolve --name**.

**Resolve** a hostname to an IP address

```avahi-resolve-host-name [hostname.local]```

**Resolve** to an IPv4 address only

```avahi-resolve-host-name -4 [hostname.local]```

**Resolve** to an IPv6 address only

```avahi-resolve-host-name -6 [hostname.local]```

# SYNOPSIS

**avahi-resolve-host-name** [_OPTIONS_] _hostname_ ...

# DESCRIPTION

**avahi-resolve-host-name** resolves hostnames to IP addresses using mDNS/DNS-SD via the Avahi daemon. It is equivalent to running **avahi-resolve** with the **--name** flag.

# INSTALL

```apt: sudo apt install avahi-utils```

```dnf: sudo dnf install avahi-tools```

```apk: sudo apk add avahi-tools```

```zypper: sudo zypper install avahi-utils```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[avahi-resolve](/man/avahi-resolve)(1), [avahi-resolve-address](/man/avahi-resolve-address)(1), [avahi-browse](/man/avahi-browse)(1), [avahi-daemon](/man/avahi-daemon)(8)

# RESOURCES

```[Homepage](https://avahi.org/)```

```[Source code](https://github.com/avahi/avahi)```

<!-- verified: 2026-06-17 -->
