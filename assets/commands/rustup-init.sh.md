# TAGLINE

Bootstrap installer script for rustup

# TLDR

**Install rustup**

```curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh```

**Install without prompts**

```curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh -s -- -y```

**Install nightly toolchain**

```curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh -s -- --default-toolchain nightly```

**Install minimal profile without modifying PATH**

```curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh -s -- -y --profile minimal --no-modify-path```

**Install with additional target for cross-compilation**

```curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh -s -- --target wasm32-unknown-unknown```

**Install with additional components**

```curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh -s -- --component rustfmt clippy```

# SYNOPSIS

**rustup-init.sh** [_options_]

# PARAMETERS

**-y**
> Accept defaults without prompting.

**-q**, **--quiet**
> Disable progress output.

**-v**, **--verbose**
> Enable verbose output.

**--default-toolchain** _name_
> Install specific toolchain (stable, beta, nightly, or a version like 1.78.0).

**--default-host** _triple_
> Set the default host triple (e.g., x86_64-unknown-linux-gnu).

**--no-modify-path**
> Don't modify the PATH environment variable.

**--profile** _name_
> Installation profile: minimal (rustc, cargo), default (adds rustfmt, clippy), or complete (all components).

**--component** _name_
> Add a specific component (e.g., rust-docs, rustfmt, clippy). Can be specified multiple times.

**--target** _triple_
> Add a cross-compilation target (e.g., wasm32-unknown-unknown). Can be specified multiple times.

# DESCRIPTION

**rustup-init.sh** is the Rust toolchain installer script. Downloads and runs rustup-init to install rustup and the Rust toolchain. This is the official method for installing Rust on Unix systems.

Options can also be set via environment variables prefixed with RUSTUP_INIT_ (e.g., RUSTUP_INIT_DEFAULT_TOOLCHAIN=nightly).

# SEE ALSO

[rustup](/man/rustup)(1), [cargo](/man/cargo)(1), [rustc](/man/rustc)(1)

