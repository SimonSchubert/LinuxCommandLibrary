# TLDR

**Uninstall a formula**

```brew uninstall [formula]```

**Uninstall a cask**

```brew uninstall --cask [cask]```

**Force remove all versions**

```brew uninstall --force [formula]```

**Uninstall ignoring dependencies**

```brew uninstall --ignore-dependencies [formula]```

**Remove with zapping additional files**

```brew uninstall --zap [cask]```

# SYNOPSIS

**brew uninstall** [_options_] _formula|cask_ ...

# DESCRIPTION

**brew uninstall** removes an installed formula or cask. It checks Homebrew's database to locate the package and removes it along with associated files.

Aliases: **brew remove**, **brew rm**

# PARAMETERS

**--force, -f**
> Force removal, delete all versions of the formula

**--ignore-dependencies**
> Don't fail even if formula is a dependency of other packages

**--formula**
> Treat all arguments as formulae

**--cask**
> Treat all arguments as casks

**--zap**
> Remove all files associated with cask (including preferences)

# RELATED COMMANDS

**brew autoremove**
> Remove unused dependencies after uninstall

**brew deps** _formula_
> Check dependencies before uninstalling

**brew uses** _formula_
> Check what depends on a formula

# CLEANUP

After uninstalling, run **brew autoremove** to remove dependencies that are no longer needed by any installed package.

# CAVEATS

Cannot uninstall packages not managed by Homebrew. Use --force carefully as it removes all versions. Check dependencies with **brew uses** before removing to avoid breaking other packages.

# SEE ALSO

[brew](/man/brew)(1), [brew-install](/man/brew-install)(1), [brew-autoremove](/man/brew-autoremove)(1), [brew-deps](/man/brew-deps)(1)
