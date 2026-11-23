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

Scan **all 65535 ports** on specific hosts

```nibble -i [192.168.1.223],[10.0.0.12/32] -p -```

Write results to a **JSON file** instead of stdout

```nibble -i [10.0.0.0/24] -o [results.json]```

Run without installing via **npx**

```npx @backendsystems/nibble```

# SYNOPSIS

**nibble** [**-i** _targets_] [**-p** _ports_] [**-o** _file_]

# DESCRIPTION

**nibble** is a single-binary local-network scanner with a clickable terminal user interface. Run without arguments it asks you to choose a network interface, sweeps the attached subnet for live hosts, maps each MAC address to a likely vendor from a built-in 40,000-entry database, probes well-known TCP ports, and reads service banners to identify the software behind each open port. Results appear in a mouse-friendly TUI (also navigable with arrow keys, **wasd** or **hjkl**, **?** for help). Custom port lists are remembered for future scans, and a history mode (hotkey **r**) lets you revisit and re-scan past results. Docker networks are scanned instantly when a Docker socket is detected.

Passing **-i** switches to headless mode: **nibble** runs non-interactively and writes JSON to stdout or to **-o**, making it scriptable. Headless scans are not saved to history. Exit codes are **0** (success), **1** (error) and **2** (invalid usage). It works on Linux, macOS, and Windows, including inside Docker and WSL, and does not require root or administrator privileges.

# PARAMETERS

**-i** _targets_
> Comma-separated IPs or CIDR ranges to scan, or a path to a file containing targets. Enables headless mode.

**-p** _ports_
> Custom port specification. Accepts comma-separated lists and ranges (e.g. **22,80,8000-8100**) or **-** for all ports.

**-o** _file_
> Write scan results to _file_ as JSON instead of printing them.

# CAVEATS

Probing is **TCP-only**; UDP services such as DNS or SNMP are not detected. Banner grabbing may trigger intrusion-detection systems on monitored networks; only scan networks you are authorized to assess. Vendor lookup depends on the bundled OUI list and may misidentify devices that spoof their MAC address.

# HISTORY

**nibble** was developed by **backendsystems** on GitHub, with its first tagged releases in **2026**, as a small, fast alternative to **nmap** for everyday LAN reconnaissance. It is distributed through **apt**, **dnf**, **brew**, **winget**, **npm**, **pip**, and **go install**, plus pre-built binaries for the three major platforms.

# SEE ALSO

[nmap](/man/nmap)(1), [arp-scan](/man/arp-scan)(1), [masscan](/man/masscan)(1), [netdiscover](/man/netdiscover)(8), [rustscan](/man/rustscan)(1)

# RESOURCES

```[Source code](https://github.com/backendsystems/nibble)```

<!-- verified: 2026-11-23 -->
