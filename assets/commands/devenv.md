# TAGLINE

declarative development environments with Nix

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

Configuration is defined in devenv.nix, specifying packages, services, environment variables, and scripts. devenv simplifies Nix usage for development environments with a user-friendly API and pre-configured services like databases, language runtimes, and development tools.

The tool supports running services in the background, automatic environment activation with direnv integration, and deterministic builds through Nix's reproducibility guarantees.

# CONFIGURATION

**devenv.nix**
> Main configuration file defining packages, services, environment variables, and shell hooks.

**devenv.yaml**
> Optional configuration for inputs and project metadata.

# CAVEATS

Requires Nix to be installed. First-time setup may take time to download dependencies. Nix store can consume significant disk space. Some proprietary software may not be available in Nix packages.

# SEE ALSO

[nix](/man/nix)(1), [nix-shell](/man/nix-shell)(1), [direnv](/man/direnv)(1)
