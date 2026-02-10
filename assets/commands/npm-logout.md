# TAGLINE

removes authentication token

# TLDR

**Logout from npm**

```npm logout```

**Logout from specific registry**

```npm logout --registry=[https://registry.example.com]```

**Logout from scope**

```npm logout --scope=[@myorg]```

# SYNOPSIS

**npm** **logout** [_options_]

# PARAMETERS

**--registry** _URL_
> Registry to logout from.

**--scope** _SCOPE_
> Scoped registry.

**--help**
> Display help information.

# DESCRIPTION

**npm logout** removes authentication token. Logs out from npm registry.

The command clears credentials. Affects specified registry or default.

# CAVEATS

Removes token from .npmrc. Per-registry logout. Affects publishing.

# HISTORY

npm logout provides **authentication management** for npm registry access.

# SEE ALSO

[npm](/man/npm)(1), [npm-login](/man/npm-login)(1), [npm-whoami](/man/npm-whoami)(1)

