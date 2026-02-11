# TAGLINE

Bootstrap installer script for rustup

# TLDR

**Install rustup**

```curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh```

**Install without prompts**

```curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh -s -- -y```

**Install specific toolchain**

```curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh -s -- --default-toolchain nightly```

# SYNOPSIS

**rustup-init.sh** [_options_]

# PARAMETERS

**-y**
> Accept defaults without prompting.

**--default-toolchain** _name_
> Install specific toolchain.

**--no-modify-path**
> Don't modify PATH.

**--profile** _name_
> Installation profile (minimal, default, complete).

# DESCRIPTION

**rustup-init.sh** is the Rust toolchain installer script. Downloads and runs rustup-init to install rustup and the Rust toolchain. Official method for installing Rust on Unix systems.

# SEE ALSO

[rustup](/man/rustup)(1), [cargo](/man/cargo)(1)

