# TAGLINE

Rust WebAssembly application bundler

# TLDR

**Build the project**

```trunk build```

**Build for release** with optimizations

```trunk build --release```

**Serve with hot reload**

```trunk serve```

**Serve on a specific port and address**

```trunk serve --port [3000] --address [0.0.0.0]```

**Serve with a backend proxy**

```trunk serve --proxy-backend=http://localhost:[9000]/api/```

**Watch for changes and rebuild**

```trunk watch```

**Clean build artifacts**

```trunk clean```

# SYNOPSIS

**trunk** _command_ [_--release_] [_options_]

# PARAMETERS

**build**
> Build the project, compiling Rust to WASM and bundling assets.

**serve**
> Start development server with hot reloading.

**watch**
> Watch for file changes and rebuild automatically.

**clean**
> Remove build artifacts (dist directory).

**--release**
> Enable release optimizations including WASM size reduction.

**--public-url** _URL_
> Public URL prefix for asset paths.

**--port** _PORT_
> Port for the dev server (default: 8080).

**--address** _ADDR_
> Address to bind the dev server to.

**--proxy-backend** _URL_
> Proxy requests to a backend server. The URI path of the URL determines the proxy path.

**--proxy-rewrite** _URI_
> Alternative URI on which to listen for proxy requests.

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
