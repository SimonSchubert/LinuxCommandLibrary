# TLDR

**Listen on port**

```nc.openbsd -l [8080]```

**Connect to host**

```nc.openbsd [host] [port]```

**Scan ports**

```nc.openbsd -zv [host] [20-30]```

**Use IPv6**

```nc.openbsd -6 [host] [port]```

**Keep listening**

```nc.openbsd -k -l [port]```

**Connect via proxy**

```nc.openbsd -X 5 -x [proxy:port] [host] [port]```

**Set source port**

```nc.openbsd -p [12345] [host] [port]```

# SYNOPSIS

**nc.openbsd** [_options_] [_host_] [_port_]

# PARAMETERS

_HOST_
> Target host.

_PORT_
> Port number.

**-l**
> Listen mode.

**-k**
> Keep listening after disconnect.

**-6**
> Use IPv6.

**-X** _VER_
> Proxy version.

**-x** _PROXY_
> Proxy address.

**--help**
> Display help information.

# DESCRIPTION

**nc.openbsd** is the OpenBSD version of netcat. It provides secure networking features.

The tool supports proxies and IPv6. More features than traditional netcat.

nc.openbsd is OpenBSD netcat.

# CAVEATS

OpenBSD variant. Different from GNU netcat. Proxy support built-in.

# HISTORY

nc.openbsd is the **OpenBSD** rewrite of netcat with additional security features and proxy support.

# SEE ALSO

[nc](/man/nc)(1), [ncat](/man/ncat)(1), [socat](/man/socat)(1)

