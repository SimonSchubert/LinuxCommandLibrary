# TLDR

**Validate a WebAssembly file**

```wasm-validate [file.wasm]```

**Validate with verbose output**

```wasm-validate -v [file.wasm]```

**Validate with threading support**

```wasm-validate --enable-threads [file.wasm]```

**Validate with exception handling**

```wasm-validate --enable-exceptions [file.wasm]```

# SYNOPSIS

**wasm-validate** [_options_] _file_

# PARAMETERS

**-v**, **--verbose**
> Verbose output (use multiple times for more detail).

**--enable-threads**
> Enable threading support.

**--enable-exceptions**
> Enable exception handling.

**--enable-tail-call**
> Enable tail call optimization.

**--enable-function-references**
> Enable function references.

**--disable-mutable-globals**
> Disable mutable globals.

**--disable-simd**
> Disable SIMD instructions.

**--help**
> Display help.

**--version**
> Display version.

# DESCRIPTION

**wasm-validate** checks WebAssembly binary files for conformance to the WebAssembly specification. It's part of WABT (WebAssembly Binary Toolkit).

The validator checks module structure, type correctness, instruction validity, and other specification requirements. It reports errors for malformed or invalid modules that would fail to load in runtimes.

Feature flags enable validation of WebAssembly proposals not yet in the core specification, such as threads, exceptions, and tail calls.

# EXIT STATUS

Returns 0 if the module is valid, non-zero otherwise.

# CAVEATS

Valid modules may still have runtime errors. Feature flags must match runtime capabilities. Part of WABT package.

# HISTORY

**wasm-validate** is part of WABT (WebAssembly Binary Toolkit), developed by the WebAssembly Community Group. It provides early detection of invalid modules before attempting to run them, useful in build pipelines and debugging.

# SEE ALSO

[wasm-objdump](/man/wasm-objdump)(1), [wasm-strip](/man/wasm-strip)(1), [wasm2wat](/man/wasm2wat)(1), [wat2wasm](/man/wat2wasm)(1)
