# TAGLINE

set registry

# TLDR

**Set registry**

```registry=https://registry.npmjs.org/```

**Set auth token**

```//registry.npmjs.org/:_authToken=[token]```

**Set scope registry**

```@myorg:registry=https://npm.myorg.com/```

**Save exact versions**

```save-exact=true```

**Set default license**

```init-license=MIT```

# SYNOPSIS

**.npmrc** - npm configuration file

# PARAMETERS

**registry**
> Default registry URL.

**save-exact**
> Save exact versions.

**save-prefix**
> Version prefix (^, ~).

**init-author-name**
> Default author.

**init-license**
> Default license.

**//registry/:_authToken**
> Registry auth token.

**@scope:registry**
> Scope-specific registry.

# DESCRIPTION

**.npmrc** files configure npm behavior. They can exist at project level, user level (~/.npmrc), or global level. Settings cascade with project taking precedence.

# FILE LOCATIONS

```
/path/to/project/.npmrc  # Project
~/.npmrc                  # User
$PREFIX/etc/npmrc         # Global
/etc/npmrc                # Built-in
```

# EXAMPLE CONFIG

```ini
# .npmrc
registry=https://registry.npmjs.org/
save-exact=true
@myorg:registry=https://npm.myorg.com/
//npm.myorg.com/:_authToken=${NPM_TOKEN}
```

# CAVEATS

Don't commit auth tokens. Use environment variables for secrets. Project .npmrc overrides user settings.

# SEE ALSO

[npm](/man/npm)(1), [npm-config](/man/npm-config)(1), [npm-login](/man/npm-login)(1)
