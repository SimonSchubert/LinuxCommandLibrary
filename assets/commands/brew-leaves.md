# TLDR

**List top-level packages (not dependencies)**

```brew leaves```

**List only manually installed leaves**

```brew leaves -r```

**List only dependency-installed leaves**

```brew leaves -p```

**Show dependency tree of leaves**

```brew deps --tree $(brew leaves)```

# SYNOPSIS

**brew leaves** [_options_]

# DESCRIPTION

**brew leaves** lists installed formulae that are not dependencies of any other installed formula or cask. These are your "top-level" packages that you explicitly installed.

This command shows the leaves of Homebrew's dependency graph - packages that can be safely uninstalled without breaking other packages.

# PARAMETERS

**-r, --installed-on-request**
> Only list leaves that were manually installed

**-p, --installed-as-dependency**
> Only list leaves that were installed as dependencies

# USE CASES

**Audit installations**
> Identify what you explicitly chose to install

**Find removable packages**
> Leaves can typically be safely uninstalled

**Backup core packages**
> Export list for recreating environment

**Understand environment**
> See core components of development setup

# RELATED COMMANDS

**brew list**
> Shows all installed packages including dependencies

**brew autoremove --dry-run**
> Lists packages that are no longer needed

**brew deps --tree $(brew leaves)**
> Shows dependency tree of your leaves

# CAVEATS

Not the same as "manually installed" - shows packages with no dependents. A manually installed package might have dependents and won't appear. Use -r flag for truly manual installations.

# SEE ALSO

[brew](/man/brew)(1), [brew-list](/man/brew-list)(1), [brew-deps](/man/brew-deps)(1), [brew-autoremove](/man/brew-autoremove)(1)
