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

**solcjs** compiles Solidity. It's the JavaScript compiler.

Smart contract compilation. Ethereum development.

Bytecode generation. Deploy to blockchain.

ABI for interaction. Contract interface.

Node.js based. npm installable.

# CAVEATS

Slower than native solc. JavaScript implementation. Some features missing.

# HISTORY

**solcjs** is a JavaScript/WebAssembly port of **solc**, the Solidity compiler for Ethereum smart contracts.

# SEE ALSO

[solc](/man/solc)(1), [truffle](/man/truffle)(1), [hardhat](/man/hardhat)(1)
