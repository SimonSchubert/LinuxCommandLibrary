# TAGLINE

JavaScript-based Solidity compiler

# TLDR

**Compile contract**

```solcjs [contract.sol]```

**Output binary**

```solcjs --bin [contract.sol]```

**Output ABI**

```solcjs --abi [contract.sol]```

**Both binary and ABI**

```solcjs --bin --abi [contract.sol]```

**Custom output directory**

```solcjs --bin -o [build] [contract.sol]```

**Optimize code**

```solcjs --bin --optimize [contract.sol]```

# SYNOPSIS

**solcjs** [_--bin_] [_--abi_] [_--optimize_] [_-o dir_] _files_

# PARAMETERS

**--bin**
> Output bytecode.

**--abi**
> Output ABI JSON.

**--optimize**
> Enable optimizer.

**-o** _DIR_
> Output directory.

**--base-path** _DIR_
> Base path for imports.

**--include-path** _DIR_
> Include path.

# DESCRIPTION

**solcjs** is a JavaScript/WebAssembly implementation of the Solidity compiler, installable via npm. It compiles Solidity smart contracts into EVM bytecode and ABI (Application Binary Interface) definitions needed for deploying and interacting with contracts on Ethereum and compatible blockchains.

The compiler produces bytecode (**--bin**) for deployment and ABI JSON (**--abi**) that describes the contract's functions and events for client interaction. The optimizer reduces bytecode size and gas costs when enabled.

solcjs provides the same core compilation functionality as the native **solc** compiler but runs in Node.js environments, making it easy to integrate into JavaScript-based development workflows and build tools like Truffle and Hardhat. It is somewhat slower than the native compiler and may lack some advanced features.

# CAVEATS

Slower than native solc. JavaScript implementation. Some features missing.

# HISTORY

**solcjs** is a JavaScript/WebAssembly port of **solc**, the Solidity compiler for Ethereum smart contracts.

# SEE ALSO

[solc](/man/solc)(1), [truffle](/man/truffle)(1), [hardhat](/man/hardhat)(1)
