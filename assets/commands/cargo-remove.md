# TLDR

**Remove dependency**

```cargo remove [serde]```

**Remove dev dependency**

```cargo remove --dev [mockall]```

**Remove build dependency**

```cargo remove --build [cc]```

**Remove multiple dependencies**

```cargo remove [serde] [tokio] [regex]```

**Remove target-specific dependency**

```cargo remove --target [x86_64-pc-windows-gnu] [winapi]```

**Dry run**

```cargo remove --dry-run [package]```

# SYNOPSIS

**cargo remove** [_options_] _dep_...

# DESCRIPTION

**cargo remove** removes one or more dependencies from Cargo.toml. Supports removing from dev, build, or target-specific dependency sections.

# PARAMETERS

**--dev**, **-D**
> Remove from dev-dependencies

**--build**, **-B**
> Remove from build-dependencies

**--target** _triple_
> Remove from target-specific dependencies

**-p**, **--package** _spec_
> Package to modify

**--dry-run**
> Show changes without modifying manifest

**--manifest-path** _path_
> Path to Cargo.toml

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress output

# CAVEATS

Does not remove dependencies from Cargo.lock until next build. Use cargo-machete to detect unused dependencies.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-add](/man/cargo-add)(1), [cargo-update](/man/cargo-update)(1)
