# TAGLINE

Install prebuilt Rust binaries from crates.io

# TLDR

**Install package binary**

```cargo binstall [ripgrep]```

**Install specific version**

```cargo binstall [tokei@12.1.0]```

**Only install if signed**

```cargo binstall --only-signed [package]```

**Install without confirmation**

```cargo binstall -y [package]```

**Upgrade cargo-binstall itself**

```cargo binstall cargo-binstall```

**Install from specific target**

```cargo binstall --targets [x86_64-unknown-linux-gnu] [package]```

# SYNOPSIS

**cargo binstall** [_options_] _crate_[@_version_]

# DESCRIPTION

**cargo binstall** installs Rust binaries by downloading prebuilt releases instead of compiling from source. It fetches crate info from crates.io, searches for matching releases, and falls back to cargo install if no binary is found.

Much faster than cargo install on constrained devices.

# PARAMETERS

**-y**, **--no-confirm**
> Skip confirmation prompt

**--only-signed**
> Only install signed packages

**--targets** _targets_
> Override target platform

**--install-path** _path_
> Custom installation directory

**--roots** _path_
> Root directory for package info

**--force**
> Force reinstallation

**--no-symlinks**
> Don't create symlinks

**--dry-run**
> Show what would be installed

**--log-level** _level_
> Set log verbosity

# FALLBACK ORDER

1. Linked repository releases
2. quickinstall artifact host
3. Alternate supported targets
4. cargo install (source build)

# SIGNATURE VERIFICATION

Maintainers can specify signing keys in Cargo.toml. Binstall downloads and verifies signatures when available.

# CAVEATS

Package must have prebuilt binaries or binstall metadata. Falls back to cargo install when no binary found.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-install](/man/cargo-install)(1)
