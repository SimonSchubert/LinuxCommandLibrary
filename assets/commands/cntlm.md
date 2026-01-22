# TLDR

**Start with config file**

```cntlm -c [/etc/cntlm.conf]```

**Run in foreground debug mode**

```cntlm -v -f```

**Detect NTLM settings**

```cntlm -M http://test.com```

**Generate password hash**

```cntlm -H -d [DOMAIN] -u [username]```

**Start SOCKS5 proxy**

```cntlm -O [1080]```

**Specify proxy and credentials**

```cntlm -u [user] -d [DOMAIN] -p [pass] [proxy:port]```

# SYNOPSIS

**cntlm** [_options_] [_proxy_host_:]_proxy_port_...

# DESCRIPTION

**cntlm** is an NTLM/NTLMv2 authenticating HTTP proxy. Caches authenticated connections for speed. Supports TCP/IP tunneling and SOCKS5. Much faster than similar proxies.

# PARAMETERS

**-u** _user_
> Proxy username

**-d** _domain_
> Proxy domain

**-p** _password_
> Proxy password

**-a** _auth_
> Auth type: NTLMv2, NTLM2SR, NT, NTLM, LM

**-M** _url_
> Magic NTLM detection mode

**-H**
> Generate password hashes

**-c** _file_
> Configuration file

**-l** _[addr:]port_
> Listen on port

**-O** _[addr:]port_
> Enable SOCKS5 proxy

**-N** _pattern_
> No-proxy pattern list

**-f**
> Run in foreground

**-v**
> Verbose/debug mode

**-g**
> Allow gateway mode (non-local connections)

**-P** _pidfile_
> Create PID file

# CONFIGURATION FILE

/etc/cntlm.conf:
```
Username    user
Domain      CORP
Password    pass
Proxy       proxy.corp.com:8080
Listen      3128
```

# AUTH TYPES

**NTLMv2**: Strongest, recommended

**NTLM2SR**: Strong

**NTLM**: Legacy compatibility

**LM**: Weakest, old servers only

# CAVEATS

Use -M to auto-detect strongest working auth. Store password hashes instead of plaintext. Config file same syntax as OpenSSH.

# SEE ALSO

[squid](/man/squid)(8), [privoxy](/man/privoxy)(1), [tinyproxy](/man/tinyproxy)(8)
