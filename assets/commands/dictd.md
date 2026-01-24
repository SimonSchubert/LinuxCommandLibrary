# TLDR

**Start dictionary server**

```dictd```

**Start with specific config**

```dictd -c [/etc/dictd/dictd.conf]```

**Run in foreground**

```dictd --foreground```

**Listen on specific port**

```dictd --port [2628]```

**Limit connections**

```dictd --limit [10]```

# SYNOPSIS

**dictd** [_options_]

# DESCRIPTION

**dictd** is a dictionary server implementing the DICT protocol (RFC 2229). It serves dictionary databases to clients, enabling word lookups, definitions, and translations.

The server supports multiple dictionary formats and can serve several dictionaries simultaneously. Clients connect via TCP to query words across all configured databases.

# PARAMETERS

**-c** _file_
> Configuration file path.

**--port** _port_
> TCP port (default 2628).

**--listen** _address_
> Listen address.

**--limit** _n_
> Maximum concurrent connections.

**--foreground**
> Don't daemonize.

**--log** _type_
> Logging type (syslog, stderr).

**--pid** _file_
> PID file location.

**-L**, **--license**
> Show license.

**-V**, **--version**
> Show version.

# CAVEATS

Requires dictionary database files. Port 2628 may need firewall rules. Large dictionaries use significant memory. Client needed for lookups.

# HISTORY

**dictd** was developed as part of the **DICT** project in the late **1990s**. The DICT protocol was designed to replace older dictionary protocols and enable internet dictionary services. The project provides both server and client implementations.

# SEE ALSO

[dict](/man/dict)(1), [dictfmt](/man/dictfmt)(1), [dictzip](/man/dictzip)(1)
