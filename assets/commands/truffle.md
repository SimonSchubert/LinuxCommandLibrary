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

**Create contract**

```truffle create contract [ContractName]```

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
> Generate component.

**--network** _NAME_
> Target network.

**--reset**
> Reset migrations.

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

Requires Node.js. Ethereum knowledge needed. Gas costs on mainnet.

# HISTORY

**Truffle** was created by **ConsenSys** for Ethereum development. It became the standard framework before Hardhat gained popularity.

# SEE ALSO

[hardhat](/man/hardhat)(1), [ganache](/man/ganache)(1), [solc](/man/solc)(1)
