# TAGLINE

Update dependencies in Cargo.lock

# TLDR

**Update all dependencies**

```cargo update```

**Update specific package**

```cargo update -p [package]```

**Update to specific version**

```cargo update -p [package] --precise [1.2.3]```

**Update workspace packages only**

```cargo update --workspace```

**Preview updates**

```cargo update --dry-run```

**Update package and its dependencies**

```cargo update -p [package] --recursive```

# SYNOPSIS

**cargo update** [_options_]

# DESCRIPTION

**cargo update** updates dependencies recorded in Cargo.lock to the latest versions compatible with the version requirements specified in Cargo.toml. If Cargo.lock does not exist, it is created. Without the `-p` flag, all dependencies are updated.

When used with `-p`, only the specified package is updated conservatively. The `--precise` flag can pin a package to an exact version. The lockfile ensures reproducible builds across environments; running `cargo update` is the standard way to pull in bug fixes and minor updates from dependencies while respecting semver constraints.

# PARAMETERS

**-p**, **--package** _spec_
> Update only specified package

**--precise** _version_
> Set exact version (with -p)

**--recursive**
> Update package and transitive dependencies (with -p)

**--workspace**
> Update only workspace packages

**--dry-run**
> Show updates without writing lockfile

**--locked**
> Assert lockfile doesn't need updating

**--offline**
> Don't access network

**--frozen**
> Equivalent to --locked --offline

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress output

# BEHAVIOR

**With -p**
> Conservative update: only specified package

**Without -p**
> Full update: all dependencies to latest

# CAVEATS

Cargo.lock is auto-maintained. Update when you want newer compatible versions. Lockfile ensures reproducible builds.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-generate-lockfile](/man/cargo-generate-lockfile)(1)
