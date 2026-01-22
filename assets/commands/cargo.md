# TLDR

**Build** project

```cargo build```

**Run** project

```cargo run```

**Test** project

```cargo test```

**Create** new project

```cargo new [project-name]```

**Add** dependency

```cargo add [dependency]```

**Update** dependencies

```cargo update```

# SYNOPSIS

**cargo** _command_ [_options_]

# DESCRIPTION

**cargo** is the Rust package manager and build system. It handles dependency management, compiling packages, running tests, generating documentation, and publishing crates to crates.io.

The tool is essential for Rust development and comes bundled with Rust.

# PARAMETERS

**new** _name_
> Create new project

**build** [**--release**]
> Compile project

**run**
> Build and run

**test**
> Run tests

**check**
> Check compilation without building

**add** _crate_
> Add dependency

**install** _crate_
> Install binary crate

**publish**
> Publish to crates.io

**doc** [**--open**]
> Build documentation

**clean**
> Remove build artifacts

**update**
> Update dependencies

# FEATURES

- Dependency resolution
- Build management
- Test runner
- Documentation generator
- Benchmarking
- Publishing to crates.io
- Workspace support
- Custom build scripts

# PROJECT STRUCTURE

```
my_project/
├── Cargo.toml      # Project manifest
├── Cargo.lock      # Dependency lock file
└── src/
    └── main.rs     # Source code
```

# CARGO.TOML

```toml
[package]
name = "myproject"
version = "0.1.0"
edition = "2021"

[dependencies]
serde = "1.0"
tokio = { version = "1.0", features = ["full"] }
```

# WORKFLOW

```bash
# Create new binary project
cargo new myapp

# Create library
cargo new --lib mylib

# Build debug version
cargo build

# Build optimized release
cargo build --release

# Run project
cargo run

# Run tests
cargo test

# Check without building
cargo check

# Generate and open docs
cargo doc --open
```

# CAVEATS

First build downloads dependencies (slow). Release builds significantly slower than debug. Cargo.lock should be committed for binaries (not libraries). Large projects have long compile times. Target directory can grow large.

# HISTORY

**Cargo** was developed alongside Rust starting around **2013**, becoming the standard build tool and package manager for the Rust ecosystem.

# SEE ALSO

[rustc](/man/rustc)(1), [rustup](/man/rustup)(1), [rust](/man/rust)(1)
