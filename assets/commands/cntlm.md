# TAGLINE

NTLM/NTLMv2 authenticating HTTP proxy

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

**cntlm** is an NTLM/NTLMv2 authenticating HTTP proxy that sits between applications and a corporate proxy server. It handles the NTLM authentication handshake transparently, so applications only need to use a simple unauthenticated proxy connection.

The proxy caches authenticated connections for reuse, providing significant speed improvements over alternatives that re-authenticate on every request. It supports NTLM, NTLMv2, NTLM2SR, and basic authentication methods, with automatic detection of the strongest supported method via the **-M** flag.

In addition to HTTP proxying, cntlm provides SOCKS5 proxy support and TCP/IP tunneling through the corporate proxy, enabling protocols beyond HTTP to traverse the proxy infrastructure. Password hashes can be stored instead of plaintext passwords for improved security.

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

# CONFIGURATION

**/etc/cntlm.conf**
> Main configuration file for proxy address, credentials, listen port, and authentication settings.

# AUTH TYPES

**NTLMv2**: Strongest, recommended

**NTLM2SR**: Strong

**NTLM**: Legacy compatibility

**LM**: Weakest, old servers only

# CAVEATS

Use -M to auto-detect strongest working auth. Store password hashes instead of plaintext. Config file same syntax as OpenSSH.

# SEE ALSO

[squid](/man/squid)(8), [privoxy](/man/privoxy)(1), [tinyproxy](/man/tinyproxy)(8)
