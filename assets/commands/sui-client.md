# TAGLINE

Sui blockchain wallet and transaction client

# TLDR

**Check active address**

```sui client active-address```

**List owned objects**

```sui client objects```

**Switch environment**

```sui client switch --env [testnet]```

**Get SUI from faucet**

```sui client faucet```

**Transfer SUI**

```sui client transfer-sui --to [address] --sui-coin-object-id [object_id] --gas-budget [1000]```

# SYNOPSIS

**sui client** _command_ [_options_]

# PARAMETERS

**active-address**
> Show current address.

**objects**
> List owned objects.

**switch**
> Switch environment or address.

**faucet**
> Request tokens from faucet.

**transfer-sui**
> Transfer SUI tokens.

**call**
> Call a Move function on a published package.

**publish**
> Publish a Move package on-chain.

**addresses**
> List all addresses in the local keystore.

**new-address**
> Generate a new keypair (ed25519, secp256k1, or secp256r1).

**gas**
> List gas objects owned by an address.

**pay-sui**
> Pay SUI to multiple recipients in one transaction.

**merge-coin**
> Merge two coin objects into one.

**split-coin**
> Split a coin object into multiple coins.

**--env** _name_
> Target environment (e.g., mainnet, testnet, devnet, localnet).

**--gas-budget** _N_
> Maximum gas units to spend on a transaction.

**--json**
> Emit output as JSON.

# DESCRIPTION

**sui client** is the Sui blockchain CLI client. Manages wallets, transfers tokens, and interacts with Move smart contracts. Part of Sui blockchain development toolkit.

# SEE ALSO

[sui-move](/man/sui-move)(1)

