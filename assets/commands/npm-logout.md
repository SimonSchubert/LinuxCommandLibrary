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

**npm logout** invalidates and removes the authentication token for the configured registry. For tokens issued by **npm login**, the registry is also notified to revoke the token server-side. The local **.npmrc** entry for the registry is then deleted.

When the configured auth was a legacy username/password (basic auth), only the local credential is removed — there is nothing to revoke on the server.

# CAVEATS

Operates on a single registry at a time; pass **--registry** or **--scope** to log out of a non-default registry. Subsequent **npm publish** or **npm install** of private packages will fail until you log in again. Tokens stored manually in **.npmrc** (e.g., `_authToken=...`) without a matching server-side credential will be removed locally but cannot be revoked.

# HISTORY

npm logout provides **authentication management** for npm registry access.

# INSTALL

```pacman: sudo pacman -S npm```

```apk: sudo apk add npm```

```brew: brew install npm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[npm](/man/npm)(1), [npm-login](/man/npm-login)(1), [npm-whoami](/man/npm-whoami)(1)

