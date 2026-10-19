# TAGLINE

Redis-compatible in-memory store with built-in full-text and vector search

# TLDR

**Start the server** on the default port 6380

```kividb```

**Listen on a specific port**

```kividb --port [6380]```

**Require a password** for the default user

```kividb --requirepass [password]```

**Enable append-only file persistence**

```kividb --aof --dir [/var/lib/kividb]```

**Load a Redis-style configuration file**

```kividb --configfile [/etc/kividb/kividb.conf]```

**Cap memory** and evict least-recently-used keys

```kividb --maxmemory [1gb] --maxmemory-policy [allkeys-lru]```

**Replicate from a primary**

```kividb --replicaof [127.0.0.1] [6380] --masterauth [password]```

**Start a cluster node**

```kividb --cluster-enabled yes --port [6380]```

**Talk to a running instance** with any Redis client

```redis-cli -p 6380 PING```

# SYNOPSIS

**kividb** [_options_]

# PARAMETERS

**--port** _number_
> TCP port for plaintext Redis-protocol clients (default: 6380).

**--bind** _address_
> Listen address (default: 0.0.0.0). Setting it on the command line or in the config file turns protected mode off.

**--protected-mode** _yes|no_
> While the default user has no password and **--bind** was not set, accept clients from this machine only (default: yes).

**--configfile** _path_
> Redis-style configuration file (default: `/etc/kividb/kividb.conf`). A missing file is ignored. Command-line flags override the file.

**--threads** _n_
> Worker threads. `0` (default) is automatic: all cores below 4, otherwise cores minus 2.

**--databases** _n_
> Number of logical databases (default: 16).

**--dir** _path_
> Working directory for `dump.kdb`, `appendonly.aof`, backups, and `nodes.conf`. Empty uses the directory the process was started in.

**--aof**
> Enable append-only file persistence (`appendonly.aof`).

**--maxmemory** _size_
> Memory limit (default: 0, unlimited). Accepts a byte count or a Redis-style unit such as `512mb` or `3gb`.

**--maxmemory-policy** _policy_
> What happens at the memory limit (default: `noeviction`). Policies include `allkeys-lru`, `allkeys-lfu`, `allkeys-lrm`, `allkeys-random`, and the matching `volatile-*` / `volatile-ttl` forms.

**--loglevel** _level_
> `debug`, `verbose`, `notice` (or `info`), `warning`, or `nothing` (default: `info`).

**--logfile** _path_
> Append the log to this file instead of standard error.

**--log-format** _text|json_
> Log line format (default: `text`).

**--io-model** _auto|uring|tokio_
> I/O backend (default: `auto`). On Linux, `auto` uses io_uring when the kernel allows it and falls back to Tokio.

**--requirepass** _password_
> Password for the `default` user.

**--aclfile** _path_
> ACL file to load users from.

**--replicaof** _host_ _port_
> Replicate from the given primary.

**--masterauth** _password_
> Password presented to the primary during the replica handshake.

**--cluster-enabled** _yes|no_
> Cluster mode. The cluster bus listens on client port plus 10000; topology is stored in `nodes.conf` (default: no).

**--cluster-node-timeout** _ms_
> Milliseconds without a reply before a peer is suspected to have failed (default: 15000).

**--tls-port** _port_
> TLS listener port. `0` disables TLS. Requires a binary built with the `tls` Cargo feature, plus **--tls-cert-file** and **--tls-key-file**.

**--tls-cert-file** _path_
> Server certificate (PEM).

**--tls-key-file** _path_
> Server private key (PEM).

**--tls-ca-cert-file** _path_
> CA used to verify client certificates.

**--tls-auth-clients** _yes|optional|no_
> Whether TLS clients must present a certificate signed by **--tls-ca-cert-file** (default: yes).

**--update-check** _yes|no_
> On a release build, ask GitHub once at startup whether a newer tag exists (default: yes). `KIVIDB_NO_UPDATE_CHECK=1` also turns it off.

**--help**
> Print the full flag list.

**--version**
> Print the version.

# DESCRIPTION

