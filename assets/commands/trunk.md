# TLDR

**Build project**

```trunk build```

**Serve with hot reload**

```trunk serve```

**Watch for changes**

```trunk watch```

**Clean build artifacts**

```trunk clean```

**Build for release**

```trunk build --release```

# SYNOPSIS

**trunk** _command_ [_--release_] [_options_]

# PARAMETERS

**build**
> Build project.

**serve**
> Development server.

**watch**
> Watch and rebuild.

**clean**
> Remove artifacts.

**--release**
> Release build.

**--public-url** _URL_
> Public URL prefix.

# DESCRIPTION

**trunk** builds Rust web apps. It's for WASM projects.

WASM bundling. Rust to WebAssembly.

Asset pipeline. CSS, JS handling.

Dev server. Hot reloading.

Build optimization. Release mode.

# CAVEATS

Rust/WASM specific. wasm-bindgen based. Trunk.toml config.

# HISTORY

**Trunk** was created for building and bundling Rust WebAssembly applications.

# SEE ALSO

[wasm-pack](/man/wasm-pack)(1), [cargo](/man/cargo)(1)
