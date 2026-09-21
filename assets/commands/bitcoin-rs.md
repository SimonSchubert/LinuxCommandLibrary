# TAGLINE

Independent Bitcoin full node written in Rust

# TLDR

**Start** a mainnet node in the current directory

```bitcoin-rs --data-dir [.bitcoin-rs]```

Run on **regtest** with a local RPC port

```bitcoin-rs --network [regtest] --data-dir [.bitcoin-rs-regtest] --rpc-bind [127.0.0.1:18443]```

Enable the **transaction index**

```bitcoin-rs --data-dir [.bitcoin-rs] --txindex [true]```

Enable **full script/address history** (Esplora-style)

```bitcoin-rs --data-dir [.bitcoin-rs] --scriptindex [full]```

Use **redb** instead of the default fjall store

```bitcoin-rs --data-dir [.bitcoin-rs] --storage-backend [redb]```

Verify **every historical script** (ignore assume-valid)

```bitcoin-rs --data-dir [.bitcoin-rs] --validation-mode [full]```

Load a **TOML** config, then override with flags

```bitcoin-rs --config [node.toml] --data-dir [.bitcoin-rs]```

Also read a Core-style **bitcoin.conf**

```bitcoin-rs --bitcoin-conf [bitcoin.conf] --data-dir [.bitcoin-rs]```

**Measure** datadir storage and exit

```bitcoin-rs --data-dir [.bitcoin-rs] --measure-storage```

# SYNOPSIS

**bitcoin-rs** [_options_]

# DESCRIPTION

**bitcoin-rs** is a Bitcoin full node implemented in Rust. It validates Legacy, SegWit v0, and Taproot spends with a native interpreter, stores chainstate in an embedded engine (fjall by default, redb compiled in, optional RocksDB), and serves Bitcoin Core-compatible JSON-RPC on **127.0.0.1:8332** for mainnet.

The node is walletless: it does not custody private keys. Optional **txindex** and **scriptindex** feed Esplora-compatible HTTP APIs so wallets and explorers can query UTXOs and confirmed history without a separate Electrum server. A typed in-process Rust API embeds the same node in other programs.

Configuration layers, from lowest to highest precedence, are built-in defaults, **--config** TOML, **--bitcoin-conf**, `BITCOIN_RS_*` environment variables, then CLI flags. Default RPC basic auth is `bitcoin-rs` / `bitcoin-rs` until cookie auth or custom credentials are set.

This is a separately designed implementation, not Bitcoin Core. Consensus is checked against Core test vectors and, optionally, `libbitcoinkernel` when built with `--features kernel`.

# PARAMETERS

**--data-dir** _path_
> Directory for chainstate and indexes (default `.bitcoin-rs`).

**--network** _name_
> `mainnet` (default), `signet`, `testnet4`, or `regtest`.

**--config** _file_
> TOML config file.

**--bitcoin-conf** _file_
> Bitcoin Core-style `bitcoin.conf`. Applied after TOML and before environment and CLI.

**--storage-backend** _name_
> `fjall` (default), `redb`, or `rocksdb` (needs the matching Cargo feature).

**--rpc-bind** _addr_
> JSON-RPC listen address (default `127.0.0.1:8332` on mainnet).

**--rpc-user** _user_ / **--rpc-password** _pass_
> HTTP basic auth. Change these before exposing the port.

**--rpc-cookie** _path_
> Cookie-file auth instead of user/password.

**--rest** _true|false_
> Serve unauthenticated Core REST on the RPC listener. Bare **--rest** is not an enable switch; pass an explicit boolean.

**--txindex** _true|false_
> Maintain a full transaction index.

**--scriptindex** [_utxo_|_full_]
> Script/address index. Bare **--scriptindex** means **full** (live UTXOs plus confirmed history). **utxo** is the live view only.

**--dbcache-mb** _n_
> UTXO cache budget in MiB (default 450).

**--prune-target-mb** _n_
> Prune stored blocks down to this size.

**--fast-sync**
> Opt-in block download policy: more outbound peers and earlier fan-out. Consensus validation is unchanged.

**--validation-mode** _mode_
> Historical script policy: **assume-valid** (default, skip scripts through the pinned assume-valid anchor), **full** (execute every script), **fast** (skip scripts on the best header chain below the tip).

**--assume-valid-height** _n_
> Height through which assume-valid may skip scripts. **0** verifies from genesis.

**--p2p-listen** _addr[,addr...]_
> P2P bind addresses.

**--connect** _host:port[,...]_
> Connect only to these peers.

**--metrics-bind** _addr_
> Prometheus metrics listener (off by default).

**--mining-payout-address** _addr_
> Watch-only coinbase address for `getblocktemplate`.

**--measure-storage**
> Write storage-footprint JSON and exit without starting the node.

# CONFIGURATION

**BITCOIN_RS_***
> Environment overrides matching CLI fields, for example `BITCOIN_RS_NETWORK`, `BITCOIN_RS_DATA_DIR`, `BITCOIN_RS_STORAGE_BACKEND`, `BITCOIN_RS_FAST_SYNC`.

**--config TOML**
> Structured node config, including `[[notifications.zmq]]` endpoint groups.

**bitcoin.conf**
> Optional Core-compatible file selected with **--bitcoin-conf**. Network-specific sections follow the network chosen by TOML, environment, and CLI.

# CAVEATS

Independent implementation; do not treat it as Bitcoin Core. There is no in-tree wallet. Default RPC credentials are public and must be changed before any non-loopback bind. Initial block download needs substantial disk, CPU, and time. **--fast** validation trusts the most-work header chain for historical scripts. Datadir formats are not interchangeable with Core. The project is under active development.

# HISTORY

**bitcoin-rs** is developed by **gosuda** as a from-scratch Rust full node aimed at typed in-process embedding, node-owned UTXO and script indexes, and reproducible checks against Bitcoin Core.

# SEE ALSO

[bitcoind](/man/bitcoind)(1), [bitcoin-cli](/man/bitcoin-cli)(1), [bitcoin-qt](/man/bitcoin-qt)(1)

# RESOURCES

```[Source code](https://github.com/gosuda/bitcoin-rs)```

```[Documentation](https://github.com/gosuda/bitcoin-rs/blob/main/docs/getting-started.md)```

<!-- verified: 2026-09-21 -->
