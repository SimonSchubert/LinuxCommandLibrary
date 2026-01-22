# TLDR

**Start web interface**

```mitmweb```

**Specify port**

```mitmweb --web-port [8081] --listen-port [8080]```

**Save flows**

```mitmweb -w [flows.mitm]```

**Load flows**

```mitmweb -r [flows.mitm]```

**Upstream proxy**

```mitmweb --mode upstream:[http://proxy:8080]```

**Transparent mode**

```mitmweb --mode transparent```

# SYNOPSIS

**mitmweb** [_options_]

# PARAMETERS

**--web-port** _PORT_
> Web interface port.

**--listen-port** _PORT_
> Proxy listen port.

**-w** _FILE_
> Write flows to file.

**-r** _FILE_
> Read flows from file.

**--mode** _MODE_
> Proxy mode.

**--help**
> Display help information.

# DESCRIPTION

**mitmweb** is mitmproxy with a web interface. It intercepts and inspects HTTP/HTTPS traffic.

The tool provides visual flow inspection. Used for debugging and security testing.

mitmweb provides web-based proxy.

# CAVEATS

HTTPS needs certificate. Security tool. Browser-based interface.

# HISTORY

mitmweb is part of **mitmproxy** project, providing a web-based interface for traffic interception.

# SEE ALSO

[mitmproxy](/man/mitmproxy)(1), [mitmdump](/man/mitmdump)(1), [wireshark](/man/wireshark)(1)

