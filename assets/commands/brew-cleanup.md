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

**Scrub cache including latest versions**

```brew cleanup -s```

**Delete entire cache**

```rm -rf "$(brew --cache)"```

# SYNOPSIS

**brew cleanup** [_options_] [_formula|cask_]

# DESCRIPTION

**brew cleanup** removes old versions of installed formulae and casks, deletes cached downloads, and frees disk space. It cleans the Cellar and the download cache.

Homebrew automatically performs cleanup after upgrades and periodically every 30 days unless HOMEBREW_NO_INSTALL_CLEANUP is set.

# PARAMETERS

**--dry-run, -n**
> Show what would be removed without removing

**--prune** _days_
> Remove cache files older than specified days

**-s**
> Scrub cache, including downloads for latest versions

**--prune-prefix**
> Remove empty directories from Homebrew prefix

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
