# TAGLINE

Multipurpose bidirectional data relay

# TLDR

**Forward TCP port** to another host

```socat TCP-LISTEN:[8080],fork TCP:[remote.host]:[80]```

**Create a simple TCP server**

```socat TCP-LISTEN:[1234],reuseaddr,fork EXEC:[/bin/cat]```

**Connect to a TCP port**

```socat - TCP:[host]:[port]```

**Forward Unix socket** to TCP

```socat TCP-LISTEN:[1234],fork UNIX-CONNECT:[/var/run/app.sock]```

**Create bidirectional pipe** between processes

```socat EXEC:'[command1]' EXEC:'[command2]'```

**Create a simple chat server**

```socat TCP-LISTEN:[12345],fork,reuseaddr STDOUT```

**SSL/TLS connection**

```socat - OPENSSL:[host]:[443],verify=0```

**Serial port to TCP**

```socat TCP-LISTEN:[5000] /dev/ttyUSB0,b9600,raw,echo=0```

**Create virtual terminal pair**

```socat -d -d pty,raw,echo=0 pty,raw,echo=0```

# SYNOPSIS

**socat** [_options_] _address1_ _address2_

# DESCRIPTION

**socat** (SOcket CAT) is a multipurpose relay tool that establishes two bidirectional byte streams and transfers data between them. It's like a more powerful netcat that supports numerous address types and protocols.

Address types include TCP, UDP, Unix sockets, files, pipes, PTYs, processes (EXEC), SSL, serial devices, and many more. socat can connect, listen, and relay between any combination of these.

Common use cases include port forwarding, protocol conversion, debugging network services, creating tunnels, and connecting disparate systems. It's invaluable for system administration and network troubleshooting.

# PARAMETERS

**TCP-LISTEN:** _port_
> Listen on TCP port.

**TCP:** _host_ **:** _port_
> Connect to TCP host:port.

**UDP:** _host_ **:** _port_
> UDP connection.

**UNIX-CONNECT:** _path_
> Connect to Unix socket.

**UNIX-LISTEN:** _path_
> Listen on Unix socket.

**EXEC:** _command_
> Execute command and connect to its I/O.

**OPENSSL:** _host_ **:** _port_
> SSL/TLS connection.

**PTY**
> Create pseudo-terminal.

**STDIO** or **-**
> Standard input/output.

**fork**
> Handle multiple connections.

**reuseaddr**
> Allow address reuse.

**verify=** _0|1_
> SSL certificate verification.

**-d** **-d**
> Verbose debugging output.

**-v**
> Verbose data transfer logging.

# CAVEATS

Complex address specifications require careful syntax. Fork option needed for multiple connections. SSL certificates may need configuration. Some features require elevated privileges.

# HISTORY

**socat** was created by **Gerhard Rieger** in **1999** as an extended version of netcat with support for many more address types. It filled the need for a universal relay tool that could bridge different communication mechanisms. The project continues active maintenance and is widely used for network administration.

# SEE ALSO

[nc](/man/nc)(1), [netcat](/man/netcat)(1), [stunnel](/man/stunnel)(1), [ssh](/man/ssh)(1)
