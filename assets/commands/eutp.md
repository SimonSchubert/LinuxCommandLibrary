# TAGLINE

UTP protocol diagnostic tool

# TLDR

**Show UTP socket** statistics

```eutp stats```

**List connections**

```eutp list```

**Trace connection**

```eutp trace [socket_id]```

# SYNOPSIS

**eutp** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: stats, list, trace.

**stats**
> Show socket statistics.

**list**
> List active connections.

**trace** _ID_
> Trace specific connection.

**--help**
> Display help information.

# DESCRIPTION

**eutp** is a diagnostic tool for UTP (uTorrent Transport Protocol) connections. UTP is a UDP-based transport protocol designed for BitTorrent that minimizes impact on other network traffic.

The tool provides visibility into UTP socket state, connection statistics, and performance metrics. It's useful for debugging libutp-based applications and understanding UTP behavior.

UTP implements congestion control similar to TCP but over UDP, making this tool relevant for BitTorrent clients and similar applications.

# CAVEATS

Limited to UTP protocol diagnostics. Requires applications using libutp. May need root access for some operations.

# HISTORY

eutp supports the UTP protocol developed by **BitTorrent, Inc.** as an alternative to TCP that's more friendly to other network traffic, implemented in the libutp library.

# SEE ALSO

[ss](/man/ss)(8), [netstat](/man/netstat)(8)
