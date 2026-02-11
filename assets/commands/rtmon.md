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

# SEE ALSO

[ip](/man/ip)(8), [ip-monitor](/man/ip-monitor)(8)
