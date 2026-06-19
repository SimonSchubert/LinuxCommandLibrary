# TAGLINE

Remove outdated downloads and old package versions

# TLDR

**Remove outdated downloads and old versions**

```brew cleanup```

**Preview what would be removed**

```brew cleanup --dry-run```

**Clean specific formula**

```brew cleanup [formula]```

**Remove cache files older than specified days**

```brew cleanup --prune=[30]```

**Remove all cached downloads**

```brew cleanup --prune=all```

**Scrub cache including latest versions**

```brew cleanup -s```

**Delete entire cache**

```rm -rf "$(brew --cache)"```

# SYNOPSIS

**brew cleanup** [_options_] [_formula|cask_]

# DESCRIPTION

**brew cleanup** removes stale lock files and outdated downloads for formulae and casks, and removes old versions of installed formulae. It cleans the Cellar and the download cache, freeing disk space.

By default, downloads older than 120 days are removed. This threshold can be changed with HOMEBREW_CLEANUP_MAX_AGE_DAYS.

Homebrew automatically performs cleanup after upgrades and periodically every 30 days unless HOMEBREW_NO_INSTALL_CLEANUP is set.

# PARAMETERS

**--dry-run, -n**
> Show what would be removed without removing

**--prune** _days_
> Remove all cache files older than specified days. Use --prune=all to remove everything

**-s, --scrub**
> Scrub the cache, including downloads for even the latest versions

**--prune-prefix**
> Only prune the symlinks and directories from the prefix, removing no other files

**--formula**
> Treat all arguments as formulae

**--cask**
> Treat all arguments as casks

# CACHE LOCATION

Default cache location: **~/Library/Caches/Homebrew** (macOS)

View cache path: **brew --cache**

# RELATED COMMANDS

**brew autoremove**
> Remove unused dependencies

**brew upgrade**
> Should be followed by cleanup

# CAVEATS

Old versions are automatically removed during **brew upgrade**. The -s flag removes even current version downloads which may need re-downloading later. Running without arguments cleans all installed packages.

# SEE ALSO

[brew](/man/brew)(1), [brew-upgrade](/man/brew-upgrade)(1), [brew-autoremove](/man/brew-autoremove)(1)

# RESOURCES

```[Source code](https://github.com/Homebrew/brew)```

```[Homepage](https://brew.sh)```

```[Documentation](https://docs.brew.sh)```

<!-- verified: 2026-06-19 -->
