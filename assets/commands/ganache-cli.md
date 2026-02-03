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

**ganache-cli** (now part of Ganache) creates a local Ethereum blockchain for development and testing. Provides instant mining and configurable accounts.

# SEE ALSO

[geth](/man/geth)(1), [truffle](/man/truffle)(1)

