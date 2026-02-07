# TAGLINE

compiler cache for faster recompilation

# TLDR

**Show cache statistics**

```ccache -s```

**Clear the cache**

```ccache -C```

**Set maximum cache size**

```ccache -M [5G]```

**Show configuration**

```ccache -p```

**Zero statistics**

```ccache -z```

**Run compiler through ccache**

```ccache [gcc] -c [file.c]```

**Show cache directory**

```ccache -k cache_dir```

# SYNOPSIS

**ccache** [_options_]

**ccache** _compiler_ [_compiler_options_]

# DESCRIPTION

**ccache** is a compiler cache that speeds up recompilation by caching previous compilations. When the same compilation is detected, it returns the cached result instead of recompiling.

Supports GCC, Clang, MSVC and similar compilers for C, C++, Objective-C, CUDA, and assembler.

# PARAMETERS

**-s**, **--show-stats**
> Show cache statistics

**-z**, **--zero-stats**
> Zero statistics counters

**-C**, **--clear**
> Clear entire cache

**-M**, **--max-size** _size_
> Set maximum cache size (e.g., 5G, 500M)

**-p**, **--show-config**
> Show current configuration

**-k**, **--get-config** _key_
> Get configuration value

**-o**, **--set-config** _key=value_
> Set configuration value

**--cleanup**
> Clean up cache to stay within size limit

**-V**, **--version**
> Show version

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

# REMOTE CACHING

Supports remote caching via HTTP, Redis, or NFS for sharing across build machines.

# CAVEATS

Only caches single-file compilations. Multi-file compilation and linking fall back to real compiler. Produces identical output to direct compilation.

# SEE ALSO

[gcc](/man/gcc)(1), [clang](/man/clang)(1), [make](/man/make)(1), [distcc](/man/distcc)(1)
