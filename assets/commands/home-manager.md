# TLDR

**Apply home configuration** from default location

```home-manager switch```

**Apply a specific flake** configuration

```home-manager switch --flake [.#username]```

**Build without activating**

```home-manager build```

**List generations** (configuration history)

```home-manager generations```

**Rollback to previous generation**

```home-manager rollback```

**Remove old generations**

```home-manager expire-generations "[30 days ago]"```

**Edit configuration file**

```home-manager edit```

**Show news** about configuration changes

```home-manager news```

# SYNOPSIS

**home-manager** [_options_] _command_ [_args_]

# PARAMETERS

**switch**
> Build and activate new configuration.

**build**
> Build configuration without activating.

**generations**
> List all configuration generations.

**rollback**
> Revert to previous generation.

**expire-generations** _period_
> Remove generations older than period.

**remove-generations** _IDs_
> Remove specific generations by ID.

**edit**
> Open configuration in $EDITOR.

**news**
> Show news entries about configuration.

**packages**
> List installed packages.

**option** _name_
> Show value of configuration option.

**--flake** _flake-uri_
> Use flake-based configuration.

**-f**, **--file** _file_
> Configuration file path.

**-A** _attribute_
> Attribute to build from configuration.

**-n**, **--dry-run**
> Show what would be done without doing it.

**-v**, **--verbose**
> Increase verbosity.

# DESCRIPTION

**home-manager** is a Nix-based tool for managing user environment configuration declaratively. It handles dotfiles, user packages, and environment settings through Nix expressions, enabling reproducible and versionable home directory setups.

Configuration is written in Nix language, typically in **~/.config/home-manager/home.nix** or as part of a Nix flake. The configuration declares packages to install, programs to configure, files to manage, and services to run.

Many programs have dedicated Home Manager modules that generate configuration files automatically. For example, configuring **programs.git** generates ~/.gitconfig with proper syntax. This is more maintainable than managing dotfiles manually.

Generations provide configuration history. Each **switch** creates a new generation, and you can roll back to any previous state. This makes experimentation safe - broken configurations can be reverted instantly.

Home Manager can run standalone or integrate with NixOS. In standalone mode, it manages the user environment independently. With NixOS, it can be imported as a module for tighter integration.

# CAVEATS

Requires Nix package manager. Learning curve for Nix language. Some program configurations may conflict with manually managed dotfiles. Flake-based configs need experimental features enabled. Generation management requires manual cleanup to prevent disk usage growth.

# HISTORY

**Home Manager** was created by Robert Helgesson (rycee) around **2017** to bring NixOS's declarative configuration approach to user home directories. It filled a gap for users who wanted Nix's reproducibility for their personal environment without running NixOS. The project has grown to include modules for hundreds of programs.

# SEE ALSO

[nix](/man/nix)(1), [nix-env](/man/nix-env)(1), [nixos-rebuild](/man/nixos-rebuild)(8), [chezmoi](/man/chezmoi)(1), [stow](/man/stow)(8)
