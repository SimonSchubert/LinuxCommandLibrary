# TAGLINE

Layer 2 network protocol attack framework

# TLDR

**Start interactive ncurses mode**

```sudo yersinia -I```

**Start GTK graphical interface**

```sudo yersinia -G```

**Launch DHCP starvation attack**

```sudo yersinia dhcp -attack 1 -interface [eth0]```

**Send STP BPDU** to claim root bridge

```sudo yersinia stp -attack 4 -interface [eth0]```

**Start DTP attack** to enable trunking

```sudo yersinia dtp -attack 1 -interface [eth0]```

**Flood CDP table**

```sudo yersinia cdp -attack 1 -interface [eth0]```

**Start network daemon** on port 12000

```sudo yersinia -D```

# SYNOPSIS

**yersinia** [_-hVGID_] [_protocol_] [_-attack attack_] [_options_]

# PARAMETERS

**-h**, **--help**
> Display help

**-V**, **--Version**
> Show version

**-G**
> Start GTK graphical interface

**-I**
> Start ncurses interactive mode

**-D**
> Start as network daemon (telnet server on port 12000)

**-e**
> Execute attack without interactive mode

**-i** _INTERFACE_
> Network interface to use

**-l** _FILE_
> Log output to file

**-r** _FILE_
> Read packets from pcap file

**-w** _FILE_
> Write packets to pcap file

**-attack** _NUM_
> Attack number to execute

# PROTOCOLS

**stp**
> Spanning Tree Protocol attacks

**vtp**
> VLAN Trunking Protocol attacks

**dtp**
> Dynamic Trunking Protocol attacks

**hsrp**
> Hot Standby Router Protocol attacks

**dhcp**
> DHCP starvation and rogue server attacks

**cdp**
> Cisco Discovery Protocol attacks

**dot1q**
> 802.1Q VLAN hopping attacks

**isl**
> Inter-Switch Link Protocol attacks

# DESCRIPTION

**yersinia** is a framework for performing Layer 2 network attacks. It exploits weaknesses in network protocols that operate at the data link layer, which are often overlooked in security assessments.

The tool supports multiple attack modes: interactive ncurses console (**-I**), GTK graphical interface (**-G**), network daemon (**-D**), and direct command-line execution. Interactive mode displays protocol fields and available attacks with indicators for which are DoS attacks.

Common attacks include DHCP starvation (exhausting IP pools), STP root bridge claiming (traffic interception), DTP trunk negotiation (VLAN access), and CDP flooding (switch table overflow). These attacks can disrupt network operations or enable man-in-the-middle positions.

# CAVEATS

Layer 2 attacks can severely disrupt network operations. Some attacks are denial-of-service and will cause network instability. Only use on networks you own or have explicit authorization to test. Requires root privileges. Many attacks only work on local network segments. Modern switches may have protections against some attacks.

# HISTORY

Yersinia was developed by **David Barroso** and **Alfredo Andres** as a research tool to demonstrate Layer 2 vulnerabilities. The name refers to *Yersinia pestis*, the bacterium causing plague, reflecting how these attacks can spread through a network. The tool highlighted that network security must address all OSI layers, not just application-layer threats. It became a standard tool for network penetration testing.

# SEE ALSO

[ettercap](/man/ettercap)(8), [arpspoof](/man/arpspoof)(8), [macchanger](/man/macchanger)(1), [tcpdump](/man/tcpdump)(8)
