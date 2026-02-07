# TAGLINE

Manage crate owners on a registry

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

**cargo owner** manages the owners of a crate on crates.io or another registry. Owners have the ability to publish new versions, yank existing releases, and add or remove other owners. All ownership modifications require authentication via an API token.

There are two types of owners: named users and teams. Named users have full rights including managing other owners, while teams can only publish and yank versions. GitHub teams can be added as owners using the `github:org:team` syntax, but only by a member of that team.

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

# CONFIGURATION

**~/.cargo/credentials.toml**
> Stores API tokens for registry authentication. Created by `cargo login`.

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
