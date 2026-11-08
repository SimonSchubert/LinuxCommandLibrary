# TAGLINE

JavaScript-based Solidity compiler

# TLDR

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

**Tune the optimizer for deployment cost or runtime cost**

```solcjs --bin --optimize --optimize-runs [200] [contract.sol]```

**Use Standard JSON input and output**

```solcjs --standard-json < [input.json]```

# SYNOPSIS

**solcjs** (_--bin_ | _--abi_ | _--standard-json_) [_--optimize_] [_-o dir_] _files_

# PARAMETERS

**--bin**
> Output bytecode.

**--abi**
> Output ABI JSON.

**--standard-json**
> Turn on Standard JSON input and output mode.

**--optimize**
> Enable the bytecode optimizer.

**--optimize-runs** _N_
> Roughly how often each opcode will run over the contract's lifetime; lower favors deployment cost, higher favors frequent use.

**-o**, **--output-dir** _DIR_
> Output directory.

**--base-path** _DIR_
> Root of the project source tree for imports.

**--include-path** _DIR_
> Extra source directories for imports; requires **--base-path**.

**-p**, **--pretty-json**
> Pretty-print all JSON output.

**-v**, **--verbose**
> More detailed console output.

**--version**
> Show version and exit.

# DESCRIPTION

**solcjs** is a JavaScript/WebAssembly implementation of the Solidity compiler, installable via npm. It compiles Solidity smart contracts into EVM bytecode and ABI (Application Binary Interface) definitions needed for deploying and interacting with contracts on Ethereum and compatible blockchains.

The compiler produces bytecode (**--bin**) for deployment and ABI JSON (**--abi**) that describes the contract's functions and events for client interaction. The optimizer reduces bytecode size and gas costs when enabled.

solcjs provides the same core compilation functionality as the native **solc** compiler but runs in Node.js environments, making it easy to integrate into JavaScript-based development workflows and build tools like Hardhat. It is somewhat slower than the native compiler and may lack some advanced features.

# CAVEATS

Slower than native solc, with fewer features. Command-line options are not compatible with solc, so tools expecting solc will not work with solcjs. One of **--bin**, **--abi** or **--standard-json** is required.

# HISTORY

**solcjs** is a JavaScript/WebAssembly port of **solc**, the Solidity compiler for Ethereum smart contracts.

# SEE ALSO

[solc](/man/solc)(1), [truffle](/man/truffle)(1), [hardhat](/man/hardhat)(1)

# RESOURCES

```[Source code](https://github.com/argotorg/solc-js)```

```[Documentation](https://docs.soliditylang.org/en/latest/installing-solidity.html)```

<!-- verified: 2026-11-08 -->
