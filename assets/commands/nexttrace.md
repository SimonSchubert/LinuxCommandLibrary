# TAGLINE

Visual traceroute with ASN, geolocation, and rich output

# TLDR

**Trace** a host

```nexttrace [example.com]```

**Fast mode** / map-related options

```nexttrace --help```

**JSON** output for scripting

```nexttrace --json [host]```

# SYNOPSIS

**nexttrace** [*options*] *host*

# DESCRIPTION

**nexttrace** (NTrace) is an enhanced traceroute implementing multiple protocols with ASN lookups, geolocation, and polished terminal output. Developed as **nxtrace/NTrace-core**; the user-facing binary is typically **nexttrace**. Available via package managers and release builds for many architectures.

# PARAMETERS

*host*

> Target hostname or IP.

Common flags (names vary by version): protocol selection (ICMP/TCP/UDP), max hops, parallel probes, language, and **--json**. Always prefer **nexttrace --help**.

# CAVEATS

Raw sockets/privileges may be required for some probe types. Geolocation databases can be wrong. Respect remote networks—do not abuse high-rate probing.

# SEE ALSO

[traceroute](/man/traceroute)(8), [mtr](/man/mtr)(8), [tracepath](/man/tracepath)(8)

# RESOURCES

```[Source code](https://github.com/nxtrace/NTrace-core)```

```[Homepage](https://nxtrace.org)```

<!-- verified: 2026-07-19 -->
