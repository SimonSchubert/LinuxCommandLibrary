# TAGLINE

Manage globally installed Pixi packages

# TLDR

**Install package globally**

```pixi global install [package]```

**List globally installed packages**

```pixi global list```

**Remove global package**

```pixi global remove [package]```

**Update all global packages**

```pixi global update --all```

**Sync** manifest with installed environments

```pixi global sync```

**Edit** the global manifest file

```pixi global edit```

# SYNOPSIS

**pixi** **global** _command_ [_options_]

# PARAMETERS

**install** _package_
> Install a package in a globally accessible location and expose its executables.

**uninstall** _environment_
> Uninstall a global environment.

**list**
> List global environments with their dependencies and exposed commands.

**add** _package_
> Add dependencies to a global environment.

**remove** _package_
> Remove dependencies from a global environment.

**update** _package_
> Update packages in global environments. Use **--all** to update all.

**sync**
> Synchronize the global manifest with installed environments.

**edit**
> Open the global manifest file in your editor.

**expose**
> Manage exposure of binaries in global environments.

# DESCRIPTION

**pixi global** manages globally installed packages. Installs command-line tools accessible from anywhere, similar to pipx for Python. Packages are isolated in their own environments.

# SEE ALSO

[pixi](/man/pixi)(1), [pipx](/man/pipx)(1)

