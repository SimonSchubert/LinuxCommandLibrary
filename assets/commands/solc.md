# TAGLINE

Solidity smart contract compiler

# TLDR

**Compile a Solidity file** and output bytecode

```solc --bin [contract.sol]```

**Compile and output ABI**

```solc --abi [contract.sol]```

**Compile with optimization** enabled

```solc --optimize --bin [contract.sol]```

**Output to a directory**

```solc -o [output_dir] --bin --abi [contract.sol]```

**Compile with Standard JSON** input/output

```solc --standard-json < [input.json]```

**Show estimated gas** for functions

```solc --gas [contract.sol]```

**Output abstract syntax tree**

```solc --ast-compact-json [contract.sol]```

**Remap import paths**

```solc [prefix]=[path] [contract.sol]```

# SYNOPSIS

**solc** [_options_] [_input-files_]

# PARAMETERS

**--bin**
> Output binary (bytecode) of the contracts.

**--abi**
> Output ABI (Application Binary Interface) specification.

**--optimize**
> Enable bytecode optimizer.

**--optimize-runs** _n_
> Optimize for n contract invocations (default: 200).

**-o**, **--output-dir** _path_
> Output directory for compiled artifacts.

**--standard-json**
> Use Standard JSON input/output mode. Reads from stdin if no file given.

**--ast-compact-json**
> Output AST in compact JSON format.

**--asm**
> Output EVM assembly.

**--gas**
> Output estimated gas usage for functions.

**--metadata**
> Output contract metadata.

**--userdoc**
> Output user documentation (NatSpec).

**--devdoc**
> Output developer documentation (NatSpec).

**--combined-json** _keys_
> Output combined JSON with specified keys (abi, bin, metadata, etc.).

**--base-path** _path_
> Base path for imports.

**--include-path** _path_
> Additional path for imports.

**--evm-version** _version_
> Target EVM version (homestead, tangerineWhistle, spuriousDragon, byzantium, constantinople, petersburg, istanbul, berlin, london, paris, shanghai).

**--via-ir**
> Enable compilation via Yul IR.

**--lsp**
> Run as Language Server Protocol backend.

**--version**
> Display version information.

# DESCRIPTION

**solc** is the command-line compiler for Solidity, the primary programming language for Ethereum smart contracts. It compiles Solidity source code into EVM (Ethereum Virtual Machine) bytecode that can be deployed to Ethereum and compatible blockchains.

The compiler can produce various outputs including bytecode, ABI definitions, assembly, abstract syntax trees, gas estimates, and documentation. The optimizer can reduce bytecode size and gas costs. Standard JSON mode provides structured input/output for integration with build tools.

Import paths can be remapped using the **context:prefix=path** syntax, allowing flexible project structures. The compiler also supports LSP mode for IDE integration.

# CAVEATS

Different Solidity versions may have incompatible syntax; use **solc-select** to manage multiple versions. The optimizer should be tested thoroughly as it can sometimes introduce subtle issues. Gas estimates are approximations and may differ from actual execution costs. EVM version must match the target blockchain's capabilities.

# HISTORY

**Solidity** was proposed by Gavin Wood in **2014** and developed by the Ethereum Foundation's Solidity team. The first release was in **2015** alongside Ethereum's launch. The language and compiler have evolved significantly, with major versions introducing features like ABIEncoderV2, custom errors, and user-defined value types. Development continues actively to improve safety, efficiency, and developer experience.

# SEE ALSO

[solc-select](/man/solc-select)(1), [forge](/man/forge)(1), [hardhat](/man/hardhat)(1), [remix](/man/remix)(1)
