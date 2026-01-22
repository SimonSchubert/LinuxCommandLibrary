# TLDR

**Login to crates.io**

```cargo login```

**Login with token directly**

```cargo login [token]```

**Login to specific registry**

```cargo login --registry [my-registry]```

# SYNOPSIS

**cargo login** [_options_] [_token_]

# DESCRIPTION

**cargo login** saves an API token for registry authentication. Required for publishing crates with cargo publish. Tokens are stored in $CARGO_HOME/credentials.toml.

For crates.io, obtain your token from https://crates.io/me

# PARAMETERS

**--registry** _name_
> Registry to authenticate with (default: crates-io)

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress output

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
