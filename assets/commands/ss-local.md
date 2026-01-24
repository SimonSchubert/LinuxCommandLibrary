# TLDR

**Start client**

```ss-local -s [server] -p [8388] -l [1080] -k [password] -m [aes-256-gcm]```

**Use config file**

```ss-local -c [/etc/shadowsocks/config.json]```

**Run in foreground**

```ss-local -c [config.json] -v```

**Specify local address**

```ss-local -c [config.json] -b [127.0.0.1]```

**UDP relay**

```ss-local -c [config.json] -u```

# SYNOPSIS

**ss-local** [_-s server_] [_-p port_] [_-l local_port_] [_-k password_] [_-m method_] [_options_]

# PARAMETERS

**-s** _SERVER_
> Server address.

**-p** _PORT_
> Server port.

**-l** _PORT_
> Local port.

**-k** _PASSWORD_
> Password.

**-m** _METHOD_
> Encryption method.

**-c** _FILE_
> Config file.

**-b** _ADDR_
> Local bind address.

**-u**
> Enable UDP relay.

**-v**
> Verbose output.

# DESCRIPTION

**ss-local** is the Shadowsocks local client. It creates a SOCKS5 proxy that tunnels through a Shadowsocks server.

Local port receives SOCKS5 connections. Traffic is encrypted and forwarded to the server.

Encryption methods include AES-GCM and ChaCha20. Server and client must match.

UDP relay enables UDP proxy. Useful for DNS and gaming.

Config file simplifies repeated use. JSON format with all parameters.

# CAVEATS

Requires matching server configuration. Some networks detect and block. Not a VPN.

# HISTORY

**Shadowsocks** was created by **clowwindy** in **2012** for circumventing internet censorship. It uses encrypted proxy connections to bypass filtering.

# SEE ALSO

[ss-server](/man/ss-server)(1), [proxychains](/man/proxychains)(1)
