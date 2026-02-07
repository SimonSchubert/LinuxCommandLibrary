# TAGLINE

Kubernetes developer tool with hot reloading

# TLDR

**Initialize a project**

```devspace init```

**Deploy to Kubernetes**

```devspace deploy```

**Start development mode**

```devspace dev```

**Open terminal in container**

```devspace enter```

**View logs**

```devspace logs```

**Run a command in container**

```devspace run [command]```

**Purge deployment**

```devspace purge```

# SYNOPSIS

**devspace** _command_ [_options_]

# SUBCOMMANDS

**init**
> Initialize DevSpace configuration.

**deploy**
> Deploy the application.

**dev**
> Start development mode with hot reloading.

**enter**
> Open terminal in container.

**logs**
> View container logs.

**run**
> Run a predefined command.

**purge**
> Delete deployed resources.

**ui**
> Open DevSpace UI in browser.

# DESCRIPTION

**devspace** is a Kubernetes developer tool for building, deploying, and developing applications. It provides hot reloading, log streaming, and terminal access during development.

The tool simplifies Kubernetes development by automating common tasks like building container images, deploying manifests, and syncing code changes. DevSpace watches for local file changes and automatically syncs them to running containers, enabling rapid iteration without rebuilding images.

Configuration is defined in devspace.yaml, specifying images, deployments, dev configurations, and custom commands. The tool supports Helm charts, kubectl manifests, and Kustomize.

# CONFIGURATION

**devspace.yaml**
> Main configuration file defining images, deployments, dev settings, and pipelines.

# CAVEATS

Requires kubectl and access to a Kubernetes cluster. Hot reload performance depends on file sync mechanism. Initial deployment may be slow for large images.

# SEE ALSO

[kubectl](/man/kubectl)(1), [skaffold](/man/skaffold)(1), [tilt](/man/tilt)(1)
