# TAGLINE

Sui blockchain command-line interface

# TLDR

**Start local network**

```sui start```

**Create new address**

```sui client new-address ed25519```

**Check gas**

```sui client gas```

**Publish package**

```sui client publish --gas-budget [1000000]```

**Call function**

```sui client call --package [pkg] --module [mod] --function [fn]```

**Switch environment**

```sui client switch --env [devnet]```

# SYNOPSIS

**sui** _command_ [_subcommand_] [_options_]

# PARAMETERS

**start**
> Start local network.

**client**
> Client operations.

**move**
> Move language tools.

**keytool**
> Key management.

**--gas-budget** _N_
> Gas limit.

**--env** _NAME_
> Environment.

# DESCRIPTION

**sui** is the command-line interface for interacting with the Sui blockchain, a Layer 1 blockchain that uses the Move programming language for smart contracts. It provides tools for managing wallets, deploying and interacting with Move packages, executing transactions, and running a local development network.

The CLI encompasses several subcommands including client operations for wallet management and transactions, move commands for building and testing smart contracts, and keytool for cryptographic key management. It supports connecting to devnet, testnet, and mainnet environments.

A local network can be started for development and testing, providing a self-contained Sui environment without requiring connection to public networks. Gas budget management is integral to all transactions on the Sui blockchain.

# CAVEATS

Sui blockchain specific. Move language. Account required.

# HISTORY

**sui** is the CLI for the **Sui** blockchain, a Layer 1 blockchain using Move language for smart contracts.

# SEE ALSO

[solana](/man/solana)(1), [aptos](/man/aptos)(1)
