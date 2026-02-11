# TAGLINE

Solana blockchain command-line interface

# TLDR

**Check wallet balance**

```solana balance```

**Check balance** of a specific address

```solana balance [address]```

**Get current cluster configuration**

```solana config get```

**Set cluster** to devnet, testnet, or mainnet

```solana config set --url [devnet|testnet|mainnet-beta]```

**Create a new keypair**

```solana-keygen new```

**Airdrop SOL** on devnet/testnet

```solana airdrop [amount]```

**Transfer SOL** to another address

```solana transfer [recipient_address] [amount]```

**Deploy a program**

```solana program deploy [path/to/program.so]```

# SYNOPSIS

**solana** [_flags_] [_options_] _subcommand_

# PARAMETERS

**-u**, **--url** _URL_
> URL for Solana's JSON RPC endpoint or cluster moniker (devnet, testnet, mainnet-beta).

**-k**, **--keypair** _KEYPAIR_
> Filepath or URL to a keypair for signing transactions.

**-C**, **--config** _FILEPATH_
> Configuration file to use.

**--no-address-labels**
> Do not use address labels in output.

**--skip-preflight**
> Skip the preflight transaction simulation.

**--skip-seed-phrase-validation**
> Skip validation of seed phrases.

**--use-quic**
> Use QUIC protocol when sending transactions.

**--output** _FORMAT_
> Output format: json, json-compact.

**-h**, **--help**
> Print help information.

**-V**, **--version**
> Print version information.

# SUBCOMMANDS

**balance**
> Get your balance or that of a specified address.

**transfer**
> Transfer SOL between accounts.

**airdrop**
> Request an airdrop of SOL (devnet/testnet only).

**config**
> Get and set CLI configuration.

**account**
> Show account contents.

**address**
> Get your public key.

**program deploy**
> Deploy a Solana program.

**stake-account**
> Manage stake accounts.

**validator-info**
> Publish or get validator information.

**epoch-info**
> Get information about the current epoch.

**slot**
> Get current slot.

**block-height**
> Get current block height.

**logs**
> Stream transaction logs.

**confirm**
> Confirm a transaction by signature.

# DESCRIPTION

**solana** is the command-line interface for interacting with the Solana blockchain. It provides tools for managing wallets, transferring tokens, deploying programs (smart contracts), staking, and querying blockchain state.

The CLI connects to Solana clusters via JSON-RPC. Three main clusters are available: **mainnet-beta** (production), **testnet** (testing), and **devnet** (development). Configuration is stored in **~/.config/solana/cli/config.yml**.

Keypairs for signing transactions can be generated with **solana-keygen** and are typically stored as JSON files. The CLI is the primary interface for Solana validators and program developers.

# CONFIGURATION

**~/.config/solana/cli/config.yml**
> CLI configuration file storing default RPC URL, keypair path, and commitment level.

**~/.config/solana/id.json**
> Default keypair file for signing transactions.

# CAVEATS

Airdrops are only available on devnet and testnet, not mainnet. Transactions require SOL for fees. Private keys should be protected; never share keypair files. The CLI requires network connectivity to the configured cluster. Rate limits may apply on public RPC endpoints.

# HISTORY

**Solana** was founded by Anatoly Yakovenko in **2017** and launched its mainnet beta in **2020**. The CLI has been the primary tool for interacting with Solana since its inception. Development transitioned from Solana Labs to **Anza** (the Agave client) in **2024**, with the CLI continuing as the first place new functionality is deployed. Solana is known for high throughput and low transaction costs.

# SEE ALSO

[solana-keygen](/man/solana-keygen)(1), [anchor](/man/anchor)(1), [spl-token](/man/spl-token)(1)
