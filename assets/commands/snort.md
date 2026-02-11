# TAGLINE

Network intrusion detection and prevention system

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

**snort** is an open-source network intrusion detection and prevention system (IDS/IPS) that performs real-time traffic analysis and packet logging. It examines network traffic against a set of user-defined rules to detect attacks, probes, and suspicious activity.

The tool operates in three modes: sniffer mode displays packets on the console, logger mode records traffic to pcap files for offline analysis, and IDS mode applies detection rules and generates alerts. Rules use a flexible language that matches on protocol, content patterns, flow direction, and other packet characteristics.

Snort can operate inline as an IPS to actively block detected threats, or passively as an IDS that only monitors and alerts. Its rule format has become an industry standard, with thousands of community and commercial rules available for detecting known vulnerabilities, malware, and policy violations.

# CONFIGURATION

**/etc/snort/snort.conf**
> Main configuration file defining network variables, preprocessors, output plugins, and rule paths.

**/etc/snort/rules/**
> Directory containing detection rule files loaded by the configuration.

# CAVEATS

Requires root for capture. Rule tuning needed. High bandwidth challenging.

# HISTORY

**Snort** was created by **Martin Roesch** in **1998**. It became the most widely deployed IDS, now maintained by Cisco.

# SEE ALSO

[suricata](/man/suricata)(1), [tcpdump](/man/tcpdump)(1), [zeek](/man/zeek)(1)
