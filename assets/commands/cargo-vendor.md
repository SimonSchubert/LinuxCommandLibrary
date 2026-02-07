# TAGLINE

Vendor all dependencies locally

# TLDR

**Vendor dependencies**

```cargo vendor```

**Vendor to specific directory**

```cargo vendor [vendor/]```

**Vendor and save config**

```cargo vendor > .cargo/config.toml```

**Vendor with versioned directories**

```cargo vendor --versioned-dirs```

**Vendor specific package**

```cargo vendor -s [package/Cargo.toml]```

# SYNOPSIS

**cargo vendor** [_options_] [_path_]

# DESCRIPTION

**cargo vendor** downloads and copies all crates.io and git dependencies into a local directory (default: `vendor/`). It outputs the Cargo configuration needed to redirect dependency resolution to the vendored sources.

This is primarily used for offline builds, air-gapped environments, and reproducible build systems where network access during compilation is not available or not desired. The vendored sources are read-only; to modify a vendored crate, use the `[patch]` section in Cargo.toml instead of editing files directly in the vendor directory.

# PARAMETERS

**-s**, **--sync** _path_
> Additional Cargo.toml to sync

**--no-delete**
> Don't delete existing vendor directory

**--versioned-dirs**
> Use versioned directory names

**--respect-source-config**
> Respect [source] config when vendoring

**--manifest-path** _path_
> Path to Cargo.toml

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress output

# CONFIGURATION

**.cargo/config.toml**
> Source replacement settings that redirect dependency resolution to the vendored directory. The output of `cargo vendor` provides the exact configuration to add.

# OFFLINE BUILDS

After vendoring:
```
cargo build --offline
```

# CAVEATS

Vendored sources are read-only. Use [patch] for modifications. Resolution may differ from online mode. Run cargo fetch first for complete dependency download.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-fetch](/man/cargo-fetch)(1)
