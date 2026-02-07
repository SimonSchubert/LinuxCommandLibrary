# TAGLINE

Ethereum smart contract Go binding generator

# TLDR

**Generate** Go bindings from a Solidity ABI

```abigen --abi [contract.abi] --pkg [packagename] --out [contract.go]```

Generate bindings from a **compiled contract**

```abigen --bin [contract.bin] --abi [contract.abi] --pkg [packagename] --out [contract.go]```

Generate from **Solidity source** directly

```abigen --sol [contract.sol] --pkg [packagename] --out [contract.go]```

# SYNOPSIS

**abigen** [_--abi file_] [_--bin file_] [_--sol file_] [_--pkg name_] [_--out file_] [_options_]

# DESCRIPTION

**abigen** is an Ethereum tool that generates Go language bindings for interacting with smart contracts. It takes a contract's ABI (Application Binary Interface) and optionally its bytecode to produce type-safe Go code for deploying and calling contract methods.

The generated code handles ABI encoding/decoding, transaction creation, and event filtering, making it straightforward to interact with Ethereum contracts from Go applications. This eliminates the need for manual ABI manipulation and provides compile-time type checking.

# PARAMETERS

**--abi** _file_
> Path to the contract ABI JSON file

**--bin** _file_
> Path to the contract bytecode (required for deployment code generation)

**--sol** _file_
> Path to Solidity source file (requires solc compiler)

**--pkg** _name_
> Package name for the generated Go code

**--out** _file_
> Output file path for generated code

**--type** _name_
> Struct name for the contract binding (defaults to contract name)

**--lang** _language_
> Target language: go, java, objc

**--solc** _path_
> Solidity compiler path when using --sol

# CAVEATS

When using **--sol**, the Solidity compiler (solc) must be installed and accessible. ABI changes require regenerating bindings. Complex Solidity types may produce verbose Go code. Ensure ABI and bytecode match when deploying contracts.

# HISTORY

**abigen** was developed by the Ethereum Foundation as part of **go-ethereum** (geth), first appearing around **2015**. It was created to provide idiomatic Go bindings for smart contracts, supporting the growing ecosystem of Go-based Ethereum tools and applications.

# SEE ALSO

[solc](/man/solc)(1), [geth](/man/geth)(1), [cast](/man/cast)(1)
