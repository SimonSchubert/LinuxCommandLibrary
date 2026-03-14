# TAGLINE

Manage package manager configurations for apx subsystems

# TLDR

Interactively **create** a new package manager configuration

```apx pkgmanagers new```

**Create** a package manager with specific commands

```apx pkgmanagers new --name [name] --install '[install_cmd]' --remove '[remove_cmd]' --update '[update_cmd]'```

**List** all available package manager configurations

```apx pkgmanagers list```

**Remove** a package manager configuration

```apx pkgmanagers rm --name [name]```

Display **information** about a specific package manager

```apx pkgmanagers show [name]```

# SYNOPSIS

**apx pkgmanagers** _command_ [_options_]

# DESCRIPTION

**apx pkgmanagers** manages package manager configurations in apx. These configurations define how packages are installed, updated, and removed within subsystems.

User-created package manager configurations are stored in **~/.local/share/apx/pkgmanagers**. Built-in configurations for common package managers like apt, dnf, and pacman are provided by default.

# SUBCOMMANDS

**new**
> Create a new package manager configuration (interactively or with flags).

**list**
> Display all available package manager configurations.

**rm**
> Remove a package manager configuration.

**show**
> Display details about a specific package manager.

# PARAMETERS

**--name** _string_
> Specify the package manager name.

**--install** _string_
> The install command for the package manager.

**--remove** _string_
> The remove command for the package manager.

**--update** _string_
> The update command for the package manager.

# SEE ALSO

[apx](/man/apx)(1), [apx-stacks](/man/apx-stacks)(1), [apx-subsystems](/man/apx-subsystems)(1)
