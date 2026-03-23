# TAGLINE

Polkadot blockchain node

# TLDR

**Start a full node**

```polkadot```

**Start a validator node**

```polkadot --validator --name [myValidator]```

**Synchronize with a specific chain**

```polkadot --chain [kusama]```

**Specify a custom data directory**

```polkadot --base-path [/path/to/data]```

**Prune old block state**

```polkadot --pruning [256]```

# SYNOPSIS

**polkadot** [_options_] [_subcommand_]

# PARAMETERS

**--validator**
> Run as a validator node.

**--name** _NAME_
> Human-readable node name for telemetry.

**--chain** _CHAIN_
> Specify the chain (polkadot, kusama, westend, or path to chain spec).

**--base-path** _DIR_
> Custom data directory.

**--pruning** _N_
> Number of block states to keep. Use "archive" to keep all.

**--rpc-port** _PORT_
> JSON-RPC server port.

**--rpc-external**
> Listen on all interfaces for RPC connections.

**--bootnodes** _ADDRS_
> Specify bootstrap nodes.

**--help**, **-h**
> Display help.

**--version**, **-V**
> Display version.

# DESCRIPTION

**polkadot** is the reference node implementation for the **Polkadot** blockchain network, a multi-chain protocol enabling cross-chain interoperability. The node participates in the network by validating transactions, producing blocks, and relaying messages between parachains.

The node can operate as a full node (syncing and verifying the chain), a validator (participating in consensus), or a collator (producing blocks for parachains). Built on the Substrate framework and written in Rust.

# CAVEATS

Validator nodes require staking DOT tokens. Running a full node requires significant disk space and bandwidth. Written in Rust.

# SEE ALSO

[cardano-node](/man/cardano-node)(1), [geth](/man/geth)(1)

