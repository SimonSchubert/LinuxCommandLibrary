# TAGLINE

Print a fully qualified package specification

# TLDR

**Show package ID for current package**

```cargo pkgid```

**Show package ID for dependency**

```cargo pkgid [serde]```

**Show package ID with version**

```cargo pkgid [serde@1.0.0]```

**Show package ID from URL**

```cargo pkgid [https://github.com/serde-rs/serde#serde]```

# SYNOPSIS

**cargo pkgid** [_options_] [_spec_]

# DESCRIPTION

**cargo pkgid** prints the fully qualified package ID specification for a package in the dependency graph. The output includes the source URL, package name, and version in a canonical format that can be used with other Cargo commands like `cargo update -p`.

This command is primarily useful when multiple versions of the same package exist in the dependency tree and disambiguation is needed. It accepts partial specifications such as just the name or name with version, and resolves them against the lockfile. The Cargo.lock file must exist and dependencies must be fetched before this command can be used.

# PARAMETERS

**-p**, **--package** _spec_
> Package to query

**--manifest-path** _path_
> Path to Cargo.toml

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress output

# SPEC FORMATS

**name**
> regex

**name@version**
> regex@1.4.3

**url#name**
> https://github.com/rust-lang/crates.io-index#foo

**url#name@version**
> https://github.com/rust-lang/cargo#crates-io@0.21.0

# FULL SPEC FORMAT

```
registry+https://github.com/rust-lang/crates.io-index#regex@1.4.3
```

# CAVEATS

Errors if specification is ambiguous. Add version qualifier to disambiguate multiple versions. Requires lockfile and fetched dependencies.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-metadata](/man/cargo-metadata)(1)
