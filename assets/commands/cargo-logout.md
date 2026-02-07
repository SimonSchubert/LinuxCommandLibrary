# TAGLINE

Remove a saved registry API token

# TLDR

**Logout from crates.io**

```cargo logout```

**Logout from specific registry**

```cargo logout --registry [my-registry]```

# SYNOPSIS

**cargo logout** [_options_]

# DESCRIPTION

**cargo logout** removes the API token for a registry from local storage. This revokes the token saved by cargo login.

# PARAMETERS

**--registry** _name_
> Registry to logout from (default: crates-io)

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress output

# BEHAVIOR

Removes the token entry from ~/.cargo/credentials.toml for the specified registry. Does not revoke the token on the server side.

# CAVEATS

To fully revoke access, also regenerate the token on the registry website (e.g., https://crates.io/me for crates.io). Only removes local credentials.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-login](/man/cargo-login)(1), [cargo-publish](/man/cargo-publish)(1)
