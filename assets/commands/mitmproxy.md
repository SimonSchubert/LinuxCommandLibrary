# TAGLINE

interactive man-in-the-middle proxy for HTTP and HTTPS traffic

# TLDR

**Start mitmproxy** on the default port (8080)

```mitmproxy```

**Start on a specific port**

```mitmproxy -p [8888]```

**Start in reverse proxy mode**

```mitmproxy -m reverse:https://[example.com]```

**Start in transparent proxy mode**

```mitmproxy -m transparent```

**Load a Python script** for traffic manipulation

```mitmproxy -s [path/to/script.py]```

**Read flows from a file**

```mitmproxy -r [flows.mitm]```

**Ignore specific hosts**

```mitmproxy --ignore-hosts '^example\.com$'```

**Start web interface** instead of console

```mitmweb```

# SYNOPSIS

**mitmproxy** [_options_]

**mitmdump** [_options_]

**mitmweb** [_options_]

# PARAMETERS

**-p** _PORT_, **--listen-port** _PORT_
> Proxy service port (default: 8080)

**-m** _MODE_, **--mode** _MODE_
> Proxy mode: regular, transparent, socks5, reverse:SPEC, upstream:SPEC

**-T**, **--transparent**
> Enable transparent proxy mode

**--socks**
> Enable SOCKS5 proxy mode

**-R** _URL_, **--reverse** _URL_
> Reverse proxy to upstream server (http[s]://host[:port])

**-s** _SCRIPT_
> Path to Python script for flow manipulation

**-r** _FILE_
> Read flows from file

**-w** _FILE_
> Write flows to file

**--ignore-hosts** _REGEX_
> Regex matching hosts to ignore (not intercepted)

**--allow-hosts** _REGEX_
> Regex matching hosts to intercept

**--anticache**
> Strip cache headers to prevent 304 responses

**--insecure**
> Do not verify upstream SSL/TLS certificates

**--cert** _SPEC_
> Add SSL certificate (path or directory)

**--cadir** _DIR_
> Location of CA files (default: ~/.mitmproxy)

**--no-http2**
> Disable HTTP/2 support

**-q**, **--quiet**
> Quiet mode

**-n**, **--no-server**
> Don't start a proxy server

**--options**
> Dump all options as YAML

**-h**, **--help**
> Show help message

# DESCRIPTION

**mitmproxy** is an interactive man-in-the-middle proxy for HTTP and HTTPS traffic. It allows inspection, modification, and replay of web traffic through a console interface. The suite includes three tools: **mitmproxy** (console UI), **mitmweb** (web UI), and **mitmdump** (command-line only).

The proxy works by intercepting connections and presenting its own certificate to clients. Install the mitmproxy CA certificate on clients to avoid SSL warnings. Traffic flows can be filtered, modified with Python scripts, or saved for later analysis.

Proxy modes include regular (explicit proxy), transparent (network-level interception), reverse (forwarding to upstream), and SOCKS5. Python addons can modify requests and responses, implement custom logic, or integrate with other tools.

# CAVEATS

Intercepting HTTPS requires clients to trust the mitmproxy CA certificate, which can be found in **~/.mitmproxy**. Transparent mode requires additional system configuration (iptables on Linux). Some applications implement certificate pinning and will refuse connections through mitmproxy. Intercepting traffic without authorization may violate laws.

# HISTORY

mitmproxy was created by **Aldo Cortesi** and first released in **2010**. Written in **Python**, it became a standard tool for web application security testing and debugging. The project introduced innovative features like the web interface (mitmweb) and a powerful scripting API. It gained widespread adoption among security researchers, developers, and QA engineers for analyzing HTTP traffic.

# SEE ALSO

[burpsuite](/man/burpsuite)(1), [wireshark](/man/wireshark)(1), [tcpdump](/man/tcpdump)(1), [charles](/man/charles)(1)
