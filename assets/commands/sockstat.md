# TLDR

Show **all sockets** (IPv4 and IPv6, listening and connected)

```sockstat```

Show **IPv4 listening** sockets on specific ports

```sockstat -4 -l -p [port1,port2]```

Show **connected** and **Unix** sockets

```sockstat -cu```

Filter by **process** ID or name

```sockstat -P [pid|process]```

Filter by **user**

```sockstat -U [uid|user]```

Filter by **group**

```sockstat -G [gid|group]```

Filter by **protocol**

```sockstat -R [tcp|udp|raw|unix]```

# SYNOPSIS

**sockstat** [**-46clouh**] [**-p** _ports_] [**-P** _pid|process_] [**-U** _uid|user_] [**-G** _gid|group_] [**-R** _protocol_]

# PARAMETERS

**-4**
> Show only IPv4 sockets

**-6**
> Show only IPv6 sockets

**-u**
> Include Unix domain sockets

**-c**
> Show only connected sockets

**-l**
> Show only listening sockets

**-o**
> Apply filters with OR logic instead of AND

**-p** _ports_
> Filter by ports (comma-separated or ranges like 80-443)

**-P** _pid|process_
> Filter by process ID or process name

**-U** _uid|user_
> Filter by user ID or username

**-G** _gid|group_
> Filter by group ID or group name

**-R** _protocol_
> Filter by protocol (tcp, udp, raw, unix)

**-h**
> Display help

# DESCRIPTION

**sockstat** lists open Internet and Unix domain sockets on the system. It displays information about which processes have which sockets open, useful for network troubleshooting and security auditing.

Output includes USER, COMMAND, PID, FD (file descriptor), PROTO (protocol), LOCAL ADDRESS, and FOREIGN ADDRESS for Internet sockets. Multiple filters can be combined to narrow results.

# CAVEATS

Requires appropriate permissions to see all sockets; root can see everything. On Linux, similar functionality is provided by **ss** or **netstat**. The sockstat command originated on BSD systems and may not be available on all Linux distributions.

# HISTORY

**sockstat** originated on **FreeBSD** and other BSD systems as a user-friendly alternative to parsing /proc or using netstat. Linux versions provide similar functionality. The tool has been part of BSD since the late **1990s** and was ported to Linux as part of various utility packages.

# SEE ALSO

[ss](/man/ss)(8), [netstat](/man/netstat)(8), [lsof](/man/lsof)(8), [fuser](/man/fuser)(1)
