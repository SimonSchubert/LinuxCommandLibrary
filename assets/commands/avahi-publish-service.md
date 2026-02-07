# TAGLINE

Register mDNS/DNS-SD services on the local network

# TLDR

**Publish** mDNS service

```avahi-publish-service [MyService] [_http._tcp] [80]```

Publish with **service text**

```avahi-publish-service [MyService] [_http._tcp] [80] ["path=/api"]```

Publish on **specific address**

```avahi-publish-service -a [192.168.1.100] [MyService] [_http._tcp] [80]```

Publish with **subtype**

```avahi-publish-service --subtype=[_printer._sub._http._tcp] [MyPrinter] [_http._tcp] [631]```

# SYNOPSIS

**avahi-publish-service** [_options_] _name_ _service-type_ _port_ [_txt-record_...]

# DESCRIPTION

**avahi-publish-service** registers a mDNS/DNS-SD service on the local network via the Avahi daemon. It allows services to be discovered by other devices using Avahi or Bonjour-compatible service discovery. This command is equivalent to **avahi-publish -s** and provides a convenient shortcut specifically for service registration.

The tool requires a service name, a DNS-SD service type (e.g., **_http._tcp**), and a port number. Optional TXT record strings can provide additional metadata about the service. Service subtypes can be registered for more specific categorization.

The registration persists only while the process is running. When terminated, the service advertisement is automatically withdrawn from the network.

# PARAMETERS

**-a**, **--address=**_address_
> Bind to specific address

**-s**, **--subtype=**_subtype_
> Register service subtype

**-d**, **--domain=**_domain_
> Publish in specific domain

**-H**, **--host=**_hostname_
> Advertise as specific hostname

**-v**, **--verbose**
> Enable verbose mode

**--no-fail**
> Don't fail if already published

# SERVICE TYPES

Common service types:
- **_http._tcp** - Web services
- **_ssh._tcp** - SSH servers
- **_printer._tcp** - Network printers
- **_afpovertcp._tcp** - AFP file sharing
- **_smb._tcp** - SMB/CIFS file sharing

# CAVEATS

Requires avahi-daemon running. Service persists only while command is running. Firewall must allow mDNS (UDP port 5353). Service names must be unique on the network.

# HISTORY

**avahi-publish-service** is part of the Avahi project, created by Lennart Poettering as a free implementation of Apple's Bonjour/Zeroconf protocol, first released around **2005**.

# SEE ALSO

[avahi-browse](/man/avahi-browse)(1), [avahi-daemon](/man/avahi-daemon)(8), [dns-sd](/man/dns-sd)(1)
