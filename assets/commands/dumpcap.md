# TAGLINE

network packet capture engine

# TLDR

**Capture on default interface**

```dumpcap -i [eth0] -w [capture.pcapng]```

**List available interfaces**

```dumpcap -D```

**Capture with ring buffer**

```dumpcap -i [eth0] -b filesize:100000 -w [capture.pcapng]```

**Capture with duration limit**

```dumpcap -i [eth0] -a duration:60 -w [capture.pcapng]```

**Capture in promiscuous mode**

```dumpcap -i [eth0] -p -w [capture.pcapng]```

**Capture with packet count limit**

```dumpcap -i [eth0] -c [1000] -w [capture.pcapng]```

# SYNOPSIS

**dumpcap** [_options_]

# PARAMETERS

**-i** _interface_
> Interface to capture on.

**-w** _file_
> Output file name.

**-D**
> List available interfaces.

**-c** _count_
> Stop after capturing count packets.

**-a** _condition_
> Stop condition: duration, filesize, files.

**-b** _option_
> Ring buffer option: filesize, duration, files.

**-f** _filter_
> Capture filter (BPF syntax).

**-p**
> Don't capture in promiscuous mode.

**-s** _snaplen_
> Packet snapshot length.

**-q**
> Quiet mode; less output.

# DESCRIPTION

**dumpcap** is a network traffic capture tool from the Wireshark project. It captures packets and writes them to files in pcapng or pcap format. Unlike Wireshark or tshark, dumpcap focuses solely on capture without protocol dissection.

The tool is designed for minimal resource usage and long-running captures. It supports ring buffers for continuous capture with automatic file rotation, making it suitable for network monitoring.

# RING BUFFER EXAMPLE

```bash
# Rotate files every 100MB, keep 10 files
dumpcap -i eth0 -b filesize:100000 -b files:10 -w capture.pcapng
```

# CAVEATS

Requires root or CAP_NET_RAW capability. Capture files can grow large quickly. Ring buffer helps manage disk space. No packet analysis; use tshark or Wireshark for dissection. Performance is better than tshark for high-speed capture.

# HISTORY

dumpcap is part of the **Wireshark** project, originally **Ethereal**, created by **Gerald Combs** in **1998**. It was separated from the main application to provide a dedicated capture engine that could run with elevated privileges while analysis runs unprivileged.

# SEE ALSO

[wireshark](/man/wireshark)(1), [tshark](/man/tshark)(1), [tcpdump](/man/tcpdump)(1), [pcap](/man/pcap)(3)
