# TAGLINE

Encrypted TCP tunnel with a local SOCKS5 proxy

# TLDR

**Start a server** on all interfaces

```rawlink server --listen [0.0.0.0:6123] --psk [64-hex-chars]```

**Start a client** and open a local SOCKS5 proxy

```rawlink client --server [203.0.113.10:6123] --socks-listen [127.0.0.1:1080] --psk [64-hex-chars]```

**Reach a site** through that proxy

```curl --proxy socks5h://[127.0.0.1:1080] [https://example.com]```

**Obfuscate** the tunnel as random bytes (set the same mode on both ends)

```rawlink client --server [203.0.113.10:6123] --psk [64-hex-chars] --obfs rand```

**Mimic an SSH handshake**

```rawlink server --listen [0.0.0.0:6123] --psk [64-hex-chars] --obfs ssh --ssh-banner '[SSH-2.0-OpenSSH_9.6p1 Ubuntu-3ubuntu13.5]'```

**Prefer throughput** over small packets

```rawlink client --server [203.0.113.10:6123] --psk [64-hex-chars] --mode throughput```

**Log more detail**

```rawlink --log-level debug server --listen [0.0.0.0:6123] --psk [64-hex-chars]```

# SYNOPSIS

**rawlink** [**--log-level** _level_] **client** **--server** _ip:port_ [_options_]

**rawlink** [**--log-level** _level_] **server** [**--listen** _ip:port_] [_options_]

# PARAMETERS

**--log-level** _LEVEL_
> Verbosity: `error`, `warn`, `info`, or `debug`. Default: `info`. Applies to either subcommand.

**client**
> Listen for SOCKS5 connections and carry them to a RawLink server.

**server**
> Accept RawLink tunnels and open the TCP destinations the client requests.

**--server** _ADDR_
> Client. Peer address as `IP:port`. A hostname is rejected.

**--listen** _ADDR_
> Server. Address that accepts tunnels, as `IP:port`. Default: `127.0.0.1:6123` (loopback only).

**--socks-listen** _ADDR_
> Client. Local SOCKS5 address, as `IP:port`. Default: `127.0.0.1:1080`.

**--psk** _HEX_
> Shared 32-byte key, written as 64 hex characters. Required to match on both ends. If omitted, a built-in development key is used and a warning is logged.

**--mode** _MODE_
> How many frames this process packs into one carrier packet. `low-latency` packs 8, `balanced` (default) packs 64, `throughput` packs 256. `lowlatency` is an alias of `low-latency`. Any other value is treated as `balanced`. Each end chooses its own mode.

**--max-conn** _N_
> Client. Maximum simultaneous SOCKS5 connections. Default: 256. Each connection holds two file descriptors.

**--max-streams** _N_
> Maximum streams on one tunnel. Must be greater than 0. Default: 256. The client opens another tunnel, up to **--max-tunnels**, as this limit is approached.

**--max-tunnels** _N_
> Client. Cap on parallel tunnels to the server. Default: 4. A value below 1 is treated as 1.

**--obfs** [_MODE_]
> Carrier obfuscation. Must match on the peer. `rand` presents high-entropy bytes, with padding and optional idle cover traffic. `ssh` starts with an OpenSSH-style banner and key exchange, then switches to the tunnel. `off` and `none` disable it. The flag with no value means `rand`. Omitting the flag leaves obfuscation off.

**--ssh-banner** _STRING_
> Identification string sent in `ssh` mode, without a trailing CRLF. Both ends must use the same string. Default: `SSH-2.0-OpenSSH_9.6p1 Ubuntu-3ubuntu13.5`.

**--obfs-padding** _BYTES_
> Maximum random padding added to a frame, from 0 to 127. Default: 64.

**--obfs-dummy** _RANGE_
> `rand` mode. Idle gap before a cover frame, as `min-max` milliseconds, a single millisecond count, or `off`. Default: `700-2200`. Values below 50 ms are raised to 50 ms.

**--obfs-dummy-size** _BYTES_
> `rand` mode. Maximum cover-frame payload, from 0 to 8192. Default: 384. A size of 0, or **--obfs-dummy** `off`, sends no cover traffic.

**-h**, **--help**
> Show help. Also accepted after **client** or **server**.

**-V**, **--version**
> Print the version and exit.

# DESCRIPTION

**rawlink** is a client-server TCP tunnel. The **client** subcommand listens as a SOCKS5 proxy. Each accepted CONNECT becomes one stream inside an AES-256-GCM session to a **server**, which dials the requested host and relays bytes both ways. Many streams share a tunnel. The client reconnects with backoff after a tunnel dies, and it can hold several tunnels at once.

Peers authenticate with a pre-shared key. There is no certificate exchange and no forward secrecy. Session keys are derived from that key and a session id. The crate version is 0.1.0, and the author states that the cryptography has not had an independent security audit.

Obfuscation is optional and separate from encryption. **rand** masks the carrier so the bytes look random, and can insert padding and idle cover frames. **ssh** imitates the opening of an OpenSSH session, then carries the tunnel in what follows. These modes change how the connection looks on the wire. They do not add a second cipher, and the author describes them as unproven against traffic analysis.

The local proxy speaks SOCKS5 with no authentication and accepts only the CONNECT command, for IPv4, IPv6, and domain destinations. UDP associate and BIND are rejected.

The program is a Rust binary. From a clone of the repository, `cargo build --release` writes `target/release/rawlink`.

# CAVEATS

**--server**, **--listen**, and **--socks-listen** must be numeric `IP:port` values. Names are not resolved.

The server listens on `127.0.0.1:6123` unless **--listen** says otherwise, so a remote client cannot connect until the server binds a reachable address.

Omitting **--psk** selects a key that is compiled into the binary. Both ends then share that development key. Do not use it for real traffic.

**--psk**, **--obfs**, and, in `ssh` mode, **--ssh-banner** have to agree on both ends. A mismatch closes the connection during admission or the obfuscation handshake.

The SOCKS5 listener does not ask for a username or password. Bind it to loopback unless every host that can reach that port should be allowed to proxy.

Only TCP CONNECT is proxied. A TUN interface, and UDP through the proxy, are outside what this command does.

A peer that speaks a different protocol version rejects the packet. Upgrade both ends together.

# HISTORY

**RawLink** was published by **Zola Gonano** on **19 October 2026** as version **0.1.0**, under the MIT license or the Apache License 2.0.

# SEE ALSO

[curl](/man/curl)(1), [proxychains](/man/proxychains)(1), [ss-local](/man/ss-local)(1), [ssh](/man/ssh)(1)

# RESOURCES

```[Source code](https://github.com/zolagonano/RawLink)```

```[Documentation](https://zola.ink/blog/posts/rawlink-building-a-vpn-protocol-from-scratch)```

<!-- verified: 2026-10-20 -->
