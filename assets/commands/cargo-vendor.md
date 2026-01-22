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

**cargo vendor** copies all crates.io and git dependencies into a local directory. Outputs configuration for using vendored sources. Useful for offline builds and reproducible environments.

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

After vendoring, add output to .cargo/config.toml:

```toml
[source.crates-io]
replace-with = "vendored-sources"

[source.vendored-sources]
directory = "vendor"
```

# OFFLINE BUILDS

After vendoring:
```
cargo build --offline
```

# CAVEATS

Vendored sources are read-only. Use [patch] for modifications. Resolution may differ from online mode. Run cargo fetch first for complete dependency download.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-fetch](/man/cargo-fetch)(1)
