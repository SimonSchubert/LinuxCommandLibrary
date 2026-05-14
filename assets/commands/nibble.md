# TAGLINE

Fast TUI scanner for hosts, vendors, and services on the local network

# TLDR

**Launch the interactive TUI** and pick an interface

```nibble```

Scan a **specific subnet** in headless mode

```nibble -i [192.168.1.0/24]```

Scan **multiple targets** read from a file

```nibble -i [targets.txt]```

Limit the scan to a **custom port range**

```nibble -i [192.168.1.0/24] -p [22,80,443,8000-8100]```

Scan **all 65535 ports** on a single host

```nibble -i [192.168.1.10/32] -p -```

Write results to a **JSON file** instead of stdout

```nibble -i [10.0.0.0/24] -o [results.json]```

# SYNOPSIS

**nibble** [**-i** _targets_] [**-p** _ports_] [**-o** _file_]

# DESCRIPTION

**nibble** is a single-binary local-network scanner with a clickable terminal user interface. Run without arguments it asks you to choose a network interface, sweeps the attached subnet for live hosts, maps each MAC address to a likely vendor from a built-in 40,000-entry database, probes well-known TCP ports, and reads service banners to identify the software behind each open port. Results appear in a mouse-friendly TUI that supports history lookup of previous scans.

In headless mode (any of **-i**, **-p**, or **-o**) **nibble** runs non-interactively and writes JSON to stdout or to **-o**, making it scriptable. It works on Linux, macOS, and Windows, including inside Docker and WSL, and does not require root or administrator privileges.

# PARAMETERS

**-i** _targets_
> Comma-separated IPs or CIDR ranges to scan, or a path to a file containing one target per line.

**-p** _ports_
> Custom port specification. Accepts comma-separated lists and ranges (e.g. **22,80,8000-8100**) or **-** for all ports.

**-o** _file_
> Write scan results to _file_ as JSON instead of printing them.

# CAVEATS

Probing is **TCP-only**; UDP services such as DNS or SNMP are not detected. Banner grabbing may trigger intrusion-detection systems on monitored networks — only scan networks you are authorized to assess. Vendor lookup depends on the bundled OUI list and may misidentify devices that spoof their MAC address.

# HISTORY

**nibble** was released by the **backendsystems** team on **GitHub in 2025** as a small, fast alternative to **nmap** for everyday LAN reconnaissance. It is distributed through **apt**, **dnf**, **brew**, **winget**, **npm**, **pip**, and **go install**, plus pre-built binaries for the three major platforms.

# SEE ALSO

[nmap](/man/nmap)(1), [arp-scan](/man/arp-scan)(1), [masscan](/man/masscan)(1), [netdiscover](/man/netdiscover)(8)
