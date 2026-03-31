# TAGLINE

DICT protocol dictionary server daemon

# TLDR

**Start dictionary server**

```dictd```

**Start with specific config**

```dictd -c [/etc/dictd/dictd.conf]```

**Run in foreground** (don't detach)

```dictd --nodetach```

**Listen on specific port**

```dictd --port [2628]```

**Limit concurrent connections**

```dictd --limit [10]```

**Run with specific PID file**

```dictd --pid [/var/run/dictd.pid]```

# SYNOPSIS

**dictd** [_options_]

# DESCRIPTION

**dictd** is a dictionary server daemon implementing the DICT protocol (RFC 2229). It serves dictionary databases to clients over TCP port 2628, enabling word lookups, definitions, translations, and thesaurus queries.

The server supports multiple dictionary formats and can serve several dictionaries simultaneously. Clients can query words across all configured databases at once or target specific dictionaries. The protocol supports various search strategies including exact match, prefix, suffix, and fuzzy matching.

dictd databases are typically in the dictd format created by dictfmt, which converts various source formats into indexed dictionary files. The server handles concurrent connections and can be configured with access controls. Popular dictionary databases include WordNet, Elements, Jargon File, and various language translation dictionaries.

# PARAMETERS

**-c** _file_
> Configuration file path.

**--port** _port_
> TCP port (default 2628).

**--listen** _address_
> Listen address.

**--limit** _n_
> Maximum concurrent connections.

**-i**, **--inetd**
> Run in inetd mode, communicating on stdin/stdout. Implies --fast-start.

**--nodetach**
> Run in foreground, don't daemonize.

**--depth** _length_
> Override the depth keyword from configuration.

**--delay** _seconds_
> Override the delay keyword from configuration.

**--fast-start**
> Skip preloading of database indexes at startup.

**--logfile** _file_
> Log to specified file instead of syslog.

**--syslog**
> Log to syslog (default when daemonized).

**--stderr**
> Log to standard error (implies --nodetach).

**--pid** _file_
> PID file location.

**-L**, **--license**
> Show license.

**-V**, **--version**
> Show version.

# CONFIGURATION

**/etc/dictd/dictd.conf** (or **/etc/dictd.conf**)
> Server configuration file specifying dictionary database locations, access controls, and server behavior. The file is read at startup and re-read on SIGHUP.

# CAVEATS

Requires dictionary database files. Port 2628 may need firewall rules. Large dictionaries use significant memory. Client needed for lookups.

# HISTORY

**dictd** was developed as part of the **DICT** project in the late **1990s**. The DICT protocol was designed to replace older dictionary protocols and enable internet dictionary services. The project provides both server and client implementations.

# SEE ALSO

[dict](/man/dict)(1)
