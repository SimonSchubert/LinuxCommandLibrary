# TLDR

**Start the interactive scapy** shell

```scapy```

**Start scapy** with increased verbosity

```scapy -d```

**Start scapy** with a custom startup file

```scapy -c [path/to/startup.py]```

**Start scapy** without running startup files

```scapy -C -P```

**Start scapy** in header-less mode with reduced verbosity

```scapy -H```

**Send a ping packet** and receive the reply

```sr1(IP(dst="[8.8.8.8]")/ICMP())```

**Perform a TCP SYN scan** on a port

```sr1(IP(dst="[target]")/TCP(dport=[80], flags="S"))```

# SYNOPSIS

**scapy** [**-h**] [**-H**] [**-d**] [**-p** _prestart_file_] [**-P**] [**-c** _startup_file_] [**-C**]

# PARAMETERS

**-h**
> Display usage information

**-H**
> Header-less mode; also reduces verbosity

**-d**
> Increase log verbosity; can be used multiple times for more detail

**-p** _prestart_file_
> Use specified file instead of ~/.config/scapy/prestart.py as pre-startup file

**-P**
> Do not run the prestart file

**-c** _startup_file_
> Use specified file instead of ~/.config/scapy/startup.py as startup file

**-C**
> Do not run the startup file

# DESCRIPTION

**Scapy** is a Python-based interactive packet manipulation program and library. It can forge, decode, send, and capture packets for a wide range of network protocols. Scapy uses the Python interpreter as its command interface, allowing full use of Python syntax including variables, loops, and functions.

The tool can replace or complement utilities like **hping**, **nmap**, **arpspoof**, **arping**, **tcpdump**, and **tshark**. Unlike traditional tools that reduce responses to simple states like "open" or "closed," Scapy provides access to the complete packet data for detailed analysis.

Common functions include **send()** for layer 3 packets, **sendp()** for layer 2, **sr()** for send-receive, **sr1()** for single response, **sniff()** for packet capture, and **wrpcap()**/**rdpcap()** for PCAP file operations.

# CAVEATS

Scapy requires root privileges for most operations involving raw sockets. It may miss packets under heavy network load. Session saving is limited by Python's marshaling capabilities, so lambda functions and generators cannot be preserved. Interface aliases may not report correct source IPs.

# HISTORY

**Scapy** was created by **Philippe Biondi** in **2003** as a flexible alternative to rigid network tools. It gained popularity in the security community for penetration testing and network research. The project transitioned to Python 3 support and continues to be actively maintained by the security community on GitHub.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [nmap](/man/nmap)(1), [hping3](/man/hping3)(1), [tshark](/man/tshark)(1)
