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

**cargo package** creates a distributable .crate archive from the source code. Output is placed in target/package/. The archive is verified by extracting and building unless --no-verify is used.

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
