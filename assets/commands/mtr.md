# TLDR

**Run traceroute to a host**

```mtr [hostname]```

**Use TCP instead of ICMP**

```mtr --tcp [hostname]```

**Use UDP instead of ICMP**

```mtr --udp [hostname]```

**Specify port for TCP/UDP**

```mtr --tcp --port [443] [hostname]```

**Generate a report and exit**

```mtr --report [hostname]```

**Generate report with N cycles**

```mtr --report --report-cycles [100] [hostname]```

**Show numeric IPs only** (no DNS)

```mtr --no-dns [hostname]```

**Output as JSON**

```mtr --json [hostname]```

# SYNOPSIS

**mtr** [_--report_] [_--tcp_|_--udp_] [_--port num_] [_--no-dns_] [_options_] _hostname_

# PARAMETERS

**-r**, **--report**
> Generate report mode output and exit.

**-c** _NUM_, **--report-cycles** _NUM_
> Number of pings per hop (default: 10).

**-s** _SIZE_, **--psize** _SIZE_
> Packet size in bytes.

**-T**, **--tcp**
> Use TCP SYN packets.

**-U**, **--udp**
> Use UDP datagrams.

**-P** _PORT_, **--port** _PORT_
> Target port for TCP/UDP.

**-n**, **--no-dns**
> Do not resolve hostnames.

**-b**, **--show-ips**
> Show both hostname and IP.

**-w**, **--report-wide**
> Wide report format (no truncation).

**-j**, **--json**
> Output in JSON format.

**-x**, **--xml**
> Output in XML format.

**-C**, **--csv**
> Output in CSV format.

**-i** _SECONDS_, **--interval** _SECONDS_
> Interval between pings.

**-m** _NUM_, **--max-ttl** _NUM_
> Maximum TTL / hops.

**-f** _NUM_, **--first-ttl** _NUM_
> Starting TTL.

**-4**
> Use IPv4 only.

**-6**
> Use IPv6 only.

**-a** _ADDRESS_, **--address** _ADDRESS_
> Bind to source address.

# DESCRIPTION

**mtr** (My TraceRoute) combines the functionality of traceroute and ping into a single network diagnostic tool. It continuously probes each hop along the route to a destination, displaying real-time statistics about packet loss and latency.

The interactive display updates continuously, showing each router hop with loss percentage, sent/received counts, and latency statistics (best, average, worst, standard deviation). This makes it easy to identify where network problems occur.

Report mode (-r) runs a fixed number of cycles and outputs summary statistics, useful for logging and scripting. Output formats include plain text, JSON, XML, and CSV for integration with monitoring systems.

TCP and UDP modes help diagnose issues when ICMP is filtered. Using TCP port 443 or 80 often reaches destinations that block ping. The tool can also detect asymmetric routing and path changes.

MTR is invaluable for diagnosing intermittent network issues - you can watch it over time to catch sporadic packet loss that a single traceroute might miss.

# CAVEATS

Requires root or capabilities for raw socket access (ICMP/UDP) unless using TCP mode. Some routers don't respond to TTL-exceeded messages, appearing as "???". Rate limiting on routers can cause false packet loss readings. ICMP deprioritization may show higher latency than actual data traffic.

# HISTORY

**mtr** was written by **Matt Kimball** in **1997** as an improvement over traditional traceroute. The name originally stood for "Matt's TraceRoute." Roger Wolff took over maintenance, adding many features. The tool has become a standard network diagnostic utility, included in most Linux distributions and available for other Unix-like systems and Windows.

# SEE ALSO

[traceroute](/man/traceroute)(1), [ping](/man/ping)(1), [tracepath](/man/tracepath)(1), [nmap](/man/nmap)(1)
