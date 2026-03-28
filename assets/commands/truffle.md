# TAGLINE

Ethereum smart contract development framework

# TLDR

**Initialize project**

```truffle init```

**Compile contracts**

```truffle compile```

**Run migrations**

```truffle migrate```

**Run tests**

```truffle test```

**Start console**

```truffle console```

**Deploy to network**

```truffle migrate --network [mainnet]```

**Start development blockchain**

```truffle develop```

**Create a new contract** boilerplate

```truffle create contract [ContractName]```

**Create a new migration** script

```truffle create migration [MigrationName]```

**Run a specific test** file

```truffle test [test/MyContract.test.js]```

**Compile with optimizer** enabled

```truffle compile --all```

# SYNOPSIS

**truffle** _command_ [_--network network_] [_options_]

# PARAMETERS

**init**
> Initialize project.

**compile**
> Compile contracts.

**migrate**
> Deploy contracts.

**test**
> Run tests.

**console**
> Interactive console.

**develop**
> Local blockchain.

**create** _TYPE_ _NAME_
> Generate a new contract, migration, or test boilerplate.

**unbox** _box_name_
> Download a pre-built Truffle project (Truffle Box).

**networks**
> Show addresses of deployed contracts on each network.

**debug** _txHash_
> Interactively debug a transaction.

**--network** _NAME_
> Target network (defined in truffle-config.js).

**--reset**
> Re-run all migrations from the beginning.

**--compile-all**
> Recompile all contracts even if unchanged.

**--verbose-rpc**
> Log RPC communication with the Ethereum client.

# DESCRIPTION

**Truffle** is a development framework for Ethereum smart contracts that provides a complete workflow from compilation through deployment and testing. It compiles Solidity contracts into bytecode and ABI artifacts, manages deployment through ordered migration scripts, and supports both JavaScript and Solidity test suites.

The built-in development blockchain (truffle develop) provides a local Ethereum environment with instant transactions and pre-funded accounts, eliminating gas costs during development. The interactive console connects to any configured network and allows direct interaction with deployed contracts.

Projects are organized with a standard directory structure including contracts, migrations, and test directories. Network configurations in truffle-config.js define deployment targets from local development to public testnets and mainnet.

# CONFIGURATION

**truffle-config.js**
> Main project configuration defining network endpoints, compiler settings, and migration options.

**contracts/**
> Directory containing Solidity smart contract source files.

**migrations/**
> Directory containing numbered deployment scripts executed in order.

# CAVEATS

**Truffle was sunset in September 2023** and is no longer actively maintained; consider migrating to Hardhat. Requires Node.js (v12 or later). Deploying to mainnet incurs real gas costs. Install via `npm install -g truffle`.

# HISTORY

**Truffle** was originally created by **Tim Coulter** and later maintained by **ConsenSys** as part of the Truffle Suite. It was the dominant Ethereum development framework for several years. ConsenSys announced the **sunsetting of Truffle** in **September 2023**, recommending migration to Hardhat or other actively maintained frameworks.

# SEE ALSO

[hardhat](/man/hardhat)(1), [ganache](/man/ganache)(1), [solc](/man/solc)(1), [npm](/man/npm)(1)
