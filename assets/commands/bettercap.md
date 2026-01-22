# TLDR

**Start** interactive session

```bettercap -iface [eth0]```

**Run** caplet script

```bettercap -caplet [script.cap]```

**ARP spoofing**

```bettercap -iface [eth0] -eval ["set arp.spoof.targets 192.168.1.10; arp.spoof on"]```

**Start** web UI

```bettercap -caplet http-ui```

# SYNOPSIS

**bettercap** [_options_]

# DESCRIPTION

**bettercap** is a powerful network attack and monitoring framework. It provides tools for man-in-the-middle attacks, network reconnaissance, packet sniffing, credential harvesting, and WiFi attacks through a modular architecture.

The tool is designed for security research, penetration testing, and network analysis.

# PARAMETERS

**-iface** _name_
> Network interface

**-caplet** _file_
> Run caplet script

**-eval** _code_
> Evaluate expression

**-env-file** _file_
> Load environment variables

**-debug**
> Enable debug logging

**-silent**
> Suppress banner and logs

# MODULES

**net.recon**
> Network reconnaissance

**net.probe**
> Active host discovery

**arp.spoof**
> ARP spoofing attacks

**dns.spoof**
> DNS spoofing

**http.proxy**
> HTTP transparent proxy

**https.proxy**
> HTTPS transparent proxy

**wifi**
> WiFi attacks and monitoring

**ble**
> Bluetooth Low Energy attacks

**packet.proxy**
> Raw packet manipulation

# INTERACTIVE COMMANDS

```
# Enable ARP spoofing
> set arp.spoof.targets 192.168.1.0/24
> arp.spoof on

# HTTP proxy with SSL stripping
> set http.proxy.sslstrip true
> http.proxy on

# Network scan
> net.probe on
> net.show
```

# CAPLETS

Scripts for automation:
```
# quick-recon.cap
net.probe on
sleep 10
net.show
```

# CAVEATS

Requires root privileges. Illegal without authorization. Can disrupt network traffic. Detection by IDS/IPS systems. WiFi attacks require monitor mode capable adapter. Use only in authorized security assessments.

# HISTORY

**bettercap** was created by Simone Margaritelli (evilsocket) in **2016** as a modern replacement for ettercap, rewritten in Go for better performance.

# SEE ALSO

[ettercap](/man/ettercap)(8), [aircrack-ng](/man/aircrack-ng)(1), [wireshark](/man/wireshark)(1)
