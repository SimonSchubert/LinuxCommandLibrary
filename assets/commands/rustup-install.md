# TAGLINE

install a Rust toolchain

# TLDR

**Install** the stable toolchain

```rustup install stable```

**Install** the nightly toolchain

```rustup install nightly```

**Install a pinned version**

```rustup install 1.78.0```

**Install a nightly from a specific date**

```rustup install nightly-2025-01-15```

**Install with the minimal profile** (rustc, rust-std, cargo only)

```rustup install stable --profile minimal```

**Install and add components**

```rustup install nightly --component rust-src --component rust-analyzer```

**Install without checking for self-update**

```rustup install stable --no-self-update```

# SYNOPSIS

**rustup** **install** [_options_] _toolchain_...

# DESCRIPTION

**rustup install** downloads and installs one or more Rust toolchains. It is an alias for **rustup toolchain install**.

A toolchain is identified by a channel (**stable**, **beta**, **nightly**), an exact version (**1.78.0**), and optionally a date (**nightly-2025-01-15**) and host triple (**stable-x86_64-unknown-linux-gnu**). If the toolchain is already installed it is updated to the latest release on that channel.

# PARAMETERS

**--profile** _NAME_
> Installation profile: **minimal**, **default**, or **complete**. Controls which components are installed.

**-c**, **--component** _NAME_
> Add a component to the toolchain (for example `rust-src`, `rust-analyzer`, `llvm-tools`, `miri`). May be repeated.

**-t**, **--target** _TRIPLE_
> Add a cross-compilation target. May be repeated.

**--no-self-update**
> Do not update rustup itself while installing the toolchain.

**--force**
> Reinstall the toolchain even if it appears up to date; on nightly, install even if some requested components are missing.

**--force-non-host**
> Allow installing a toolchain whose host triple does not match the running machine (introduced in rustup 1.28).

**--allow-downgrade**
> Allow choosing an older nightly if the most recent one is missing required components.

**-h**, **--help**
> Print help.

# CAVEATS

By default, rustup checks for and applies its own self-updates whenever a toolchain is installed; disable with **--no-self-update** in CI environments. Components and targets requested at install time must be available for the chosen channel/date or the install fails; with **--force** rustup will install the toolchain anyway, skipping the missing components.

# HISTORY

**rustup** is the official Rust toolchain installer, created by **Brian Anderson** and now maintained by the **Rust project**. **rustup install** has been the canonical way to add new toolchains since rustup's initial release.

# SEE ALSO

[rustup](/man/rustup)(1), [rustup-toolchain](/man/rustup-toolchain)(1), [rustup-uninstall](/man/rustup-uninstall)(1)
