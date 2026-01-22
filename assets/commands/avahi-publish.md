# TLDR

**Register** a service on the local network

```avahi-publish -s "[service_name]" [service_type] [port]```

**Register** a service with TXT records

```avahi-publish -s "[service_name]" _http._tcp [port] "path=/index.html"```

**Register** a hostname to IP address mapping

```avahi-publish -a [hostname] [ip_address]```

**Register** a service in verbose mode

```avahi-publish -s -v "[service_name]" [service_type] [port]```

**Register** a service in a specific domain

```avahi-publish -s --domain=[domain] "[service_name]" [service_type] [port]```

**Register** with a subtype

```avahi-publish -s --subtype=[subtype] "[service_name]" [service_type] [port]```

# SYNOPSIS

**avahi-publish** **-s** [_options_] _name_ _service-type_ _port_ [_TXT data ..._]

**avahi-publish** **-a** [_options_] _hostname_ _address_

# PARAMETERS

**-s, --service**
> Register a service (requires name, service type, and port)

**-a, --address**
> Register hostname-to-address mapping

**-v, --verbose**
> Enable verbose output with detailed information

**-H, --host=**_HOSTNAME_
> Specify remote host name for the service

**-d, --domain=**_DOMAIN_
> Publish in specified domain (default: .local)

**--subtype=**_SUBTYPE_
> Add subtype registration to the primary service type (repeatable)

**-R, --no-reverse**
> Skip publishing reverse (address-to-name) entry

**-f, --no-fail**
> Continue and reconnect if daemon becomes unavailable

**-h, --help**
> Display help information

**-V, --version**
> Show version information

# DESCRIPTION

**avahi-publish** is a command-line utility for registering mDNS/DNS-SD services or hostname-to-address mappings through the Avahi daemon. It enables network service advertisement and hostname resolution on local networks using **mDNS** (Multicast DNS) and **DNS-SD** (DNS Service Discovery) protocols.

The tool operates in two primary modes:

> **Service Registration Mode** (**-s**): Registers a network service by specifying a DNS-SD service name (e.g., "Web Server"), a service type (e.g., _http._tcp), and an IP port number. Optional TXT record strings can be appended to provide additional service metadata like path, version, or configuration parameters.

> **Address/Hostname Registration Mode** (**-a**): Registers a mapping between a fully qualified hostname and an IPv4 or IPv6 address, enabling name resolution via mDNS.

When started, **avahi-publish** connects to the Avahi daemon and maintains the registration until the process is terminated. The registration is automatically withdrawn when the process exits.

Service types follow the DNS-SD naming convention: **_service._proto** where service identifies the application protocol (http, ssh, ftp) and proto is either _tcp or _udp. For example, **_http._tcp** for HTTP services or **_ssh._tcp** for SSH.

By default, services are published in the **.local** domain, but this can be changed using the **--domain** option. The tool also supports service subtypes via **--subtype**, allowing additional service categorization.

# CAVEATS

Requires **avahi-daemon** to be running. The registration persists only while the **avahi-publish** process is active; terminating the process removes the service advertisement. For persistent service registration, use service definition files in **/etc/avahi/services/**.

# SEE ALSO

[avahi-publish-service](/man/avahi-publish-service)(1), [avahi-publish-address](/man/avahi-publish-address)(1), [avahi-resolve](/man/avahi-resolve)(1), [avahi-browse](/man/avahi-browse)(1), [avahi-daemon](/man/avahi-daemon)(8)
