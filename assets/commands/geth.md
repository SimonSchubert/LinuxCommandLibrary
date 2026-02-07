# TAGLINE

official Go implementation of Ethereum protocol

# TLDR

**Start Ethereum node**

```geth```

**Sync mainnet**

```geth --syncmode [snap]```

**Start with console**

```geth console```

**Attach to running** node

```geth attach```

**Create new account**

```geth account new```

# SYNOPSIS

**geth** [_options_] [_command_]

# PARAMETERS

_COMMAND_
> Subcommand: console, attach, account, etc.

**--syncmode** _MODE_
> Sync mode: full, snap, light.

**--datadir** _PATH_
> Data directory.

**--http**
> Enable HTTP RPC.

**--ws**
> Enable WebSocket RPC.

**console**
> Interactive JavaScript console.

**attach**
> Attach to running node.

**account** _CMD_
> Account management.

**--help**
> Display help information.

# DESCRIPTION

**geth** (go-ethereum) is the official Go implementation of the Ethereum protocol. It runs a full Ethereum node, enabling blockchain synchronization, transaction validation, mining operations, and smart contract deployment.

The client provides multiple sync modes: "snap" for fast syncing with state snapshots, "full" for complete blockchain validation, and "light" for minimal storage requirements. It exposes JSON-RPC APIs over HTTP, WebSocket, and IPC for application integration.

geth includes an interactive JavaScript console for direct blockchain interaction, account management for creating and managing Ethereum wallets, and support for both mainnet and test networks. It's the most widely used Ethereum client for running production nodes and development environments.

# CAVEATS

Full sync requires significant disk space. Resource intensive. Mainnet sync takes time.

# HISTORY

geth is developed by the **Ethereum Foundation** as the official Go implementation. It was one of the original Ethereum clients and remains the most popular for running nodes.

# SEE ALSO

[eth](/man/eth)(1), [solc](/man/solc)(1)
