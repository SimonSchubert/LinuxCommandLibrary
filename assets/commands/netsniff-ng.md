# TAGLINE

high-performance packet sniffer

# TLDR

**Capture from an interface to a pcap file**

```netsniff-ng --in [eth0] --out [capture.pcap]```

**Replay a pcap file** onto the network

```netsniff-ng --in [capture.pcap] --out [eth0]```

**Apply a tcpdump/BPF filter** while capturing

```netsniff-ng --in [eth0] --out [capture.pcap] "[tcp port 80]"```

**Capture and print packets** to the console (no file)

```netsniff-ng --in [eth0] --out - --verbose```

**Rotate output** into a directory, one file per interval

```netsniff-ng --in [eth0] --out [dir/] --interval [60sec]```

**Set the kernel ring buffer size** for high-speed capture

```netsniff-ng --in [eth0] --out [capture.pcap] --ring-size [64MiB]```

# SYNOPSIS

**netsniff-ng** [_options_] [_filter-expression_]

# PARAMETERS

**-i**, **-d**, **--in**, **--dev** _INPUT_
> Input source: a network device, a pcap file, or **-** for stdin.

**-o**, **--out** _OUTPUT_
> Output sink: a network device, a pcap file, a directory (with --interval), or **-** for stdout.

**-f**, **--filter** _EXPR_
> Apply a low-level (BPF) or high-level (tcpdump-style) packet filter. A bare filter expression on the command line is also accepted.

**--ring-size** _SIZE_
> Set the mmap ring buffer size, e.g. **10MiB**, **1GiB**.

**-F**, **--interval** _NUM_
> When writing to a directory, start a new pcap file every NUM packets, or by time/size (e.g. **60sec**, **100MiB**).

**-s**, **--silent**
> Do not print captured packets to the console.

**-V**, **--verbose**
> Print/dump each captured packet in verbose form.

**-T**, **--magic** _PCAP_MAGIC_
> Set the pcap file format magic (link-layer/timestamp variant).

**-b**, **--bind-cpu** _CPU_
> Pin the capture process to the given CPU.

**-H**, **--prio-high**
> Run the process with high scheduling priority.

**-V**, **--version**, **-h**, **--help**
> Show version or help information.

# DESCRIPTION

**netsniff-ng** is a high-performance, zero-copy network analyzer, packet capture and replay tool. It uses the Linux kernel's **PACKET_MMAP** RX_RING/TX_RING interface to move packets between kernel and user space without copying, allowing capture and transmission close to line rate.

It can capture live traffic to a pcap file, replay a pcap back onto an interface, and rotate captures into per-interval files for long-running collection. Filtering accepts both raw BPF and tcpdump-style expressions.

# CAVEATS

Requires root (or **CAP_NET_RAW** / **CAP_NET_ADMIN**). It is part of the netsniff-ng toolkit, which also includes trafgen, mausezahn, ifpps, flowtop, and astraceroute. Some link types and timestamp formats depend on driver and kernel support.

# HISTORY

**netsniff-ng** was created by **Daniel Borkmann** in **2009** as a free, Linux-native, zero-copy packet analyzer, and grew into the broader netsniff-ng networking toolkit. It is licensed under the GPLv2.

# INSTALL

```apt: sudo apt install netsniff-ng```

```dnf: sudo dnf install netsniff-ng```

```pacman: sudo pacman -S netsniff-ng```

```zypper: sudo zypper install netsniff-ng```

```nix: nix profile install nixpkgs#netsniff-ng```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [tshark](/man/tshark)(1)

