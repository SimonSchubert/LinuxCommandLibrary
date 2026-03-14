# TAGLINE

Manage uv's package download and build cache

# TLDR

**Show the cache directory** location

```uv cache dir```

**Remove all cached data**

```uv cache clean```

**Remove cached data** for a specific package

```uv cache clean [requests]```

**Remove unused cache entries** (outdated/orphaned)

```uv cache prune```

**Remove all unzipped cache data** while keeping downloads

```uv cache prune --ci```

# SYNOPSIS

**uv cache** _command_ [_options_]

# PARAMETERS

**dir**
> Display the path to the cache directory.

**clean** [_package_]
> Remove all cached data, or data for a specific package if specified.

**prune**
> Remove unused cache entries that are no longer needed by any project.

**--ci**
> Used with prune to remove all unzipped source distributions and pre-built archives, optimizing for CI environments where only the compressed archives are needed.

# DESCRIPTION

**uv cache** manages uv's package cache, which stores downloaded distributions, built wheels, and source archives. The cache significantly speeds up subsequent installations by avoiding redundant downloads and builds.

The default cache location is **$XDG_CACHE_HOME/uv** or **~/.cache/uv** on Linux, **~/Library/Caches/uv** on macOS, and **%LOCALAPPDATA%\uv\cache** on Windows. This can be overridden with the **UV_CACHE_DIR** environment variable or the **--cache-dir** global option.

# CAVEATS

Pruning removes only entries not referenced by any project lockfile in the cache metadata. Use `clean` for a full reset if cache corruption is suspected. The cache can grow large in CI environments; use `prune --ci` to minimize disk usage.

# SEE ALSO

[uv](/man/uv)(1), [uv-pip](/man/uv-pip)(1), [pip-cache](/man/pip-cache)(1)