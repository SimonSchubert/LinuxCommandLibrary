# TLDR

**Find cargo path**

```rustup which cargo```

**Find rustc path**

```rustup which rustc```

**Find tool in specific toolchain**

```rustup which --toolchain nightly rustfmt```

# SYNOPSIS

**rustup** **which** [_options_] _command_

# PARAMETERS

**--toolchain** _name_
> Search in specific toolchain.

# DESCRIPTION

**rustup which** displays the path to Rust tools. Shows which binary would be executed for a given command. Useful for debugging toolchain issues.

# SEE ALSO

[rustup](/man/rustup)(1), [which](/man/which)(1)

