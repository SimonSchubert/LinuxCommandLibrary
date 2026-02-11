# TAGLINE

Rust WebAssembly application bundler

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

**Trunk** is a build tool for Rust WebAssembly applications that handles compilation, bundling, and serving. It compiles Rust code to WebAssembly, processes assets like CSS and JavaScript, and generates the HTML and JavaScript glue code needed to run WASM modules in the browser.

The development server provides hot reloading, automatically rebuilding and refreshing the browser when source files change. Release builds apply optimizations including WASM size reduction for production deployment.

Trunk integrates with wasm-bindgen for JavaScript interop and works with frameworks like Yew, Leptos, and Seed. Configuration is managed through a Trunk.toml file in the project root.

# CONFIGURATION

**Trunk.toml**
> Project configuration file specifying build options, proxy settings, and asset pipeline rules.

# CAVEATS

Rust/WASM specific. wasm-bindgen based. Trunk.toml config.

# HISTORY

**Trunk** was created for building and bundling Rust WebAssembly applications.

# SEE ALSO

[wasm-pack](/man/wasm-pack)(1), [cargo](/man/cargo)(1)
