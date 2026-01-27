# TLDR

**Run a WebAssembly file**

```wasmer run [program.wasm]```

**Run with specific function**

```wasmer run [program.wasm] -i [function_name]```

**Run a package from registry**

```wasmer run [python/python]```

**Install a package globally**

```wasmer install -g [package]```

**Compile to native code**

```wasmer compile [program.wasm] -o [program.wasmu]```

**Run with HTTP client enabled**

```wasmer run --http-client [program.wasm]```

**Validate WebAssembly file**

```wasmer validate [program.wasm]```

**Display Wasmer version**

```wasmer --version```

# SYNOPSIS

**wasmer** [_command_] [_options_] [_input_] [_args_...]

# COMMANDS

**run**: Execute a WebAssembly file or package.

**compile**: Compile to native code.

**validate**: Validate WebAssembly file.

**install**: Install a package.

**publish**: Publish a package to registry.

**config**: Manage configuration.

**self-update**: Update Wasmer.

# PARAMETERS

**-i**, **--invoke** _function_
> Function to invoke.

**-e**, **--entrypoint** _module_
> Entrypoint module for packages.

**--stack-size** _size_
> Stack size (default: 1048576).

**--http-client**
> Allow HTTP requests.

**--wasmer-dir** _dir_
> Wasmer home directory.

**--cache-dir** _dir_
> Cache directory.

**--backend** _backend_
> Compiler backend: cranelift, llvm, singlepass.

**-v**, **--verbose**
> Verbose output.

**-h**, **--help**
> Display help.

**--version**
> Display version.

# DESCRIPTION

**wasmer** is a WebAssembly runtime for running Wasm modules outside the browser. It supports WASI for system access and provides fast, secure execution with multiple compiler backends.

The runtime is secure by default, with no access to files, network, or environment unless explicitly enabled. Wasmer can run packages from its registry or local .wasm files.

Compiler backends offer different tradeoffs: Singlepass provides fastest compilation, Cranelift balances compilation and execution speed (default), and LLVM produces most optimized code.

Install via: `curl https://get.wasmer.io -sSfL | sh`

# CAVEATS

WASI support varies by module. Some system interfaces require explicit flags to enable. Package registry requires account for publishing. Ahead-of-time compiled modules are platform-specific.

# HISTORY

**Wasmer** was created by Syrus Akbary and launched in 2018. It became one of the leading standalone WebAssembly runtimes, supporting multiple languages and platforms. The project includes a package registry for distributing Wasm applications.

# SEE ALSO

[wasmtime](/man/wasmtime)(1), [wasm-pack](/man/wasm-pack)(1), [node](/man/node)(1)
