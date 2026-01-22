# TLDR

**Show all connections** and listening ports

```netstat -a```

**Show listening ports only**

```netstat -l```

**Show TCP connections** with numeric addresses

```netstat -tn```

**Show listening ports with process IDs**

```sudo netstat -tulnp```

**Show routing table**

```netstat -r```

**Show network interface statistics**

```netstat -i```

**Show protocol statistics**

```netstat -s```

**Continuously refresh** connection status

```netstat -c```

# SYNOPSIS

**netstat** [_options_]

**netstat** {--route|-r} [_options_]

**netstat** {--interfaces|-i} [_options_]

**netstat** {--statistics|-s} [_options_]

# PARAMETERS

**-a**, **--all**
> Show both listening and non-listening sockets

**-l**, **--listening**
> Show only listening sockets

**-t**, **--tcp**
> Show TCP connections

**-u**, **--udp**
> Show UDP connections

**-n**, **--numeric**
> Show numeric addresses instead of resolving names

**-p**, **--program**
> Show PID and program name for each socket

**-r**, **--route**
> Display kernel routing table

**-i**, **--interfaces**
> Display network interface table

**-g**, **--groups**
> Display multicast group membership

**-s**, **--statistics**
> Display protocol statistics (SNMP)

**-M**, **--masquerade**
> Display masqueraded connections

**-c**, **--continuous**
> Refresh display every second

**-e**, **--extend**
> Display extended information (use twice for more)

**-o**, **--timers**
> Include networking timer information

**-v**, **--verbose**
> Verbose output

**-W**, **--wide**
> Don't truncate IP addresses

**-4**
> Show IPv4 only

**-6**
> Show IPv6 only

**-A** _FAMILY_
> Address families (inet, inet6, unix, ipx, etc.)

# DESCRIPTION

**netstat** displays network connections, routing tables, interface statistics, masquerade connections, and multicast memberships. It is a traditional tool for network troubleshooting and monitoring.

Without options, netstat shows open sockets. The most common usage (**netstat -tulnp**) shows TCP and UDP listening ports with process information and numeric addresses. The routing table (**-r**) shows how packets are directed, while interface statistics (**-i**) show traffic and errors per network interface.

Output columns include: **Proto** (protocol), **Recv-Q/Send-Q** (data queued), **Local/Foreign Address** (endpoints), **State** (connection state like LISTEN, ESTABLISHED, TIME_WAIT), and optionally **PID/Program** (process using the socket).

# CAVEATS

netstat is considered obsolete on Linux; **ss** is the recommended replacement with better performance and more features. Showing process information (**-p**) requires root privileges. Name resolution can slow output significantly; use **-n** for faster results. Some options may vary between Unix implementations.

# HISTORY

netstat originated in **BSD Unix** in the early 1980s as part of the original TCP/IP implementation. It became a standard networking tool across all Unix-like systems and Windows. On Linux, netstat was part of the **net-tools** package, which is now deprecated in favor of the **iproute2** suite. The **ss** command from iproute2, introduced around **2001**, provides similar functionality with better performance by reading directly from kernel data structures.

# SEE ALSO

[ss](/man/ss)(8), [ip](/man/ip)(8), [lsof](/man/lsof)(8), [ifconfig](/man/ifconfig)(8)
