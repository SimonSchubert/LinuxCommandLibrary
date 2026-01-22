# TLDR

**Listen on port**

```nc -l [8080]```

**Connect to host**

```nc [host] [port]```

**Send file**

```nc [host] [port] < [file.txt]```

**Receive file**

```nc -l [port] > [file.txt]```

**Port scan**

```nc -zv [host] [20-30]```

**UDP mode**

```nc -u [host] [port]```

**Set timeout**

```nc -w [5] [host] [port]```

**Verbose mode**

```nc -v [host] [port]```

# SYNOPSIS

**nc** [_options_] [_host_] [_port_]

# PARAMETERS

_HOST_
> Target hostname or IP.

_PORT_
> Port number or range.

**-l**
> Listen mode.

**-v**
> Verbose output.

**-z**
> Zero-I/O mode (scanning).

**-u**
> UDP mode.

**-w** _SECS_
> Timeout seconds.

**--help**
> Display help information.

# DESCRIPTION

**nc** (netcat) is a networking utility. It reads and writes data across network connections.

The tool creates TCP/UDP connections. Often called the "network Swiss army knife."

nc is versatile network tool.

# CAVEATS

Multiple implementations exist. Features vary by version. Security implications.

# HISTORY

Netcat was written by **Hobbit** in 1996 and has become an essential network debugging tool.

# SEE ALSO

[ncat](/man/ncat)(1), [socat](/man/socat)(1), [telnet](/man/telnet)(1)

