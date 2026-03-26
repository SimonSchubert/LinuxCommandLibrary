# TAGLINE

manages Angular CLI persistent disk cache

# TLDR

**Enable cache**

```ng cache enable```

**Disable cache**

```ng cache disable```

**Delete all cached build artifacts from disk**

```ng cache clean```

**Print cache configuration and statistics**

```ng cache info```

**Enable caching in all environments, including CI**

```ng config cli.cache.environment all```

**Change the cache storage path**

```ng config cli.cache.path ".cache/ng"```

# SYNOPSIS

**ng cache** _command_ [_options_]

# PARAMETERS

**enable**, **on**
> Enables persistent disk cache for all projects in the workspace.

**disable**, **off**
> Disables persistent disk cache for all projects in the workspace.

**clean**
> Deletes persistent disk cache from disk.

**info**
> Prints persistent disk cache configuration and statistics.

# DESCRIPTION

**ng cache** manages the Angular CLI's persistent disk cache. The cache stores the results of cachable operations, allowing subsequent builds to reuse those results and significantly decrease build times.

Cache is **enabled by default** for local development machines. It is disabled in CI environments by default (detected via the **CI** environment variable).

Cache behaviour can be further configured in **angular.json** under `cli.cache`:

- **enabled** — whether the cache is active
- **environment** — where caching applies: `local` (default), `ci`, or `all`
- **path** — directory used to store cache files (default: `.angular/cache`)

# SEE ALSO

[ng](/man/ng)(1), [ng-build](/man/ng-build)(1), [ng-config](/man/ng-config)(1)

