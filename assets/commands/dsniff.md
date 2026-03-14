# TAGLINE

network password sniffer

# TLDR

**Sniff passwords** on interface

```sudo dsniff -i [eth0]```

**Read from capture file**

```dsniff -p [capture.pcap]```

**Write to file**

```sudo dsniff -i [eth0] -w [output.txt]```

**Enable automatic protocol detection**

```sudo dsniff -i [eth0] -m```

**Read from a previously saved session file**

```dsniff -r [savefile]```

**Sniff with custom trigger definitions**

```sudo dsniff -i [eth0] -t [80/tcp=http]```

# SYNOPSIS

**dsniff** [_options_]

# DESCRIPTION

**dsniff** is a password sniffer that passively monitors network traffic to capture authentication credentials transmitted in cleartext. It supports a comprehensive array of protocols including FTP, Telnet, HTTP, SNMP, IMAP, POP, LDAP, rlogin, RPC, NFS, X11, Oracle, PostgreSQL, and many others.

The tool operates by analyzing packet streams and extracting usernames and passwords as they traverse the network. It performs automatic protocol detection and TCP stream reassembly to correctly capture credentials from multi-packet exchanges.

dsniff was designed for authorized network security auditing and penetration testing, demonstrating the significant security risks of transmitting credentials over unencrypted protocols. Its existence helped drive the widespread adoption of encrypted alternatives like SSH and HTTPS. The tool remains relevant for security assessments and identifying legacy systems using insecure authentication methods.

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

**-s** _snaplen_
> Analyze at most the first snaplen bytes of each TCP connection (default 1024).

**-f** _services_
> Load trigger definitions from a services configuration file.

**-t** _trigger[,...]_
> Load triggers from a comma-separated list, specified as port/proto=service.

**-r** _savefile_
> Read previously captured sessions from a saved file.

**-d**
> Enable debugging.

_expression_
> Specify a tcpdump(8) filter expression to select traffic to sniff.

# SUPPORTED PROTOCOLS

FTP, Telnet, SMTP, HTTP, POP, poppass, NNTP, IMAP, SNMP, LDAP, Rlogin, RIP, OSPF, PPTP MS-CHAP, NFS, VRRP, YP/NIS, SOCKS, X11, CVS, IRC, AIM, ICQ, Napster, PostgreSQL, Meeting Maker, Citrix ICA, Symantec pcAnywhere, NAI Sniffer, Microsoft SMB, Oracle SQL*Net, Sybase, Microsoft SQL

# CAVEATS

Only for authorized security testing. Encrypted protocols (SSH, HTTPS) not captured. Requires root/admin privileges. May violate network policies. Protocol detection not perfect.

# HISTORY

**dsniff** was created by **Dug Song** around **2000** as part of a suite of network auditing tools. It demonstrated the dangers of cleartext authentication, contributing to the push for encrypted protocols. The dsniff suite includes related tools like arpspoof and macof.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [arpspoof](/man/arpspoof)(1), [ettercap](/man/ettercap)(8), [tcpreplay](/man/tcpreplay)(1)
