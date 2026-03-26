# TAGLINE

Universal TLS/SSL tunneling proxy

# TLDR

**Start stunnel with a configuration file**

```stunnel [/etc/stunnel/stunnel.conf]```

**Read configuration from a file descriptor** (e.g. stdin)

```stunnel -fd [0]```

**Display version and compile-time defaults**

```stunnel -version```

**Show available socket options**

```stunnel -sockets```

**Show available TLS options**

```stunnel -options```

**Display help**

```stunnel -help```

# SYNOPSIS

**stunnel** [_configfile_] | **-fd** _n_ | **-help** | **-version** | **-sockets** | **-options**

# PARAMETERS

**configfile**
> Path to the configuration file to use

**-fd** _n_
> Read configuration from file descriptor _n_ (Unix only)

**-help**
> Display help message

**-version**
> Display version information and compile-time defaults

**-sockets**
> Show default socket options

**-options**
> Show supported TLS/SSL options compiled into OpenSSL

# CONFIGURATION

Stunnel is driven entirely by a configuration file. The file uses INI-style syntax: global directives appear at the top, then one or more named service sections in `[service_name]` blocks. Lines beginning with `;` are comments.

**Global directives (selected)**

**foreground**
> Keep the process in the foreground and log to stderr instead of syslog. Values: `yes | no`. Default: `no`

**pid**
> Path to the PID file. An empty value disables PID file creation. Path is relative to `chroot` if set (Unix only)

**chroot**
> Chroot jail directory. Stunnel drops privileges and changes root to this directory after startup (Unix only)

**setuid**
> Unix user to run as after startup (Unix only)

**setgid**
> Unix group to run as after startup (Unix only)

**debug**
> Logging verbosity level. Format: `[FACILITY.]LEVEL`. Levels: emerg(0), alert(1), crit(2), err(3), warning(4), notice(5), info(6), debug(7). Default: `notice`

**output**
> Append log messages to the specified file instead of syslog

**syslog**
> Enable or disable logging to syslog. Values: `yes | no`. Default: `yes`

**Service-level directives (selected)**

**accept**
> Accept connections on the specified address. Format: `[HOST:]PORT`. Omit `accept` in inetd mode

**connect**
> Forward connections to the specified address. Format: `[HOST:]PORT`. Default host: `localhost`. Multiple entries are supported for round-robin load balancing

**client**
> Enable client mode — the remote end is expected to speak TLS. Values: `yes | no`. Default: `no` (server mode)

**cert**
> Path to the PEM or PKCS#12 certificate chain file. Required in server mode; optional in client mode unless the server requires client certificates

**key**
> Path to the private key file. Defaults to the value of `cert` when omitted. The file should only be readable by its owner

**CAfile**
> Load trusted CA certificates from a file. Used with `verifyChain` or `verifyPeer`

**CApath**
> Load trusted CA certificates from a directory. Certificate files must be named in the OpenSSL hash format (`XXXXXXXX.0`)

**verifyChain**
> Verify the peer certificate chain starting from a trusted root CA. Values: `yes | no`. Default: `no`

**verifyPeer**
> Verify the end-entity (leaf) peer certificate. Values: `yes | no`. Default: `no`

**checkHost**
> Verify the hostname in the peer certificate's Subject Alternative Names. Multiple entries allowed. Requires OpenSSL 1.0.2+

**sni**
> Server Name Indication. In client mode: SNI hostname to send. In server mode: `SERVICE_NAME:SERVER_NAME_PATTERN` for virtual hosting. Requires OpenSSL 1.0.0+

**protocol**
> Application-level protocol to negotiate TLS with. Supported: `cifs`, `connect`, `imap`, `ldap`, `nntp`, `pgsql`, `pop3`, `proxy`, `smtp`, `socks`

**exec**
> Execute a local inetd-style program instead of connecting to a remote host. The program's stdin/stdout are used for the unencrypted side of the tunnel

**execArgs**
> Whitespace-separated argument list for `exec`, including the program name as `$0`

