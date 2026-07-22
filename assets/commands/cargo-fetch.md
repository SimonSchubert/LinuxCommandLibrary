# TAGLINE

Download dependencies for offline builds

# TLDR

**Fetch all dependencies**

```cargo fetch```

**Fetch for specific target**

```cargo fetch --target [x86_64-unknown-linux-gnu]```

**Fetch with locked versions**

```cargo fetch --locked```

**Fetch offline (from cache)**

```cargo fetch --offline```

# SYNOPSIS

**cargo fetch** [_options_]

# DESCRIPTION

**cargo fetch** downloads all dependencies from the network and stores them locally. If Cargo.lock exists, fetches exact versions specified. Otherwise, generates the lock file first.

Useful for preparing to work offline with the --offline flag.

# PARAMETERS

**--target** _triple_
> Fetch for specified target architecture (can be repeated)

**--locked**
> Assert same dependencies as original Cargo.lock

**--offline**
> Use only locally cached crates

**--frozen**
> Equivalent to --locked and --offline

**--manifest-path** _path_
> Path to Cargo.toml

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress log messages

# BEHAVIOR

Without --target, fetches all target dependencies. Git dependencies are cloned with submodules. Registry crates are downloaded to cargo cache.

# CAVEATS

Subsequent cargo commands can run offline after fetch unless lock file changes. Network access required unless using --offline with cached dependencies.

# INSTALL

```apt: sudo apt install cargo```

```dnf: sudo dnf install cargo```

```apk: sudo apk add cargo```

```zypper: sudo zypper install cargo```

```nix: nix profile install nixpkgs#cargo```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-build](/man/cargo-build)(1), [cargo-update](/man/cargo-update)(1)

# RESOURCES

```[Source code](https://github.com/rust-lang/cargo)```

```[Documentation](https://doc.rust-lang.org/cargo/commands/cargo-fetch.html)```

<!-- verified: 2026-06-22 -->
