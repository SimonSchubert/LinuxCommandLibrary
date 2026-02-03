# TLDR

**Run command with toolchain**

```rustup run stable cargo build```

**Run with nightly**

```rustup run nightly rustc --version```

**Run specific version**

```rustup run [1.70.0] cargo test```

# SYNOPSIS

**rustup** **run** _toolchain_ _command_ [_args_...]

# PARAMETERS

**--install**
> Install toolchain if missing.

# DESCRIPTION

**rustup run** executes a command with a specific Rust toolchain. Temporarily uses specified toolchain regardless of default or override settings.

# SEE ALSO

[rustup](/man/rustup)(1), [rustup-override](/man/rustup-override)(1)

