# TAGLINE

manages access levels for published packages on the npm registry

# TLDR

**Set package to public**

```npm access public [package]```

**Set package to restricted**

```npm access restricted [package]```

**Grant read-only access**

```npm access grant read-only [scope:team] [package]```

**Grant read-write access**

```npm access grant read-write [scope:team] [package]```

**Revoke access**

```npm access revoke [scope:team] [package]```

**List package permissions**

```npm access ls-packages [scope:team]```

# SYNOPSIS

**npm access** _command_ [_options_]

# PARAMETERS

**public**
> Make package public.

**restricted**
> Make package private.

**grant** _level_
> Grant team access.

**revoke**
> Remove team access.

**ls-packages**
> List packages for user/team.

**ls-collaborators**
> List package collaborators.

# DESCRIPTION

**npm access** manages access levels for published packages on the npm registry. It controls whether packages are public or private and manages team permissions.

This command is relevant for npm organizations and scoped packages.
# Make scoped package public
npm access public @myorg/mypackage

# Grant team access
npm access grant read-write @myorg:developers @myorg/mypackage

# List collaborators
npm access ls-collaborators @myorg/mypackage
```

# CAVEATS

Requires authentication. Private packages need paid npm account. Scoped packages default to restricted.

# HISTORY

npm access was added to support npm Organizations and private packages, enabling team-based access control.

# SEE ALSO

[npm](/man/npm)(1), [npm-publish](/man/npm-publish)(1), [npm-owner](/man/npm-owner)(1)
