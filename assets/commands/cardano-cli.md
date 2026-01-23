# TLDR

**Query tip** (latest block info)

```cardano-cli query tip --mainnet```

**Generate payment keys**

```cardano-cli address key-gen --verification-key-file [payment.vkey] --signing-key-file [payment.skey]```

**Build a payment address**

```cardano-cli address build --payment-verification-key-file [payment.vkey] --out-file [payment.addr] --mainnet```

**Query UTxOs** for an address

```cardano-cli query utxo --address [addr1...] --mainnet```

**Build a transaction**

```cardano-cli transaction build --tx-in [txhash#index] --tx-out [addr]+[lovelace] --change-address [addr] --mainnet --out-file [tx.raw]```

**Sign a transaction**

```cardano-cli transaction sign --tx-body-file [tx.raw] --signing-key-file [payment.skey] --mainnet --out-file [tx.signed]```

**Submit a transaction**

```cardano-cli transaction submit --tx-file [tx.signed] --mainnet```

# SYNOPSIS

**cardano-cli** _command_ [_subcommand_] [_options_]

# DESCRIPTION

**cardano-cli** is the command-line interface for interacting with the Cardano blockchain. It provides functionality for key generation, address creation, transaction building, and querying the blockchain state.

The tool interfaces with a running cardano-node to query blockchain data and submit transactions. It supports both mainnet and various test networks (preprod, preview). Operations include managing stake keys, delegating to stake pools, and minting native tokens.

Cardano uses an extended UTxO (EUTxO) model where transactions consume and produce unspent transaction outputs. The CLI handles the complexity of building valid transactions with proper fees and balancing.

# PARAMETERS

**query**
> Query blockchain state (tip, utxo, protocol-parameters).

**address**
> Address commands (key-gen, build).

**transaction**
> Transaction commands (build, sign, submit).

**stake-address**
> Stake address and delegation commands.

**stake-pool**
> Stake pool operations.

**key**
> Key utility commands.

**genesis**
> Genesis block commands.

**--mainnet**
> Use mainnet network magic.

**--testnet-magic** _num_
> Use testnet with specific magic number.

**--socket-path** _path_
> Path to node socket (or CARDANO_NODE_SOCKET_PATH env).

**--out-file** _file_
> Output file for results.

**--signing-key-file** _file_
> Private key for signing.

**--verification-key-file** _file_
> Public key file.

# CAVEATS

Requires a running and synced cardano-node. Socket path must be accessible. Transactions require correct fee calculation and change output. Keys should be stored securely; loss means loss of funds. Testnet tokens have no real value.

# HISTORY

**cardano-cli** is developed by **Input Output Global (IOG)** as part of the Cardano blockchain project founded by **Charles Hoskinson**. Cardano mainnet launched in **September 2017** (Byron era). The Shelley era in **2020** introduced staking. The Alonzo upgrade in **September 2021** added smart contract support. The tool continues to evolve with each protocol upgrade.

# SEE ALSO

[cardano-node](/man/cardano-node)(1), [cardano-wallet](/man/cardano-wallet)(1), [cardano-address](/man/cardano-address)(1)
