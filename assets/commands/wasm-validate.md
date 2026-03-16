# TAGLINE

Validate WebAssembly binary files

# TLDR

**Validate** a WebAssembly binary file

```wasm-validate [file.wasm]```

**Validate** with **verbose** output

```wasm-validate -v [file.wasm]```

**Validate** with **all** features enabled

```wasm-validate --enable-all [file.wasm]```

**Validate** with **threading** support enabled

```wasm-validate --enable-threads [file.wasm]```

**Validate** with **garbage collection** support enabled

```wasm-validate --enable-gc [file.wasm]```

**Validate** ignoring errors in **custom sections**

```wasm-validate --ignore-custom-section-errors [file.wasm]```

# SYNOPSIS

**wasm-validate** [_options_] _file_

# PARAMETERS

**-v**, **--verbose**
> Use verbose output. Use multiple times for more detail.

**--enable-exceptions**
> Enable experimental exception handling.

**--enable-threads**
> Enable threading support.

**--enable-function-references**
> Enable typed function references.

**--enable-tail-call**
> Enable tail-call support.

**--enable-annotations**
> Enable custom annotation syntax.

**--enable-code-metadata**
> Enable code metadata.

**--enable-gc**
> Enable garbage collection.

**--enable-memory64**
> Enable 64-bit memory support.

**--enable-multi-memory**
> Enable multi-memory support.

**--enable-extended-const**
> Enable extended constant expressions.

**--enable-all**
> Enable all features.

**--disable-mutable-globals**
> Disable import/export mutable globals.

**--disable-saturating-float-to-int**
> Disable saturating float-to-int operators.

**--disable-sign-extension**
> Disable sign-extension operators.

**--disable-simd**
> Disable SIMD support.

**--disable-multi-value**
> Disable multi-value support.

**--disable-bulk-memory**
> Disable bulk-memory operations.

**--disable-reference-types**
> Disable reference types (externref).

**--no-debug-names**
> Ignore debug names in the binary file.

**--ignore-custom-section-errors**
> Ignore errors in custom sections.

**--help**
> Display help message.

**--version**
> Display version information.

# DESCRIPTION

**wasm-validate** reads a file in the WebAssembly binary format and validates it against the WebAssembly specification. It is part of WABT (WebAssembly Binary Toolkit).

The validator checks module structure, type correctness, instruction validity, and other specification requirements. It reports errors for malformed or invalid modules that would fail to load in runtimes.

Feature flags enable or disable validation of WebAssembly proposals. Some features like mutable globals and bulk memory are enabled by default, while proposals like threads, GC, and exceptions must be explicitly enabled.

# EXIT STATUS

Returns 0 if the module is valid, non-zero otherwise.

# CAVEATS

Valid modules may still have runtime errors. Feature flags must match the capabilities of the target runtime. Part of the WABT package.

# HISTORY

**wasm-validate** is part of WABT (WebAssembly Binary Toolkit), developed by the WebAssembly Community Group. It provides early detection of invalid modules before attempting to run them, useful in build pipelines and debugging.

# SEE ALSO

[wasm-objdump](/man/wasm-objdump)(1), [wasm-strip](/man/wasm-strip)(1), [wasm2wat](/man/wasm2wat)(1), [wat2wasm](/man/wat2wasm)(1), [wasm2c](/man/wasm2c)(1)
