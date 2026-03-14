# TAGLINE

eBPF-based network analysis and tracing tool

# TLDR

**Watch HTTP traffic**

```kyanos watch http```

**Watch traffic on a specific port**

```kyanos watch --port [port]```

**Watch traffic filtered by process ID**

```kyanos watch --pids [1234]```

**Watch traffic filtered by container ID**

```kyanos watch --container-id [abc123]```

**Watch Redis traffic filtered by key**

```kyanos watch redis --keys [my-key1,my-key2]```

**Show network statistics**

```kyanos stat```

**Show an overview of external dependencies**

```kyanos overview```

# SYNOPSIS

**kyanos** _command_ [_options_]

# DESCRIPTION

**kyanos** is a networking analysis tool using eBPF that can visualize the time packets spend in the kernel, capture requests and responses for protocols like HTTP, Redis, and MySQL, and make troubleshooting more efficient.

It provides three subcommands: **watch** for capturing network traffic with filtering by IP, port, process, container, or protocol-level details; **stat** for aggregating request/response data with statistical information; and **overview** for displaying external resources the machine depends on. It can also automatically decrypt SSL traffic.

The tool provides kernel-level trace points showing packet journey from network card arrival to kernel socket buffer, displayed in a visual format to identify exactly which stage causes delays.

# CAVEATS

Requires Linux kernel version 3.10 (from 3.10.0-957) or 4.14 and above. Needs root privileges for eBPF operations. Only available for amd64 and arm64 architectures.

# HISTORY

**kyanos** was created by **hengyoush** and is written in **Go** with **C** for eBPF programs. It was designed as a lightweight, nearly zero-dependency network analysis tool — just a single binary.

# SEE ALSO

[tcpdump](/man/tcpdump)(8), [wireshark](/man/wireshark)(1), [bpftrace](/man/bpftrace)(8)
