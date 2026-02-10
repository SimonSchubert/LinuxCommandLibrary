# TAGLINE

specialized HTTP packet sniffer

# TLDR

**Capture HTTP traffic**

```sudo httpry -i [eth0]```

**Filter by port**

```sudo httpry -i [eth0] 'port 8080'```

**Log to file**

```sudo httpry -i [eth0] -o [http.log]```

**Read from pcap**

```httpry -r [capture.pcap]```

**Custom output format**

```sudo httpry -i [eth0] -f [method,host,request-uri]```

# SYNOPSIS

**httpry** [_options_] [_filter_]

# PARAMETERS

_FILTER_
> BPF filter expression.

**-i** _INTERFACE_
> Network interface.

**-r** _FILE_
> Read from pcap.

**-o** _FILE_
> Output file.

**-f** _FIELDS_
> Output fields.

**-d**
> Daemon mode.

**--help**
> Display help information.

# DESCRIPTION

**httpry** is a specialized HTTP packet sniffer. It captures and logs HTTP request and response metadata for analysis.

The tool focuses on HTTP header parsing with customizable output. It's designed for HTTP-specific traffic analysis and logging.

# CAVEATS

Requires root. HTTP only, not HTTPS. Uses libpcap.

# HISTORY

httpry was developed as a lightweight HTTP-specific packet analysis tool for network monitoring.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [httpflow](/man/httpflow)(1), [ngrep](/man/ngrep)(1)
