# TAGLINE

personal Ethereum blockchain for development

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
> Number of accounts to generate (default: 10).

**-e**, **--defaultBalanceEther** _amount_
> Default account balance in ether (default: 100).

**-m**, **--mnemonic** _phrase_
> BIP39 mnemonic for HD wallet.

**-s**, **--seed** _seed_
> Seed to use for HD wallet account generation.

**-d**, **--deterministic**
> Generate deterministic addresses and mnemonic.

**-n**, **--secure**
> Lock available accounts by default.

**-u**, **--unlock** _accounts_
> Specify accounts to unlock.

**-f**, **--fork** _url_
> Fork from network at URL.

**-b**, **--blockTime** _seconds_
> Block time for auto-mining (default: 0, instant mining).

**-g**, **--gasPrice** _price_
> Gas price in wei (default: 20000000000).

**-l**, **--gasLimit** _limit_
> Block gas limit (default: 6721975).

**-i**, **--networkId** _id_
> Network ID.

**--chain.chainId** _id_
> Chain ID.

**--db** _path_
> Directory to save chain database for persistence.

**--verbose**
> Log all incoming requests to stdout.

**--allowUnlimitedContractSize**
> Allow unlimited contract sizes for debugging.

# DESCRIPTION

**Ganache** is a personal Ethereum blockchain for development. It simulates full client behavior, providing instant transaction mining, configurable accounts, and blockchain forking.

Developers use Ganache to test smart contracts locally before deploying to testnets or mainnet. It integrates with Truffle, Hardhat, and other development frameworks.

# CAVEATS

Not for production. Behavior may differ from mainnet. State is lost on restart (use --db for persistence). Forking requires archive node access. **Ganache was deprecated in December 2023** when Consensys sunset both Truffle and Ganache. Developers are encouraged to migrate to Hardhat or Foundry.

# HISTORY

Ganache was developed by **Truffle Suite** (part of Consensys). It evolved from TestRPC and was renamed Ganache around **2017**. The current version (Ganache 7+) was a complete rewrite supporting forking and improved compatibility. In **September 2023**, Consensys announced the sunset of both Truffle and Ganache, with codebases archived in December 2023.

# SEE ALSO

[hardhat](/man/hardhat)(1), [truffle](/man/truffle)(1), [geth](/man/geth)(1)
