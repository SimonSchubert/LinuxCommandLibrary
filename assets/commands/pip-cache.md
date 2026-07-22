# TAGLINE

Inspect and manage pip's wheel cache

# TLDR

**Show cache directory**

```pip cache dir```

**List cached packages**

```pip cache list```

**Show cache info**

```pip cache info```

**Remove specific package from cache**

```pip cache remove [package]```

**Clear all cache**

```pip cache purge```

# SYNOPSIS

**pip** **cache** _command_ [_options_]

# PARAMETERS

**dir**
> Print the cache directory path.

**info**
> Show cache size and location.

**list** [_pattern_]
> List wheels currently in the cache, optionally filtered by glob _pattern_ or package name.

**remove** _pattern_
> Remove cached wheels matching _pattern_ (glob or package name).

**purge**
> Remove every wheel and HTTP response from the cache.

**--format** _FORMAT_
> Output format for **list**: **human** (default) or **abspath** (full file paths). Also configurable via **PIP_FORMAT**.

# DESCRIPTION

**pip cache** manages pip's HTTP-response cache and built-wheel cache. Pip stores downloaded and locally built wheels under a per-user cache directory (e.g. **~/.cache/pip** on Linux, **~/Library/Caches/pip** on macOS, **%LocalAppData%\pip\Cache** on Windows) so that subsequent installs of the same version can skip the network round-trip and the build step.

To bypass the cache for a single install, use **pip install --no-cache-dir** _pkg_; to override the cache location, set the **PIP_CACHE_DIR** environment variable or pass **pip --cache-dir** _DIR_.

# CAVEATS

**pip cache list** and **remove** only operate on the wheel cache, not the HTTP response cache. **purge** clears both. The HTTP cache uses ETag/Last-Modified validation, so safely removable at any time.

# INSTALL

```apk: sudo apk add py3-pip```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pip](/man/pip)(1), [pip-install](/man/pip-install)(1)

