# TLDR

Show all **TCP/UDP/RAW/UNIX sockets**

```ss -a -t```

Show all **listening** sockets

```ss -l```

Show all TCP sockets with **process** information

```ss -tp```

Show all TCP sockets connected to local **HTTPS port**

```ss -t src :443```

Show all TCP sockets **listening** on port 8080

```ss -lt src :8080```

Show **established** SSH connections

```ss -o state established '( dport = :ssh or sport = :ssh )'```

**Kill** a socket connection

```ss -K dst 192.168.1.1 dport = 22```

Print **summary** statistics

```ss -s```

# SYNOPSIS

**ss** [_options_] [_FILTER_]

# DESCRIPTION

**ss** is used to dump socket statistics. It displays information similar to netstat but can show more TCP and state information than other tools. It retrieves socket information directly from kernel space, making it faster than netstat.

# PARAMETERS

**-h, --help**
> Show summary of options

**-a, --all**
> Display both listening and non-listening sockets

**-l, --listening**
> Display only listening sockets

**-n, --numeric**
> Do not resolve service names; show numeric ports

**-r, --resolve**
> Attempt to resolve numeric address/ports

**-p, --processes**
> Show process using socket

**-t, --tcp**
> Display TCP sockets

**-u, --udp**
> Display UDP sockets

**-x, --unix**
> Display Unix domain sockets

**-w, --raw**
> Display raw sockets

**-4, --ipv4**
> Display IPv4 sockets only

**-6, --ipv6**
> Display IPv6 sockets only

**-o, --options**
> Show timer information

**-e, --extended**
> Show detailed socket information (UID, inode, cookie)

**-m, --memory**
> Show socket memory usage

**-i, --info**
> Show internal TCP information

**-K, --kill**
> Forcibly close sockets

**-s, --summary**
> Print summary statistics

**-E, --events**
> Continually display sockets as they are destroyed

**-N, --net=NSNAME**
> Switch to specified network namespace

# CAVEATS

State filtering supports TCP states (established, syn-sent, syn-recv, fin-wait-1, fin-wait-2, time-wait, closed, close-wait, last-ack, listening, closing) and meta-states (all, connected, synchronized, bucket). The **-K** option requires appropriate privileges.

# HISTORY

**ss** is part of the **iproute2** package and was developed as a modern replacement for **netstat**. It provides faster performance by reading directly from kernel netlink sockets rather than parsing /proc files.

# SEE ALSO

[ip](/man/ip)(8), [netstat](/man/netstat)(8), [lsof](/man/lsof)(8)
