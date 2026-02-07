# TAGLINE

Remove dependencies from a Cargo.toml manifest

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

**cargo remove** removes one or more dependencies from the Cargo.toml manifest file. It can target regular dependencies, dev-dependencies, build-dependencies, or platform-specific dependency sections.

The command modifies Cargo.toml directly but does not update Cargo.lock until the next build or `cargo update`. Multiple dependencies can be removed in a single invocation. Use `--dry-run` to preview changes before applying them.

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
