# TAGLINE

IPv6 security testing toolkit

# TLDR

**Scan for alive IPv6 hosts** on a network

```atk6-alive6 [eth0]```

**Trace route to IPv6 host**

```atk6-trace6 [eth0] [target]```

**Convert MAC address** to IPv6 link-local

```atk6-address6 [00:11:22:33:44:55]```

**Flood target with router advertisements**

```atk6-flood_router6 [eth0] [target]```

**Spoof neighbor advertisements** (MITM)

```atk6-parasite6 [eth0]```

**Announce as a fake router**

```atk6-fake_router6 [eth0] [network/64]```

**Test known IPv6 vulnerabilities**

```atk6-exploit6 [eth0] [target]```

# SYNOPSIS

**atk6-**_tool_ [_options_] [_interface_] [_arguments_]

# TOOLS

**alive6**
> Detect alive hosts on the local network segment

**trace6**
> Fast IPv6 traceroute with ICMP6 or TCP-SYN

**address6**
> Convert between MAC, IPv4, and IPv6 addresses

**fake_router6**
> Announce as a router on the network

**flood_router6**
> Flood target with random router advertisements

**flood_advertise6**
> Flood target with random neighbor advertisements

**parasite6**
> ICMP neighbor spoofer for MITM attacks

**redir6**
> ICMPv6 redirect spoofer for MITM

**dos-new-ip6**
> DoS by telling new devices their IP collides

**denial6**
> Prevent new IPv6 interfaces with DAD attacks

**fake_mld6**
> Join multicast groups on the network

**exploit6**
> Test known IPv6 implementation vulnerabilities

**ndpexhaust26**
> Exhaust NDP tables with ICMPv6 flooding

**rsmurf6**
> Remote smurf attack over IPv6

# DESCRIPTION

**thc-ipv6** is a toolkit for testing IPv6 and ICMPv6 protocol weaknesses. It contains various tools for network reconnaissance, denial of service, man-in-the-middle attacks, and vulnerability testing on IPv6 networks.

On Debian-based systems, tools are prefixed with **atk6-** (e.g., **atk6-alive6**). Each tool has its own options; run with **-h** for help. The toolkit exploits features of IPv6 that differ from IPv4, including neighbor discovery, router advertisements, and multicast.

The library **thc-ipv6-lib.c** enables custom tool development with minimal code for crafting IPv6/ICMPv6 packets. Environment variables **THC_IPV6_PPPOE** and **THC_IPV6_6IN4** configure tunnel support.

# CAVEATS

These tools are for authorized security testing only. IPv6 attacks can disrupt network connectivity for all users on a segment. Many attacks require root privileges and direct network access. Some tools may crash vulnerable systems. Detection and logging of IPv6 attacks varies by network infrastructure.

# HISTORY

THC-IPv6 was created by **van Hauser** (Marc Heuse) of **The Hacker's Choice** (THC), a German hacker collective. The toolkit was developed to demonstrate IPv6 security weaknesses as organizations began IPv6 deployment. It highlights that IPv6 introduces new attack surfaces absent in IPv4 networks, particularly around neighbor discovery and router advertisement protocols.

# SEE ALSO

[nmap](/man/nmap)(1), [ip](/man/ip)(8), [ping6](/man/ping6)(8), [traceroute6](/man/traceroute6)(8)
