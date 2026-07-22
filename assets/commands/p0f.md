# TAGLINE

performs passive OS fingerprinting

# TLDR

**Start fingerprinting**

```p0f -i [eth0]```

**Read from pcap**

```p0f -r [capture.pcap]```

**Write to log file**

```p0f -i [eth0] -o [log.txt]```

**Fingerprint specific port**

```p0f -i [eth0] "port 80"```

**Run in background**

```p0f -i [eth0] -d```

# SYNOPSIS

**p0f** [_options_] [_filter_]

# PARAMETERS

**-i** _INTERFACE_
> Listen on the named network interface.

**-r** _FILE_
> Read packets from a pcap capture file instead of a live interface.

**-o** _FILE_
> Append fingerprinting results to _FILE_ (text log).

**-w** _FILE_
> Write captured packets to a new pcap file (similar to **tcpdump -w**).

**-s** _PATH_
> Listen on _PATH_ as a Unix domain socket for API queries.

**-d**
> Run as a daemon in the background. Requires **-o** or **-s**.

**-u** _USER_
> Drop privileges to _USER_ after opening the capture interface.

**-p**
> Put the interface into promiscuous mode.

**-f** _FILE_
> Use _FILE_ as the fingerprint database (default: **/etc/p0f/p0f.fp**).

**-S** _N_
> Set the max number of concurrent API connections.

**-c** _DIR_
> Restrict output by chrooting to _DIR_.

**-L**
> List available capture interfaces and exit.

**--help**
> Display help information.

# DESCRIPTION

**p0f** is a passive OS, application, and link-type fingerprinter. It listens to TCP/IP traffic without sending any packets and infers the remote operating system, MTU/uplink, NAT presence, and approximate uptime from quirks of the SYN, SYN+ACK, and HTTP traffic it observes.

Because it never probes the target, **p0f** is invisible on the wire and well-suited to forensic analysis of pcaps, fingerprinting visitors of a public-facing service, and detecting policy violations such as un-NATted devices behind a firewall.

# CAVEATS

Needs raw socket / **CAP_NET_RAW** access (or root). Detection quality depends on having a current **p0f.fp** signature database. **p0f v3** is a rewrite that does not read v2 fingerprint files; ensure the bundled fingerprints match the binary version.

# HISTORY

p0f was created by **Michal Zalewski** for passive TCP/IP stack fingerprinting.

# INSTALL

```apt: sudo apt install p0f```

```dnf: sudo dnf install p0f```

```pacman: sudo pacman -S p0f```

```zypper: sudo zypper install p0f```

```brew: brew install p0f```

```nix: nix profile install nixpkgs#p0f```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[nmap](/man/nmap)(1), [tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1)

