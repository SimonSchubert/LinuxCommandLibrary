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
> BPF-style capture filter expression, same syntax as tcpdump.

**-i** _DEVICE_
> Ethernet interface to listen on. If omitted, httpry polls the system and picks the first interface found.

**-r** _FILE_
> Read packets from an existing pcap capture file instead of doing a live capture. Does not require root.

**-o** _FILE_
> Output file for writing parsed packet data.

**-f** _FORMAT_
> Comma-delimited list of HTTP fields to output (e.g. `method,host,request-uri`).

**-m** _METHODS_
> Comma-delimited list of request methods to parse (e.g. `GET,POST`).

**-n** _COUNT_
> Parse this many HTTP packets, then exit. Default is 0 (run forever).

**-d**
> Run as a daemon process; status output goes to syslog. Requires **-o**.

**-b** _FILE_
> Write all processed HTTP packets to a binary pcap dump file.

**-p**
> Do not put the interface into promiscuous mode.

**-q**
> Suppress non-critical output (startup banner, statistics, etc).

**-u** _USER_
> Drop privileges to the given user after opening the capture device.

**-h**
> Display help information.

# DESCRIPTION

**httpry** is a specialized HTTP packet sniffer. It captures live traffic or reads a pcap file and logs HTTP request and response metadata - method, host, URI, headers - in a compact, customizable line-oriented format instead of full packet dumps.

The tool focuses purely on HTTP header parsing rather than general-purpose packet capture, making it lightweight for continuous logging and analysis of web traffic. Output fields are selected with **-f**, and it can run as a background daemon writing to syslog.

# CAVEATS

Live capture requires root (or appropriate capabilities) to open the network interface; reading from a pcap file with **-r** does not. Only plaintext HTTP is parsed - encrypted HTTPS traffic is invisible to it. Built on libpcap. The project has seen no releases since 2018 and is effectively unmaintained.

# HISTORY

httpry was created by **Jason Bittel** around **2005** as a lightweight, purpose-built alternative to general packet sniffers for logging HTTP traffic. It later moved to GitHub under jbittel/httpry.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [httpflow](/man/httpflow)(1), [ngrep](/man/ngrep)(1)

# RESOURCES

```[Source code](https://github.com/jbittel/httpry)```

<!-- verified: 2026-07-19 -->
