# TAGLINE

uses ICMP ECHO_REQUEST packets to test network connectivity to a host

# TLDR

**Ping a host** continuously

```ping [host]```

**Ping a host** a specific number of times

```ping -c [5] [host]```

**Ping with a specific interval** (seconds)

```ping -i [0.5] [host]```

**Ping with a specific packet size**

```ping -s [1024] [host]```

**Ping with a specific TTL**

```ping -t [64] [host]```

**Ping and show only summary** statistics

```ping -q -c [10] [host]```

**Ping using IPv6**

```ping6 [host]```

**Ping with audible alert** on response

```ping -a [host]```

# SYNOPSIS

**ping** [_options_] _destination_

**ping6** [_options_] _destination_

# PARAMETERS

**-c** _COUNT_
> Stop after sending COUNT packets

**-i** _INTERVAL_
> Wait INTERVAL seconds between packets (default: 1)

**-s** _SIZE_
> Packet data size in bytes (default: 56, total 64 with ICMP header)

**-t** _TTL_
> Set IP Time To Live

**-w** _DEADLINE_
> Exit after DEADLINE seconds regardless of packets

**-W** _TIMEOUT_
> Wait TIMEOUT seconds for each response

**-q**
> Quiet output; only show summary

**-v**
> Verbose output

**-a**
> Audible ping (beep on reply)

**-f**
> Flood ping; send packets as fast as possible (root only)

**-n**
> Numeric output only; don't resolve hostnames

**-4**
> Use IPv4 only

**-6**
> Use IPv6 only

**-I** _INTERFACE_
> Use specified network interface or address

**-R**
> Record route (IPv4, may be ignored by hosts)

**-D**
> Print timestamps

**-Q** _TOS_
> Set Quality of Service bits

**-p** _PATTERN_
> Fill packet with specified pattern bytes

# DESCRIPTION

**ping** uses ICMP ECHO_REQUEST packets to test network connectivity to a host. It measures round-trip time (RTT) and packet loss, making it essential for network troubleshooting and monitoring.

Each response shows the sequence number, TTL, and time in milliseconds. The TTL value indicates how many router hops occurred (starting from the remote host's initial TTL, typically 64 or 255). Statistics at the end show packets transmitted/received, loss percentage, and RTT min/avg/max/mdev.

The command requires network access and may need root privileges for some options like flood ping. On many systems, **ping6** or **ping -6** is used for IPv6 targets.

# CAVEATS

Some hosts and firewalls block ICMP packets, causing ping to fail even when the host is reachable. Flood ping (**-f**) can overwhelm networks and should be used carefully. The **-R** record route option is often ignored by modern routers for security reasons. Very small intervals require root privileges.

# HISTORY

The ping command was written by **Mike Muuss** at the US Army Ballistic Research Laboratory in **December 1983**. The name comes from the sound of sonar, reflecting its purpose of testing if a remote host is "there". Muuss wrote it to diagnose network problems and it became one of the most widely used network utilities. The original implementation was for BSD Unix and has since been ported to virtually every operating system.

# SEE ALSO

[traceroute](/man/traceroute)(8), [mtr](/man/mtr)(8), [netstat](/man/netstat)(8), [ss](/man/ss)(8)
