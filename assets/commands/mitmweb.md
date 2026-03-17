# TAGLINE

Man-in-the-middle proxy with a web interface

# TLDR

**Start mitmweb with default settings**

```mitmweb```

**Specify proxy and web interface ports**

```mitmweb --listen-port [8080] --web-port [8081]```

**Save intercepted flows to a file**

```mitmweb -w [flows.mitm]```

**Load previously saved flows**

```mitmweb -r [flows.mitm]```

**Run in upstream proxy mode**

```mitmweb --mode upstream:[http://proxy:8080]```

**Run in transparent proxy mode**

```mitmweb --mode transparent```

**Run in reverse proxy mode**

```mitmweb --mode reverse:[https://target.example.com]```

**Disable auto-opening the browser**

```mitmweb --no-web-open-browser```

# SYNOPSIS

**mitmweb** [_options_]

# PARAMETERS

**--web-port** _PORT_
> Port for the web interface (default: 8081).

**--web-open-browser**
> Automatically open a browser on startup (default: true).

**--no-web-open-browser**
> Do not automatically open a browser.

**--listen-port** _PORT_
> Proxy listen port (default: 8080).

**-w** _FILE_
> Write flows to file.

**-r** _FILE_
> Read flows from file.

**--mode** _MODE_
> Proxy mode: regular, transparent, socks5, reverse:SPEC, upstream:SPEC, wireguard.

**--set** _OPTION=VALUE_
> Set an arbitrary option (e.g., --set ignore_hosts=example.com).

**-s** _SCRIPT_
> Run a Python addon script.

**--ssl-insecure**
> Do not verify upstream server SSL/TLS certificates.

**--help**
> Display help information.

# DESCRIPTION

**mitmweb** is the web-based interface for mitmproxy. It intercepts, inspects, modifies, and replays HTTP/HTTPS traffic through a browser-based UI. The web interface provides flow listing, detail views, and interactive request/response editing.

By default, mitmweb starts a proxy on port 8080 and a web interface on port 8081. It supports the same proxy modes as mitmproxy: regular, transparent, SOCKS5, reverse proxy, upstream proxy, and WireGuard.

Clients must be configured to use the proxy, and for HTTPS interception, the mitmproxy CA certificate must be installed on the client. Visit http://mitm.it through the proxy to download certificates.

# CAVEATS

HTTPS interception requires installing the mitmproxy CA certificate on the client device. Transparent mode requires OS-level traffic redirection (e.g., iptables). The web interface should not be exposed to untrusted networks without authentication.

# HISTORY

**mitmweb** is part of the **mitmproxy** project, created by Aldo Cortesi. The mitmproxy project started in **2010** and mitmweb was added to provide a browser-based alternative to the console-based mitmproxy interface.

# SEE ALSO

[mitmproxy](/man/mitmproxy)(1), [mitmdump](/man/mitmdump)(1), [wireshark](/man/wireshark)(1), [tshark](/man/tshark)(1)
