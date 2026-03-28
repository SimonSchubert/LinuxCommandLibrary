# TAGLINE

compiler cache for faster recompilation

# TLDR

**Show cache statistics**

```ccache -s```

**Show verbose cache statistics** including hit rates

```ccache -sv```

**Clear the cache**

```ccache -C```

**Set maximum cache size**

```ccache -M [5G]```

**Show current configuration**

```ccache -p```

**Zero statistics counters**

```ccache -z```

**Run compiler through ccache**

```ccache [gcc] -c [file.c]```

**Set a configuration value**

```ccache -o [max_size=10G]```

**Show the cache directory path**

```ccache -k cache_dir```

# SYNOPSIS

**ccache** [_options_]

**ccache** _compiler_ [_compiler_options_]

# DESCRIPTION

**ccache** is a compiler cache that speeds up recompilation by caching previous compilations. When the same compilation is detected, it returns the cached result instead of recompiling.

Supports GCC, Clang, MSVC and similar compilers for C, C++, Objective-C, CUDA, and assembler.

# PARAMETERS

**-s**, **--show-stats**
> Show cache statistics summary.

**-sv**
> Show verbose statistics including hit/miss details.

**-z**, **--zero-stats**
> Zero statistics counters.

**-C**, **--clear**
> Clear entire cache.

**-M**, **--max-size** _size_
> Set maximum cache size (e.g., 5G, 500M).

**-F**, **--max-files** _count_
> Set maximum number of files in the cache.

**-p**, **--show-config**
> Show current configuration with origins.

**-k**, **--get-config** _key_
> Get a single configuration value.

**-o**, **--set-config** _key=value_
> Set a configuration value persistently.

**-d**, **--directory** _path_
> Operate on specified cache directory instead of the default.

**--cleanup**
> Clean up cache to stay within size limit.

**--evict-older-than** _age_
> Remove files older than given age (e.g., 30d, 24h).

**-V**, **--version**
> Show version.

# SETUP

**Symlink method:**
```
ln -s /usr/bin/ccache /usr/local/bin/gcc
ln -s /usr/bin/ccache /usr/local/bin/g++
```

**Environment variable:**
```
export CC="ccache gcc"
export CXX="ccache g++"
```

# CONFIGURATION

**~/.config/ccache/ccache.conf**
> Primary configuration file controlling cache size, compression, compiler settings, and remote storage.

**/etc/ccache.conf**
> System-wide configuration defaults.

# ENVIRONMENT

**CCACHE_DIR**
> Path to the cache directory (default: ~/.cache/ccache or ~/.ccache).

**CCACHE_CONFIGPATH**
> Path to the configuration file.

**CCACHE_MAXSIZE**
> Maximum cache size (overrides config file).

**CCACHE_DISABLE** / **CCACHE_NODISABLE**
> Disable or re-enable ccache.

# REMOTE CACHING

Supports remote caching via HTTP, Redis, or NFS for sharing across build machines.

# CAVEATS

Only caches single-file compilations. Multi-file compilation and linking fall back to the real compiler. Produces identical output to direct compilation. Precompiled headers require special configuration.

# SEE ALSO

[gcc](/man/gcc)(1), [clang](/man/clang)(1), [make](/man/make)(1), [distcc](/man/distcc)(1), [sccache](/man/sccache)(1), [cmake](/man/cmake)(1)
