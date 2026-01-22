# TLDR

**Start** the Avahi mDNS/DNS-SD daemon

```avahi-daemon```

**Start** and daemonize (run in background)

```avahi-daemon --daemonize```

**Check** if the daemon is running

```avahi-daemon --check```

**Reload** configuration and service definitions

```avahi-daemon --reload```

**Kill** a running daemon

```avahi-daemon --kill```

**Enable debug** output with verbose logging

```avahi-daemon --debug```

# SYNOPSIS

**avahi-daemon** [_options_]

# PARAMETERS

**-f, --file=**_FILE_
> Specify configuration file (default: /etc/avahi/avahi-daemon.conf)

**-D, --daemonize**
> Daemonize after startup; implies --syslog

**-s, --syslog**
> Log to syslog instead of STDERR

**--debug**
> Increase verbosity to debug level

**--no-rlimits**
> Don't enforce resource limits from configuration file

**--no-drop-root**
> Don't drop root privileges (not recommended for security)

**--no-chroot**
> Disable chroot operation (requires compile-time support)

**--no-proc-title**
> Don't change process name during execution

**-k, --kill**
> Terminate running daemon by sending SIGTERM

**-r, --reload**
> Reread resolv.conf and service definitions by sending SIGHUP

**-c, --check**
> Return 0 if daemon is running, non-zero otherwise

**-h, --help**
> Display help information

**-v, --version**
> Show version information

# DESCRIPTION

**avahi-daemon** implements Apple's Zeroconf architecture (also known as **Rendezvous** or **Bonjour**) on Linux and other Unix-like systems. It registers local IP addresses and static services using **mDNS** (Multicast DNS) and **DNS-SD** (DNS Service Discovery) protocols.

The daemon provides **service discovery** functionality, allowing applications and devices on a local network to automatically discover each other without requiring manual configuration or a central DNS server. It publishes services and responds to service discovery queries from other hosts.

At startup, **avahi-daemon** reads its configuration from **/etc/avahi/avahi-daemon.conf** and loads XML service definitions from **/etc/avahi/services/\*.service**. When enabled, it also processes **/etc/resolv.conf** for unicast DNS server information.

The daemon provides two IPC APIs: a simple protocol used by **avahi-dnsconfd** and **nss-mdns**, plus a comprehensive **D-Bus** interface for application integration.

**Signal handling**: **SIGINT** and **SIGTERM** trigger shutdown, **SIGHUP** reloads DNS server data and service definitions, and **SIGUSR1** dumps cached resource records to syslog for debugging.

# FILES

**/etc/avahi/avahi-daemon.conf**
> Main configuration file

**/etc/avahi/hosts**
> Static hostname mappings for mDNS publishing

**/etc/avahi/services/\*.service**
> XML service definition files for static service registration

# CAVEATS

Requires network multicast support to function properly. IPv4 link-local addresses (169.254.0.0/16) and multicast addresses must be accessible. Some restrictive firewalls may block mDNS traffic on UDP port 5353.

# HISTORY

**Avahi** was developed as a free software implementation of Apple's **Bonjour** (originally Rendezvous) protocol suite. The project began in **2004** and has become the de facto standard mDNS/DNS-SD implementation on Linux systems, integrated into major distributions.

# SEE ALSO

[avahi-daemon.conf](/man/avahi-daemon.conf)(5), [avahi.hosts](/man/avahi.hosts)(5), [avahi.service](/man/avahi.service)(5), [avahi-browse](/man/avahi-browse)(1), [avahi-publish](/man/avahi-publish)(1), [avahi-dnsconfd](/man/avahi-dnsconfd)(8)
