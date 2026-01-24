# TLDR

**Filter BGP data** for a specific prefix

```bgpgrep -p [192.0.2.0/24] [path/to/bgp.dump]```

**Search for routes** from a specific AS

```bgpgrep -a [AS64496] [path/to/bgp.dump]```

**Filter by AS path** pattern

```bgpgrep -P "[64496 64497]" [path/to/bgp.dump]```

**Extract routes** with a specific origin AS

```bgpgrep -o [AS64496] [path/to/bgp.dump]```

**Read from stdin** (MRT format)

```cat [bgp.dump] | bgpgrep -p [10.0.0.0/8]```

**Output in machine-readable format**

```bgpgrep -m -p [prefix] [bgp.dump]```

**Filter with multiple conditions**

```bgpgrep -p [prefix] -a [AS_number] [bgp.dump]```

# SYNOPSIS

**bgpgrep** [_-p prefix_] [_-a asn_] [_-o asn_] [_-P pattern_] [_-m_] [_file ..._]

# PARAMETERS

**-p** _prefix_
> Match routes for the specified IP prefix.

**-a** _asn_
> Match routes with the AS number anywhere in the path.

**-o** _asn_
> Match routes with the specified origin AS.

**-P** _pattern_
> Match AS path against the given pattern.

**-m**
> Machine-readable output format.

**-v**
> Invert match (show non-matching entries).

**-c**
> Count matching entries.

**-h**
> Display help information.

# DESCRIPTION

**bgpgrep** is a tool for filtering and searching BGP routing data stored in MRT (Multi-threaded Routing Toolkit) format. It processes BGP table dumps and update files from route collectors like RIPE RIS and RouteViews.

The tool supports filtering by IP prefix, AS number, AS path patterns, and origin AS. Multiple filters can be combined to narrow down results. This is useful for network operators and researchers analyzing routing data, investigating routing anomalies, or studying AS relationships.

BGP dumps in MRT format can be obtained from public route collectors. The tool processes these binary files efficiently, outputting matching BGP announcements in a human-readable or machine-parseable format.

Common use cases include tracking route propagation, identifying prefix hijacks, analyzing AS path lengths, and studying routing policy effects. The tool handles both IPv4 and IPv6 prefixes.

# CAVEATS

Input must be in MRT format (common BGP dump format). Large dump files can take significant time to process. AS path matching patterns may have implementation-specific syntax. Memory usage scales with file size.

# HISTORY

**bgpgrep** was developed as part of the BGP analysis toolset for network operators and researchers working with routing data. It complements other tools like **bgpdump** and **bgpstream** in the BGP data analysis ecosystem. The tool emerged from the need for efficient filtering of large-scale BGP datasets from route collectors.

# SEE ALSO

[bgpdump](/man/bgpdump)(1), [bgpstream](/man/bgpstream)(1), [traceroute](/man/traceroute)(1), [whois](/man/whois)(1)
