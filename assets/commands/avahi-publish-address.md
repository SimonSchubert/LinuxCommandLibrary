# TAGLINE

Register mDNS hostname-to-address mappings

# TLDR

**Register** a hostname to IP address mapping

```avahi-publish-address [hostname] [ip_address]```

**Register** an IPv4 address with a hostname

```avahi-publish-address myserver.local 192.168.1.100```

**Register** an IPv6 address with a hostname

```avahi-publish-address myserver.local fe80::1```

**Register** in verbose mode

```avahi-publish-address -v [hostname] [ip_address]```

**Register** in a specific domain

```avahi-publish-address --domain=[domain] [hostname] [ip_address]```

**Register** without reverse DNS entry

```avahi-publish-address --no-reverse [hostname] [ip_address]```

# SYNOPSIS

**avahi-publish-address** [_options_] _hostname_ _address_

# PARAMETERS

**-v, --verbose**
> Enable verbose output with detailed information

**-d, --domain=**_DOMAIN_
> Specify mDNS domain name to register in (defaults to .local)

**-P, --proto=**_PROTO_
> Specify IP protocol to publish (ipv4, ipv6, or all)

**-R, --no-reverse**
> Do not publish reverse DNS (PTR) entry for the address

**-f, --no-fail**
> Continue and reconnect if daemon becomes unavailable

**-h, --help**
> Display help information

**-V, --version**
> Show version information

# DESCRIPTION

**avahi-publish-address** is a command-line utility for registering hostname-to-address mappings via the Avahi daemon using mDNS (Multicast DNS). This command is equivalent to **avahi-publish -a** and provides a convenient shortcut specifically for address registration.

The tool enables local network name resolution by advertising a hostname and its associated IPv4 or IPv6 address. The hostname typically resolves as **hostname.local** on the local network, allowing other devices to discover and connect to the host by name rather than by IP address.

When invoked, **avahi-publish-address** connects to the Avahi daemon and maintains the hostname-to-address mapping until the process is terminated. The mapping is automatically withdrawn when the process exits.

By default, the tool publishes both forward (name-to-address) and reverse (address-to-name) DNS entries. The reverse entry can be suppressed using the **--no-reverse** option. The protocol can be explicitly specified using **--proto** when needed, though the tool automatically detects the protocol from the address format.

The published hostname becomes discoverable by other mDNS-capable devices on the local network segment, including Linux systems with Avahi, macOS systems with Bonjour, and Windows systems with appropriate mDNS support.

# CAVEATS

Requires **avahi-daemon** to be running. The hostname registration persists only while the **avahi-publish-address** process is active; terminating the process removes the mapping. For persistent hostname registration, configure static mappings in **/etc/avahi/hosts**.

# SEE ALSO

[avahi-publish](/man/avahi-publish)(1), [avahi-publish-service](/man/avahi-publish-service)(1), [avahi-resolve](/man/avahi-resolve)(1), [avahi-browse](/man/avahi-browse)(1), [avahi-daemon](/man/avahi-daemon)(8)
