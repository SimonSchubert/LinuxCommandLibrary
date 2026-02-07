# TAGLINE

comprehensive suite for network MITM attacks

# TLDR

**Start graphical** interface

```ettercap -G```

**ARP poisoning** attack

```ettercap -T -M arp:remote /[target1]// /[target2]//```

**Sniff on interface**

```ettercap -T -i [eth0]```

**Use text interface**

```ettercap -T```

**Load plugin**

```ettercap -T -P [dns_spoof]```

**Read from pcap** file

```ettercap -T -r [capture.pcap]```

# SYNOPSIS

**ettercap** [_options_] [_target1_] [_target2_]

# PARAMETERS

_TARGET_
> Target specification (MAC/IP/PORT).

**-G**
> Graphical (GTK) interface.

**-T**
> Text-only interface.

**-M** _METHOD_
> MITM attack method.

**-i** _INTERFACE_
> Network interface.

**-P** _PLUGIN_
> Load plugin.

**-r** _FILE_
> Read from pcap file.

**-w** _FILE_
> Write to pcap file.

**--help**
> Display help information.

# DESCRIPTION

**Ettercap** is a comprehensive suite for man-in-the-middle attacks on LAN. It supports active and passive protocol analysis, including features for network and host analysis.

The tool can intercept traffic through ARP poisoning, allowing packet sniffing, injection, and filtering. Plugins extend functionality for DNS spoofing, OS fingerprinting, and more.

Ettercap is used for network security testing, protocol analysis, and penetration testing on authorized networks.

# CONFIGURATION

**/etc/ettercap/etter.conf**
> Main configuration file controlling default interface, packet forwarding, plugin paths, and network settings.

**/etc/ettercap/etter.dns**
> DNS spoofing configuration mapping hostnames to IP addresses for the dns_spoof plugin.

# CAVEATS

Only use on authorized networks. May disrupt network operations. Detectable by security tools. Some attacks need root privileges.

# HISTORY

Ettercap was created by **Alberto Ornaghi** and **Marco Valleri**, released as open source for network security research. It became a standard tool for man-in-the-middle attack demonstrations.

# SEE ALSO

[arpspoof](/man/arpspoof)(8), [wireshark](/man/wireshark)(1), [mitmproxy](/man/mitmproxy)(1)
