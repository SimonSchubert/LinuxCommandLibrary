# TAGLINE

Uninstall and reinstall a Homebrew package

# TLDR

**Reinstall a formula**

```brew reinstall [formula]```

**Reinstall a cask**

```brew reinstall --cask [cask]```

**Reinstall with debug output**

```brew reinstall --debug [formula]```

**Reinstall and build from source**

```brew reinstall --build-from-source [formula]```

**Reinstall without quarantine** (casks only)

```brew reinstall --no-quarantine [cask]```

**Reinstall interactively**

```brew reinstall --interactive [formula]```

# SYNOPSIS

**brew** **reinstall** [_options_] _formula_|_cask_ [...]

# PARAMETERS

**--cask**
> Treat all named arguments as casks.

**--formula**
> Treat all named arguments as formulae.

**--build-from-source** **-s**
> Compile formula from source even if a bottle exists.

**--debug** **-d**
> Enable debugging mode during installation.

**--interactive** **-i**
> Open an interactive shell for debugging the build.

**--no-quarantine**
> Disable macOS quarantine for casks.

**--force**
> Install without checking for previously installed versions.

**--verbose** **-v**
> Print detailed installation output.

# DESCRIPTION

**brew reinstall** uninstalls and then installs a formula or cask. This is useful for fixing broken installations, applying new build options, or refreshing a package to its current version.

The command preserves configuration files when reinstalling formulas that have linked kegs.

# CAVEATS

Reinstalling may interrupt services that depend on the formula. Running applications from reinstalled casks may need to be restarted.

# SEE ALSO

[brew](/man/brew)(1), [brew-install](/man/brew-install)(1), [brew-uninstall](/man/brew-uninstall)(1)
