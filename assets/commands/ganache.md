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

**Mine a block every few seconds**

```ganache -b [10]```

**Run in the background** as a detached instance

```ganache --detach```

**List and stop** detached instances

```ganache instances list```

```ganache instances stop [name]```

# SYNOPSIS

**ganache** [_options_]

# PARAMETERS

**-p**, **--server.port** _port_
> Port to listen on (default 8545).

**-h**, **--server.host** _host_
> Hostname (default 127.0.0.1).

**-a**, **--wallet.totalAccounts** _num_
> Number of accounts to generate (default: 10).

**-e**, **--wallet.defaultBalance** _amount_
> Default account balance in ether (default: 1000).

**-m**, **--wallet.mnemonic** _phrase_
> BIP39 mnemonic for HD wallet.

**-s**, **--wallet.seed** _seed_
> Seed to use for HD wallet account generation.

**-d**, **--wallet.deterministic**
> Use a pre-defined, deterministic seed.

**-n**, **--wallet.lock**
> Lock available accounts by default.

**-u**, **--wallet.unlockedAccounts** _accounts_
> Addresses or indexes of accounts to unlock.

**-f**, **--fork.url** _url_
> Fork from a running Ethereum client at URL.

**-b**, **--miner.blockTime** _seconds_
> Block time for auto-mining (default: 0, instant mining).

**-g**, **--miner.defaultGasPrice** _price_
> Default gas price in wei (default: 0x77359400, 2 gwei).

**-l**, **--miner.blockGasLimit** _limit_
> Block gas limit (default: 0xb71b00, 12000000).

**-i**, **--chain.networkId** _id_
> Network ID returned by net_version.

**--chain.chainId** _id_
> Chain ID (default: 1337).

**-k**, **--chain.hardfork** _name_
> EVM hardfork rules to use.

**--database.dbPath** _path_
> Directory to save chain database for persistence.

**-v**, **--logging.verbose**
> Log detailed RPC requests.

**-q**, **--logging.quiet**
> Disable logging.

**--chain.allowUnlimitedContractSize**
> Allow unlimited contract sizes for debugging.

**-D**, **--detach**
> Run as a background (daemon) instance and print its name.

Flat names from earlier versions, such as **--port**, **--accounts**, **--gasLimit**, and **--db**, still work as deprecated aliases.

# DESCRIPTION

**Ganache** is a personal Ethereum blockchain for development. It simulates full client behavior, providing instant transaction mining, configurable accounts, and blockchain forking.

Developers use Ganache to test smart contracts locally before deploying to testnets or mainnet. It integrates with Truffle, Hardhat, and other development frameworks.

# CAVEATS

Not for production. Behavior may differ from mainnet. State is lost on restart (use --database.dbPath for persistence). Forking requires archive node access. **Ganache was deprecated in December 2023** when Consensys sunset both Truffle and Ganache. Developers are encouraged to migrate to Hardhat or Foundry.

# HISTORY

Ganache was developed by **Truffle Suite** (part of Consensys). It evolved from TestRPC and was renamed Ganache around **2017**. The current version (Ganache 7+) was a complete rewrite supporting forking and improved compatibility. In **September 2023**, Consensys announced the sunset of both Truffle and Ganache, with codebases archived in December 2023. The last release is **7.9.2**.

# SEE ALSO

[hardhat](/man/hardhat)(1), [truffle](/man/truffle)(1), [geth](/man/geth)(1)

# RESOURCES

```[Source code](https://github.com/ConsenSys-archive/ganache)```

```[Homepage](https://archive.trufflesuite.com/ganache/)```

<!-- verified: 2026-11-09 -->
