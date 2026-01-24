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

**sui** interacts with Sui blockchain. It's the CLI tool.

Smart contract deployment. Move packages.

Transaction management. Send and query.

Key management. Wallets and addresses.

Local development. Test network.

# CAVEATS

Sui blockchain specific. Move language. Account required.

# HISTORY

**sui** is the CLI for the **Sui** blockchain, a Layer 1 blockchain using Move language for smart contracts.

# SEE ALSO

[solana](/man/solana)(1), [aptos](/man/aptos)(1)
