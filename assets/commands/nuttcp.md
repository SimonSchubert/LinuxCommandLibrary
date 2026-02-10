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

**Bidirectional test**

```nuttcp -r [server_ip]```

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
> Window size.

# DESCRIPTION

**nuttcp** is a network performance measurement tool. It measures TCP and UDP throughput between systems, providing detailed statistics about network performance.

nuttcp is similar to iperf but with some different features and reporting format.

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
