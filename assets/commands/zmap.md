# TAGLINE

Fast internet-wide network scanner

# TLDR

**Scan port 80 on a network**

```sudo zmap -p [80] [192.168.1.0/24]```

**Scan entire internet on specific port**

```sudo zmap -p [443] -o [results.txt]```

**Scan with rate limit**

```sudo zmap -p [22] -r [10000] [10.0.0.0/8]```

**Scan with bandwidth limit**

```sudo zmap -p [80] -B [10M] [target_subnet]```

**Use specific interface**

```sudo zmap -p [80] -i [eth0] [target]```

**Output as CSV**

```sudo zmap -p [80] -o [results.csv] -O csv [target]```

# SYNOPSIS

**zmap** [**-p** _port_] [**-o** _outfile_] [**-b** _blacklist_] [_options_] [_target_]

# PARAMETERS

**-p**, **--target-port** _port_
> Port to scan

**-o**, **--output-file** _file_
> Output results to file

**-b**, **--blacklist-file** _file_
> File of addresses to exclude

**-w**, **--whitelist-file** _file_
> File of addresses to include (only scan these)

**-r**, **--rate** _pps_
> Packets per second (default: unlimited)

**-B**, **--bandwidth** _bps_
> Bandwidth limit (e.g., 10M, 1G)

**-i**, **--interface** _iface_
> Network interface

**-G**, **--gateway-mac** _mac_
> Gateway MAC address

**-O**, **--output-module** _module_
> Output format (csv, json, extended_file)

**-f**, **--output-fields** _fields_
> Comma-separated fields to output

**-n**, **--max-targets** _n_
> Maximum targets to scan

**-N**, **--max-results** _n_
> Stop after N results

# DESCRIPTION

**ZMap** is a fast network scanner designed for internet-wide surveys. It can scan the entire IPv4 address space in under 45 minutes from a single machine, using optimized packet generation and stateless scanning.

Unlike nmap which maintains connection state, ZMap sends probes and separately listens for responses, enabling much higher throughput. It uses a cyclic multiplicative group to randomize scan order, avoiding network hotspots.

ZMap supports various probe types through modules (TCP SYN, ICMP, UDP) and output formats. It's commonly used for security research, measuring internet-wide vulnerability exposure, and census-style studies.

# CAVEATS

**WARNING**: Scanning networks without authorization is illegal in many jurisdictions. Only scan networks you own or have explicit permission to test.

Requires root/CAP_NET_RAW for raw socket access.

High scan rates can overwhelm networks or trigger security alerts. Use rate limiting and respect network policies.

Always use a blacklist to exclude sensitive addresses (RFC 1918, military, critical infrastructure).

# SEE ALSO

[nmap](/man/nmap)(1), [masscan](/man/masscan)(1), [unicornscan](/man/unicornscan)(1)
