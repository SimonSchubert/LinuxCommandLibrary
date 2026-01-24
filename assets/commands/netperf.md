# TLDR

**Run TCP throughput test**

```netperf -H [hostname]```

**Run UDP test**

```netperf -H [hostname] -t UDP_STREAM```

**Run latency test**

```netperf -H [hostname] -t TCP_RR```

**Run test for specific duration**

```netperf -H [hostname] -l [30]```

**Specify message size**

```netperf -H [hostname] -- -m [1024]```

**Run with multiple connections**

```netperf -H [hostname] -C -c```

**Start netserver** (on remote host)

```netserver```

# SYNOPSIS

**netperf** [_-H host_] [_-t test_] [_-l duration_] [_options_] [_-- test_options_]

# PARAMETERS

**-H** _HOST_
> Remote host running netserver.

**-t** _TEST_
> Test type (TCP_STREAM, UDP_STREAM, TCP_RR, etc.).

**-l** _SECONDS_
> Test duration.

**-p** _PORT_
> Port for control connection.

**-P** _PORT_
> Port for data connection.

**-c**
> Report local CPU utilization.

**-C**
> Report remote CPU utilization.

**-f** _UNITS_
> Output format (K, M, G for bits/bytes).

**-v** _LEVEL_
> Verbosity level.

**-- -m** _SIZE_
> Message size for test.

**-- -s** _SIZE_
> Local socket buffer size.

**-- -S** _SIZE_
> Remote socket buffer size.

# DESCRIPTION

**netperf** measures network throughput and latency. It consists of netperf (client) and netserver (server running on the remote host).

TCP_STREAM tests bulk data transfer throughput. It measures how fast data can be pushed through a TCP connection, useful for evaluating network capacity.

UDP_STREAM tests UDP throughput without TCP's overhead. Results show raw network capability but may include packet loss.

TCP_RR (request/response) measures latency - how long round trips take. This is critical for interactive applications and databases.

CPU utilization reporting helps identify whether the network or CPU limits performance. High CPU use during network tests suggests the endpoint is the bottleneck.

Socket buffer sizes affect performance. Larger buffers improve throughput on high-latency links but increase memory use.

# CAVEATS

Requires netserver on remote host. Firewall may block connections. Results affected by other network traffic. CPU measurement needs privileges on some systems.

# HISTORY

**netperf** was developed by **Hewlett-Packard** starting in the **1990s** as a network benchmarking tool. It became a standard for measuring network performance, used in countless benchmarks and academic papers.

# SEE ALSO

[iperf3](/man/iperf3)(1), [nuttcp](/man/nuttcp)(1), [ping](/man/ping)(1), [netcat](/man/netcat)(1)
