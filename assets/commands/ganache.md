# TLDR

**Start Ganache CLI**

```ganache```

**Start on specific port**

```ganache -p [8545]```

**Start with specific accounts**

```ganache -a [20]```

**Start with mnemonic**

```ganache -m "[word1 word2 ... word12]"```

**Fork mainnet**

```ganache -f [https://mainnet.infura.io/v3/KEY]```

**Start with deterministic accounts**

```ganache -d```

# SYNOPSIS

**ganache** [_options_]

# PARAMETERS

**-p**, **--port** _port_
> Port to listen on (default 8545).

**-h**, **--host** _host_
> Hostname (default 127.0.0.1).

**-a**, **--accounts** _num_
> Number of accounts to generate.

**-e**, **--defaultBalanceEther** _amount_
> Default account balance.

**-m**, **--mnemonic** _phrase_
> BIP39 mnemonic for HD wallet.

**-d**, **--deterministic**
> Generate deterministic addresses.

**-f**, **--fork** _url_
> Fork from network at URL.

**-b**, **--blockTime** _seconds_
> Block time for mining.

**-g**, **--gasLimit** _limit_
> Block gas limit.

**--chain.chainId** _id_
> Chain ID.

# DESCRIPTION

**Ganache** is a personal Ethereum blockchain for development. It simulates full client behavior, providing instant transaction mining, configurable accounts, and blockchain forking.

Developers use Ganache to test smart contracts locally before deploying to testnets or mainnet. It integrates with Truffle, Hardhat, and other development frameworks.

# CAVEATS

Not for production. Behavior may differ from mainnet. State is lost on restart (use --database.dbPath for persistence). Forking requires archive node access.

# HISTORY

Ganache was developed by **Truffle Suite** (now part of Consensys). It evolved from TestRPC and was renamed Ganache around **2017**. The current version (Ganache 7+) is a complete rewrite supporting forking and improved compatibility.

# SEE ALSO

[hardhat](/man/hardhat)(1), [truffle](/man/truffle)(1), [geth](/man/geth)(1)
