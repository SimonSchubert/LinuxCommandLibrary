# TAGLINE

command-line interface for Handshake daemon

# TLDR

**Show wallet info**

```hsd-cli wallet get```

**Generate address**

```hsd-cli wallet createaddress```

**Send coins**

```hsd-cli wallet send [address] [amount]```

**Show balance**

```hsd-cli wallet balance```

**Query name**

```hsd-cli rpc getnameinfo [name]```

# SYNOPSIS

**hsd-cli** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Command to execute.

**wallet**
> Wallet operations.

**rpc**
> RPC method calls.

**--url** _URL_
> Node URL.

**--api-key** _KEY_
> API key.

**--network** _NETWORK_
> Network to use (main, testnet, regtest, simnet).

**--wallet** _ID_
> Wallet ID.

**--help**
> Display help information.

# DESCRIPTION

**hsd-cli** is the command-line interface for the Handshake daemon (hsd). Handshake is a decentralized naming protocol compatible with DNS where top-level domains are registered on a blockchain.

The tool interacts with the hsd node server for blockchain queries and name operations. For wallet-specific operations, the companion tool **hsw-cli** communicates with the wallet server. RPC commands are available via `hsd-cli rpc <command>`.

# CAVEATS

Requires a running hsd node. Requires Node.js. Name auctions follow specific bidding rules and timelines.

# HISTORY

hsd-cli is part of **Handshake** (HNS), a decentralized naming and certificate authority project.

# SEE ALSO

[hsw-cli](/man/hsw-cli)(1)
