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

**Use SIP003 plugin** (e.g., v2ray-plugin)

```ss-local -c [config.json] --plugin [v2ray-plugin] --plugin-opts "[tls;host=example.com]"```

**Run as daemon**

```ss-local -c [config.json] -f [/var/run/ss-local.pid]```

# SYNOPSIS

**ss-local** [_-s server_] [_-p port_] [_-l local_port_] [_-k password_] [_-m method_] [_options_]

# PARAMETERS

**-s** _SERVER_
> Remote server hostname or IP.

**-p** _PORT_
> Remote server port.

**-l** _PORT_
> Local SOCKS5 listening port.

**-k** _PASSWORD_
> Shared password (must match server).

**-m** _METHOD_
> Encryption method (e.g., aes-256-gcm, chacha20-ietf-poly1305).

**-c** _FILE_
> JSON configuration file.

**-b** _ADDR_
> Local bind address.

**-i** _INTERFACE_
> Outgoing network interface.

**-t** _SECONDS_
> Socket timeout (default: 60).

**-a** _USER_
> Drop privileges to this user after startup.

**-f** _PIDFILE_
> Fork to background and write PID file.

**-n** _NUMBER_
> Maximum number of open files.

**-u**
> Enable UDP relay alongside TCP.

**-U**
> UDP-only relay (disable TCP).

**-6**
> Prefer IPv6 for hostname resolution.

**-v**
> Verbose logging.

**--fast-open**
> Enable TCP Fast Open.

**--reuse-port**
> Enable SO_REUSEPORT.

**--mptcp**
> Enable Multipath TCP.

**--no-delay**
> Enable TCP_NODELAY.

**--mtu** _MTU_
> Interface MTU for fragmentation.

**--acl** _FILE_
> Access Control List file.

**--plugin** _NAME_
> SIP003 transport plugin (e.g., v2ray-plugin, obfs-local).

**--plugin-opts** _OPTS_
> Options passed to the SIP003 plugin.

**--key** _BASE64_
> Pre-shared key as Base64 (alternative to -k).

**-h**, **--help**
> Show help.

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

Encryption method and password must exactly match the remote ss-server. Only proxies TCP by default; add **-u** for UDP. Deep packet inspection on some networks fingerprints and blocks Shadowsocks; mitigate with SIP003 plugins like v2ray-plugin or obfs. Not a full VPN; only applications configured to use the SOCKS5 endpoint are proxied.

# HISTORY

**Shadowsocks** was created by **clowwindy** in **2012** for circumventing internet censorship. It uses encrypted proxy connections to bypass filtering.

# SEE ALSO

[ss-server](/man/ss-server)(1), [proxychains](/man/proxychains)(1)

