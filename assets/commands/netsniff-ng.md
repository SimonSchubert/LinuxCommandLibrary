# TLDR

**Capture packets**

```netsniff-ng -i [eth0] -o [capture.pcap]```

**Read pcap file**

```netsniff-ng -i [capture.pcap]```

**Filter packets**

```netsniff-ng -i [eth0] -f "[tcp port 80]"```

**High-speed capture**

```netsniff-ng -i [eth0] --ring-size [64MB] -o [capture.pcap]```

**Show packet details**

```netsniff-ng -i [eth0] -V```

**Capture to directory**

```netsniff-ng -i [eth0] -P [output/]```

# SYNOPSIS

**netsniff-ng** [_options_]

# PARAMETERS

**-i** _INPUT_
> Input interface or file.

**-o** _OUTPUT_
> Output file.

**-f** _FILTER_
> BPF filter expression.

**--ring-size** _SIZE_
> Ring buffer size.

**-V**
> Verbose packet display.

**-P** _DIR_
> Output directory.

**--help**
> Display help information.

# DESCRIPTION

**netsniff-ng** is a high-performance packet sniffer. It uses zero-copy mechanisms for speed.

The tool captures at line rate. Supports BPF filtering and pcap output.

netsniff-ng is fast packet capture.

# CAVEATS

Requires root. High-performance focus. Part of netsniff-ng toolkit.

# HISTORY

netsniff-ng was created for **high-speed packet capture** using Linux kernel zero-copy features.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [tshark](/man/tshark)(1)

