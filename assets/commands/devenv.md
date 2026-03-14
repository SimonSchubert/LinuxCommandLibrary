# TAGLINE

declarative development environments with Nix

# TLDR

**Initialize a new project**

```devenv init```

**Enter the development shell**

```devenv shell```

**Start background processes** (databases, servers, etc.)

```devenv up```

**Start processes detached** in the background

```devenv processes up```

**Run a command in the environment**

```devenv shell -- [command]```

**Search for a package** in nixpkgs

```devenv search [package_name]```

**Update inputs and lockfile**

```devenv update```

**Run project tests**

```devenv test```

# SYNOPSIS

**devenv** _command_ [_options_]

# SUBCOMMANDS

**init**
> Initialize a new devenv project.

**shell**
> Enter the development shell.

**up**
> Start background processes.

**processes up**
> Start processes in the background.

**processes down**
> Stop background processes.

**update**
> Update devenv inputs and lockfile.

**search** _name_
> Search for packages in nixpkgs.

**test**
> Run project tests defined in devenv.nix.

**container**
> Build, copy, or run a container.

**build**
> Build any attribute in devenv.nix.

**gc**
> Garbage collect old shell generations.

**info**
> Show environment information.

**repl**
> Launch interactive REPL for inspecting configuration.

# DESCRIPTION

**devenv** is a development environment management tool built on Nix. It provides declarative, reproducible development environments with automatic dependency management.

Configuration is defined in devenv.nix, specifying packages, services, environment variables, and scripts. devenv simplifies Nix usage for development environments with a user-friendly API and pre-configured services like databases, language runtimes, and development tools.

The tool supports running services in the background, automatic environment activation with direnv integration, and deterministic builds through Nix's reproducibility guarantees.

# CONFIGURATION

**devenv.nix**
> Main configuration file defining packages, languages, services, environment variables, scripts, and shell hooks.

**devenv.yaml**
> Configuration for Nix inputs (nixpkgs version, additional flakes) and project imports.

**devenv.lock**
> Lock file pinning exact input versions for reproducibility.

# CAVEATS

Requires Nix to be installed. First-time setup may take time to download dependencies. Nix store can consume significant disk space. Some proprietary software may not be available in Nix packages.

# SEE ALSO

[nix](/man/nix)(1), [nix-shell](/man/nix-shell)(1), [direnv](/man/direnv)(1)
