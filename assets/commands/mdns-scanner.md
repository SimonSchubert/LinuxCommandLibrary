# TAGLINE

TUI for scanning networks and mapping IPs to mDNS hostnames

# TLDR

**Scan the local network**

```mdns-scanner```

# SYNOPSIS

**mdns-scanner** [_options_]

# DESCRIPTION

**mdns-scanner** is a TUI application that scans local networks and maps IP addresses to their multicast DNS hostnames. It automatically discovers active devices on non-loopback network interfaces and resolves their addresses to mDNS hostnames or DNS-SD service instances.

The TUI displays discovered hosts in a navigable list with their IP addresses and resolved hostnames.

# CAVEATS

Only discovers devices that respond to mDNS queries. Devices without mDNS support will not appear in results.

# HISTORY

**mdns-scanner** was created by **CramBL** and is written in **Rust**.

# SEE ALSO

[avahi-browse](/man/avahi-browse)(1), [nmap](/man/nmap)(1)
