# TAGLINE

server for netperf testing

# TLDR

**Start netserver**

```netserver```

**Specify port**

```netserver -p [12865]```

**Debug mode**

```netserver -D```

**Bind to address**

```netserver -L [192.168.1.10]```

**Set IPv4 mode**

```netserver -4```

**Set IPv6 mode**

```netserver -6```

# SYNOPSIS

**netserver** [_options_]

# PARAMETERS

**-p** _PORT_
> Listen port (default 12865).

**-D**
> Do not daemonize; run in foreground (debug).

**-d**
> Increase debug verbosity.

**-L** _ADDR_
> Local bind address.

**-N**
> No control connection; standalone data mode.

**-f**
> Do not spawn on demand; remain in foreground.

**-v** _LEVEL_
> Verbosity level.

**-4**
> IPv4 only.

**-6**
> IPv6 only.

**--help**
> Display help information.

# DESCRIPTION

**netserver** is the server for netperf testing. It receives network performance tests.

The tool handles benchmark requests. Run on target machine for throughput tests.

# CAVEATS

Requires netperf client. Opens network port. Performance testing tool.

# HISTORY

netserver is part of **netperf**, created by HP for network performance measurement.

# SEE ALSO

[netperf](/man/netperf)(1), [iperf](/man/iperf)(1), [iperf3](/man/iperf3)(1), [nuttcp](/man/nuttcp)(1)

