# TAGLINE

creates or verifies a user account in the npm registry

# TLDR

**Login to npm registry**

```npm adduser```

**Login to specific registry**

```npm adduser --registry [https://registry.example.com]```

**Login with specific scope**

```npm adduser --scope @[myorg]```

# SYNOPSIS

**npm** **adduser** [_options_]

# PARAMETERS

**--registry** _url_
> Registry to authenticate with.

**--scope** _scope_
> Associate with scope.

**--auth-type** _type_
> Authentication type.

# DESCRIPTION

**npm adduser** creates or verifies a user account in the npm registry. Prompts for username, password, and email. Stores credentials in ~/.npmrc. Alias for npm login.

# SEE ALSO

[npm](/man/npm)(1), [npm-logout](/man/npm-logout)(1)

