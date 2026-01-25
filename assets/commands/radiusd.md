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

**radiusd** is the FreeRADIUS server daemon. RADIUS (Remote Authentication Dial-In User Service) provides centralized authentication, authorization, and accounting for network access.

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

```bash
# Main directories
/etc/raddb/              # or /etc/freeradius/
/etc/raddb/radiusd.conf  # Main config
/etc/raddb/clients.conf  # RADIUS clients
/etc/raddb/users         # User definitions
```

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
