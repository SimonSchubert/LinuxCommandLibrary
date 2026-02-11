# TAGLINE

WebAssembly package manager

# TLDR

**Install package**

```wapm install [package]```

**Run package**

```wapm run [package]```

**Search packages**

```wapm search [query]```

**Publish package**

```wapm publish```

**Login**

```wapm login```

**List installed**

```wapm list```

# SYNOPSIS

**wapm** _command_ [_options_] [_args_]

# PARAMETERS

**install**
> Install package.

**run**
> Run package.

**search**
> Find packages.

**publish**
> Upload package.

**login**
> Authenticate.

**list**
> Show installed.

# DESCRIPTION

**wapm** is the package manager for WebAssembly modules, providing commands to install, run, search, and publish packages from the wapm.io registry. It works with the Wasmer runtime to execute WebAssembly packages on any platform.

Packages installed through wapm contain pre-compiled WebAssembly modules that run in a sandboxed environment, making them portable across operating systems and architectures. The registry hosts a variety of tools and libraries compiled to WebAssembly from languages like Rust, C, and AssemblyScript.

Publishing packages requires a wapm.io account and a wapm.toml manifest file describing the package metadata, entry points, and dependencies.

# CAVEATS

Wasmer recommended. WASM ecosystem. wapm.io account for publish.

# HISTORY

**wapm** is the package manager for **Wasmer**, providing WebAssembly package management.

# SEE ALSO

[wasmer](/man/wasmer)(1), [wasm-pack](/man/wasm-pack)(1)