**delay**
> Delay DNS resolution for `connect` until a client connects. Values: `yes | no`. Default: `no`

**ciphers**
> Colon-delimited list of TLS 1.2 and earlier cipher suites to allow

**ciphersuites**
> Colon-delimited list of TLS 1.3 ciphersuites. Default: `TLS_CHACHA20_POLY1305_SHA256:TLS_AES_256_GCM_SHA384:TLS_AES_128_GCM_SHA256`. Requires OpenSSL 1.1.1+

**sslVersionMin**
> Minimum TLS protocol version. Requires OpenSSL 1.1.0+. Default: `TLSv1`

**sslVersionMax**
> Maximum TLS protocol version. Requires OpenSSL 1.1.0+. Default: `all`

**securityLevel**
> OpenSSL security level (0–5). Level 2 requires at least 112-bit security (default). Requires OpenSSL 1.1.0+

**transparent**
> Enable transparent proxy mode. Values: `none`, `source`, `destination`, `both`. Requires kernel and routing support (Unix only)

**socket**
> Set a socket option. Format: `a|l|r:OPTION=VALUE[:VALUE]` where `a`=accept socket, `l`=local socket, `r`=remote socket

# DESCRIPTION

**stunnel** is a TLS/SSL proxy that wraps arbitrary TCP connections with encryption without requiring any changes to the application code. It uses OpenSSL for all cryptographic operations and supports modern TLS versions.

In **server mode** (the default), stunnel listens for incoming TLS-encrypted connections and forwards them unencrypted to a backend service (e.g. a plain-text IMAP or SMTP daemon). In **client mode** (`client = yes`), it accepts unencrypted connections from local clients and establishes a TLS-encrypted tunnel to a remote TLS server.

Stunnel reads a configuration file that contains global settings and one or more named service sections. Each service section defines an independent tunnel. Multiple tunnels can run within a single stunnel process.

It supports inetd-style operation (omit `accept`; stunnel inherits the socket), daemon mode, and launch by systemd. Unix signals control a running daemon: `SIGHUP` reloads the configuration, `SIGUSR1` reopens the log file, and `SIGTERM`/`SIGQUIT`/`SIGINT` shut it down.

**FTP limitation**: stunnel cannot tunnel the FTP data channel because FTP uses dynamically negotiated secondary ports.

# EXAMPLES

**Wrap a plain IMAP daemon with TLS (server mode)**

```
[imapd]
accept  = 993
exec    = /usr/sbin/imapd
execArgs = imapd
cert    = /etc/stunnel/server.pem
```

**Forward encrypted IMAP to a plain local daemon (server mode)**

```
[imapd]
accept  = 993
connect = 143
cert    = /etc/stunnel/server.pem
```

**Wrap outgoing connections to a remote TLS server (client mode)**

```
[imap-client]
client  = yes
accept  = 127.0.0.1:143
connect = mail.example.com:993
```

**SOCKS proxy tunnel (client and server pair)**

```
; Server side
[socks-server]
protocol = socks
accept   = 9080
cert     = /etc/stunnel/server.pem

; Client side
[socks-client]
client   = yes
accept   = 127.0.0.1:1080
connect  = vpnserver.example.com:9080
verifyChain = yes
CAfile   = /etc/stunnel/ca.pem
```

# CAVEATS

SSLv2 and SSLv3 are disabled by default due to known security vulnerabilities. Certificate chain verification (`verifyChain = yes`) and hostname checking (`checkHost`) should be enabled in production client configurations to prevent man-in-the-middle attacks. Transparent proxy mode requires specific kernel support and routing configuration. The `compression` option poses a security risk (CRIME-style attacks) when the application allows attacker-controlled plaintext.

# HISTORY

stunnel was created by **Michał Trojnara** in **1998** as a universal TLS wrapper for TCP services. It remains in active development and supports modern TLS 1.3 and current OpenSSL APIs.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-s_client](/man/openssl-s_client)(1), [certbot](/man/certbot)(1), [socat](/man/socat)(1), [haproxy](/man/haproxy)(1)
