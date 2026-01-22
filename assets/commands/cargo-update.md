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

**cargo update** updates dependencies in Cargo.lock to latest compatible versions. Creates Cargo.lock if it doesn't exist. Without -p flag, updates all dependencies.

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
