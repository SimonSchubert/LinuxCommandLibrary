# TAGLINE

Shadowsocks local SOCKS5 proxy client

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

**ss-local** is the local client component of Shadowsocks, an encrypted proxy protocol. It listens on a local port as a SOCKS5 proxy server, encrypting all traffic and forwarding it through a remote Shadowsocks server to bypass network filtering.

Applications configured to use the local SOCKS5 proxy have their traffic encrypted using methods such as AES-256-GCM or ChaCha20-Poly1305 before it leaves the local machine. The encryption method and password must match the remote server configuration. UDP relay mode (**-u**) enables proxying of UDP traffic for applications like DNS resolution and gaming.

Connection parameters can be specified on the command line or stored in a JSON configuration file for convenience.

# CONFIGURATION

**/etc/shadowsocks-libev/config.json**
> System-wide configuration file specifying server address, port, password, encryption method, and local listening settings.

**~/.shadowsocks/config.json**
> Per-user configuration file with the same JSON format as the system-wide config.

# CAVEATS

Requires matching server configuration. Some networks detect and block. Not a VPN.

# HISTORY

**Shadowsocks** was created by **clowwindy** in **2012** for circumventing internet censorship. It uses encrypted proxy connections to bypass filtering.

# SEE ALSO

[ss-server](/man/ss-server)(1), [proxychains](/man/proxychains)(1)
