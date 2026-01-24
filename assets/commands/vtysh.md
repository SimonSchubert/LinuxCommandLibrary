# TLDR

**Start the interactive shell**

```sudo vtysh```

**Execute a single command**

```sudo vtysh -c "[show ip route]"```

**Execute command and echo it** (for scripting)

```sudo vtysh -E -c "[show ip route]"```

**Connect to a specific daemon** only

```sudo vtysh -d [bgpd]```

**Execute boot startup configuration**

```sudo vtysh -b```

**Show running configuration**

```sudo vtysh -c "show running-config"```

# SYNOPSIS

**vtysh** [**-b**] [**-c** _command_] [**-d** _daemon_] [**-E**] [**-h**]

# PARAMETERS

**-b**, **--boot**
> Execute boot startup configuration from the integrated config file.

**-c** _command_, **--command** _command_
> Execute specified command and exit. Can be used multiple times for multiple commands.

**-d** _daemon_, **--daemon** _daemon_
> Connect to specific daemon only (zebra, bgpd, ospfd, ripd, isisd, etc.).

**-E**, **--echo**
> Echo the command and prompt before displaying results. Useful for scripting.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**vtysh** is an integrated command shell for FRRouting (FRR) and Quagga routing software. It provides a unified Cisco IOS-like CLI for configuring and monitoring all routing daemons (Zebra, BGP, OSPF, RIP, IS-IS, etc.) from a single interface.

The shell operates in hierarchical modes: User EXEC mode for basic commands, Privileged EXEC mode (via **enable**) for administrative commands, and Configuration mode (via **configure terminal**) for making changes. Each routing protocol has its own configuration sub-mode.

vtysh connects to all running routing daemons through their control sockets, presenting their combined functionality. Commands like **show ip route**, **show bgp summary**, and **show running-config** aggregate information from all relevant daemons.

Configuration can be saved with **write memory** to the integrated config file (/etc/frr/frr.conf) or individual daemon configs.

# CAVEATS

Requires root privileges or membership in the frr/quagga group to access daemon control sockets. The integrated config file must be enabled for unified configuration. Some commands may behave differently than Cisco IOS despite similar syntax. Tab completion and context-sensitive help (?) are available in interactive mode.

# HISTORY

**vtysh** was developed as part of the **Quagga** routing suite, which forked from GNU Zebra in **2003**. When Quagga development stalled, the **FRRouting** project forked it in **2017** and continued active development. vtysh remains the primary CLI for FRR, providing a familiar interface for network engineers accustomed to commercial router operating systems.

# SEE ALSO

[zebra](/man/zebra)(8), [bgpd](/man/bgpd)(8), [ospfd](/man/ospfd)(8), [ripd](/man/ripd)(8)
