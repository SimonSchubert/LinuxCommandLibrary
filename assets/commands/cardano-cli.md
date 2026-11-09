# TAGLINE

Command-line interface for the Cardano blockchain

# TLDR

**Query tip** (latest block info)

```cardano-cli query tip --mainnet```

**Generate payment keys**

```cardano-cli address key-gen --verification-key-file [payment.vkey] --signing-key-file [payment.skey]```

**Build a payment address**

```cardano-cli address build --payment-verification-key-file [payment.vkey] --out-file [payment.addr] --mainnet```

**Generate stake keys**

```cardano-cli latest stake-address key-gen --verification-key-file [stake.vkey] --signing-key-file [stake.skey]```

**Query UTxOs** for an address

```cardano-cli query utxo --address [addr1...] --mainnet```

**Build a transaction**

```cardano-cli latest transaction build --tx-in [txhash#index] --tx-out [addr]+[lovelace] --change-address [addr] --mainnet --out-file [tx.raw]```

**Sign a transaction**

```cardano-cli latest transaction sign --tx-body-file [tx.raw] --signing-key-file [payment.skey] --mainnet --out-file [tx.signed]```

**Submit a transaction**

```cardano-cli latest transaction submit --tx-file [tx.signed] --mainnet```

# SYNOPSIS

**cardano-cli** [_era_] _command_ [_subcommand_] [_options_]

# DESCRIPTION

**cardano-cli** is the command-line interface for interacting with the Cardano blockchain. It provides functionality for key generation, address creation, transaction building, and querying the blockchain state.

The tool interfaces with a running cardano-node to query blockchain data and submit transactions. It supports both mainnet and various test networks (preprod, preview). Operations include managing stake keys, delegating to stake pools, minting native tokens, and participating in on-chain governance (Conway era).

Cardano uses an extended UTxO (EUTxO) model where transactions consume and produce unspent transaction outputs. The CLI handles the complexity of building valid transactions with proper fees and balancing. Era-dependent commands such as **transaction**, **stake-address**, **stake-pool** and **governance** live under an era group: **latest** (currently Conway) or a named era such as **conway**.

# PARAMETERS

**query**
> Query blockchain state (tip, utxo, protocol-parameters, stake-pools and more).

**address**
> Payment address commands (key-gen, key-hash, build, info).

**key**
> Key utility commands, including mnemonic generation and key conversion.

**node**
> Node operational certificate and key-evolving signature commands.

**hash**
> Hashing utilities for anchor data, scripts and genesis files.

**latest**
> Commands for the latest era (Conway).

**conway**, **dijkstra**
> Commands for a specific era.

**legacy**, **byron**
> Legacy and Byron era commands.

**debug**
> Debugging commands.

**latest transaction**
> Transaction commands (build, build-raw, sign, submit and more).

**latest stake-address**
> Stake address and delegation commands.

**latest stake-pool**
> Stake pool operations.

**latest governance**
> Governance commands: actions, DRep registration, committee, and voting.

**latest genesis**
> Genesis file commands.

**version**
> Show the CLI version.

**--mainnet**
> Use mainnet network magic.

**--testnet-magic** _num_
> Use testnet with specific magic number.

**--socket-path** _path_
> Path to node socket (defaults to CARDANO_NODE_SOCKET_PATH env).

**--out-file** _file_
> Output file for results.

**--signing-key-file** _file_
> Private key for signing.

**--verification-key-file** _file_
> Public key file.

# CAVEATS

Node queries and transaction submission require a running and synced cardano-node with an accessible socket path; key generation and signing work offline. Transactions require correct fee calculation and change output. Keys should be stored securely; loss means loss of funds. Testnet tokens have no real value.

# HISTORY

**cardano-cli** was developed by **Input Output Global (IOG)** as part of the Cardano blockchain project founded by **Charles Hoskinson**, and is now maintained under the **IntersectMBO** organization. Cardano mainnet launched in **September 2017** (Byron era). The Shelley era in **2020** introduced staking. The Alonzo upgrade in **September 2021** added smart contract support. The tool continues to evolve with each protocol upgrade.

# SEE ALSO

[cardano-node](/man/cardano-node)(1), [cardano-wallet](/man/cardano-wallet)(1)

# RESOURCES

```[Source code](https://github.com/IntersectMBO/cardano-cli)```

```[Documentation](https://developers.cardano.org/docs/get-started/infrastructure/cardano-cli/basic-operations/get-started/)```

<!-- verified: 2026-11-09 -->
