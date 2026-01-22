# TLDR

**Show Cargo version**

```cargo version```

**Show verbose version info**

```cargo version --verbose```

**Short form**

```cargo -V```

**Verbose short form**

```cargo -Vv```

# SYNOPSIS

**cargo version** [_options_]
**cargo** -V [v]

# DESCRIPTION

**cargo version** displays the version of Cargo. Includes version number, build date, and git commit hash.

# PARAMETERS

**-v**, **--verbose**
> Show additional build metadata

**--format-version** _n_
> Output format: 1 (legacy JSON), 2 (human-readable, default)

# OUTPUT

**Default**
```
cargo 1.75.0 (1d8b05cdd 2023-11-20)
```

**Verbose**
```
cargo 1.75.0 (1d8b05cdd 2023-11-20)
release: 1.75.0
commit-hash: 1d8b05cdd
commit-date: 2023-11-20
host: x86_64-unknown-linux-gnu
libgit2: 1.7.1
libcurl: 7.88.1
ssl: OpenSSL 3.0.11
os: Linux [kernel 6.1.0]
```

# RELATED COMMANDS

**rustc --version**
> Show Rust compiler version

**rustup show**
> Show installed toolchains

# CAVEATS

Operates offline with no side effects. Useful for CI/CD and build script checks.

# SEE ALSO

[cargo](/man/cargo)(1), [rustc](/man/rustc)(1), [rustup](/man/rustup)(1)
