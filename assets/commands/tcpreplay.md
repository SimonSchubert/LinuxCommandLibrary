# TAGLINE

Replay captured network traffic

# TLDR

**Replay pcap**

```tcpreplay -i [eth0] [capture.pcap]```

**Replay at speed**

```tcpreplay -i [eth0] -M [100] [capture.pcap]```

**Loop replay**

```tcpreplay -i [eth0] --loop [10] [capture.pcap]```

**Replay at topspeed**

```tcpreplay -i [eth0] --topspeed [capture.pcap]```

**Multiplier speed**

```tcpreplay -i [eth0] -x [2.0] [capture.pcap]```

# SYNOPSIS

**tcpreplay** [_-i interface_] [_-M mbps_] [_--loop n_] [_options_] _pcap_

# PARAMETERS

**-i** _IFACE_
> Output interface.

**-M** _MBPS_
> Rate in Mbps.

**-x** _MULT_
> Speed multiplier.

**--loop** _N_
> Loop count.

**--topspeed**
> Maximum speed.

**-K**
> Preload into memory.

# DESCRIPTION

**tcpreplay** replays previously captured network traffic from pcap files back onto the network. It reads packet captures produced by tools like tcpdump or Wireshark and transmits them through a specified network interface at controlled rates.

The tool provides flexible speed control: traffic can be replayed at the original recorded speed, at a fixed rate in Mbps, at a speed multiplier, or at maximum wire speed with **--topspeed**. The **--loop** option repeats the capture file multiple times, and **-K** preloads the entire file into memory for consistent high-speed replay.

Common use cases include testing network devices like firewalls and IDS/IPS systems, stress-testing network infrastructure, reproducing network issues for debugging, and benchmarking network applications under realistic traffic conditions.

# CAVEATS

Root required. Raw socket access. May disrupt networks.

# HISTORY

**tcpreplay** was created for replaying captured network traffic for testing network devices and applications.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [tcprewrite](/man/tcprewrite)(1)
