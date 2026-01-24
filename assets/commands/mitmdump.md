# TLDR

**Start proxy on default port**

```mitmdump```

**Start on specific port**

```mitmdump -p [8888]```

**Save traffic to file**

```mitmdump -w [traffic.mitm]```

**Read and replay traffic**

```mitmdump -r [traffic.mitm]```

**Run with script**

```mitmdump -s [script.py]```

**Filter requests by URL**

```mitmdump --set flow_detail=3 "~u example.com"```

**Transparent proxy mode**

```mitmdump --mode transparent```

**Ignore specific hosts**

```mitmdump --ignore-hosts "^example\.com$"```

# SYNOPSIS

**mitmdump** [_-p port_] [_-w file_] [_-r file_] [_-s script_] [_--mode mode_] [_options_] [_filter_]

# PARAMETERS

**-p** _PORT_, **--listen-port** _PORT_
> Proxy listen port (default: 8080).

**-w** _FILE_
> Write flows to file.

**-r** _FILE_
> Read flows from file.

**-s** _SCRIPT_
> Run Python script.

**--mode** _MODE_
> Proxy mode: regular, transparent, socks5, reverse, upstream.

**--listen-host** _HOST_
> Listen host.

**--ssl-insecure**
> Don't verify server SSL certificates.

**--ignore-hosts** _PATTERN_
> Ignore hosts matching regex.

**--intercept** _FILTER_
> Intercept flows matching filter.

**--modify-body** _SPEC_
> Modify response body.

**--modify-headers** _SPEC_
> Modify headers.

**--set** _KEY=VALUE_
> Set option value.

**--flow-detail** _LEVEL_
> Output detail level (0-3).

**-q**, **--quiet**
> Suppress output.

**-k**, **--insecure**
> Don't verify upstream SSL.

# DESCRIPTION

**mitmdump** is the command-line companion to mitmproxy, a powerful HTTPS proxy for debugging, testing, and security analysis. It captures and manipulates HTTP/HTTPS traffic.

The tool acts as a man-in-the-middle proxy. For HTTPS, it generates certificates on-the-fly, enabling inspection of encrypted traffic. Clients must trust mitmproxy's CA certificate.

Traffic can be saved (-w) and replayed (-r) for analysis or testing. Saved flows include complete request/response data with timing information.

Python scripts (-s) enable programmatic traffic manipulation. Scripts define hooks like request(), response(), and clientconnect() to modify or analyze traffic in real-time.

Filter expressions select specific flows: ~u for URL, ~m for method, ~b for body content, ~h for headers. Filters can combine with & (and), | (or), and ! (not).

Modes include: regular (explicit proxy), transparent (network-level interception), reverse (forward to specific server), and upstream (chain to another proxy).

# CAVEATS

HTTPS interception requires CA trust. Some applications pin certificates. Transparent mode needs iptables/pf configuration. Large traffic volumes use significant memory. Recording all traffic impacts performance.

# HISTORY

**mitmproxy** and mitmdump were created by **Aldo Cortesi** around **2010**. The project grew from security research tools into a widely-used proxy suite. It's essential for mobile app debugging, API development, and security testing.

# SEE ALSO

[mitmproxy](/man/mitmproxy)(1), [charles](/man/charles)(1), [wireshark](/man/wireshark)(1), [tcpdump](/man/tcpdump)(1)
