# TLDR

**Scan single host**

```nmap [192.168.1.1]```

**Scan network range**

```nmap [192.168.1.0/24]```

**Scan specific ports**

```nmap -p [22,80,443] [host]```

**Service/version detection**

```nmap -sV [host]```

**OS detection**

```nmap -O [host]```

**Aggressive scan**

```nmap -A [host]```

**Stealth SYN scan**

```nmap -sS [host]```

**UDP scan**

```nmap -sU [host]```

**Save output**

```nmap -oN [output.txt] [host]```

# SYNOPSIS

**nmap** [_options_] _targets_

# PARAMETERS

_TARGETS_
> Hosts/networks to scan.

**-p** _PORTS_
> Ports to scan.

**-sV**
> Service version detection.

**-O**
> OS detection.

**-A**
> Aggressive scan.

**-sS**
> TCP SYN scan.

**-sU**
> UDP scan.

**-oN** _FILE_
> Normal output file.

**--help**
> Display help information.

# DESCRIPTION

**nmap** is the Network Mapper. It discovers hosts and services on networks.

The tool performs port scanning. Essential for network security assessment.

nmap is network scanner.

# CAVEATS

Authorized use only. Some scans need root. May trigger IDS alerts.

# HISTORY

Nmap was created by **Gordon Lyon (Fyodor)** in 1997 and is the premier network scanning tool.

# SEE ALSO

[masscan](/man/masscan)(1), [netcat](/man/netcat)(1), [zenmap](/man/zenmap)(1)

