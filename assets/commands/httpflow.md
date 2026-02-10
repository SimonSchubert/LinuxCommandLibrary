# TAGLINE

captures and displays HTTP traffic in real-time

# TLDR

**Capture HTTP traffic on interface**

```sudo httpflow -i [eth0]```

**Filter by port**

```sudo httpflow -i [eth0] 'port 80'```

**Save to file**

```sudo httpflow -i [eth0] -w [output]```

**Read from pcap**

```httpflow -r [capture.pcap]```

# SYNOPSIS

**httpflow** [_options_] [_filter_]

# PARAMETERS

_FILTER_
> BPF filter expression.

**-i** _INTERFACE_
> Network interface.

**-r** _FILE_
> Read from pcap file.

**-w** _DIR_
> Write output directory.

**-u** _URL_
> Filter by URL pattern.

**-d**
> Print debug info.

**--help**
> Display help information.

# DESCRIPTION

**httpflow** captures and displays HTTP traffic in real-time. It reconstructs HTTP requests and responses from network packets.

The tool is useful for debugging, monitoring, and analyzing web traffic. It displays headers, bodies, and request/response pairs.

# CAVEATS

Requires root for live capture. Cannot decode HTTPS. Privacy considerations apply.

# HISTORY

httpflow was created as a tool for real-time HTTP traffic analysis and debugging.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [mitmproxy](/man/mitmproxy)(1)
