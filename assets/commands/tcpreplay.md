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

**tcpreplay** replays network traffic. It sends pcap files.

Traffic generation. Testing and debugging.

Rate control. Specify bandwidth.

Loop support. Continuous playback.

Network testing. Stress and security.

# CAVEATS

Root required. Raw socket access. May disrupt networks.

# HISTORY

**tcpreplay** was created for replaying captured network traffic for testing network devices and applications.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [tcprewrite](/man/tcprewrite)(1)
