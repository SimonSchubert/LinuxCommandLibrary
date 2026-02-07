# TAGLINE

Install packages via Homebrew

# TLDR

**Install a formula**

```brew install [formula]```

**Install a cask**

```brew install --cask [cask]```

**Install without upgrading existing version**

```HOMEBREW_NO_INSTALL_UPGRADE=1 brew install [formula]```

**Install with debug session on failure**

```brew install --debug [formula]```

**Force install without checking existing versions**

```brew install --force [formula]```

**Install and display install times**

```brew install --display-times [formula]```

# SYNOPSIS

**brew install** [_options_] _formula|cask_ ...

# DESCRIPTION

**brew install** installs a formula or cask. If the formula is already installed but outdated, it will be upgraded unless HOMEBREW_NO_INSTALL_UPGRADE is set.

After installation, cleanup runs automatically for installed formulae or every 30 days for all formulae unless HOMEBREW_NO_INSTALL_CLEANUP is set.

# PARAMETERS

**--cask**
> Treat all arguments as casks

**--formula**
> Treat all arguments as formulae

**--force**
> Install without checking for previously installed keg-only or non-migrated versions

**--debug**
> Open interactive debugging session if brewing fails

**--display-times**
> Print install times for each package

**--verbose**
> Print detailed build information

**--build-from-source**
> Compile formula from source instead of using bottle

**--force-bottle**
> Install from bottle even if it would not normally be used

**--include-test**
> Install test dependencies

# ENVIRONMENT

**HOMEBREW_NO_INSTALL_UPGRADE**
> Prevent automatic upgrade of outdated formulae

**HOMEBREW_NO_INSTALL_CLEANUP**
> Prevent automatic cleanup after installation

**HOMEBREW_NO_INSTALLED_DEPENDENTS_CHECK**
> Skip checking outdated dependents

# CAVEATS

Formula-specific options can be appended to the command. Bottles (precompiled binaries) are used when available. Building from source requires Xcode Command Line Tools on macOS.

# SEE ALSO

[brew](/man/brew)(1), [brew-uninstall](/man/brew-uninstall)(1), [brew-upgrade](/man/brew-upgrade)(1), [brew-info](/man/brew-info)(1)
