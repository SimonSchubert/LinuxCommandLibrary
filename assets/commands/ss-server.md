# TLDR

**Start server** with inline configuration

```ss-server -s [0.0.0.0] -p [8388] -k "[password]" -m [aes-256-gcm]```

**Start server** with a configuration file

```ss-server -c [/etc/shadowsocks/config.json]```

**Start in verbose mode**

```ss-server -c [config.json] -v```

**Start with a specific user**

```ss-server -c [config.json] -a [nobody]```

**Run as daemon**

```ss-server -c [config.json] -f [/var/run/ss-server.pid]```

# SYNOPSIS

**ss-server** [**-c** _config_] [**-s** _server_] [**-p** _port_] [**-k** _password_] [**-m** _method_] [_options_]

# PARAMETERS

**-c**, **--config** _file_
> Path to JSON configuration file.

**-s**, **--server** _address_
> Server address to bind to.

**-p**, **--server-port** _port_
> Server port number.

**-k**, **--password** _password_
> Password for encryption.

**-m**, **--encrypt-method** _method_
> Encryption method (aes-256-gcm, chacha20-ietf-poly1305, etc.).

**-t**, **--timeout** _seconds_
> Socket timeout in seconds.

**-a**, **--user** _user_
> Run as specified user.

**-f**, **--pid-file** _file_
> PID file path for daemon mode.

**-d**, **--dns** _server_
> DNS server address.

**--fast-open**
> Enable TCP fast open.

**--reuse-port**
> Enable port reuse for multiple instances.

**-u**, **--udp**
> Enable UDP relay.

**-v**, **--verbose**
> Enable verbose logging.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**ss-server** is the server component of Shadowsocks, a secure proxy protocol designed to protect network traffic. It listens for incoming connections from Shadowsocks clients and forwards traffic to destination servers.

The server encrypts all traffic between client and server using modern cryptographic algorithms. Recommended ciphers include **aes-256-gcm** and **chacha20-ietf-poly1305** (AEAD ciphers). Older stream ciphers are deprecated due to security vulnerabilities.

Configuration can be provided via command-line arguments or a JSON file. The JSON format supports additional options like multiple server ports and plugin configuration.

# CONFIGURATION

**/etc/shadowsocks-libev/config.json**
> System-wide JSON configuration file specifying server address, port, password, encryption method, timeout, and optional plugin settings.

# CAVEATS

Avoid deprecated stream ciphers (rc4-md5, aes-cfb, etc.) as they lack authentication. Use AEAD ciphers for security. Running as root is not recommended; use **-a** to drop privileges. TCP fast open requires kernel support and may be blocked by some networks. Check local laws regarding proxy software usage.

# HISTORY

**Shadowsocks** was created by clowwindy in **2012** as a secure proxy protocol. The original Python implementation was followed by ports to various languages. The libev-based implementation (shadowsocks-libev) provides **ss-server** as a high-performance C implementation. The project has been widely adopted and continues development with community contributions despite the original repository's removal.

# SEE ALSO

[ss-local](/man/ss-local)(1), [ss-tunnel](/man/ss-tunnel)(1), [ss-redir](/man/ss-redir)(1), [ss-manager](/man/ss-manager)(1)
