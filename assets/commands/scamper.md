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

**scamper** performs Internet measurements. It's designed for large-scale network research.

Multiple probing techniques available. Traceroute, ping, and specialized measurements.

Warts output format stores rich data. Includes timing, responses, and metadata.

Rate limiting controls probe intensity. Prevents overwhelming networks.

Parallelism handles many targets. Designed for Internet-scale measurement.

# CAVEATS

Requires raw socket access. High-rate probing may cause issues. Research-oriented tool.

# HISTORY

**scamper** was developed by **Matthew Luckie** for Internet measurement research. It's used by researchers studying network topology and performance.

# SEE ALSO

[traceroute](/man/traceroute)(1), [ping](/man/ping)(1), [mtr](/man/mtr)(1)
