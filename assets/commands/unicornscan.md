# TLDR

**Basic TCP SYN scan**

```unicornscan [192.168.1.1]```

**Scan specific ports**

```unicornscan [192.168.1.1]:[22,80,443]```

**Scan port range**

```unicornscan [192.168.1.1]:[1-1000]```

**UDP scan**

```unicornscan -mU [192.168.1.1]```

**Scan at specific rate**

```unicornscan -r [1000] [192.168.1.1]```

**Immediate verbose output**

```unicornscan -Iv [192.168.1.1]```

**Scan network range**

```unicornscan [192.168.1.0/24]:[80,443]```

**Save results to pcap**

```unicornscan -w [scan.pcap] [192.168.1.1]```

# SYNOPSIS

**unicornscan** [_options_] _target_[:_ports_]

# PARAMETERS

**-m** _mode_
> Scan mode: T (TCP SYN), U (UDP), sf (connect), A (ARP).

**-r** _pps_
> Packets per second rate.

**-i** _interface_
> Network interface to use.

**-I**
> Immediate mode: display results as found.

**-v**
> Verbose output.

**-H**
> Resolve hostnames in output.

**-l** _file_
> Log output to file.

**-w** _file_
> Write packets to pcap file.

**-L** _seconds_
> Packet timeout (default: 7).

**-p** _ports_
> Global ports to scan.

**-B** _port_
> Source port for scanning.

**-b** _layer_
> Send broken CRC: T (transport), N (network), TN (both).

**-e** _module_
> Enable module (e.g., osdetect).

**-E**
> Process error responses (ICMP, RST).

**-Q**
> Quiet mode.

**-h**
> Display help.

# SCAN MODES

**-mT**: TCP SYN scan (default)

**-mTsA**: TCP ACK scan

**-mTsF**: TCP FIN scan

**-mTs**: TCP NULL scan

**-mTsFPU**: TCP Xmas scan

**-msf**: TCP connect scan

**-mU**: UDP scan

# DESCRIPTION

**unicornscan** is an asynchronous network scanner designed for high-speed reconnaissance. It uses a custom TCP/IP stack that separates packet sending and receiving into different threads, enabling much faster scanning than traditional scanners.

The scanner supports various TCP flag combinations, UDP scanning, and OS/service fingerprinting through loadable modules. Its asynchronous design makes it particularly effective for scanning large networks.

Output can be customized and saved to pcap files for later analysis. The tool integrates with databases for storing scan results.

# CAVEATS

Requires root privileges for raw socket access. High scan rates may trigger IDS/IPS. Custom TCP stack may behave differently than system stack. Use only with authorization on target networks.

# HISTORY

**unicornscan** was developed by Jack Louis and Robert E. Lee. It was designed for scalability and speed, addressing limitations of synchronous scanners. The tool became popular for penetration testing and is included in Kali Linux.

# SEE ALSO

[nmap](/man/nmap)(1), [masscan](/man/masscan)(1), [zmap](/man/zmap)(1), [hping3](/man/hping3)(1)
