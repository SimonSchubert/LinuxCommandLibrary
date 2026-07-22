# TAGLINE

Monitor kernel routing table changes

# TLDR

Save all **network state changes** to a file

```sudo rtmon file path/to/file```

Specify the **type of change** to log

```sudo rtmon file link```

# SYNOPSIS

**rtmon** [_options_] file _path_

# PARAMETERS

**file** _path_
> Output file for network state changes

_type_
> Filter by change type (link, address, route)

# DESCRIPTION

**rtmon** monitors and records network state changes to a file. It captures link changes, address modifications, and routing table updates for later analysis.

The output can be replayed or analyzed to understand network configuration history.

# CAVEATS

Requires root privileges. Output file can grow large over time with frequent changes.

# HISTORY

Part of **iproute2** package, providing network monitoring and logging capabilities.

# INSTALL

```apt: sudo apt install iproute2```

```pacman: sudo pacman -S iproute2```

```apk: sudo apk add iproute2```

```zypper: sudo zypper install iproute2```

```brew: brew install iproute2```

```nix: nix profile install nixpkgs#iproute2```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ip](/man/ip)(8), [ip-monitor](/man/ip-monitor)(8)
