# TAGLINE

Network exploration and security auditing tool

# TLDR

**Scan a single host**

```nmap [192.168.1.1]```

**Scan a network range**

```nmap [192.168.1.0/24]```

**Scan specific ports**

```nmap -p [22,80,443] [host]```

**Service and version detection**

```nmap -sV [host]```

**OS detection** (requires root)

```sudo nmap -O [host]```

**Aggressive scan** (OS, version, scripts, traceroute)

```sudo nmap -A [host]```

**Stealth SYN scan** (requires root)

```sudo nmap -sS [host]```

**UDP scan** (requires root)

```sudo nmap -sU [host]```

**Scan all 65535 ports**

```nmap -p- [host]```

**Save output in all formats**

```nmap -oA [output_basename] [host]```

**Run a specific NSE script**

```nmap --script [vuln] [host]```

# SYNOPSIS

**nmap** [_scan type_] [_options_] _target specification_

# PARAMETERS

_TARGETS_
> Hosts/networks to scan. Accepts hostnames, IPs, CIDR ranges, or ranges like 192.168.1.1-254.

**-p** _PORTS_
> Ports to scan. Ranges (1-1024), lists (22,80,443), or -p- for all 65535 ports.

**-sS**
> TCP SYN scan (stealth/half-open). Default scan type when run as root.

**-sT**
> TCP connect scan. Default when run without root.

**-sU**
> UDP scan. Slower than TCP scans.

**-sn**
> Ping scan (host discovery only, no port scan).

**-sV**
> Probe open ports for service version information.

**-O**
> Enable OS detection (requires root).

**-A**
> Aggressive scan: enables -O, -sV, --script=default, and --traceroute.

**-T**_0-5_
> Timing template from paranoid (0) to insane (5). Default is -T3.

**--script** _scripts_
> Run specified NSE (Nmap Scripting Engine) scripts.

**-oN** _FILE_
> Normal text output to file.

**-oX** _FILE_
> XML output to file.

**-oG** _FILE_
> Grepable output to file.

**-oA** _BASENAME_
> Output in all formats (normal, XML, grepable).

**-v**
> Increase verbosity level (use -vv for more).

**--top-ports** _N_
> Scan only the N most common ports.

**-Pn**
> Skip host discovery (treat all hosts as online).

**-iL** _FILE_
> Read targets from a file.

**--open**
> Only show open ports in results.

# DESCRIPTION

**nmap** (Network Mapper) is a free and open-source tool for network discovery and security auditing. It uses raw IP packets to determine available hosts, their services, operating systems, firewall rules, and other characteristics.

Nmap includes the Nmap Scripting Engine (NSE) with hundreds of scripts for vulnerability detection, service enumeration, and brute-force testing. Output can be saved in multiple formats for integration with other tools.

Common scan types include TCP SYN scans (-sS) for stealth, TCP connect scans (-sT) for unprivileged users, UDP scans (-sU), and ping scans (-sn) for host discovery.

# CAVEATS

Unauthorized scanning may be illegal. Many scan types (SYN, OS detection) require root/sudo privileges. Aggressive scanning can trigger IDS/IPS alerts or cause network disruption. UDP scans are significantly slower than TCP scans.

# HISTORY

Nmap was created by **Gordon Lyon (Fyodor)** and first released in **1997**. It has since become the de facto standard for network scanning and is used by security professionals worldwide.

# SEE ALSO

[masscan](/man/masscan)(1), [netcat](/man/netcat)(1), [zenmap](/man/zenmap)(1), [ss](/man/ss)(8), [tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1)

