# TAGLINE

Manage Rust cross-compilation targets

# TLDR

**List targets**

```rustup target list```

**Add target**

```rustup target add [wasm32-unknown-unknown]```

**Add ARM target**

```rustup target add aarch64-unknown-linux-gnu```

**Remove target**

```rustup target remove [target]```

# SYNOPSIS

**rustup** **target** _command_ [_options_]

# PARAMETERS

**list**
> List available targets.

**add** _target_
> Install target.

**remove** _target_
> Uninstall target.

**--toolchain** _name_
> Target specific toolchain.

# DESCRIPTION

**rustup target** manages cross-compilation targets. Add targets to compile for different platforms (ARM, WebAssembly, Windows, etc.) from your current system.

# SEE ALSO

[rustup](/man/rustup)(1), [rustup-toolchain](/man/rustup-toolchain)(1)

