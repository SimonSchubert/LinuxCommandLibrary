# TAGLINE

OpenBSD rewrite of netcat for TCP/UDP connections and port scanning

# TLDR

**Listen for incoming connections on a port**

```nc.openbsd -l [8080]```

**Connect to a host and port**

```nc.openbsd [host] [port]```

**Scan ports without sending data**

```nc.openbsd -zv [host] [20-30]```

**Keep listening after client disconnects**

```nc.openbsd -k -l [port]```

**Connect via a SOCKS5 proxy**

```nc.openbsd -X 5 -x [proxy_host:proxy_port] [host] [port]```

**Use UDP instead of TCP**

```nc.openbsd -u [host] [port]```

**Transfer a file** (receiver)

```nc.openbsd -l [port] > [received_file]```

**Send CRLF line endings** (useful for HTTP/SMTP)

```nc.openbsd -C [host] [port]```

# SYNOPSIS

**nc.openbsd** [**-46bCDdFhklNnrStUuvZz**] [**-I** _length_] [**-i** _interval_] [**-M** _ttl_] [**-m** _minttl_] [**-O** _length_] [**-P** _proxy_username_] [**-p** _source_port_] [**-q** _seconds_] [**-s** _sourceaddr_] [**-T** _keyword_] [**-V** _rtable_] [**-W** _recvlimit_] [**-w** _timeout_] [**-X** _proxy_protocol_] [**-x** _proxy_address_[_:port_]] [_destination_] [_port_]

# PARAMETERS

_DESTINATION_
> Target hostname or IP address.

_PORT_
> Port number or range (e.g., 20-30).

**-4**
> Use IPv4 addresses only.

**-6**
> Use IPv6 addresses only.

**-C**
> Send CRLF as line-ending (LF is translated to CR+LF).

**-D**
> Enable debugging on the socket.

**-d**
> Do not attempt to read from stdin.

**-F**
> Pass the first connected socket to stdout using sendmsg(2) and exit.

**-i** _interval_
> Sleep for interval seconds between lines of text sent and received.

**-k**
> Keep listening for another connection after the current one completes (requires -l).

**-l**
> Listen for an incoming connection rather than initiating one.

**-M** _ttl_
> Set the TTL / hop limit of outgoing packets.

**-m** _minttl_
> Drop incoming packets whose TTL / hop limit is under minttl.

**-N**
> Shut down the network socket after EOF on stdin.

**-n**
> Do not perform domain name resolution.

**-P** _proxy_username_
> Username to present to a proxy server requiring authentication.

**-p** _source_port_
> Specify the source port nc should use.

**-q** _seconds_
> After EOF on stdin, wait the specified number of seconds and then quit.

**-r**
> Choose source and/or destination ports randomly.

**-S**
> Enable RFC 2385 TCP MD5 signature option.

**-s** _sourceaddr_
> Set the source address to send packets from.

**-T** _keyword_
> Change the IPv4 TOS or IPv6 traffic class value.

**-U**
> Use Unix-domain sockets.

**-u**
> Use UDP instead of TCP.

**-V** _rtable_
> Set the routing table to be used.

**-v**
> Produce more verbose output.

**-W** _recvlimit_
> Terminate after receiving recvlimit packets from the network.

**-w** _timeout_
> Timeout connections that cannot be established or are idle after timeout seconds.

**-X** _proxy_protocol_
> Proxy protocol: 4 (SOCKS4), 5 (SOCKS5, default), or connect (HTTPS proxy).

**-x** _proxy_address_[:_port_]
> Connect to destination using the specified proxy.

**-z**
> Only scan for listening daemons, without sending any data.

# DESCRIPTION

**nc.openbsd** is the OpenBSD rewrite of netcat, a versatile networking utility for reading and writing data across TCP, UDP, and Unix-domain socket connections. It can open connections, send packets, listen on ports, perform port scanning, and handle both IPv4 and IPv6.

Common uses include simple TCP proxying, shell scripts that interact with network services, network daemon testing, and ad-hoc file transfers. The **-X** and **-x** flags provide built-in SOCKS and HTTPS proxy support, and the **-z** flag enables lightweight port scanning.

Unlike some other netcat implementations, the OpenBSD version does not have **-c** or **-e** options for executing programs on connection, as a security measure.

# CAVEATS

OpenBSD variant of netcat, commonly the default on Debian/Ubuntu systems. Port scanning (**-z**) cannot be used with listen mode (**-l**). The **-k** flag only works with **-l**. No **-c** or **-e** option exists for executing commands, unlike some other netcat variants.

# HISTORY

nc.openbsd is the **OpenBSD** rewrite of the original netcat by Hobbit (1995). The OpenBSD version was developed to provide a cleaner, more secure implementation, removing features like arbitrary command execution (**-e**) and adding proxy support, TLS capabilities (on OpenBSD), and Unix-domain socket support.

# SEE ALSO

[nc](/man/nc)(1), [ncat](/man/ncat)(1), [socat](/man/socat)(1)

