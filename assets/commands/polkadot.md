# TAGLINE

Polkadot blockchain node

# TLDR

**Start a full node**

```polkadot```

**Start a validator node**

```polkadot --validator --name [myValidator]```

**Synchronize with a specific chain**

```polkadot --chain [kusama]```

**Use warp sync for fast initial synchronization**

```polkadot --sync [warp]```

**Specify a custom data directory**

```polkadot --base-path [/path/to/data]```

**Purge the local chain data**

```polkadot purge-chain --chain [polkadot]```

# SYNOPSIS

**polkadot** [_options_] [_subcommand_]

# PARAMETERS

**--validator**
> Run as a validator node.

**--name** _NAME_
> Human-readable node name for telemetry.

**--chain** _CHAIN_
> Specify the chain: polkadot, kusama, westend, paseo, or path to chain spec JSON.

**--base-path** _DIR_
> Custom data directory.

**--sync** _MODE_
> Sync mode: Full (default), Fast, or Warp.

**--state-pruning** _N_
> Number of block states to keep. Use `archive` or `archive-canonical` to keep all. Default: 256.

**--blocks-pruning** _N_
> Number of blocks to keep. Use `archive` or `archive-canonical` to keep all. Default: archive-canonical.

**--rpc-port** _PORT_
> Unified JSON-RPC and WebSocket server port (default: 9944).

**--rpc-external**
> Listen on all interfaces for RPC connections.

**--rpc-methods** _METHOD_
> RPC methods to expose: Auto (default), Safe, or Unsafe.

**--bootnodes** _ADDRS_
> Specify bootstrap nodes.

**purge-chain**
> Remove the entire local chain database.

**key**
> Key management utilities (generate, insert, inspect).

**export-chain-spec**
> Export the chain specification.

**--help**, **-h**
> Display help.

**--version**, **-V**
> Display version.

# DESCRIPTION

**polkadot** is the reference node implementation for the **Polkadot** blockchain network, a multi-chain protocol enabling cross-chain interoperability. The node participates in the network by validating transactions, producing blocks, and relaying messages between parachains.

The node can operate as a full node (syncing and verifying the chain), a validator (participating in consensus), or a collator (producing blocks for parachains). Built on the Substrate framework as part of the **polkadot-sdk** monorepo and written in Rust.

# CAVEATS

Validator nodes require staking DOT tokens. Running a full node requires significant disk space and bandwidth. The `--pruning` flag still works as an alias for `--state-pruning`. HTTP and WebSocket are served on a single unified port (default 9944).

# SEE ALSO

[cardano-node](/man/cardano-node)(1), [geth](/man/geth)(1)

