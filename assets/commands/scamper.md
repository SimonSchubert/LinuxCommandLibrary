# TAGLINE

Internet measurement tool for traceroute and probing

# TLDR

**Traceroute**

```scamper -c "trace" -i [target]```

**Ping**

```scamper -c "ping" -i [target]```

**Multiple targets from file**

```scamper -c "trace" -f [targets.txt]```

**Output to file**

```scamper -c "trace" -o [output.warts] -i [target]```

**Set probing rate**

```scamper -c "trace" -p [100] -i [target]```

**DNS lookup**

```scamper -c "host" -i [example.com]```

**Dealias (alias resolution)**

```scamper -c "dealias" -i [ip1],[ip2]```

# SYNOPSIS

**scamper** [_-c command_] [_-i target_] [_-f file_] [_-o output_] [_options_]

# PARAMETERS

**-c** _COMMAND_
> Measurement command.

**-i** _TARGET_
> Target address.

**-f** _FILE_
> Target file.

**-o** _FILE_
> Output file.

**-p** _RATE_
> Packets per second.

**-M** _MONITORNAME_
> Monitor name.

**-l** _LISTID_
> List ID.

# COMMANDS

**trace** - Traceroute
**ping** - ICMP ping
**host** - DNS lookup
**dealias** - Alias resolution
**tracelb** - Load-balanced traceroute
**sting** - NAT detection

# DESCRIPTION

**scamper** is a network measurement tool designed for large-scale Internet research. It supports multiple probing techniques including traceroute, ping, DNS lookups, alias resolution, and load-balanced path detection, running them efficiently against many targets with configurable parallelism and rate limiting.

Results are stored in the warts binary format, which captures rich metadata including precise timing, ICMP responses, and measurement parameters. Companion tools (sc_warts2json, sc_warts2csv, etc.) convert warts data into common formats for analysis. Rate limiting controls prevent overwhelming target networks while maintaining measurement throughput.

# CAVEATS

Requires raw socket access. High-rate probing may cause issues. Research-oriented tool.

# HISTORY

**scamper** was developed by **Matthew Luckie** for Internet measurement research. It's used by researchers studying network topology and performance.

# SEE ALSO

[traceroute](/man/traceroute)(1), [ping](/man/ping)(1), [mtr](/man/mtr)(1)
