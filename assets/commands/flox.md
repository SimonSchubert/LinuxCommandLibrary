# TLDR

**Initialize environment**

```flox init```

**Install package**

```flox install [ripgrep]```

**Activate environment**

```flox activate```

**Search for packages**

```flox search [nodejs]```

**List installed packages**

```flox list```

# SYNOPSIS

**flox** _command_ [_options_] [_arguments_]

# PARAMETERS

_COMMAND_
> Operation: init, install, activate, search, list, etc.

**init**
> Initialize new environment.

**install** _PACKAGES_
> Install packages.

**activate**
> Enter environment shell.

**search** _QUERY_
> Search for packages.

**list**
> Show installed packages.

**uninstall** _PACKAGES_
> Remove packages.

**push**
> Publish environment.

**--help**
> Display help information.

# DESCRIPTION

**flox** is a virtual environment manager built on Nix. It creates reproducible development environments with declarative package management, shareable across machines and teams.

Environments are defined in a manifest file and can be pushed to FloxHub for sharing. Unlike traditional virtual environments, flox handles any language or tool from the Nix package collection.

flox simplifies Nix's complexity while preserving its reproducibility guarantees.

# CAVEATS

Requires Nix installation. Large initial downloads for Nix store. Some packages may not be available.

# HISTORY

flox was created to make **Nix** accessible to mainstream developers. It provides familiar virtual environment workflows backed by Nix's reproducible package management.

# SEE ALSO

[nix](/man/nix)(1), [direnv](/man/direnv)(1), [devbox](/man/devbox)(1)
