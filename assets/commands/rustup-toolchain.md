# TLDR

**List toolchains**

```rustup toolchain list```

**Install toolchain**

```rustup toolchain install stable```

**Uninstall toolchain**

```rustup toolchain uninstall nightly```

**Link custom toolchain**

```rustup toolchain link [name] [path]```

# SYNOPSIS

**rustup** **toolchain** _command_ [_options_]

# PARAMETERS

**list**
> List installed toolchains.

**install** _name_
> Install toolchain.

**uninstall** _name_
> Remove toolchain.

**link** _name_ _path_
> Link custom toolchain.

**--profile** _name_
> Installation profile.

# DESCRIPTION

**rustup toolchain** manages Rust toolchains. Install, remove, and list toolchains. Supports stable, beta, nightly, and specific versions. Can link custom-built toolchains.

# SEE ALSO

[rustup](/man/rustup)(1), [rustup-default](/man/rustup-default)(1)

