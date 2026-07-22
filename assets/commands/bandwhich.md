# TAGLINE

Display network bandwidth usage per process

# TLDR

**Monitor** network usage (requires root)

```sudo bandwhich```

Monitor a **specific interface**

```sudo bandwhich --interface [eth0]```

**Do not resolve** hostnames

```sudo bandwhich --no-resolve```

Show only the **processes** table

```sudo bandwhich --processes```

Show **cumulative** (total) utilization

```sudo bandwhich --total-utilization```

Output **machine-friendly** text instead of the UI

```sudo bandwhich --raw```

# SYNOPSIS

**bandwhich** [_options_]

# DESCRIPTION

**bandwhich** is a CLI utility for displaying current network utilization by process, connection, and remote IP/hostname. It provides a terminal UI showing which programs are using bandwidth in real-time.

The tool is particularly useful for identifying bandwidth-heavy applications and monitoring network activity.

# PARAMETERS

**-i**, **--interface** _name_
> Monitor a specific network interface (may be repeated).

**-r**, **--raw**
> Output machine-friendly text instead of the interactive terminal UI.

**-n**, **--no-resolve**
> Do not resolve IP addresses to hostnames.

**-s**, **--show-dns**
> Show DNS queries in the output.

**-d**, **--dns-server** _ip_
> Use a custom DNS server for reverse lookups.

**-p**, **--processes**
> Show only the processes table.

**-c**, **--connections**
> Show only the connections table.

**-a**, **--addresses**
> Show only the remote addresses table.

**-t**, **--total-utilization**
> Show cumulative usage statistics rather than per-second rates.

**-u**, **--unit-family** _family_
> Unit format: bin-bytes, bin-bits, si-bytes, or si-bits.

# FEATURES

- Real-time bandwidth monitoring
- Per-process statistics
- Connection details
- Remote host identification
- Interactive terminal UI
- DNS query logging

# INTERFACE

Display sections:
- **Processes** - Bandwidth per process
- **Connections** - Active connections
- **Remote addresses** - Traffic by destination
- **Total** - Aggregate statistics

# CAVEATS

Requires root/sudo for packet capture. May not capture all traffic types. Hostname resolution can slow display. Terminal must support required features. Some VPN traffic may not be attributed correctly.

# HISTORY

**bandwhich** was created by Aram Drevekenin around **2019** as a modern, user-friendly alternative to tools like iftop and nethogs. It is written in Rust and is currently in passive maintenance.

# INSTALL

```pacman: sudo pacman -S bandwhich```

```apk: sudo apk add bandwhich```

```brew: brew install bandwhich```

```nix: nix profile install nixpkgs#bandwhich```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[iftop](/man/iftop)(8), [nethogs](/man/nethogs)(8), [nload](/man/nload)(1), [netstat](/man/netstat)(8)

# RESOURCES

```[Source code](https://github.com/imsnif/bandwhich)```

<!-- verified: 2026-06-19 -->
