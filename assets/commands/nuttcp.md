# TAGLINE

network performance measurement tool

# TLDR

**Start server**

```nuttcp -S```

**Test throughput to server**

```nuttcp [server_ip]```

**Test UDP throughput**

```nuttcp -u [server_ip]```

**Specify bandwidth limit**

```nuttcp -R [100M] [server_ip]```

**Test for specific duration**

```nuttcp -T [30] [server_ip]```

**Receiver mode** (reverse direction test)

```nuttcp -r [server_ip]```

**Use multiple parallel streams**

```nuttcp -N [4] [server_ip]```

**Test with interval reporting** every second

```nuttcp -i [1] [server_ip]```

# SYNOPSIS

**nuttcp** [_options_] [_host_]

# PARAMETERS

**-S**
> Server mode.

**-u**
> UDP mode (default TCP).

**-R** _rate_
> Rate limit (K, M, G).

**-T** _time_
> Test duration.

**-t**
> Transmitter mode.

**-r**
> Receiver mode.

**-p** _port_
> Data port.

**-P** _port_
> Control port.

**-w** _size_
> Window size (socket buffer size).

**-N** _nstream_
> Number of parallel data streams (default 1, max 128).

**-i** _interval_
> Interval reporting in seconds.

**-l** _buflen_
> Length of network read/write buffer in bytes.

**-s**
> Use stdin/stdout for data (enables disk-to-network transfers).

**-F**
> Flip direction of data connection open (useful with firewalls/NAT).

**-b**
> Brief one-line output (default format).

# DESCRIPTION

**nuttcp** is a network performance measurement tool. It measures TCP and UDP throughput between systems, providing detailed statistics about network performance.

nuttcp is similar to iperf but includes features such as server mode, rate limiting, multiple parallel streams, and timer-based usage. It also supports IPv6, IPv4 multicast, and setting TOS/DSCP bits.

# EXAMPLE OUTPUT

```
   84.8594 MB /  10.00 sec =   71.1477 Mbps 0 retrans
```

# CAVEATS

Requires server on remote end. Firewall must allow ports. UDP tests may show packet loss. Results affected by other traffic.

# HISTORY

nuttcp was developed by **Bill Fink** at NLANR/DAST as a network testing tool, building on the earlier ttcp.

# SEE ALSO

[iperf3](/man/iperf3)(1), [iperf](/man/iperf)(1), [netperf](/man/netperf)(1), [tc](/man/tc)(8)
