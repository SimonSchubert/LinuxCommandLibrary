# TAGLINE

Route TCP connections through proxy servers

# TLDR

**Run command through proxy**

```proxychains [command]```

**Run curl through proxy**

```proxychains curl [url]```

**Use specific config**

```proxychains -f [config.conf] [command]```

**Quiet mode**

```proxychains -q [command]```

# SYNOPSIS

**proxychains** [_options_] _command_ [_args_]

# PARAMETERS

**-q**
> Quiet mode.

**-f** _file_
> Use specific config file.

# DESCRIPTION

**proxychains** forces TCP connections through proxy servers (SOCKS4/5, HTTP). It hooks network calls using LD_PRELOAD to redirect traffic transparently.

Useful for anonymization and bypassing network restrictions.

# EXAMPLES

```bash
# Run through proxy
proxychains curl http://example.com

# SSH through proxy
proxychains ssh user@host

# nmap through Tor
proxychains nmap -sT target

# Quiet mode
proxychains -q wget http://example.com/file
```

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
strict_chain  - All proxies in order
dynamic_chain - Skip dead proxies
random_chain  - Random proxy order
round_robin   - Cycle through proxies
```

# CAVEATS

Only TCP supported. UDP and ICMP not proxied. Some apps detect LD_PRELOAD.

# HISTORY

proxychains was originally written by **haad** and later forked as **proxychains-ng** by **rofl0r** with improvements.

# SEE ALSO

[tor](/man/tor)(1), [torsocks](/man/torsocks)(1), [socat](/man/socat)(1), [tsocks](/man/tsocks)(1)
