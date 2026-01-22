# TLDR

**Listen** on a port and save to file

```ncat -l [port] > [path/to/file]```

**Listen** with multiple connections (keep open)

```ncat -lk [port]```

**Send file** to remote host

```ncat < [path/to/file] [address] [port]```

Accept connections over **SSL**

```ncat --ssl -lk [port]```

**Connect** to SSL server

```ncat --ssl [host] [port]```

**Check connectivity** with timeout

```ncat -w [seconds] -vz [host] [port]```

Create a **chat server**

```ncat -l [port] --chat```

# SYNOPSIS

**ncat** [**-l**] [**-k**] [**--ssl**] [**-w** _timeout_] [**-v**] [**-z**] [_host_] [_port_]

# PARAMETERS

**-l, --listen**
> Listen for incoming connections

**-k, --keep-open**
> Accept multiple connections in listen mode

**--ssl**
> Use SSL/TLS encryption

**--ssl-cert _file_**
> Specify SSL certificate file

**--ssl-key _file_**
> Specify SSL private key file

**-w, --wait _seconds_**
> Connection timeout in seconds

**-v, --verbose**
> Enable verbose output

**-z**
> Zero-I/O mode; report connection status only

**-p, --source-port _port_**
> Specify source port

**-e, --exec _command_**
> Execute command after connection

**--chat**
> Enable chat mode for multiple users

**--proxy _host:port_**
> Connect through proxy

**--proxy-type _type_**
> Proxy type: http, socks4, socks5

**-4**
> Use IPv4 only

**-6**
> Use IPv6 only

# DESCRIPTION

**ncat** is a networking utility from the Nmap project for reading, writing, redirecting, and encrypting data across networks. It is a reimplementation of netcat with additional features including SSL support, proxy connections, and IPv6.

Ncat can operate as a simple TCP/UDP client or server, port scanner, or network relay. It supports connection brokering, access control, and can be used for file transfer, port forwarding, and network debugging.

# CAVEATS

The --exec option can be dangerous and should be used carefully. SSL connections require proper certificate handling for security. Some features may require root privileges for privileged ports.

# HISTORY

**ncat** was developed as part of the **Nmap** project by Fyodor and contributors. It was designed as a modern replacement for the traditional netcat utility with enhanced features and better security options.

# SEE ALSO

[nc](/man/nc)(1), [netcat](/man/netcat)(1), [nmap](/man/nmap)(1), [socat](/man/socat)(1)
