# TAGLINE

Universal TLS/SSL tunneling proxy

# TLDR

**Start stunnel with a configuration file**

```stunnel [/etc/stunnel/stunnel.conf]```

**Run in foreground** (don't daemonize)

```stunnel -fd 0```

**Display help**

```stunnel -help```

**Show available socket options**

```stunnel -sockets```

**Show available TLS options**

```stunnel -options```

# SYNOPSIS

**stunnel** [_configfile_] | **-fd** _n_ | **-help** | **-version** | **-sockets** | **-options**

# PARAMETERS

**configfile**
> Path to configuration file

**-fd** _n_
> Read configuration from file descriptor n

**-help**
> Display help message

**-version**
> Display version information

**-sockets**
> Show available socket options

**-options**
> Show available TLS/SSL options

# CONFIGURATION

Key configuration directives:

**accept**
> Accept connections on specified host:port

**connect**
> Connect to specified host:port

**cert**
> Path to certificate file

**key**
> Path to private key file

**client**
> Set to "yes" for client mode

**exec**
> Execute local program instead of connecting

# DESCRIPTION

**stunnel** is a TLS/SSL proxy that wraps arbitrary TCP connections with encryption. It adds TLS functionality to existing services without modifying application code.

In server mode, stunnel accepts encrypted connections and forwards them unencrypted to a backend service. In client mode, it accepts unencrypted connections and establishes TLS tunnels to remote servers.

The proxy uses OpenSSL for cryptography and supports modern TLS versions. It can run as a daemon or be launched by inetd/systemd for on-demand connections.

# CAVEATS

SSLv2 and SSLv3 are disabled by default due to security vulnerabilities. Certificate verification should be enabled in production. Transparent proxy mode requires specific kernel support.

# HISTORY

stunnel was created by **Michał Trojnara** in **1998** as a universal TLS wrapper. It became widely used for adding SSL to legacy protocols and continues active development, supporting modern TLS standards.

# SEE ALSO

[openssl](/man/openssl)(1), [nginx](/man/nginx)(8), [haproxy](/man/haproxy)(1)
