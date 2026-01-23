# TLDR

**Start the DNS configuration daemon**

```avahi-dnsconfd```

**Start as a background daemon**

```avahi-dnsconfd --daemonize```

**Start with syslog** logging

```avahi-dnsconfd --syslog```

**Kill a running instance**

```avahi-dnsconfd --kill```

**Refresh DNS server data** (send SIGHUP)

```killall -HUP avahi-dnsconfd```

# SYNOPSIS

**avahi-dnsconfd** [_options_]

# PARAMETERS

**-D**, **--daemonize**
> Run as a background daemon and log to syslog

**-s**, **--syslog**
> Log to syslog instead of stderr

**-k**, **--kill**
> Kill an already running avahi-dnsconfd instance

**--refresh**
> Refresh DNS server information

**--check**
> Check if daemon is running

**-h**, **--help**
> Display help message

**-v**, **--version**
> Show version information

# DESCRIPTION

**avahi-dnsconfd** is a daemon that configures unicast DNS servers based on mDNS/DNS-SD announcements on the local network. It connects to a running **avahi-daemon** and monitors for DNS server announcements.

When a unicast DNS server is announced or removed from the network, avahi-dnsconfd executes the action script **/etc/avahi/avahi-dnsconfd.action** to update the system's DNS configuration. This provides DHCP-like DNS server discovery using mDNS.

The daemon requires avahi-daemon to be running. It is useful in environments where DNS servers are dynamically announced via Zeroconf/Bonjour protocols rather than configured through traditional DHCP.

# SIGNALS

**SIGINT**, **SIGTERM**
> Shutdown the daemon

**SIGHUP**
> Refresh DNS server data

# CAVEATS

Requires avahi-daemon to be running first. The action script must be properly configured to update DNS resolver settings. May conflict with other DNS management tools like NetworkManager or systemd-resolved if not properly integrated.

# HISTORY

**Avahi** was created by **Lennart Poettering** and **Trent Lloyd** starting in **2005** as a free implementation of Zeroconf/mDNS/DNS-SD for Linux. The avahi-dnsconfd component was designed to integrate zero-configuration DNS server discovery with traditional unicast DNS resolution, allowing networks to operate without manual DNS configuration.

# SEE ALSO

[avahi-daemon](/man/avahi-daemon)(8), [avahi-browse](/man/avahi-browse)(1), [systemd-resolved](/man/systemd-resolved)(8)
