# TAGLINE

Manage stack configurations for apx subsystems

# TLDR

Interactively **create** a new stack configuration

```apx stacks new```

Interactively **update** a stack configuration

```apx stacks update [name]```

**List** all available stack configurations

```apx stacks list```

**Show** information about a specific stack

```apx stacks show [name]```

**Remove** a specified stack configuration

```apx stacks rm --name [name]```

**Import** a stack configuration from file

```apx stacks import --input [path/to/stack.yml]```

**Export** a stack configuration to file

```apx stacks export --name [name] --output [path/to/output_file]```

# SYNOPSIS

**apx stacks** _command_ [_options_]

# DESCRIPTION

**apx stacks** manages stack configurations in apx. A stack defines a combination of a base container image and a package manager, serving as the foundation for subsystems.

User-created stack configurations are stored in **~/.local/share/apx/stacks**. Stacks can be shared between systems by exporting and importing YAML configuration files.

# SUBCOMMANDS

**new**
> Create a new stack configuration interactively

**update**
> Modify an existing stack configuration

**list**
> Display all available stack configurations

**show**
> Show information about a specific stack

**rm**
> Remove a stack configuration

**import**
> Import a stack from a YAML file

**export**
> Export a stack to a YAML file

# PARAMETERS

**-n, --name** _string_
> Specify the stack name

**-b, --base** _string_
> Base container image for the stack (used by new and update)

**-p, --packages** _string_
> Packages to preinstall (used by new and update)

**-k, --pkg-manager** _string_
> Package manager to use (used by new and update)

**-y, --no-prompt** _string_
> Assume default answers, do not prompt interactively

**-f, --force**
> Remove the stack without asking for confirmation (used by rm)

**-i, --input** _path_
> Path to the stack configuration file to import

**-o, --output** _path_
> Path for the exported stack file (defaults to current directory)

# INSTALL

```dnf: sudo dnf install apx```

```aur: yay -S apx```

```nix: nix profile install nixpkgs#apx```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[apx](/man/apx)(1), [apx-pkgmanagers](/man/apx-pkgmanagers)(1), [apx-subsystems](/man/apx-subsystems)(1)

# RESOURCES

```[Source code](https://github.com/Vanilla-OS/apx)```

```[Homepage](https://vanillaos.org)```

```[Documentation](https://docs.vanillaos.org/apx/en/working-w-stacks)```

<!-- verified: 2026-06-11 -->
