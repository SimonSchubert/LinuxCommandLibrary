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

**--wallet** _ID_
> Wallet ID.

**--help**
> Display help information.

# DESCRIPTION

**hsd-cli** is the command-line interface for Handshake daemon. Handshake is a decentralized naming protocol compatible with DNS.

The tool manages wallets, names, and blockchain queries. It interacts with the hsd node for name registrations and transactions.

hsd-cli manages Handshake blockchain.

# CAVEATS

Requires running hsd node. Cryptocurrency tool. Name auctions have rules.

# HISTORY

hsd-cli is part of **Handshake** (HNS), a decentralized naming and certificate authority project.

# SEE ALSO

[hsw-cli](/man/hsw-cli)(1), [hsd](/man/hsd)(1)
