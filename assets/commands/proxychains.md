# TAGLINE

Route TCP connections through proxy servers

# TLDR

**Run a command** through the proxy

```proxychains [command]```

**Run curl through proxy**

```proxychains curl [url]```

**Use a specific config** file

```proxychains -f [path/to/config.conf] [command]```

**Quiet mode** (suppress proxy info output)

```proxychains -q [command]```

**SSH through proxy**

```proxychains ssh [user]@[host]```

# SYNOPSIS

**proxychains** [**-q**] [**-f** _config_file_] _program_ [_args_]

# PARAMETERS

**-q**
> Quiet mode. Do not display proxy connection information.

**-f** _config_file_
> Use specified configuration file instead of the default. Without this flag, proxychains searches in order: the path in the **PROXYCHAINS_CONF_FILE** environment variable, **./proxychains.conf**, **~/.proxychains/proxychains.conf**, and **/etc/proxychains.conf**.

# DESCRIPTION

**proxychains** forces TCP connections made by a given application to go through proxy servers such as SOCKS4, SOCKS5, or HTTP proxies. It hooks network-related libc functions using **LD_PRELOAD** to redirect traffic transparently without modifying the target application.

Useful for anonymization, routing traffic through Tor, and bypassing network restrictions. Supported authentication types are user/pass for SOCKS4/5 and basic for HTTP.

The modern maintained version is **proxychains-ng** (proxychains4) by **rofl0r**, which is a continuation of the original project.

# CONFIGURATION

```
# /etc/proxychains.conf
strict_chain
proxy_dns

[ProxyList]
socks5 127.0.0.1 9050
http   192.168.1.1 8080
```

# CHAIN TYPES

```
strict_chain  - All proxies in order, fail if any is down
dynamic_chain - Skip dead proxies, at least one must respond
random_chain  - Random proxy order each connection
round_robin   - Cycle through proxies in order
```

# CAVEATS

Only TCP connections are supported. UDP and ICMP traffic is not proxied. Statically linked programs bypass the LD_PRELOAD hook. DNS requests can be proxied by enabling **proxy_dns** in the configuration file.

# HISTORY

proxychains was originally written by **haad** and later forked as **proxychains-ng** (proxychains4) by **rofl0r** with improvements including better stability and additional features.

# SEE ALSO

[tor](/man/tor)(1), [torsocks](/man/torsocks)(1), [socat](/man/socat)(1), [ssh](/man/ssh)(1), [curl](/man/curl)(1)
