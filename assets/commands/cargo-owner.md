# TLDR

**List crate owners**

```cargo owner --list [crate_name]```

**Add owner by username**

```cargo owner --add [username] [crate_name]```

**Remove owner**

```cargo owner --remove [username] [crate_name]```

**Add GitHub team as owner**

```cargo owner --add github:[org]:[team] [crate_name]```

# SYNOPSIS

**cargo owner** [_options_] [_crate_]

# DESCRIPTION

**cargo owner** manages owners of a crate on crates.io. Owners can publish versions, yank releases, and manage other owners. Requires authentication.

# PARAMETERS

**-a**, **--add** _login_
> Add user or team as owner

**-r**, **--remove** _login_
> Remove user or team as owner

**-l**, **--list**
> List current owners

**--registry** _name_
> Registry to use

**--index** _url_
> Registry index URL

**--token** _token_
> API token for authentication

**-v**, **--verbose**
> Verbose output

**-q**, **--quiet**
> Suppress output

# OWNER TYPES

**Named owners (users)**
> Full rights: publish, yank, add/remove owners

**Team owners**
> Limited rights: publish and yank only

# TEAM SYNTAX

```
github:organization:team-name
```

Must be a member of the team to add it.

# ENVIRONMENT

**CARGO_REGISTRY_TOKEN**
> API token for authentication

# CAVEATS

Only existing owners can modify ownership. Users must have logged into crates.io. Teams cannot add or remove other owners.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-publish](/man/cargo-publish)(1), [cargo-login](/man/cargo-login)(1)
