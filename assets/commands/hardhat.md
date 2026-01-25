# TLDR

**Create new project**

```npx hardhat init```

**Compile contracts**

```npx hardhat compile```

**Run tests**

```npx hardhat test```

**Start local node**

```npx hardhat node```

**Run deployment script**

```npx hardhat run [scripts/deploy.js]```

**Deploy to network**

```npx hardhat run [scripts/deploy.js] --network [sepolia]```

**Open console**

```npx hardhat console```

# SYNOPSIS

**npx hardhat** [_task_] [_options_]

# PARAMETERS

**compile**
> Compile Solidity contracts.

**test**
> Run test suite.

**node**
> Start local Ethereum node.

**run** _script_
> Run JavaScript script.

**console**
> Open interactive console.

**clean**
> Clear cache and artifacts.

**--network** _name_
> Target network.

**--show-stack-traces**
> Show full stack traces.

# DESCRIPTION

**Hardhat** is an Ethereum development environment. It provides a local blockchain, debugging tools, and a plugin ecosystem for compiling, testing, and deploying smart contracts.

Hardhat features console.log for Solidity debugging, network forking, and TypeScript support. It's the most popular choice for professional Ethereum development.

# CONFIGURATION

```javascript
// hardhat.config.js
module.exports = {
  solidity: "0.8.19",
  networks: {
    sepolia: {
      url: process.env.RPC_URL,
      accounts: [process.env.PRIVATE_KEY]
    }
  }
};
```

# CAVEATS

Requires Node.js. Network configuration needs RPC URLs. Private keys should use environment variables. Gas estimation may differ from mainnet.

# HISTORY

Hardhat was created by **Nomic Foundation** (formerly Nomic Labs) as a successor to Buidler. It became the leading Ethereum development framework, known for its developer experience and debugging capabilities.

# SEE ALSO

[truffle](/man/truffle)(1), [foundry](/man/foundry)(1), [ganache](/man/ganache)(1)
