# TAGLINE

Dynamic IP routing daemon

# TLDR

**Start** BIRD with a specific configuration file

```bird -c [/etc/bird/bird.conf]```

**Parse configuration** and check for errors

```bird -p```

**Run** in foreground with debug messages

```bird -d```

**Run** in foreground as a specific user

```bird -f -u [bird] -g [bird]```

**Start** with a custom control socket path

```bird -s [/run/bird/bird.ctl]```

# SYNOPSIS

**bird** [_options_]

# DESCRIPTION

**bird** (BIRD Internet Routing Daemon) is a dynamic IP routing daemon supporting multiple routing protocols including BGP, OSPF, RIP, and Babel. It's designed for high-performance routing on Unix-like systems.

The daemon is widely used for internet routing, particularly by ISPs and in data centers.

# PARAMETERS

**-c** _file_
> Use given configuration file instead of the default /etc/bird/bird.conf.

**-d**
> Enable debug messages to stderr and run in foreground.

**-D** _file_
> Log debugging information to given file instead of stderr.

**-f**
> Run in foreground (without debug messages).

**-p**
> Just parse the configuration file and exit. Returns zero if valid.

**-s** _socket_
> Use given filename for the control socket (default: /run/bird/bird.ctl).

**-P** _file_
> Create a PID file with the given filename.

**-u** _user_
> Drop privileges and run as given user instead of root.

**-g** _group_
> Run with given group ID.

**-l**
> Look for configuration file and control socket in the current working directory.

**-R**
> Apply graceful restart recovery after start.

**--help**
> Display command-line options.

**--version**
> Display BIRD version.

# SUPPORTED PROTOCOLS

**BGP** - Border Gateway Protocol
**OSPF** - Open Shortest Path First (v2 and v3)
**RIP** - Routing Information Protocol
**Babel** - Babel routing protocol
**BFD** - Bidirectional Forwarding Detection
**Static** - Static routes
**Kernel** - Kernel routing table sync
**Pipe** - Route copying between tables

# CONFIGURATION

**/etc/bird/bird.conf**
> Main configuration file defining routing protocols, filters, and network interfaces.

# CONTROL

Use `birdc` (BIRD client) to interact with running daemon:
```bash
birdc show protocols
birdc show route
birdc configure
```

# CAVEATS

Complex configuration for advanced setups. Requires root or network admin privileges (uses CAP_NET_ADMIN when run with **-u**). Misconfiguration can disrupt routing. In BIRD 1.x, IPv4 and IPv6 used separate daemons (bird/bird6); BIRD 2.x unified them into a single daemon.

# HISTORY

**BIRD** was developed at Charles University in Prague starting in **1998**, becoming a popular open-source routing daemon for Unix systems.

# SEE ALSO

[birdc](/man/birdc)(8), [bgpd](/man/bgpd)(8), [ip](/man/ip)(8), [route](/man/route)(8)
