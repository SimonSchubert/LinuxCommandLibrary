# TAGLINE

Output workspace and dependency metadata as JSON

# TLDR

**Output project metadata**

```cargo metadata```

**Output with format version**

```cargo metadata --format-version 1```

**Without dependencies**

```cargo metadata --no-deps```

**Filter to specific features**

```cargo metadata --features [feature1,feature2]```

**Pretty print JSON**

```cargo metadata --format-version 1 | jq .```

# SYNOPSIS

**cargo metadata** [_options_]

# DESCRIPTION

**cargo metadata** outputs JSON to stdout containing information about workspace members, resolved dependencies, and build configuration. Useful for tooling and IDE integration.

# PARAMETERS

**--format-version** _version_
> Schema version (use 1 for stability)

**--no-deps**
> Skip dependency resolution (faster, workspace only)

**--features** _features_
> Enable specified features

**--all-features**
> Enable all features

**--no-default-features**
> Disable default features

**--filter-platform** _triple_
> Filter to specified platform

**--manifest-path** _path_
> Path to Cargo.toml

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress log messages

# OUTPUT FIELDS

**packages**
> Array of all packages and dependencies

**workspace_members**
> Package IDs of workspace members

**workspace_root**
> Absolute path to workspace root

**target_directory**
> Path to build output directory

**resolve**
> Dependency resolution graph

**version**
> Schema version number

# CAVEATS

Output format may change between Cargo versions. Always use --format-version for scripts. The cargo_metadata crate provides Rust parsing.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-locate-project](/man/cargo-locate-project)(1)
