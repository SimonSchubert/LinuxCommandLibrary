# TAGLINE

FreeRADIUS authentication and accounting server

# TLDR

**Start RADIUS server**

```radiusd```

**Start in debug mode**

```radiusd -X```

**Check configuration**

```radiusd -C```

**Foreground with debug**

```radiusd -f -X```

**Specific config file**

```radiusd -d [/etc/raddb]```

# SYNOPSIS

**radiusd** [_options_]

# PARAMETERS

**-X**
> Debug mode (verbose output).

**-C**
> Check configuration only.

**-f**
> Run in foreground.

**-d** _dir_
> Configuration directory.

**-n** _name_
> Server name.

**-l** _file_
> Log file.

# DESCRIPTION

**radiusd** is the FreeRADIUS server daemon implementing the RADIUS (Remote Authentication Dial-In User Service) protocol for centralized authentication, authorization, and accounting of network access. It handles login requests from network devices such as VPN gateways, wireless access points, and switches, verifying credentials against backends like LDAP, SQL databases, or local files.

The server supports multiple authentication methods including PAP, CHAP, MS-CHAP, EAP-TLS, and PEAP. It processes authorization policies to determine what network resources an authenticated user may access, and records accounting data for session tracking and billing. The **-X** debug mode provides detailed request processing output essential for troubleshooting authentication flows, while **-C** validates configuration syntax without starting the server.

# EXAMPLES

```bash
# Start daemon
radiusd

# Debug mode (very verbose)
radiusd -X

# Check config syntax
radiusd -C

# Foreground for systemd
radiusd -f

# Test authentication
radtest user password localhost 0 testing123
```

# CONFIGURATION

**/etc/raddb/radiusd.conf**
> Main server configuration controlling logging, thread pools, module loading, and virtual server definitions. On Debian-based systems, this is at /etc/freeradius/radiusd.conf.

**/etc/raddb/clients.conf**
> Defines RADIUS clients (network devices) with their IP addresses and shared secrets for authenticating requests.

**/etc/raddb/users**
> Local user definitions and authorization rules for simple deployments without an external authentication backend.

**/etc/raddb/mods-enabled/**
> Symlinks to enabled module configurations controlling authentication backends, LDAP connections, SQL databases, and policy processing.

# PORTS

```
1812 - Authentication
1813 - Accounting
```

# CAVEATS

Complex configuration. Requires careful security setup. Debug mode outputs secrets - use only for testing.

# HISTORY

FreeRADIUS is the most widely deployed RADIUS server, started in 1999 by **Alan DeKok** and **Miquel van Smoorenburg**.

# SEE ALSO

[radtest](/man/radtest)(1), [radclient](/man/radclient)(1), [radwho](/man/radwho)(1)
