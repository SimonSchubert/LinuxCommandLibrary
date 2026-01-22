# TLDR

**Upgrade all installed formulae and casks**

```brew upgrade```

**Upgrade specific formula**

```brew upgrade [formula]```

**Upgrade specific cask**

```brew upgrade --cask [cask]```

**Upgrade with verbose output**

```brew upgrade --verbose [formula]```

**Upgrade and display install times**

```brew upgrade --display-times```

**Dry run showing what would be upgraded**

```brew upgrade --dry-run```

# SYNOPSIS

**brew upgrade** [_options_] [_formula|cask_] ...

# DESCRIPTION

**brew upgrade** upgrades outdated formulae and casks. Without arguments, it upgrades all installed packages. With arguments, it upgrades only the specified packages.

The command also handles outdated dependents and dependents with broken linkage automatically.

# PARAMETERS

**--cask**
> Treat all arguments as casks

**--formula**
> Treat all arguments as formulae

**--dry-run**
> Show what would be upgraded without upgrading

**--verbose**
> Print detailed upgrade information

**--display-times**
> Print upgrade times for each package

**--force**
> Upgrade even if no newer version is available

**--greedy**
> Also upgrade casks with auto_updates or version :latest

**--fetch-HEAD**
> Fetch upstream repository for HEAD installations

# ENVIRONMENT

**HOMEBREW_NO_INSTALLED_DEPENDENTS_CHECK**
> Skip upgrading outdated dependents

**HOMEBREW_NO_INSTALL_CLEANUP**
> Skip automatic cleanup after upgrade

# CAVEATS

Cask upgrades may use uninstall/reinstall or content replacement strategy. The content replacement strategy preserves macOS app permissions. Run brew update first to fetch the latest package definitions.

# SEE ALSO

[brew](/man/brew)(1), [brew-update](/man/brew-update)(1), [brew-outdated](/man/brew-outdated)(1), [brew-install](/man/brew-install)(1)
