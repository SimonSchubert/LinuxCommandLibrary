# TAGLINE

Lightweight HTTP and HTTPS proxy daemon

# TLDR

**Start tinyproxy** with the default configuration

```tinyproxy```

**Start with a custom configuration file**

```tinyproxy -c [path/to/tinyproxy.conf]```

**Run in foreground** (don't daemonize)

```tinyproxy -d```

**Run in foreground with custom config** for debugging

```tinyproxy -d -c [path/to/tinyproxy.conf]```

**Show version information**

```tinyproxy -v```

**Show help**

```tinyproxy -h```

# SYNOPSIS

**tinyproxy** [**-c** _config-file_] [**-d**] [**-h**] [**-v**]

# PARAMETERS

**-c** _config-file_
> Use an alternate configuration file instead of the default /etc/tinyproxy/tinyproxy.conf.

**-d**
> Do not daemonize. Stay in the foreground, useful for debugging.

**-h**
> Display a short help screen and exit.

**-v**
> Display version information and exit.

# DESCRIPTION

**Tinyproxy** is a lightweight HTTP/HTTPS proxy daemon designed for minimal resource consumption. It listens on a configurable TCP port and handles HTTP proxy requests, making it ideal for embedded systems, containers, or environments where a full-featured proxy would be too resource-intensive.

The daemon supports basic HTTP proxying, HTTPS via CONNECT method, upstream proxy configuration, access control lists, and URL-based filtering. It can also function as a reverse proxy, forwarding requests to backend servers.

Configuration is done through a configuration file (typically /etc/tinyproxy/tinyproxy.conf) that specifies the listening port, allowed clients, log settings, and filtering rules. Tinyproxy provides a built-in statistics page accessible by requesting the stathost (default: tinyproxy.stats).

Signals can control the running daemon: SIGHUP triggers garbage collection on connections, and standard signals handle graceful shutdown.

# CONFIGURATION

**/etc/tinyproxy/tinyproxy.conf**
> Main configuration file specifying listening port, allowed clients, log settings, upstream proxies, filtering rules, and access control lists.

**-c** _file_
> Use an alternate configuration file at runtime.

# CAVEATS

Tinyproxy does not support caching, authentication schemes beyond basic, or SOCKS proxying. For high-traffic production environments, consider more full-featured proxies like Squid. The default configuration may allow connections from any host, so access control should be configured appropriately.

# HISTORY

**Tinyproxy** was originally written by **Steven Young** in **1999** as a lightweight alternative to heavier proxy servers. The project has been maintained by various contributors and continues development on GitHub. Its small footprint and simplicity have made it popular for embedded Linux systems, Docker containers, and privacy-focused setups.

# SEE ALSO

[squid](/man/squid)(8), [privoxy](/man/privoxy)(1), [nginx](/man/nginx)(8)
