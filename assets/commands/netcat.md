# TAGLINE

versatile networking utility for reading and writing data across TCP and UDP

# TLDR

**Connect to a host** on a specific port

```nc [host] [port]```

**Listen for incoming connections** on a port

```nc -l [port]```

**Listen and keep listening** after client disconnects

```nc -lk [port]```

**Scan ports** on a host

```nc -zv [host] [20-30]```

**Send a file** over the network

```nc [host] [port] < [file.txt]```

**Receive a file** on listening side

```nc -l [port] > [received_file.txt]```

**Connect via UDP** instead of TCP

```nc -u [host] [port]```

**Set a connection timeout**

```nc -w [5] [host] [port]```

**Use IPv6**

```nc -6 [host] [port]```

# SYNOPSIS

**nc** [_options_] [_hostname_] [_port_]

**nc** -l [_options_] [_port_]

# PARAMETERS

**-l**
> Listen mode; wait for incoming connections

**-k**
> Keep listening after connection closes (with -l)

**-n**
> No DNS lookup; use numeric addresses only

**-p** _PORT_
> Specify source port

**-s** _ADDR_
> Specify source IP address

**-u**
> Use UDP instead of TCP

**-v**
> Verbose output

**-w** _SECS_
> Timeout for connections and idle time

**-z**
> Zero-I/O mode; scan without sending data

**-4**
> Force IPv4 only

**-6**
> Force IPv6 only

**-d**
> Do not read from stdin

**-i** _SECS_
> Delay between lines sent/received

**-r**
> Randomize port numbers

**-t**
> Enable telnet negotiation

**-C**
> Send CRLF line endings

**-x** _PROXY:PORT_
> Connect via proxy

**-X** _PROTO_
> Proxy protocol (4=SOCKS4, 5=SOCKS5, connect=HTTPS)

**-U**
> Use Unix domain sockets

**-e** _CMD_
> Execute command on connection (traditional nc only)

# DESCRIPTION

**nc** (netcat) is a versatile networking utility for reading and writing data across TCP and UDP connections. Often called the "network Swiss army knife," it can create almost any kind of network connection and is invaluable for debugging and testing.

Common uses include: port scanning, transferring files, creating simple chat servers, network debugging, and testing network services. In listen mode (**-l**), nc waits for incoming connections; otherwise it initiates connections to remote hosts.

Data is read from stdin and written to stdout, making it easy to pipe data through network connections. Multiple implementations exist (OpenBSD, GNU, ncat from Nmap), with varying feature sets. The **-e** option for command execution exists in some versions but is omitted from security-focused implementations.

# CAVEATS

Different netcat implementations have different options and capabilities. OpenBSD netcat omits the **-e** flag for security reasons. Some options like **-k** may not be available in all versions. Port scanning may be detected as hostile activity. Use **ncat** (from Nmap) for consistent cross-platform behavior.

# HISTORY

Netcat was originally written by a hacker known as **Hobbit** and released in **1995**. It quickly became an essential tool for network administrators and security professionals. The original version included powerful but potentially dangerous features like **-e** for command execution. OpenBSD rewrote netcat from scratch in **2001** with a focus on security, removing risky features. The Nmap project created **ncat** as a modern reimplementation with SSL support and additional features.

# SEE ALSO

[ncat](/man/ncat)(1), [socat](/man/socat)(1), [telnet](/man/telnet)(1), [ss](/man/ss)(8)
