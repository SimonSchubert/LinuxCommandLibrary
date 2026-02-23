# TAGLINE

Manage Bun's global package cache

# TLDR

**Print** the path to Bun's global module cache

```bun pm cache```

**Clear** the entire global module cache

```bun pm cache rm```

# SYNOPSIS

**bun pm cache** [**rm**]

# DESCRIPTION

**bun pm cache** manages Bun's global module cache directory where all packages downloaded from npm registries are stored. Running without arguments prints the absolute path to the cache directory. The **rm** subcommand deletes the entire cache contents.

The default cache location is **~/.bun/install/cache**, where packages are stored in subdirectories named **\${name}@\${version}**. When **bun install** runs, it checks this global cache first and uses cached copies via hardlink, clonefile, or copy instead of fetching from the network.

The cache location can be overridden via the **BUN_INSTALL_CACHE_DIR** environment variable or the **[install.cache]** section in **bunfig.toml**.

# CONFIGURATION

Cache settings in **bunfig.toml**

```
[install.cache]
dir = "~/.bun/install/cache"
disable = false
disableManifest = false
```

**dir** sets a custom cache directory. **disable** prevents loading from global cache. **disableManifest** forces resolving latest versions from the registry.

# CAVEATS

There is no selective cache clearing; **bun pm cache rm** is all-or-nothing and removes the entire global cache. To remove a specific package, manually delete its directory under **~/.bun/install/cache/\<package\>@\<version\>**. The command historically required being run inside a directory containing a **package.json**, even though it operates on the global cache.

# SEE ALSO

[bun](/man/bun)(1), [bun-pm-trust](/man/bun-pm-trust)(1), [npm-cache](/man/npm-cache)(1)
