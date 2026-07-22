# TAGLINE

Network attack and monitoring framework

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

**bettercap** is the Swiss Army knife for WiFi, Bluetooth Low Energy, wireless HID hijacking, CAN-bus, and IPv4/IPv6 network reconnaissance and MITM attacks. Written in Go, it provides man-in-the-middle attacks, network reconnaissance, packet sniffing, credential harvesting, and a REST API and web UI through a modular architecture.

The tool is designed for security research, penetration testing, and network analysis. It must be run as root.

# PARAMETERS

**-iface** _name_
> Network interface to bind to; if empty the default interface is auto-selected

**-caplet** _file_
> Read commands from this file and run them in the interactive session

**-eval** _code_
> Run one or more commands (separated by ;) in the interactive session

**-autostart** _modules_
> Comma-separated list of modules to auto-start

**-script** _file_
> Load a session script

**-gateway-override** _ip_
> Use the provided IP address instead of the detected default gateway

**-env-file** _file_
> Load environment variables from this file

**-caplets-path** _dir_
> Alternative base path for caplets

**-no-history**
> Disable the interactive session history file

**-no-colors**
> Disable output color effects

**-debug**
> Print debug messages

**-silent**
> Suppress all logs which are not errors

**-version**
> Print the version and exit

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

# INSTALL

```apt: sudo apt install bettercap```

```pacman: sudo pacman -S bettercap```

```zypper: sudo zypper install bettercap```

```brew: brew install bettercap```

```nix: nix profile install nixpkgs#bettercap```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[ettercap](/man/ettercap)(8), [arpspoof](/man/arpspoof)(8), [nmap](/man/nmap)(1), [aircrack-ng](/man/aircrack-ng)(1), [wireshark](/man/wireshark)(1)

# RESOURCES

```[Source code](https://github.com/bettercap/bettercap)```

```[Homepage](https://www.bettercap.org/)```

<!-- verified: 2026-06-19 -->
