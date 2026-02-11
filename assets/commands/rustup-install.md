# TAGLINE

Install a specific Rust toolchain

# TLDR

**Install toolchain**

```rustup install stable```

**Install nightly**

```rustup install nightly```

**Install specific version**

```rustup install [1.70.0]```

**Install with components**

```rustup install nightly --component rust-src```

# SYNOPSIS

**rustup** **install** [_options_] _toolchain_...

# PARAMETERS

**--profile** _name_
> Installation profile.

**--component** _comp_
> Add component.

**--target** _target_
> Add target.

# DESCRIPTION

**rustup install** downloads and installs Rust toolchains. Alias for rustup toolchain install. Supports stable, beta, nightly, and specific versions.

# SEE ALSO

[rustup](/man/rustup)(1), [rustup-toolchain](/man/rustup-toolchain)(1), [rustup-uninstall](/man/rustup-uninstall)(1)

