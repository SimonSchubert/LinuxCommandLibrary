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

**truffle** develops Ethereum smart contracts. It provides complete development workflow.

Compilation converts Solidity to bytecode. Artifacts contain ABI and bytecode.

Migrations deploy contracts. Scripts run in order.

Testing verifies contract behavior. JavaScript and Solidity tests.

Development blockchain runs locally. Instant transactions, no gas costs.

Console interacts with contracts. Call functions directly.

# CAVEATS

Requires Node.js. Ethereum knowledge needed. Gas costs on mainnet.

# HISTORY

**Truffle** was created by **ConsenSys** for Ethereum development. It became the standard framework before Hardhat gained popularity.

# SEE ALSO

[hardhat](/man/hardhat)(1), [ganache](/man/ganache)(1), [solc](/man/solc)(1)
