# TAGLINE

Install the Rust toolchain Cerulion uses to build nodes

# TLDR

Install **current stable Rust** when this machine does not already have 1.95 or newer

```cerulion-install-rust```

# SYNOPSIS

**cerulion-install-rust**

# DESCRIPTION

**cerulion-install-rust** is the one-shot installer that ships with [cerulion](/man/cerulion)(1). It installs the current stable Rust toolchain unless Rust 1.95 or newer is already on the machine. Cerulion's Homebrew formula and Debian package do not install Rust themselves. Building a node needs that compiler.

After it runs, put Cargo's bin directory on `PATH`:

```${CARGO_HOME:-$HOME/.cargo}/bin```

`cerulion workspace create` and `cerulion node build` offer to run this installer when Rust 1.95 or newer is missing.

The command takes no documented flags. It is a setup helper, not the robotics CLI.

# SEE ALSO

[cerulion](/man/cerulion)(1), [cargo](/man/cargo)(1), [rustc](/man/rustc)(1)

# RESOURCES

```[Source code](https://github.com/cerulion-inc/cerulion)```

```[Homepage](https://cerulion.com)```

```[Documentation](https://docs.cerulion.com)```

<!-- verified: 2026-11-17 -->
