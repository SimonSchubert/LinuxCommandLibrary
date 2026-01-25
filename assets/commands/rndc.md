# TLDR

**Reload BIND configuration**

```rndc reload```

**Reload specific zone**

```rndc reload [example.com]```

**Show server status**

```rndc status```

**Flush cache**

```rndc flush```

**Stop server**

```rndc stop```

# SYNOPSIS

**rndc** [_options_] _command_ [_args_]

# PARAMETERS

**-s** _server_
> Server address.

**-p** _port_
> Port number.

**-k** _keyfile_
> Key file.

**-c** _config_
> Config file.

# COMMANDS

**reload** [_zone_]
> Reload config/zone.

**status**
> Server status.

**flush** [_view_]
> Flush cache.

**stop**
> Stop server.

**reconfig**
> Reload config only.

**zonestatus** _zone_
> Zone status.

# DESCRIPTION

**rndc** (Remote Name Daemon Control) administers the BIND DNS server. It sends commands to named to reload zones, flush cache, and perform other management tasks.

# EXAMPLES

```bash
# Check status
rndc status

# Reload all
rndc reload

# Reload specific zone
rndc reload example.com

# Flush DNS cache
rndc flush

# Flush specific name
rndc flushname example.com

# Reload configuration only
rndc reconfig

# Check zone status
rndc zonestatus example.com
```

# CONFIGURATION

```bash
# /etc/rndc.conf
key "rndc-key" {
    algorithm hmac-sha256;
    secret "base64secret==";
};

options {
    default-key "rndc-key";
    default-server 127.0.0.1;
    default-port 953;
};
```

# CAVEATS

Requires shared key with named. Default port 953. Generate key with rndc-confgen.

# HISTORY

rndc is part of **BIND** (Berkeley Internet Name Domain) by **ISC** (Internet Systems Consortium).

# SEE ALSO

[named](/man/named)(8), [rndc-confgen](/man/rndc-confgen)(8), [named.conf](/man/named.conf)(5)
