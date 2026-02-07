# TAGLINE

Assemble a local package into a distributable archive

# TLDR

**Create package archive**

```cargo package```

**Package without verification**

```cargo package --no-verify```

**List files in package**

```cargo package --list```

**Allow uncommitted changes**

```cargo package --allow-dirty```

**Package specific workspace member**

```cargo package -p [crate_name]```

# SYNOPSIS

**cargo package** [_options_]

# DESCRIPTION

**cargo package** creates a distributable `.crate` archive from the source code. The archive is placed in `target/package/` and contains the source files, a normalized Cargo.toml, and optionally the Cargo.lock file. By default, the package is verified by extracting and building it in a temporary directory.

During packaging, the Cargo.toml manifest is normalized: workspace inheritance is resolved, `[patch]`, `[replace]`, and `[workspace]` sections are removed, and path dependencies must include a version key. The `include` and `exclude` fields in Cargo.toml control which files are packaged. This command is equivalent to `cargo publish --dry-run` and is useful for inspecting what would be uploaded to a registry.

# PARAMETERS

**-l**, **--list**
> List files that would be included

**--no-verify**
> Skip extraction and build verification

**--allow-dirty**
> Allow uncommitted VCS changes

**--no-metadata**
> Ignore warnings about missing metadata

**--exclude-lockfile**
> Don't include Cargo.lock

**--target** _triple_
> Build for target platform (verification)

**-p**, **--package** _spec_
> Package specific workspace member

**--workspace**
> Package all workspace members

**-v**, **--verbose**
> Verbose output

# MANIFEST PROCESSING

The Cargo.toml is normalized:
- [patch], [replace], [workspace] sections removed
- Path dependencies require version key
- Cargo.lock included by default

# FILE CONTROL

Use include/exclude fields in Cargo.toml to control packaged files.

# CAVEATS

crates.io has 10MB size limit. Path dependencies without version keys are not allowed. Equivalent to cargo publish --dry-run.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-publish](/man/cargo-publish)(1)
