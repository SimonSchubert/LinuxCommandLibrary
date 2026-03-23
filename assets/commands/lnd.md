# TAGLINE

Lightning Network Daemon for Bitcoin

# TLDR

**Start the daemon**

```lnd```

**Start with a specific Bitcoin backend**

```lnd --bitcoin.active --bitcoin.mainnet --bitcoind.rpcuser=[user] --bitcoind.rpcpass=[pass]```

**Start on testnet**

```lnd --bitcoin.active --bitcoin.testnet```

**Specify a custom data directory**

```lnd --lnddir=[~/.lnd]```

# SYNOPSIS

**lnd** [_options_]

# PARAMETERS

**--bitcoin.active**
> Enable Bitcoin as the active chain.

**--bitcoin.mainnet**
> Use the Bitcoin main network.

**--bitcoin.testnet**
> Use the Bitcoin test network.

**--bitcoind.rpcuser** _USER_
> Username for bitcoind RPC authentication.

**--bitcoind.rpcpass** _PASS_
> Password for bitcoind RPC authentication.

**--lnddir** _DIR_
> Custom path to lnd's data directory.

**--listen** _ADDR_
> Add an interface/port to listen for peer connections.

**--rpclisten** _ADDR_
> Add an interface/port for the RPC server to listen on.

**--restlisten** _ADDR_
> Add an interface/port for the REST server to listen on.

**--debuglevel** _LEVEL_
> Logging level (trace, debug, info, warn, error, critical).

**--help**, **-h**
> Show help.

**--version**, **-v**
> Display version information.

# DESCRIPTION

**lnd** (Lightning Network Daemon) is a complete implementation of the **Lightning Network** protocol. It enables fast, low-cost Bitcoin transactions through payment channels, allowing near-instant payments without waiting for blockchain confirmations.

The daemon manages payment channels, routes payments across the network, and maintains a local channel graph. It exposes gRPC and REST APIs for interaction, typically used via the companion **lncli** command-line client.

# CAVEATS

Requires a Bitcoin full node backend (bitcoind, btcd, or neutrino). Channel management involves real funds on mainnet. Written in Go.

# SEE ALSO

[electrum](/man/electrum)(1), [geth](/man/geth)(1)

