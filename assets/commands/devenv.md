# TLDR

**Initialize a new project**

```devenv init```

**Enter the development shell**

```devenv shell```

**Start background services**

```devenv up```

**Stop background services**

```devenv down```

**Run a command in the environment**

```devenv shell -- [command]```

**Update devenv**

```devenv update```

# SYNOPSIS

**devenv** _command_ [_options_]

# SUBCOMMANDS

**init**
> Initialize a new devenv project.

**shell**
> Enter the development shell.

**up**
> Start background processes.

**down**
> Stop background processes.

**update**
> Update devenv and inputs.

**gc**
> Garbage collect old environments.

**info**
> Show environment information.

# DESCRIPTION

**devenv** is a development environment management tool built on Nix. It provides declarative, reproducible development environments with automatic dependency management.

Configuration is defined in devenv.nix, specifying packages, services, and environment variables.

# CAVEATS

Requires Nix to be installed. First-time setup may take time to download dependencies.

# SEE ALSO

[nix](/man/nix)(1), [nix-shell](/man/nix-shell)(1), [direnv](/man/direnv)(1)
