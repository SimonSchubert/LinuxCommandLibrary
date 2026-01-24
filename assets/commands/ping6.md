# TLDR

**Ping IPv6 address**

```ping6 [2001:db8::1]```

**Ping hostname**

```ping6 [ipv6.example.com]```

**Limit packet count**

```ping6 -c [5] [host]```

**Set interval**

```ping6 -i [2] [host]```

**Set packet size**

```ping6 -s [1000] [host]```

**Flood ping**

```ping6 -f [host]```

**Quiet output**

```ping6 -q -c [10] [host]```

**Specify interface**

```ping6 -I [eth0] [fe80::1]```

# SYNOPSIS

**ping6** [_-c count_] [_-i interval_] [_-s size_] [_-I interface_] [_options_] _destination_

# PARAMETERS

**-c** _COUNT_
> Stop after count packets.

**-i** _INTERVAL_
> Seconds between packets.

**-s** _SIZE_
> Packet data size.

**-I** _INTERFACE_
> Source interface.

**-q**
> Quiet output.

**-f**
> Flood mode.

**-t** _TTL_
> Time to live.

**-w** _DEADLINE_
> Timeout in seconds.

# DESCRIPTION

**ping6** sends ICMPv6 echo requests to IPv6 hosts. It tests network connectivity and measures latency.

Link-local addresses require interface specification. The -I option binds to specific network interface.

Statistics show packet loss and round-trip times. Minimum, average, and maximum latency are reported.

Flood mode tests network under load. Requires root privileges.

Many systems now use ping for both IPv4 and IPv6. The separate ping6 command remains for compatibility.

# CAVEATS

Firewalls may block ICMPv6. Link-local requires interface. Flood ping requires root.

# HISTORY

**ping6** appeared with IPv6 implementations in the **1990s**. On many modern systems, the **ping** command handles both protocols, making ping6 a compatibility alias.

# SEE ALSO

[ping](/man/ping)(1), [traceroute6](/man/traceroute6)(1), [ip](/man/ip)(8)
