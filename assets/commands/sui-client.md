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
> Call Move function.

**publish**
> Publish Move package.

**--env** _name_
> Target environment.

# DESCRIPTION

**sui client** is the Sui blockchain CLI client. Manages wallets, transfers tokens, and interacts with Move smart contracts. Part of Sui blockchain development toolkit.

# SEE ALSO

[sui-move](/man/sui-move)(1)

