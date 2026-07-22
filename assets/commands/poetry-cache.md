# TAGLINE

Manage Poetry's package download cache

# TLDR

**Show cache directory path**

```poetry cache list```

**Clear cache for specific package**

```poetry cache clear [cache_name] --all```

**Clear PyPI cache**

```poetry cache clear pypi --all```

# SYNOPSIS

**poetry** **cache** _command_ [_options_]

# PARAMETERS

**list**
> Show cached packages per repository.

**clear** _cache_
> Clear a specific cache.

**--all**
> Clear all entries in cache.

# DESCRIPTION

**poetry cache** manages Poetry's package cache. Poetry caches downloaded packages to speed up subsequent installations. Use this to view cache contents or clear space.

# INSTALL

```dnf: sudo dnf install poetry```

```apk: sudo apk add poetry```

```brew: brew install poetry```

```nix: nix profile install nixpkgs#poetry```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-install](/man/poetry-install)(1)

