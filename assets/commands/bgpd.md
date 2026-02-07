# TAGLINE

Border Gateway Protocol routing daemon

# TLDR

**Start bgpd** with default configuration

```bgpd```

**Start with a specific configuration file**

```bgpd -f [/etc/bgpd.conf]```

**Run in foreground** with debug output

```bgpd -d```

**Check configuration syntax** without starting

```bgpd -n```

**Start with verbose logging**

```bgpd -v```

# SYNOPSIS

**bgpd** [**-dnv**] [**-D** _macro=value_] [**-f** _file_]

# DESCRIPTION

**bgpd** is the Border Gateway Protocol daemon from the OpenBGPD project. It manages BGP sessions with peer routers and maintains the Routing Information Base (RIB) for exchanging routing information between autonomous systems.

BGP is the protocol that makes the Internet work by enabling routing between different networks (autonomous systems). bgpd implements BGP-4 and supports features like route filtering, communities, local preference, MED, and AS path manipulation.

The daemon reads its configuration from /etc/bgpd.conf, which defines neighbors, filters, and routing policies. It runs as an unprivileged user after initialization and communicates with bgpctl for runtime management.

# PARAMETERS

**-d**
> Run in foreground, do not daemonize.

**-D** _macro=value_
> Define a macro to be used in config.

**-f** _file_
> Use specified configuration file.

**-n**
> Check configuration syntax only.

**-v**
> Produce verbose output.

**-V**
> Show version information.

# CAVEATS

Running a BGP daemon on the public Internet requires coordination with upstream providers and valid AS number assignment. Misconfiguration can cause routing issues affecting network connectivity. bgpd requires root privileges to start but drops privileges after initialization. Configuration changes typically require a restart or reload signal.

# HISTORY

**OpenBGPD** was developed starting in **2003** by Henning Brauer and Claudio Jeker for **OpenBSD** as part of the OpenBSD networking stack. It was created to provide a secure, clean BGP implementation after vulnerabilities and complexity issues with other routing daemons. The portable version for Linux and FreeBSD has been maintained since **2016**. OpenBGPD is used by ISPs and network operators valuing its simplicity and security.

# SEE ALSO

[bgpctl](/man/bgpctl)(8), [bgpd.conf](/man/bgpd.conf)(5), [ospfd](/man/ospfd)(8), [bird](/man/bird)(8)
