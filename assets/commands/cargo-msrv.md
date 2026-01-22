# TLDR

**Find minimum supported Rust version**

```cargo msrv find```

**Find using linear search**

```cargo msrv find --linear```

**Verify current MSRV works**

```cargo msrv verify```

**Show declared MSRV**

```cargo msrv show```

**Set MSRV in Cargo.toml**

```cargo msrv set [1.56.0]```

**List dependency MSRVs**

```cargo msrv list```

**Find for specific path**

```cargo msrv --path [/path/to/project] find```

# SYNOPSIS

**cargo msrv** [_options_] _command_

# DESCRIPTION

**cargo msrv** finds and manages the Minimum Supported Rust Version (MSRV) for Rust projects. Uses binary search by default to efficiently find the oldest compatible Rust version.

# COMMANDS

**find**
> Discover the MSRV by testing versions

**verify**
> Check if project works with declared MSRV

**show**
> Display MSRV from Cargo.toml

**set** _version_
> Update rust-version in Cargo.toml

**list**
> Show MSRVs of dependencies

# PARAMETERS

**--path** _dir_
> Project directory path

**--linear**
> Use linear search instead of binary

**--min** _version_
> Minimum version to consider

**--max** _version_
> Maximum version to consider

**--target** _triple_
> Target platform

**--manifest-path** _path_
> Path to Cargo.toml

# REQUIREMENTS

Requires rustup for toolchain management.

# CAVEATS

Binary search is much faster than linear (79+ minor versions exist). Set MSRV via package.rust-version field in Cargo.toml.

# SEE ALSO

[cargo](/man/cargo)(1), [rustup](/man/rustup)(1)
