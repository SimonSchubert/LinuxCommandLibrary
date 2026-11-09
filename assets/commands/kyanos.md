# TAGLINE

eBPF-based network analysis and tracing tool

# TLDR

**Watch HTTP traffic**

```kyanos watch http```

**Watch traffic on specific remote ports**

```kyanos watch --remote-ports [6379,16379]```

**Watch traffic on specific local ports**

```kyanos watch --local-ports [8080]```

**Watch HTTP traffic for one path**

```kyanos watch http --path [/foo/bar]```

**Watch traffic filtered by process ID**

```kyanos watch --pids [1234]```

**Watch traffic filtered by container ID**

```kyanos watch --container-id [abc123]```

**Watch Redis traffic filtered by key**

```kyanos watch redis --keys [my-key1,my-key2]```

**Show network statistics**

```kyanos stat```

**Find the slowest requests** in the last 5 seconds

```kyanos stat --slow --time [5]```

**Find the largest HTTP responses**

```kyanos stat http --bigresp```

**Show an overview of external dependencies**

```kyanos overview```

# SYNOPSIS

**kyanos** _command_ [_options_]

# PARAMETERS

**watch** [_protocol_]
> Capture requests and responses. Protocols: http, redis, mysql, rocketmq, mongodb, dns, kafka.

**stat** [_protocol_]
> Aggregate request/response statistics.

**overview**
> Show the external dependencies the machine talks to.

**-p**, **--pids** _PIDS_
> Filter by comma-separated process IDs.

**--comm** _NAME_
> Filter by process name.

**--remote-ports** _PORTS_, **--local-ports** _PORTS_
> Filter by comma-separated remote or local ports.

**--remote-ips** _IPS_
> Filter by comma-separated remote IPs.

**--container-id** _ID_, **--container-name** _NAME_
> Filter by container.

**--pod-name** _NAME.NAMESPACE_
> Filter by Kubernetes pod.

**--latency** _MS_
> Only requests slower than this many milliseconds.

**--req-size** _BYTES_, **--resp-size** _BYTES_
> Only requests or responses larger than this size.

**--side** _SIDE_
> Filter by connection side: server or client (default: all).

**--max-records** _N_
> Limit the number of table records for watch (default: 100).

**--json-output** _DEST_
> Output watch records as JSON to **stdout** or a file.

**-m**, **--metric** _METRICS_
> For stat and overview: t (total time), q (request size), p (response size), n (network time), s (socket time).

**-g**, **--group-by** _FIELD_
> For stat: conn, remote-ip, remote-port, local-port, protocol, or http-path.

**--slow**, **--bigreq**, **--bigresp**
> For stat: find the slowest records, biggest requests, or biggest responses.

**--time** _SECONDS_
> For stat: collection time.

**--btf** _FILE_
> Use the specified kernel BTF file.

**-d**, **--debug**
> Print more logs.

# DESCRIPTION

**kyanos** is a networking analysis tool using eBPF that can visualize the time packets spend in the kernel, capture requests and responses for protocols like HTTP, Redis, MySQL, Kafka, MongoDB, RocketMQ, and DNS, and make troubleshooting more efficient.

It provides three subcommands: **watch** for capturing network traffic with filtering by IP, port, process, container, or protocol-level details; **stat** for aggregating request/response data with statistical information; and **overview** for displaying external resources the machine depends on. It can also automatically decrypt SSL traffic.

The tool provides kernel-level trace points showing packet journey from network card arrival to kernel socket buffer, displayed in a visual format to identify exactly which stage causes delays.

# CAVEATS

Requires Linux kernel version 3.10 (from 3.10.0-957) or 4.14 and above. Needs root privileges for eBPF operations. Only available for amd64 and arm64 architectures.

# HISTORY

**kyanos** was created by **hengyoush** and is written in **Go** with **C** for eBPF programs. It was designed as a lightweight, nearly zero-dependency network analysis tool: just a single binary.

# SEE ALSO

[tcpdump](/man/tcpdump)(8), [wireshark](/man/wireshark)(1), [bpftrace](/man/bpftrace)(8)

# RESOURCES

```[Source code](https://github.com/hengyoush/kyanos)```

```[Documentation](https://kyanos.io/)```

<!-- verified: 2026-11-09 -->
