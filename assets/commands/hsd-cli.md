# TAGLINE

command-line client for the Handshake node server

# TLDR

**Show node** and chain status

```hsd-cli info```

**List available commands**

```hsd-cli help```

**Query a name** on the Handshake chain

```hsd-cli rpc getnameinfo [name]```

**Show the DNS resource** stored for a name

```hsd-cli rpc getnameresource [name]```

Show **blockchain info** through RPC

```hsd-cli rpc getblockchaininfo```

Show a **block** by height or hash

```hsd-cli block [height_or_hash]```

Show a **transaction** or an address history

```hsd-cli tx [hash_or_address]```

Print the **mempool** snapshot

```hsd-cli mempool```

Connect to a node on another **network** with an **API key**

```hsd-cli --network=[regtest] --api-key=[key] info```

# SYNOPSIS

**hsd-cli** [_options_] _command_ [_args_]

# PARAMETERS

**info**
> Get server info.

**block** _hash_|_height_
> View a block.

**header** _hash_|_height_
> View a block header.

**tx** _hash_|_address_
> View a transaction, or the transactions of an address.

**coin** _hash index_|_address_
> View coins.

**mempool**
> Get a mempool snapshot.

**broadcast** _tx-hex_
> Broadcast a raw transaction.

**reset** _height_|_hash_
> Reset the chain to the given block.

**rpc** _method_ [_args_]
> Execute a node RPC call, such as getnameinfo or getpeerinfo.

**help**
> Show the list of commands.

**-n**, **--network=**_NETWORK_
> Network to use: main (default), testnet, regtest or simnet.

**-u**, **--url=**_URL_
> Full URL of the node HTTP server.

**-k**, **--api-key=**_KEY_
> API key for the node HTTP server.

**-s**, **--ssl**
> Connect over TLS.

**-h**, **--http-host=**_HOST_
> Hostname of the node HTTP server. Note that **-h** is not a help flag here.

**-p**, **--http-port=**_PORT_
> Port of the node HTTP server. Defaults to the port of the selected network (12037 on main).

**--timeout=**_MS_
> Request timeout.

# DESCRIPTION

**hsd-cli** is the command-line interface for the node server of **hsd**, the reference implementation of Handshake. Handshake is a decentralized naming protocol compatible with DNS where top-level domains are registered on a blockchain.

The tool queries the running node for blocks, transactions, coins and name data, and forwards any other node RPC method through **hsd-cli rpc**. Wallet operations such as balances, addresses and sending coins are not part of it: they are provided by the companion tool **hsw-cli**, which talks to the wallet server.

Options can also be set in **hsd.conf** in the data directory or through environment variables prefixed with **HSD_**.

# CAVEATS

Requires a running hsd node and Node.js. Pass option values as **--option=value**. **reset** rewinds the node's chain state.

# HISTORY

hsd-cli is part of **hsd**, the reference implementation of **Handshake** (HNS), a decentralized naming and certificate authority project. It is also published separately in the **hs-client** package.

# SEE ALSO

[hsw-cli](/man/hsw-cli)(1)

# RESOURCES

```[Source code](https://github.com/handshake-org/hsd)```

```[Homepage](https://handshake.org)```

```[Documentation](https://hsd-dev.org/api-docs/)```

<!-- verified: 2026-11-09 -->
