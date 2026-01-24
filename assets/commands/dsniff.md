# TLDR

**Sniff passwords** on interface

```sudo dsniff -i [eth0]```

**Read from capture file**

```dsniff -p [capture.pcap]```

**Write to file**

```sudo dsniff -i [eth0] -w [output.txt]```

**Sniff specific protocols**

```sudo dsniff -i [eth0] -m```

# SYNOPSIS

**dsniff** [_options_]

# DESCRIPTION

**dsniff** is a password sniffer that captures authentication credentials from network traffic. It handles various protocols including FTP, Telnet, HTTP, SNMP, IMAP, LDAP, and others.

The tool is designed for authorized network auditing and security testing, demonstrating the risks of transmitting credentials over unencrypted protocols.

# PARAMETERS

**-i** _interface_
> Network interface to sniff.

**-p** _file_
> Read from pcap file.

**-w** _file_
> Write output to file.

**-m**
> Enable automatic protocol detection.

**-n**
> Don't resolve hostnames.

**-c**
> Perform half-duplex TCP stream reassembly.

**-d**
> Enable debugging.

# SUPPORTED PROTOCOLS

FTP, Telnet, HTTP, POP, IMAP, LDAP, rlogin, RPC, SNMP, NFS, X11, IRC, AIM, CVS, Citrix, Oracle, PostgreSQL, Sybase, Microsoft SQL

# CAVEATS

Only for authorized security testing. Encrypted protocols (SSH, HTTPS) not captured. Requires root/admin privileges. May violate network policies. Protocol detection not perfect.

# HISTORY

**dsniff** was created by **Dug Song** around **2000** as part of a suite of network auditing tools. It demonstrated the dangers of cleartext authentication, contributing to the push for encrypted protocols. The dsniff suite includes related tools like arpspoof and macof.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [arpspoof](/man/arpspoof)(1), [ettercap](/man/ettercap)(1)
