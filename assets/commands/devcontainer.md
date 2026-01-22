# TLDR

**Build a dev container**

```devcontainer build --workspace-folder [.]```

**Start a dev container**

```devcontainer up --workspace-folder [.]```

**Execute command in** container

```devcontainer exec --workspace-folder [.] [command]```

**Open shell in** container

```devcontainer exec --workspace-folder [.] bash```

**Read configuration**

```devcontainer read-configuration --workspace-folder [.]```

**List features**

```devcontainer features list```

**Generate templates**

```devcontainer templates apply -t [python]```

# SYNOPSIS

**devcontainer** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: build, up, exec, read-configuration, features, templates.

**--workspace-folder** _PATH_
> Path to workspace with .devcontainer config.

**build**
> Build the dev container image.

**up**
> Create and start the container.

**exec** _COMMAND_
> Run command in container.

**read-configuration**
> Output resolved configuration.

**features list**
> List available dev container features.

**--help**
> Display help information.

# DESCRIPTION

**devcontainer** is the CLI for managing development containers defined by the Dev Container specification. It allows building, running, and interacting with containerized development environments from the command line.

Dev containers provide reproducible development environments using Docker containers. Configuration in .devcontainer/devcontainer.json defines the container image, extensions, settings, and features needed for a project.

The CLI enables dev container workflows without IDE integration, useful for CI/CD pipelines, remote development, and automation of development environment setup.

# CAVEATS

Requires Docker or compatible container runtime. Configuration must follow Dev Container spec. Some features require specific base images. Resource-intensive for complex environments.

# HISTORY

The Dev Container CLI was released by **Microsoft** as part of the Dev Containers specification (**2022**). It extends the VS Code Dev Containers functionality to command-line workflows and other tools.

# SEE ALSO

[docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1), [code](/man/code)(1)
