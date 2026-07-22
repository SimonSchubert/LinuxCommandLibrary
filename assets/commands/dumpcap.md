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

**Capture without promiscuous mode** (it is on by default)

```dumpcap -i [eth0] -p -w [capture.pcapng]```

**Capture with a packet count limit**

```dumpcap -i [eth0] -c [1000] -w [capture.pcapng]```

**Apply a capture filter**

```dumpcap -i [eth0] -f "[tcp port 443]" -w [capture.pcapng]```

# SYNOPSIS

**dumpcap** [_options_]

# PARAMETERS

**-i** _interface_
> Interface to capture on. May be repeated to capture on several at once.

**-w** _file_
> Write packets to this file. Use **-** for standard output.

**-D**
> List the available interfaces and exit.

**-L**
> List the link-layer types supported by the interface and exit.

**-c** _count_
> Stop after this many packets.

**-a** _condition_:_value_
> Autostop condition: **duration**:_secs_, **filesize**:_kB_, **files**:_n_, or **packets**:_n_.

**-b** _condition_:_value_
> Ring buffer: rotate to a new file on **filesize**:_kB_, **duration**:_secs_, **interval**:_secs_, or **packets**:_n_, keeping at most **files**:_n_.

**-f** _filter_
> Capture filter in BPF syntax. Filtering in the kernel is far cheaper than capturing everything and discarding it later.

**-p**
> Do **not** put the interface into promiscuous mode. Promiscuous mode is the default, so this flag turns it off.

**-s** _snaplen_
> Snapshot length: bytes captured per packet. Useful for keeping headers while discarding payloads.

**-P**
> Write the output in pcap format instead of the default pcapng.

**-q**
> Quiet: do not print the running packet count.

# DESCRIPTION

**dumpcap** is a network traffic capture tool from the Wireshark project. It captures packets and writes them to files in pcapng or pcap format. Unlike Wireshark or tshark, dumpcap focuses solely on capture without protocol dissection.

Its whole reason for existing is **privilege separation**. Capturing packets requires elevated privileges, while dissecting them means running an enormous body of parsing code over hostile input from the network, which is the last thing you want privileged. Wireshark and tshark therefore do not capture: they run dumpcap as a small, separate, privileged helper and read the result back unprivileged. Running dumpcap directly is simply using that helper on its own.

Because it does no dissection, it is also the fastest capture path in the suite and the right choice for long-running or high-rate captures where tshark would drop packets.

# RING BUFFER

Rotate to a new file every 100 MB, keeping the 10 most recent:

```dumpcap -i [eth0] -b filesize:100000 -b files:10 -w [capture.pcapng]```

This is the standard way to capture continuously without filling the disk: the oldest file is discarded as each new one is opened. Note that **filesize** is in **kB**, so `filesize:100000` is roughly 100 MB, not 100 kB.

# CAVEATS

Capture needs root, or the `CAP_NET_RAW` and `CAP_NET_ADMIN` capabilities on the binary. Distributions usually handle this by installing dumpcap setuid-capable and restricting it to the `wireshark` group; adding yourself to that group is the supported way to capture without root, and is why running `wireshark` as root is both unnecessary and a bad idea.

Note the inverted flag: **-p** *disables* promiscuous mode, which is on by default. Promiscuous mode also does far less than people expect on a switched network, where you will see your own traffic and broadcasts regardless, and need a mirror port or a tap to see anyone else's.

Use **-f** rather than filtering later. A capture filter is compiled to BPF and runs in the kernel, so unwanted packets are never copied to userspace at all, whereas a display filter in Wireshark discards them only after they have been written to disk.

Capture files grow startlingly fast on a busy link. A ring buffer, a snaplen, or both are the difference between a useful capture and a full disk.

# HISTORY

dumpcap is part of the **Wireshark** project, which **Gerald Combs** started in **1998** under the name **Ethereal**. It was split out of the main application after a long run of security advisories in the dissectors made the risk of a privileged monolith untenable: with the split, only the few hundred lines that actually touch the network run with elevated rights, while the millions of lines of protocol parsing do not.

# INSTALL

```apt: sudo apt install wireshark-common```

```apk: sudo apk add wireshark-common```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[wireshark](/man/wireshark)(1), [tshark](/man/tshark)(1), [tcpdump](/man/tcpdump)(1), [editcap](/man/editcap)(1)

# RESOURCES

```[Source code](https://gitlab.com/wireshark/wireshark)```

```[Homepage](https://www.wireshark.org)```

```[Documentation](https://www.wireshark.org/docs/man-pages/dumpcap.html)```

<!-- verified: 2026-07-14 -->

