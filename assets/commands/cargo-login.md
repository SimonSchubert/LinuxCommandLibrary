# TAGLINE

Save a registry API token for authentication

# TLDR

**Login to crates.io** (token read from stdin)

```cargo login```

**Login with a token provided as argument**

```cargo login [token]```

**Login to a specific registry**

```cargo login --registry [my-registry]```

# SYNOPSIS

**cargo login** [_options_] [_token_]

# DESCRIPTION

**cargo login** runs a credential provider to save a token for registry authentication. Required for publishing crates with `cargo publish`. The token is read from stdin. Tokens are stored in `$CARGO_HOME/credentials.toml` by default.

For crates.io, obtain your token from https://crates.io/me

# PARAMETERS

**--registry** _name_
> Registry to authenticate with (default: crates-io)

**-v**, **--verbose**
> Verbose output. May be specified twice for extra detail.

**-q**, **--quiet**
> Suppress output.

**--color** _when_
> Control colored output (auto, always, never).

**--config** _KEY=VALUE_
> Override a Cargo configuration value.

# TOKEN STORAGE

**Default location**
> ~/.cargo/credentials.toml

**Format**
```toml
[registry]
token = "your-api-token"
```

# CREDENTIAL PROVIDERS

Configure in ~/.cargo/config.toml:

```toml
[registry]
global-credential-providers = [
    "cargo:token",
    "cargo:libsecret",
    "cargo:macos-keychain",
    "cargo:wincred"
]
```

# ENVIRONMENT

**CARGO_REGISTRIES_<NAME>_TOKEN**
> Token via environment variable

**CARGO_REGISTRY_TOKEN**
> Default registry token

# CAVEATS

Keep tokens secret. The cargo:token provider stores tokens unencrypted. For enhanced security, use system keychain providers.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-publish](/man/cargo-publish)(1), [cargo-logout](/man/cargo-logout)(1)
