# TAGLINE

Remove an installed Homebrew package

# TLDR

**Remove a formula**

```brew remove [formula]```

**Remove a cask**

```brew remove --cask [cask]```

**Remove all files associated with a cask** including preferences and caches

```brew remove --zap [cask]```

Remove **all installed versions** of a formula

```brew remove --force [formula]```

**Preview** what would be removed

```brew remove --dry-run [formula]```

**Remove even if **other formulae depend** on it**

```brew remove --ignore-dependencies [formula]```

# SYNOPSIS

**brew** **remove** [_options_] _formula_|_cask_ [...]

# PARAMETERS

**--cask**, **--casks**
> Treat all named arguments as casks.

**--formula**, **--formulae**
> Treat all named arguments as formulae.

**--force**, **-f**
> Delete all installed versions of a formula. For casks, uninstall even if not installed, overwrite existing files, and ignore errors.

**-n**, **--dry-run**
> Show what would be uninstalled and autoremoved, without removing anything.

**--zap**
> Remove all files associated with a cask. May remove files which are shared between applications.

**--ignore-dependencies**
> Do not fail uninstall if dependent formulae exist.

# DESCRIPTION

**brew remove** uninstalls a formula or cask. This is an alias for **brew uninstall**. It removes the installed files but preserves configuration files. Dependencies that are no longer needed are removed automatically unless **HOMEBREW_NO_AUTOREMOVE** is set.

For casks, use **--zap** to perform a more thorough removal including application preferences and caches.

# CAVEATS

Removing a formula that other formulae depend on will fail unless **--ignore-dependencies** is used. The **--zap** option for casks may remove user data and cannot be combined with **--formula**.

# SEE ALSO

[brew](/man/brew)(1), [brew-uninstall](/man/brew-uninstall)(1), [brew-rm](/man/brew-rm)(1), [brew-autoremove](/man/brew-autoremove)(1), [brew-cleanup](/man/brew-cleanup)(1)

# RESOURCES

```[Source code](https://github.com/Homebrew/brew)```

```[Homepage](https://brew.sh/)```

```[Documentation](https://docs.brew.sh/Manpage)```

<!-- verified: 2026-11-09 -->
