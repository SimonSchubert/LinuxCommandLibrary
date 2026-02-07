# TAGLINE

Display information about a Rust crate

# TLDR

**Show package information**

```cargo info [serde]```

**Show specific version info**

```cargo info [serde@1.0]```

**Show info for local package**

```cargo info```

**Show info with features**

```cargo info [tokio]```

# SYNOPSIS

**cargo info** [_options_] [_spec_]

# DESCRIPTION

**cargo info** displays information about a package from crates.io or the local workspace. Shows metadata from Cargo.toml including name, version, description, license, dependencies, and features.

For local workspace packages, displays information from the local manifest. Creates Cargo.lock if it doesn't exist.

# PARAMETERS

**--registry** _name_
> Use specified registry

**--index** _url_
> Use specified registry index

**--manifest-path** _path_
> Path to Cargo.toml

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress output

# OUTPUT

Displays:
- Package name and version
- Description
- License
- Documentation and repository links
- Dependencies
- Features
- Recent versions

# CAVEATS

Without version specification, selects version based on Minimum Supported Rust Version (MSRV). For more detailed crate queries, consider cargo-crate or cargo-information.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-search](/man/cargo-search)(1)
