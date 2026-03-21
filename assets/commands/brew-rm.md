# TAGLINE

Remove an installed Homebrew package

# TLDR

**Remove a formula**

```brew rm [formula]```

**Remove a cask**

```brew rm --cask [cask]```

**Force removal** of all installed versions

```brew rm --force [formula]```

**Remove with zap** (thorough cask removal including preferences and caches)

```brew rm --zap --cask [cask]```

**Remove multiple formulae**

```brew rm [formula1] [formula2] [formula3]```

**Dry run** to see what would be removed

```brew rm --dry-run [formula]```

# SYNOPSIS

**brew** **rm** [_options_] _formula_|_cask_ [...]

# PARAMETERS

**--cask**
> Treat all named arguments as casks.

**--formula**
> Treat all named arguments as formulae.

**-f**, **--force**
> Delete all installed versions of a formula. For casks, also remove even if the cask is not installed.

**--zap**
> Remove all files associated with a cask, including preferences, caches, and other shared resources. Use with caution.

**--ignore-dependencies**
> Do not fail uninstall even if dependent formulae still exist.

**-n**, **--dry-run**
> Show what would be removed without actually removing anything.

**-d**, **--debug**
> Display any debugging information.

**-v**, **--verbose**
> Make some output more verbose.

# DESCRIPTION

**brew rm** is an alias for **brew uninstall** and **brew remove**. It uninstalls a formula or cask from the system.

All three commands (**rm**, **remove**, **uninstall**) are functionally identical. Removing a formula does not automatically remove its unused dependencies; use **brew autoremove** to clean those up.

# CAVEATS

Removing a formula that other installed formulae depend on will fail unless **--ignore-dependencies** is used. The **--zap** option may remove shared resources used by other applications. Keg-only formulae unlinked from the prefix are still removed.

# SEE ALSO

[brew](/man/brew)(1), [brew-remove](/man/brew-remove)(1), [brew-uninstall](/man/brew-uninstall)(1), [brew-autoremove](/man/brew-autoremove)(1), [brew-install](/man/brew-install)(1), [brew-cleanup](/man/brew-cleanup)(1)
