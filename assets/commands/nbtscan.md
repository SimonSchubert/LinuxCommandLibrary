# TAGLINE

scans networks for NetBIOS name information

# TLDR

**Scan network for NetBIOS names**

```nbtscan [192.168.1.0/24]```

**Scan single host**

```nbtscan [192.168.1.10]```

**Verbose output**

```nbtscan -v [192.168.1.0/24]```

**Human readable output**

```nbtscan -h [192.168.1.0/24]```

**Show all names**

```nbtscan -f [192.168.1.0/24]```

**Set timeout**

```nbtscan -t [5] [192.168.1.0/24]```

# SYNOPSIS

**nbtscan** [_options_] _target_

# PARAMETERS

_TARGET_
> IP address or network range.

**-v**
> Verbose mode.

**-h**
> Human readable output.

**-f**
> Show full NBT resource records.

**-t** _SECS_
> Timeout in seconds.

**--help**
> Display help information.

# DESCRIPTION

**nbtscan** sweeps a target IP address or CIDR range with NetBIOS Name Service (UDP port **137**) queries and decodes the responses, printing the NetBIOS computer name, logged-in user, workgroup/domain, MAC address (if available), and registered service codes. It is the network-wide equivalent of **nbtstat -A** from Windows, useful for inventorying Windows and Samba hosts on a LAN.

The default output is one host per line, suitable for piping into shells; **-v** shows every NetBIOS name table entry, **-f** prints the full table including type codes (00, 03, 20, 1B, 1C, ...) that map to workstations, file servers, domain controllers, etc. **-h** prints a more human-readable section per host.

# CAVEATS

NetBIOS over TCP/IP must be enabled on the target hosts; modern Windows networks may have it disabled in favor of SMB direct over TCP/445. Sweeping a network produces noticeable traffic and will frequently trigger IDS alerts; obtain authorization before scanning. UDP/137 is often blocked at the network perimeter, so external scans usually return nothing.

# HISTORY

**nbtscan** was written by **Alla Bezroutchko** (Steve Friedl maintained early releases) as a fast, Unix-side replacement for Windows **nbtstat -A**. It has been distributed by virtually every penetration-testing and forensics Linux distribution since the early 2000s.

# SEE ALSO

[nmblookup](/man/nmblookup)(1), [nmap](/man/nmap)(1), [smbclient](/man/smbclient)(1)

