# TLDR

**List all installed packages**

```brew list```

**List installed formulae only**

```brew list --formula```

**List installed casks only**

```brew list --cask```

**List with versions**

```brew list --versions```

**Check if specific package is installed**

```brew list [package]```

**List with verbose file information**

```brew list --verbose [package]```

**List top-level packages (not dependencies)**

```brew leaves```

# SYNOPSIS

**brew list** [_options_] [_formula|cask_]

# DESCRIPTION

**brew list** displays all installed formulae and casks. Without arguments, it lists all packages. With a package name, it shows the installed files for that package.

Aliases: **brew ls**

# PARAMETERS

**--formula**
> List installed formulae only

**--cask**
> List installed casks only

**--versions**
> Show version numbers alongside packages

**--verbose**
> Display installed files for each package

**--pinned**
> List pinned formulae only

**--multiple**
> List packages with multiple versions

**-1**
> Force output to one entry per line

**-l**
> List files in long format

**-r**
> Reverse sort order

**-t**
> Sort by modification time

# RELATED COMMANDS

**brew leaves**
> Show top-level packages that are not dependencies

**brew deps --tree --installed**
> Show installed packages with dependency tree

# CAVEATS

Output format varies based on terminal capabilities and flags. Use --versions to distinguish between multiple installed versions of the same package.

# SEE ALSO

[brew](/man/brew)(1), [brew-info](/man/brew-info)(1), [brew-outdated](/man/brew-outdated)(1), [brew-leaves](/man/brew-leaves)(1)