**kividb** is the KiviDB server, a multi-threaded in-memory key-value store written in Rust. It speaks the Redis protocol (RESP2 and RESP3), so existing Redis clients, `redis-cli`, and libraries talk to it unchanged. Full-text, tag, numeric, and vector search (`FT.*`, including FLAT and HNSW) are built in rather than loaded as a module.

The default listen address is `0.0.0.0:6380`, not Redis's 6379, so both can run on the same host. Persistence uses native snapshots (`dump.kdb`, via `SAVE` / `BGSAVE`) and an optional append-only file (`--aof`). With AOF enabled, recovery replays `appendonly.aof`; the file is fsynced about once a second. Vector indexes store their HNSW graph in the snapshot when you save after ingest, so a restart does not have to rebuild the graph from hashes.

Worker threads shard the dataset across cores. On Linux the server uses io_uring when **--io-model** is `auto` or `uring` and the kernel allows it. Lua scripting (`EVAL`, `SCRIPT`, `FUNCTION`, `FCALL`) is compiled in only with `--features lua`. TLS is compiled in only with `--features tls`; a binary without that feature refuses to start if **--tls-port** is set, rather than serving plaintext.

Replication (`--replicaof`) and Redis-style clustering (`--cluster-enabled yes`) are supported. A replica is always read-only. KiviDB does not snapshot on a Redis `save` schedule; use AOF or `BGSAVE`.

Release binaries and `.deb` / `.rpm` packages are published on GitHub Releases. Docker images (`kividb/kividb`, `ghcr.io/kividbio/kividb`) listen with `--protected-mode no` by default because a container is never reached from loopback.

# CONFIGURATION

**/etc/kividb/kividb.conf**
> Redis-style file: one directive per line (`port 6380`, `appendonly yes`, `bind 127.0.0.1`). Comments start with `#`. Unknown directives are errors. Command-line flags win over the file. `CONFIG REWRITE` can create the file if it is missing.

**dump.kdb**
> Native snapshot written by `SAVE` / `BGSAVE` in **--dir**. Loaded at startup unless an AOF is present.

**appendonly.aof**
> Append-only log used when **--aof** / `appendonly yes` is set. When present it is the source of truth on restart.

**nodes.conf**
> Cluster topology file (default name; **--cluster-config-file** changes it).

# CAVEATS

Protected mode is on by default. Remote clients receive `-DENIED` until you set **--requirepass**, **--bind**, or **--protected-mode no**. Binding to a public address without a password exposes the dataset.

The default port is **6380**. Point `redis-cli` and other clients at that port, or pass **--port 6379**.

`--maxmemory 0` is unlimited. Without a limit the process can consume all RAM.

Lua commands error on a default (non-`lua`) build. **--tls-port** on a non-`tls` build is fatal.

There is no `--daemonize`. Run under a supervisor or systemd. Redis `save` intervals are ignored. `appendfsync` is always once a second.

Docker's default seccomp profile often blocks io_uring, so the server falls back to Tokio unless you loosen seccomp.

A release build makes one HTTPS request to GitHub at startup unless **--update-check no**, `update-check no` in the config file, `KIVIDB_NO_UPDATE_CHECK=1`, or `CI` is set.

KiviDB is licensed AGPL-3.0-only. Talking to it over the network does not put client applications under the AGPL; modifying the server and offering that modified version as a network service does.

# HISTORY

**KiviDB** is developed by **KIVIDB PRIVATE LIMITED**. Version **1.0** was released in **October 2026**, followed shortly by **1.1.0**. It is written in Rust as a Redis-protocol alternative with built-in search, under the GNU Affero General Public License v3.

# SEE ALSO

[redis-server](/man/redis-server)(1), [redis-cli](/man/redis-cli)(1), [valkey-server](/man/valkey-server)(1), [valkey-cli](/man/valkey-cli)(1), [memcached](/man/memcached)(1)

# RESOURCES

```[Source code](https://github.com/kividbio/kividb)```

```[Homepage](https://kividb.io)```

```[Documentation](https://github.com/kividbio/kividb/blob/master/COMMANDS.md)```

<!-- verified: 2026-10-19 -->
