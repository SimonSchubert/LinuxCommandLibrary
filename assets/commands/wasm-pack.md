# TAGLINE

Build Rust projects for WebAssembly

# TLDR

**Build Rust project for WebAssembly**

```wasm-pack build```

**Build for npm publishing**

```wasm-pack build --target bundler```

**Build for web browser**

```wasm-pack build --target web```

**Build for Node.js**

```wasm-pack build --target nodejs```

**Build with custom output directory**

```wasm-pack build --out-dir [dist]```

**Build in development mode**

```wasm-pack build --dev```

**Publish to npm**

```wasm-pack publish```

**Create new project from template**

```wasm-pack new [project-name]```

# SYNOPSIS

**wasm-pack** [_options_] _command_ [_args_]

# COMMANDS

**build**: Compile to WebAssembly and generate bindings.

**new**: Create new project from template.

**pack**: Create tarball for npm publishing.

**publish**: Publish package to npm registry.

**login**: Login to npm registry.

**test**: Run wasm-pack tests.

# PARAMETERS

**--target** _target_
> Output target: bundler (default), web, nodejs, deno, no-modules.

**--out-dir** _dir_
> Output directory (default: pkg).

**--out-name** _name_
> Output file basename.

**--dev**
> Development build with debug info.

**--profiling**
> Release build with debug info.

**--release**
> Optimized release build (default).

**--scope** _scope_
> npm scope for publishing.

**--mode** _mode_
> Build mode: normal, no-install, force.

**--verbose**
> Enable verbose output.

**--quiet**
> Suppress output.

**-h**, **--help**
> Display help.

**-V**, **--version**
> Display version.

# DESCRIPTION

**wasm-pack** is a build tool for Rust-generated WebAssembly. It compiles Rust code to WebAssembly, generates JavaScript bindings using wasm-bindgen, and produces npm-ready packages.

The build process compiles Rust to the wasm32-unknown-unknown target, runs wasm-bindgen to generate JavaScript glue code, and optionally runs wasm-opt for optimization. The output includes .wasm files, TypeScript definitions, and package.json for npm.

Different targets generate different JavaScript module formats: bundler for webpack/rollup, web for ES modules in browsers, nodejs for CommonJS, and no-modules for script tags.

Install via cargo: `cargo install wasm-pack`

# CAVEATS

Requires Rust toolchain with wasm32-unknown-unknown target. First build may download wasm-bindgen and wasm-opt. Some Rust crates may not compile to WebAssembly. WASI support requires different tooling.

# HISTORY

**wasm-pack** was created by the Rust and WebAssembly Working Group to simplify publishing Rust-generated WebAssembly to npm. It streamlines the workflow of compiling, binding generation, and package publishing into a single tool.

# SEE ALSO

[cargo](/man/cargo)(1), [wasm-bindgen](/man/wasm-bindgen)(1), [wasmtime](/man/wasmtime)(1), [npm](/man/npm)(1)
