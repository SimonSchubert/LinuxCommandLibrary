# TLDR

**Login to npm registry**

```npm login```

**Login to specific registry**

```npm login --registry=[https://registry.example.com]```

**Login with scope**

```npm login --scope=@[myorg]```

**Check login status**

```npm whoami```

**Logout**

```npm logout```

# SYNOPSIS

**npm login** [_options_]

# PARAMETERS

**--registry** _url_
> Registry URL.

**--scope** _scope_
> Associate login with scope.

**--auth-type** _type_
> Authentication type.

# DESCRIPTION

**npm login** (also npm adduser) authenticates with an npm registry. Credentials are stored in ~/.npmrc and used for publishing and accessing private packages.

For npm.js, this enables publishing packages and accessing private organization packages.

# AUTHENTICATION FLOW

```bash
# Standard login
npm login
# Enter username, password, email, OTP if enabled

# Verify
npm whoami
# Output: your-username

# View token
npm token list
```

# NPMRC LOCATIONS

```
~/.npmrc           # User config
./.npmrc           # Project config
/etc/npmrc         # Global config
```

# CAVEATS

Tokens stored in plaintext in .npmrc. Use npm token for token management. 2FA may be required.

# HISTORY

npm login has been part of npm since its early versions, evolving to support 2FA and multiple registries.

# SEE ALSO

[npm](/man/npm)(1), [npm-publish](/man/npm-publish)(1), [npm-whoami](/man/npm-whoami)(1), [npm-token](/man/npm-token)(1)
