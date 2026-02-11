# TAGLINE

Set directory-specific Rust toolchain overrides

# TLDR

**Set directory override**

```rustup override set nightly```

**Remove directory override**

```rustup override unset```

**List overrides**

```rustup override list```

# SYNOPSIS

**rustup** **override** _command_ [_options_]

# PARAMETERS

**set** _toolchain_
> Set override for current directory.

**unset**
> Remove current directory override.

**list**
> Show all overrides.

**--path** _path_
> Target specific directory.

# DESCRIPTION

**rustup override** manages directory-specific toolchain overrides. Overrides take precedence over default toolchain. Useful for projects requiring specific Rust versions.

# SEE ALSO

[rustup](/man/rustup)(1), [rustup-default](/man/rustup-default)(1)

