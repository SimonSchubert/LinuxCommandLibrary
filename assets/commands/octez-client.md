# TLDR

**Get account balance**

```octez-client get balance for [address]```

**Transfer tokens**

```octez-client transfer [amount] from [source] to [destination]```

**Generate new account**

```octez-client gen keys [alias]```

**Show account address**

```octez-client show address [alias]```

**List known addresses**

```octez-client list known addresses```

# SYNOPSIS

**octez-client** [_command_] [_options_]

# PARAMETERS

**get balance for** _ADDRESS_
> Show account balance.

**transfer** _AMOUNT_ **from** _SRC_ **to** _DST_
> Send tokens.

**gen keys** _ALIAS_
> Create new account.

**show address** _ALIAS_
> Display address.

**-A** _NODE_
> Node address.

**--help**
> Display help information.

# DESCRIPTION

**octez-client** is the Tezos blockchain client. Manages accounts and transactions.

The tool interacts with Tezos network. Supports smart contracts.

octez-client manages Tezos accounts.

# CAVEATS

Requires Tezos node connection. Transaction fees apply. Network dependent.

# HISTORY

octez-client is the **official Tezos client** for interacting with the blockchain.

# SEE ALSO

[octez-node](/man/octez-node)(1), [octez-baker](/man/octez-baker)(1)

