# TAGLINE

command-line Ethereum test blockchain

# TLDR

**Start Ethereum test blockchain**

```ganache-cli```

**Start on specific port**

```ganache-cli -p [8545]```

**Start with specific accounts**

```ganache-cli -a [10]```

**Start with mnemonic**

```ganache-cli -m "[mnemonic phrase]"```

**Start with deterministic addresses**

```ganache-cli -d```

**Fork from mainnet**

```ganache-cli -f [https://mainnet.infura.io/v3/key]```

**Set gas limit**

```ganache-cli -l [8000000]```

# SYNOPSIS

**ganache-cli** [_options_]

# PARAMETERS

**-p**, **--port** _port_
> Port number.

**-a**, **--accounts** _num_
> Number of accounts.

**-m**, **--mnemonic** _phrase_
> HD wallet mnemonic.

**-d**, **--deterministic**
> Deterministic addresses.

**-f**, **--fork** _url_
> Fork from network.

**-l**, **--gasLimit** _limit_
> Block gas limit.

**-e**, **--defaultBalanceEther** _amount_
> Default account balance.

**-i**, **--networkId** _id_
> Network ID.

# DESCRIPTION

**ganache-cli** (now part of Ganache) creates a local Ethereum blockchain for development and testing. It provides instant transaction mining and configurable test accounts for smart contract development.

This command-line version is now superseded by the **ganache** command, which offers the same functionality with additional features. ganache-cli was originally known as TestRPC before being renamed and integrated into the Ganache suite.

The tool simulates a full Ethereum client, making it ideal for testing smart contracts locally before deploying to testnets or mainnet. It integrates with development frameworks like Truffle and Hardhat.

# CAVEATS

ganache-cli is deprecated in favor of the **ganache** command. Not for production use. Blockchain state resets on restart unless persistence is configured. Behavior may differ from actual Ethereum mainnet.

# HISTORY

Originally released as **TestRPC**, it was renamed to **ganache-cli** when incorporated into the Truffle Suite around **2017**. The tool has since been replaced by the unified **ganache** command starting with Ganache 7.

# SEE ALSO

[geth](/man/geth)(1), [truffle](/man/truffle)(1)

