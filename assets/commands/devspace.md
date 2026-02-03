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

Configuration is defined in devspace.yaml.

# CAVEATS

Requires kubectl and access to a Kubernetes cluster.

# SEE ALSO

[kubectl](/man/kubectl)(1), [skaffold](/man/skaffold)(1), [tilt](/man/tilt)(1)
