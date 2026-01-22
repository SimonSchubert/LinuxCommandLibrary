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

**geth** (go-ethereum) is the official Go implementation of the Ethereum protocol. It runs a full Ethereum node, enabling blockchain interaction, mining, and smart contract deployment.

The client syncs the blockchain, validates transactions, and provides RPC APIs for applications. It supports multiple sync modes balancing speed and security.

geth is the most widely used Ethereum client for running nodes and development.

# CAVEATS

Full sync requires significant disk space. Resource intensive. Mainnet sync takes time.

# HISTORY

geth is developed by the **Ethereum Foundation** as the official Go implementation. It was one of the original Ethereum clients and remains the most popular for running nodes.

# SEE ALSO

[eth](/man/eth)(1), [solc](/man/solc)(1)
