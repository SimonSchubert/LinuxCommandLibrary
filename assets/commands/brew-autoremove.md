# TLDR

**Remove unused dependencies**

```brew autoremove```

**Preview what would be removed**

```brew autoremove --dry-run```

# SYNOPSIS

**brew autoremove** [_options_]

# DESCRIPTION

**brew autoremove** uninstalls formulae that were only installed as dependencies and are no longer needed by any installed formula. It cleans up orphaned dependencies left behind after uninstalling packages.

# PARAMETERS

**--dry-run, -n**
> List what would be removed without removing

# HOW IT WORKS

When you install a package like **git**, dependencies (gettext, pcre2) are installed automatically. When you uninstall **git**, those dependencies remain. Running **brew autoremove** removes these orphaned dependencies.

# EXAMPLE WORKFLOW

```
brew uninstall git          # Remove package
brew autoremove             # Clean up dependencies
brew cleanup                # Remove cached downloads
```

# PREVENTING REMOVAL

To prevent a formula from being removed by autoremove, mark it as "installed on request":

```brew install formula```

This changes the formula's status from dependency to explicitly installed.

# RELATED COMMANDS

**brew leaves**
> Show top-level packages (not dependencies)

**brew deps --installed**
> Show dependency tree

**brew cleanup**
> Remove cached downloads and old versions

# CAVEATS

Only removes formulae installed as dependencies, not those explicitly installed. Safe to run regularly after uninstalling packages. Does not remove casks.

# SEE ALSO

[brew](/man/brew)(1), [brew-uninstall](/man/brew-uninstall)(1), [brew-cleanup](/man/brew-cleanup)(1), [brew-leaves](/man/brew-leaves)(1)
