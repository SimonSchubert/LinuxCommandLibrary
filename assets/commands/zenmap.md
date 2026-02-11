# TAGLINE

Graphical interface for Nmap scanner

# TLDR

**Launch GUI**

```zenmap```

**Scan a target**

```zenmap -t [target]```

**Open existing scan results**

```zenmap -f [results.xml]```

# SYNOPSIS

**zenmap** [_options_] [_results_file_]

# PARAMETERS

**-t**, **--target** _target_
> Start with specified target

**-p**, **--profile** _profile_
> Start with specified scan profile

**-f**, **--file** _file_
> Open scan results file

**-n**, **--nmap** _path_
> Path to nmap executable

**-v**, **--verbose**
> Increase verbosity

**--help**
> Display help message

# DESCRIPTION

**Zenmap** is the official graphical user interface for Nmap, the network security scanner. It provides visual network topology mapping, scan comparison, and profile management to make Nmap more accessible.

The interface includes predefined scan profiles (Intense scan, Quick scan, Ping scan, etc.) and allows creating custom profiles. Scan results are displayed in multiple views: Nmap output, ports/hosts tables, topology map, and host details.

Zenmap can save scans to its database for later comparison, helping track network changes over time. The topology view visualizes discovered hosts and their relationships.

Scan profiles translate to Nmap command lines, visible in the interface. This helps users learn Nmap's options while using the GUI.

# CAVEATS

Many scan types require root/administrator privileges for raw socket access.

Scanning networks without authorization may be illegal. Only scan networks you own or have explicit permission to test.

The GTK-based interface may not be available on all systems. nmap command-line works everywhere.

Zenmap development is less active than Nmap itself. Some newer Nmap features may not have GUI support.

# SEE ALSO

[nmap](/man/nmap)(1), [masscan](/man/masscan)(1), [netstat](/man/netstat)(8)
