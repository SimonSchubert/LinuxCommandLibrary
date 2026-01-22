# TLDR

**Start** BIRD daemon

```bird -c [/etc/bird/bird.conf]```

**Check** configuration

```bird -p [/etc/bird/bird.conf]```

**Run** in foreground

```bird -d```

# SYNOPSIS

**bird** [_options_]

# DESCRIPTION

**bird** (BIRD Internet Routing Daemon) is a dynamic IP routing daemon supporting multiple routing protocols including BGP, OSPF, RIP, and Babel. It's designed for high-performance routing on Unix-like systems.

The daemon is widely used for internet routing, particularly by ISPs and in data centers.

# PARAMETERS

**-c** _file_
> Configuration file

**-d**
> Debug mode (foreground)

**-D** _file_
> Debug output file

**-p**
> Parse config and exit

**-s** _socket_
> Control socket path

**-P** _file_
> PID file

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

Example /etc/bird/bird.conf:
```
router id 192.0.2.1;

protocol kernel {
    ipv4 {
        export all;
    };
}

protocol bgp {
    local as 65001;
    neighbor 192.0.2.2 as 65002;
    ipv4 {
        import all;
        export all;
    };
}
```

# CONTROL

Use `birdc` (BIRD client) to interact with running daemon:
```bash
birdc show protocols
birdc show route
birdc configure
```

# CAVEATS

Complex configuration for advanced setups. Requires root/network admin privileges. Misconfiguration can disrupt routing. IPv4 and IPv6 use separate instances (bird/bird6 on some systems). Not suitable for beginners.

# HISTORY

**BIRD** was developed at Charles University in Prague starting in **1998**, becoming a popular open-source routing daemon for Unix systems.

# SEE ALSO

[birdc](/man/birdc)(8), [bgpd](/man/bgpd)(8), [quagga](/man/quagga)(8)
