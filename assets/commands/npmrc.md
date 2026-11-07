# TAGLINE

npm configuration file

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

**Read an auth token from an environment variable**

```//registry.npmjs.org/:_authToken=${NPM_TOKEN}```

**Ignore peer dependency conflicts**

```legacy-peer-deps=true```

**Edit the user config in your editor**

```npm config edit```

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

**engine-strict**
> Refuse to install packages whose **engines** field does not match the running Node.js version.

**legacy-peer-deps**
> Ignore peer dependency conflicts (npm 6 behavior).

**fund**, **audit**
> Show funding messages / run security audit on install (both default true).

**cache**
> Cache directory (default ~/.npm).

**//registry/:_authToken**
> Registry auth token.

**@scope:registry**
> Scope-specific registry.

# DESCRIPTION

**.npmrc** files configure npm behavior using **key=value** lines in ini format. They can exist at project, user, global and built-in level; settings cascade, with the project file taking precedence. Command-line flags (**--key=value**) and **npm_config_*** environment variables override all files.

Values may reference environment variables with **${VAR}** (optionally **${VAR?}** to substitute an empty string when unset). Lines starting with **#** or **;** are comments. Arrays are written as **key[]=value**.

# FILE LOCATIONS

```
/path/to/project/.npmrc   # Project (next to package.json)
~/.npmrc                  # User (--userconfig, NPM_CONFIG_USERCONFIG)
$PREFIX/etc/npmrc         # Global (--globalconfig)
/path/to/npm/npmrc        # Built-in, shipped with npm itself
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

Don't commit auth tokens; use **${NPM_TOKEN}** style references instead. Auth settings must be scoped to a registry URL (**//host/:_authToken**); unscoped **_authToken** is rejected by npm 9+.

# SEE ALSO

[npm](/man/npm)(1), [npm-config](/man/npm-config)(1), [npm-login](/man/npm-login)(1)

# RESOURCES

```[Source code](https://github.com/npm/cli)```

```[Documentation](https://docs.npmjs.com/cli/configuring-npm/npmrc)```

<!-- verified: 2026-11-07 -->
