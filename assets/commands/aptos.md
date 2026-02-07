# TAGLINE

Aptos blockchain CLI for accounts and smart contracts

# TLDR

**Initialize a new Aptos account**

```aptos init```

**Create a new account on chain**

```aptos account create --account [address]```

**Check account balance**

```aptos account balance --account [address]```

**Compile a Move module**

```aptos move compile --package-dir [path/to/package]```

**Publish a Move module**

```aptos move publish --package-dir [path/to/package]```

**Run a Move function**

```aptos move run --function-id [address::module::function]```

**Transfer APT tokens**

```aptos account transfer --account [recipient] --amount [amount]```

**Get transaction details**

```aptos transaction show --hash [transaction_hash]```

# SYNOPSIS

**aptos** _command_ [_subcommand_] [_options_]

# PARAMETERS

**init**
> Initialize configuration and create a new account.

**account**
> Account-related operations (create, balance, transfer).

**move**
> Move language operations (compile, publish, run, test).

**node**
> Node operations (run, show-status).

**key**
> Key management (generate, extract).

**config**
> Configuration management.

**--profile** _name_
> Use a specific profile from configuration.

**--network** _network_
> Target network: mainnet, testnet, devnet, or custom URL.

**--private-key** _key_
> Private key for signing transactions.

**--assume-yes**
> Assume yes for all prompts.

**--output** _format_
> Output format: json, text.

# DESCRIPTION

**aptos** is the official command-line interface for interacting with the Aptos blockchain. It provides tools for account management, smart contract development using the Move language, and blockchain interactions.

The CLI supports the full development lifecycle: initializing projects, compiling Move modules, running tests, deploying to various networks (devnet, testnet, mainnet), and executing on-chain functions. It manages accounts, keys, and profiles for different environments.

Move is Aptos's smart contract language, derived from Facebook's Diem project. The CLI's Move commands handle compilation, testing, and publishing of Move packages to the blockchain.

# CONFIGURATION

**~/.aptos/config.yaml**
> Main CLI configuration file storing profiles, private keys, and network settings.

**Move.toml**
> Move package manifest file in the project directory, defining dependencies and addresses.

# CAVEATS

Private keys should be protected; avoid storing them in shell history or plain text. Testnet and devnet tokens have no value and are for development only. Gas fees apply to mainnet transactions. The faucet for test tokens may have rate limits.

# HISTORY

Aptos emerged from the Diem (formerly Libra) blockchain project developed at **Meta (Facebook)**. When Diem was discontinued in **2022**, former team members founded **Aptos Labs** and launched the Aptos mainnet in **October 2022**. The CLI and Move language carry forward innovations from Diem's research, including the Move Prover for formal verification.

# SEE ALSO

[solana](/man/solana)(1), [sui](/man/sui)(1), [foundry](/man/foundry)(1)
