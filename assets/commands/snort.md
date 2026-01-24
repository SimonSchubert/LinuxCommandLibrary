# TLDR

**Sniffer mode**

```snort -v -i [eth0]```

**Packet logger**

```snort -dev -l [/var/log/snort] -i [eth0]```

**IDS mode**

```snort -c [/etc/snort/snort.conf] -i [eth0]```

**Test configuration**

```snort -T -c [/etc/snort/snort.conf]```

**Read pcap file**

```snort -r [capture.pcap] -c [snort.conf]```

**Daemon mode**

```snort -D -c [snort.conf] -i [eth0]```

**Alert modes**

```snort -A [fast] -c [snort.conf] -i [eth0]```

# SYNOPSIS

**snort** [_-c config_] [_-l logdir_] [_-i interface_] [_options_]

# PARAMETERS

**-c** _FILE_
> Configuration file.

**-i** _INTERFACE_
> Network interface.

**-l** _DIR_
> Log directory.

**-A** _MODE_
> Alert mode (fast, full, console).

**-D**
> Daemon mode.

**-r** _FILE_
> Read pcap.

**-T**
> Test configuration.

**-v**
> Verbose.

**-d**
> Dump packet data.

**-e**
> Display link layer.

# DESCRIPTION

**snort** is a network intrusion detection system. It analyzes traffic against rule sets.

Sniffer mode displays packets. Simple network monitoring.

Logger mode records traffic. Creates pcap files for analysis.

IDS mode applies rules. Alerts on suspicious activity.

Rules define detection logic. Protocol, content, and flow matching.

# CAVEATS

Requires root for capture. Rule tuning needed. High bandwidth challenging.

# HISTORY

**Snort** was created by **Martin Roesch** in **1998**. It became the most widely deployed IDS, now maintained by Cisco.

# SEE ALSO

[suricata](/man/suricata)(1), [tcpdump](/man/tcpdump)(1), [zeek](/man/zeek)(1)
