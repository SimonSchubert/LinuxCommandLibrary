# TAGLINE

Wallet server and CLI for managing Cardano wallets

# TLDR

**Start the wallet server**

```cardano-wallet serve --port [8090] --node-socket [/path/to/node.socket] --database [/path/to/wallet-db] --mainnet```

**Create a wallet** from recovery phrase

```cardano-wallet wallet create from-recovery-phrase [wallet_name]```

**List all wallets**

```cardano-wallet wallet list```

**Get wallet balance**

```cardano-wallet wallet get --id [wallet_id]```

**Generate a receiving address**

```cardano-wallet address list --id [wallet_id]```

**Create a transaction**

```cardano-wallet transaction create --id [wallet_id] --payment [addr1...@amount]```

**Submit a transaction**

```cardano-wallet transaction submit --id [wallet_id] --transaction [tx_binary]```

# SYNOPSIS

**cardano-wallet** _command_ [_options_]

# DESCRIPTION

**cardano-wallet** is a HTTP server and CLI for managing Cardano wallets. It provides hierarchical deterministic (HD) wallet functionality with a RESTful API, enabling applications to create wallets, manage addresses, and submit transactions.

The wallet server connects to a cardano-node to query blockchain state and submit transactions. It maintains a local database of wallet state, tracking UTxOs and transaction history. The server supports multiple wallets and provides coin selection for transaction building.

Wallets are restored from 15 or 24-word recovery phrases following BIP39/CIP11 standards. The CLI provides both interactive commands and script-friendly output formats.

# PARAMETERS

**serve**
> Start the wallet HTTP server.

**wallet create**
> Create a new wallet.

**wallet list**
> List all wallets.

**wallet get**
> Get wallet details.

**wallet delete**
> Delete a wallet.

**address list**
> List wallet addresses.

**transaction create**
> Build a transaction.

**transaction submit**
> Submit a signed transaction.

**transaction list**
> List wallet transactions.

**stake-pool list**
> List available stake pools.

**--port** _port_
> HTTP server port.

**--node-socket** _path_
> Path to node socket.

**--database** _path_
> Wallet database directory.

**--mainnet**
> Connect to mainnet.

**--testnet** _magic_
> Connect to testnet.

**--id** _wallet_id_
> Wallet identifier.

# CAVEATS

Requires a synced cardano-node. Database must be persisted for wallet recovery. Recovery phrase must be kept secure and offline. The server exposes sensitive operations, so should be properly secured. Syncing wallet state for restored wallets can take time.

# HISTORY

**cardano-wallet** was developed by **Input Output Global (IOG)** as the official wallet backend for Cardano. It was introduced during the **Shelley era** in **2020** to provide a standard wallet implementation. The tool supports the evolving Cardano protocol including staking, native tokens, and smart contract interactions.

# SEE ALSO

[cardano-cli](/man/cardano-cli)(1), [cardano-node](/man/cardano-node)(1), [cardano-address](/man/cardano-address)(1)
