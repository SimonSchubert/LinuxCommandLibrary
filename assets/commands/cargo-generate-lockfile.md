# TLDR

**Generate lock file**

```cargo generate-lockfile```

**Regenerate with latest versions**

```cargo generate-lockfile```

**Generate with specific manifest**

```cargo generate-lockfile --manifest-path [path/to/Cargo.toml]```

**Generate with custom lockfile path**

```cargo generate-lockfile --lockfile-path [/tmp/Cargo.lock]```

# SYNOPSIS

**cargo generate-lockfile** [_options_]

# DESCRIPTION

**cargo generate-lockfile** creates or rebuilds Cargo.lock for the current package or workspace. If lockfile exists, rebuilds with latest available versions of all packages.

# PARAMETERS

**--manifest-path** _path_
> Path to Cargo.toml

**--lockfile-path** _path_
> Custom lockfile path (must end with Cargo.lock)

**--locked**
> Assert exact same dependencies as original lockfile

**--offline**
> Don't access network

**--frozen**
> Equivalent to --locked and --offline

**-v**, **--verbose**
> Verbose output (use twice for very verbose)

**-q**, **--quiet**
> Suppress log messages

# BEHAVIOR

Creates new Cargo.lock if none exists. Rebuilds existing lockfile with newest compatible versions. Use cargo update for more control over version updates.

# CAVEATS

Ensures reproducible builds by locking dependency versions. Useful in CI pipelines for deterministic builds. Consider committing Cargo.lock for applications, not libraries.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-update](/man/cargo-update)(1), [cargo-fetch](/man/cargo-fetch)(1)
