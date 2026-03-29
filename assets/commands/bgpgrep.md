# TAGLINE

Filter and search BGP routing data in MRT format

# TLDR

**Filter routes** matching a specific subnet from MRT dumps

```bgpgrep [path/to/rib.mrt.gz] -subnet [192.0.2.0/24]```

**Filter routes** by AS path pattern

```bgpgrep [path/to/rib.mrt.gz] -aspath "[64496 64497]"```

**List routes** from a specific peer

```bgpgrep [path/to/rib.mrt.gz] -peer [198.51.100.1]```

**Find routes** that lead to a specific address

```bgpgrep [path/to/rib.mrt.gz] -supernet [8.8.8.8/32]```

**Detect bogon ASNs** in routing data

```bgpgrep [path/to/rib.mrt.gz] -bogon-asn```

**Combine filters** with logical operators

```bgpgrep [path/to/rib.mrt.gz] -bogon-asn -or -subnet [fullbogons.txt]```

**Filter by timestamp** range

```bgpgrep [path/to/updates.mrt.gz] -timestamp "[>=2021-07-01]" -and -timestamp "[<2021-07-08]"```

# SYNOPSIS

**bgpgrep** [_file ..._] [_filter expressions_]

# PARAMETERS

**-peer** _address|asn_
> Match routes received from a specific peer, identified by IP address or AS number.

**-aspath** _pattern_
> Match routes whose AS path matches the given pattern. Supports AS number sequences and regular expression-like syntax.

**-supernet** _prefix_
> Match routes that are supernets of (or equal to) the specified prefix.

**-subnet** _prefix|file_
> Match routes that are subnets of the specified prefix, or match against a prefix list from a file.

**-communities** _expression_
> Match routes with specific BGP community values. Supports wildcard patterns.

**-bogon-asn**
> Match routes containing bogon (reserved/unallocated) AS numbers in the AS path.

**-loops**
> Detect AS path loops.

**-timestamp** _condition_
> Filter by timestamp using comparison operators (e.g., ">=2021-07-01").

**-and**
> Logical AND between filter conditions (default when combining filters).

**-or**
> Logical OR between filter conditions.

**-not**
> Negate the following filter condition.

# DESCRIPTION

**bgpgrep** is part of the Micro BGP Suite, a set of shell tools for filtering and analyzing BGP routing data stored in MRT (Multi-threaded Routing Toolkit) format. It processes BGP table dumps and update files from route collectors like RIPE RIS and RouteViews.

Each line of output is prefixed with a character indicating the message type: `=` for RIB snapshot, `+` for announcement, `-` for withdrawal, and `#` for BGP state change. The output uses a pipe-delimited format where the 9th field contains the peer address and ASN, enabling easy integration with standard command-line tools like `cut` and `awk`.

The tool supports filtering by prefix, AS path patterns, peer, communities, and timestamp. Multiple filters can be combined using boolean operators (`-and`, `-or`, `-not`) with parentheses for grouping. It handles both IPv4 and IPv6 prefixes and supports compressed MRT files (gzip, bzip2).

# CAVEATS

Input must be in MRT format (common BGP dump format). Filter option names use single-dash long form (e.g., `-peer`, not `--peer`). AS path matching patterns use bgpgrep-specific syntax that differs from standard regular expressions.

# SEE ALSO

[traceroute](/man/traceroute)(1), [whois](/man/whois)(1)
