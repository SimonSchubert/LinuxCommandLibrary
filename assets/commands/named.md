# TAGLINE

DNS server daemon from BIND

# TLDR

**Start** DNS server with default configuration

```named```

Use a **custom configuration** file

```named -c [path/to/named.conf]```

Use **IPv4 only**

```named -4```

Use **IPv6 only**

```named -6```

Listen on a **specific port** instead of 53

```named -p [port]```

Run in **foreground** (don't daemonize)

```named -f```

# SYNOPSIS

**named** [**-4**|**-6**] [**-c** _config-file_] [**-p** _port_] [**-f**] [**-g**] [**-u** _user_]

# PARAMETERS

**-4**
> Use IPv4 only, even if IPv6 is available

**-6**
> Use IPv6 only, even if IPv4 is available

**-c _config-file_**
> Use specified configuration file instead of /etc/named.conf

**-p _port_**
> Listen on specified port instead of default 53

**-f**
> Run in foreground; do not daemonize

**-g**
> Run in foreground with logging to stderr

**-u _user_**
> Run as specified user after binding to privileged ports

**-t _directory_**
> Chroot to specified directory after startup

**-n _cpus_**
> Number of CPUs to use for worker threads

**-d _debug-level_**
> Set debug level (higher = more verbose)

# DESCRIPTION

**named** is the DNS (Domain Name System) server daemon from BIND (Berkeley Internet Name Domain). It resolves domain names to IP addresses and vice versa, serving DNS queries from clients.

The server reads zone files and configuration from /etc/named.conf by default. It can act as an authoritative server for domains, a recursive resolver, or both. The daemon typically runs as a system service managed by systemd.

# CAVEATS

Requires root privileges to bind to port 53. Should run as unprivileged user (-u) after startup for security. Misconfigured DNS servers can be exploited for amplification attacks. Zone file syntax errors prevent startup.

# HISTORY

**BIND** (Berkeley Internet Name Domain) was originally developed at UC Berkeley in the early 1980s. It is the most widely used DNS server software on the Internet. The Internet Systems Consortium (ISC) currently maintains BIND.

# SEE ALSO

[rndc](/man/rndc)(8), [dig](/man/dig)(1), [nslookup](/man/nslookup)(1), [named.conf](/man/named.conf)(5)
