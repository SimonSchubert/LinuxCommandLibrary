# TAGLINE

tezos blockchain client

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

**-A** _ADDR_
> Node RPC host (default: localhost).

**-P** _PORT_
> Node RPC port (default: 8732).

**-E** _URI_
> Full node RPC endpoint URI (replaces -A/-P).

**--help**
> Display help information.

# DESCRIPTION

**octez-client** is the command-line client for the Tezos blockchain, part of the Octez implementation. It manages accounts (keys and aliases), queries chain state, transfers tez, and originates and calls smart contracts.

The client talks to a Tezos node over its RPC interface, so a reachable node (local or remote, selected with **-E** or **-A**/**-P**) is required for most operations. Protocol-specific commands become available once the client connects to a node running that protocol.

# CAVEATS

Requires a Tezos node RPC connection. Transactions pay fees in tez and depend on network conditions. Use testnets before mainnet.

# HISTORY

octez-client is the **official Tezos client** (formerly tezos-client) for interacting with the blockchain.

# SEE ALSO

[octez-node](/man/octez-node)(1), [octez-baker](/man/octez-baker)(1)

# RESOURCES

```[Source code](https://gitlab.com/tezos/tezos)```

```[Documentation](https://octez.tezos.com/docs/active/cli-commands.html)```

```[Homepage](https://tezos.com)```

<!-- verified: 2026-11-07 -->

