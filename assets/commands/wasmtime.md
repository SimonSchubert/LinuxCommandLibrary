# TAGLINE

Standalone WebAssembly runtime

# TLDR

**Run a WebAssembly file**

```wasmtime [program.wasm]```

**Run with directory access**

```wasmtime --dir [/path/to/dir] [program.wasm]```

**Invoke a specific function**

```wasmtime run --invoke '[add(1, 2)]' [program.wasm]```

**Run a WASI HTTP server**

```wasmtime serve [component.wasm]```

**Compile to native ahead-of-time**

```wasmtime compile [program.wasm] -o [program.cwasm]```

**Run compiled module**

```wasmtime run [program.cwasm]```

**Enable WASI features**

```wasmtime -S inherit-env [program.wasm]```

# SYNOPSIS

**wasmtime** [_options_] [_command_] [_wasm-file_] [_args_...]

# COMMANDS

**run**: Execute WebAssembly module (default).

**serve**: Run component as WASI HTTP server.

**compile**: AOT compile to native code.

**config**: Manage Wasmtime configuration.

**wast**: Execute WebAssembly spec tests.

# PARAMETERS

**--dir** _path_
> Grant access to host directory.

**--env** _key=value_
> Set environment variable.

**--invoke** _expr_
> Invoke specific exported function.

**-O**, **--optimize** _options_
> Optimization settings.

**-C**, **--codegen** _options_
> Code generation settings.

**-D**, **--debug** _options_
> Debug settings.

**-W**, **--wasm** _options_
> WebAssembly semantics settings.

**-S**, **--wasi** _options_
> WASI configuration (inherit-env, inherit-network).

**--config** _file_
> Load settings from TOML file.

**-h**, **--help**
> Display help.

**-V**, **--version**
> Display version.

# DESCRIPTION

**wasmtime** is a standalone WebAssembly runtime from the Bytecode Alliance. It executes WebAssembly modules and components outside the browser, supporting WASI (WebAssembly System Interface) for system access.

The runtime can execute both binary (.wasm) and text (.wat) WebAssembly files. For performance-critical applications, modules can be ahead-of-time compiled to native code using the compile subcommand.

By default, Wasmtime sandboxes modules with no access to system resources. Access to files, environment, and network must be explicitly granted through command-line options.

The serve subcommand runs WebAssembly components implementing the wasi:http/proxy interface as HTTP servers.

# CAVEATS

WASI is not fully POSIX-compatible. Some system calls may not be available. Ahead-of-time compiled modules are platform-specific. Component Model support is evolving.

# HISTORY

**Wasmtime** was developed by the Bytecode Alliance, a nonprofit organization including Mozilla, Fastly, Intel, and Red Hat. It serves as a reference implementation for WebAssembly outside the browser and drives development of WASI and the Component Model standards.

# SEE ALSO

[wasmer](/man/wasmer)(1), [wasm-tools](/man/wasm-tools)(1), [wasm-pack](/man/wasm-pack)(1)
