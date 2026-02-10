# TAGLINE

handshake wallet client

# TLDR

**Show wallet info**

```hsw-cli get```

**List wallets**

```hsw-cli wallets```

**Create wallet**

```hsw-cli create [wallet-name]```

**Show balance**

```hsw-cli balance```

**Generate address**

```hsw-cli address```

# SYNOPSIS

**hsw-cli** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Command to execute.

**get**
> Get wallet info.

**wallets**
> List wallets.

**create**
> Create wallet.

**balance**
> Show balance.

**address**
> Generate address.

**--url** _URL_
> Wallet service URL.

**--api-key** _KEY_
> API key.

**--help**
> Display help information.

# DESCRIPTION

**hsw-cli** is the Handshake wallet client. It connects to the wallet service for managing HNS wallets and transactions.

The tool handles wallet creation, balance queries, and address generation. It separates wallet functions from the main node.

# CAVEATS

Requires wallet service running. Separate from node client. Cryptocurrency tool.

# HISTORY

hsw-cli is the wallet-specific CLI for **Handshake**, complementing the hsd-cli node client.

# SEE ALSO

[hsd-cli](/man/hsd-cli)(1), [hsd](/man/hsd)(1)
