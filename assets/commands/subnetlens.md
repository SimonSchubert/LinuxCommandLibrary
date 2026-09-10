# TAGLINE

Local-network host discovery and port scanner with a TUI

# TLDR

**Scan a subnet** with the interactive TUI

```subnetlens scan [192.168.1.0/24]```

Scan a **single host**

```subnetlens scan [192.168.1.1]```

Scan an **IP range**

```subnetlens scan [192.168.1.1-192.168.1.50]```

Limit the **port list**

```subnetlens scan [192.168.1.0/24] --ports [22,80,443,8080]```

**Plain-text** output for scripts, with **banner** grabs

```subnetlens scan [192.168.1.0/24] --plain --banners```

Raise **timeout** and split discovery vs port-scan concurrency

```subnetlens scan [192.168.1.0/24] --timeout [300] --concurrency [100] --discovery-concurrency [400]```

Include hosts that only return **TCP errors**

```subnetlens scan [192.168.1.0/24] --all-alive```

Enable **ARP and ICMP** discovery (needs root)

```sudo subnetlens scan [192.168.1.0/24]```

Write **debug logs** while scanning in plain mode

```sudo SLENS_DEBUG=1 subnetlens scan [192.168.1.0/24] --plain```

# SYNOPSIS

**subnetlens** **scan** _target_ [_options_]

# PARAMETERS

**scan** _target_
> Discover live hosts and scan their TCP ports. _target_ is one CIDR prefix (`192.168.1.0/24`), a single IP, or a hyphenated range (`192.168.1.1-192.168.1.50`).

**-p** _ports_, **--ports** _ports_
> Comma-separated TCP ports. Default is a built-in list of common services (FTP, SSH, HTTP/S, SMB, mail, databases, RDP/VNC, HTTP alternates, plus a handful of Apple and Android ports).

**-t** _ms_, **--timeout** _ms_
> Per-connection timeout in milliseconds. Default `500`.

**-c** _n_, **--concurrency** _n_
> Max concurrent port-scan and banner probes. Default `100`.

**--discovery-concurrency** _n_
> Max concurrent host-discovery probes. `0` (default) reuses **--concurrency**.

**-b**, **--banners**
> Grab service banners on open ports.

**--plain**
> Print results as plain text instead of the Bubble Tea TUI. Progress goes to stderr; host records go to stdout.

**--all-alive**
> Show every discovered host, including those that only respond with TCP connection errors.

# DESCRIPTION

**subnetlens** is a concurrent local-network scanner written in Go. It finds live hosts, scans a set of TCP ports with connect() (no extra privileges), optionally grabs banners, and heuristically fingerprints OS and device type. MAC vendor names come from a bundled IEEE OUI table; randomized MACs are flagged rather than mis-attributed.

Host discovery can use several methods:

- **TCP connect** — default, no elevated privileges
- **ICMP echo** — needs root
- **ARP** — needs root on Linux and macOS
- **mDNS** — passive listen for local service announcements

The default interface is a streaming TUI built with Charm's Bubble Tea. **--plain** is the script-friendly path: it prints the local machine's interface/IP/MAC when the scan target covers that address, then one block per host (IP, hostname, OS, device, vendor, open ports).

The binary is a single static-style Go build (`go build` / `go install`). There is no JSON/CSV export yet; that is listed as future work. A planned proprietary "Pro" layer (UDP scan, GUI graph, `subnetlens watch`) is separate from this open-source CLI.

# CAVEATS

Intended only for **authorized** network testing. Scanning networks you do not own or administer may be illegal.

TCP connect scanning works unprivileged. ARP and ICMP need **root** (raw sockets). Without root, discovery is TCP-only and MAC/vendor data will be thinner.

Default port coverage is a short common list, not 1–65535. Raise **--ports** explicitly when you need a wider sweep.

Aggressive **--concurrency** can trip IDS/IPS or exhaust local file descriptors. The scanner may emit warnings and cap sockets when the plan is too large.

JSON/CSV export, UDP scanning, and continuous `watch` are not in the open-source CLI.

# HISTORY

**subnetlens** was written by **Olha Stefanishyna** in **2026** (MIT, Go, Cobra CLI + Bubble Tea TUI).

# SEE ALSO

[nmap](/man/nmap)(1), [arp-scan](/man/arp-scan)(1), [netdiscover](/man/netdiscover)(1), [netscanner](/man/netscanner)(1), [rustscan](/man/rustscan)(1), [naabu](/man/naabu)(1), [masscan](/man/masscan)(1), [avahi-browse](/man/avahi-browse)(1)

# RESOURCES

```[Source code](https://github.com/ostefani/subnetlens)```

<!-- verified: 2026-09-10 -->
