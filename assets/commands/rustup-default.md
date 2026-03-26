# TAGLINE

Set the default Rust toolchain

# TLDR

**Set default toolchain**

```rustup default stable```

**Set nightly as default**

```rustup default nightly```

**Set specific version**

```rustup default [1.70.0]```

**Show current default**

```rustup default```

# SYNOPSIS

**rustup** **default** [_toolchain_]

# PARAMETERS

_toolchain_
> Toolchain name: **stable**, **beta**, **nightly**, or a specific version like **1.70.0**. Can include a target triple (e.g., `nightly-x86_64-unknown-linux-gnu`).

# DESCRIPTION

**rustup default** sets or shows the default Rust toolchain. The default toolchain is used when no override is active (via `rustup override` or `rust-toolchain.toml`). Common choices are stable, beta, or nightly. If the specified toolchain is not installed, rustup will download and install it automatically.

# CAVEATS

Project-level overrides (from `rust-toolchain.toml` or `rustup override`) take precedence over the default. Changing the default does not affect projects that have overrides set.

# SEE ALSO

[rustup](/man/rustup)(1), [rustup-toolchain](/man/rustup-toolchain)(1), [rustup-override](/man/rustup-override)(1)

