# TAGLINE

TUI for scanning networks and mapping IPs to mDNS hostnames

# TLDR

**Scan the local network**

```mdns-scanner```

# SYNOPSIS

**mdns-scanner** [_options_]

# DESCRIPTION

**mdns-scanner** is a terminal UI application that scans the local network for active hosts and resolves their IP addresses to **multicast DNS** (mDNS) hostnames or DNS-SD service instances. It enumerates non-loopback network interfaces, performs ARP/ICMP-based host discovery, then issues mDNS queries on the **224.0.0.251** (IPv4) and **ff02::fb** (IPv6) link-local multicast groups on UDP port **5353**.

The TUI displays discovered hosts in a navigable list with their IP addresses and any resolved **\*.local** hostnames or service records, making it useful for finding printers, Chromecasts, Apple devices, HomeKit accessories, and other Bonjour/Avahi-aware hardware on a LAN.

# CAVEATS

Only discovers devices that respond to mDNS queries. Devices without an mDNS responder (or with mDNS blocked by firewall rules) will not be resolved, though they may still appear by IP. Multicast traffic does not cross routed segments by default, so the tool only sees the directly-attached broadcast domain.

# HISTORY

**mdns-scanner** was created by **CramBL** and is written in **Rust**. It is published on **crates.io** and distributed through **cargo install mdns-scanner**.

# SEE ALSO

[avahi-browse](/man/avahi-browse)(1), [nmap](/man/nmap)(1), [arp-scan](/man/arp-scan)(1)
