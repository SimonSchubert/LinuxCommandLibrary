# TAGLINE

Terminal network traffic monitor using BPF

# TLDR

**Monitor all network traffic**

```sudo netop```

**Monitor a specific interface**

```sudo netop -n [eth0]```

# SYNOPSIS

**netop** [_options_]

# PARAMETERS

**-n** _INTERFACE_
> Specify the network interface to monitor.

# DESCRIPTION

**netop** is a terminal-based network traffic monitor that uses BPF (Berkeley Packet Filter) to capture and display network activity. It provides a TUI showing real-time network topology and traffic statistics with customizable filter rules.

# CAVEATS

Requires root privileges for packet capture. BPF support must be available on the system.

# HISTORY

**netop** was created by **ZingerLittleBee** and is written in **Rust**.

# SEE ALSO

[tcpdump](/man/tcpdump)(8), [iftop](/man/iftop)(8), [nethogs](/man/nethogs)(8)
