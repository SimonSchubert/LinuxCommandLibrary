# TAGLINE

Daemonless container engine for OCI containers

# TLDR

**Run a container**

```podman run [image]```

**List running containers**

```podman ps```

**List all containers**

```podman ps -a```

**Pull an image**

```podman pull [image]```

**Build from Dockerfile**

```podman build -t [tag] [path]```

**Stop a container**

```podman stop [container]```

**Remove a container**

```podman rm [container]```

# SYNOPSIS

**podman** [_options_] _command_ [_args_]

# PARAMETERS

**run**
> Run a container.

**ps**
> List containers.

**pull**
> Pull an image.

**build**
> Build image from Containerfile.

**stop**
> Stop container.

**rm**
> Remove container.

**images**
> List images.

**exec**
> Execute in container.

**-d**, **--detach**
> Run in background.

# DESCRIPTION

**podman** is a daemonless, rootless container engine that manages OCI-compliant containers and images. Unlike Docker, it does not require a background daemon process, and containers can run entirely as an unprivileged user.

The CLI is designed to be drop-in compatible with Docker, supporting familiar commands like **run**, **build**, **pull**, **ps**, **stop**, and **rm**. Podman also supports pods (groups of containers sharing namespaces), which align with Kubernetes pod concepts. Developed by Red Hat, it uses Buildah for image building and crun/runc as the container runtime.

# CONFIGURATION

**/etc/containers/registries.conf**
> System-wide container registry configuration including search registries and mirrors.

**/etc/containers/storage.conf**
> Storage driver and path configuration for container images and layers.

**/etc/containers/containers.conf**
> Default container runtime settings including resource limits, logging, and network configuration.

**~/.config/containers/**
> User-level overrides for rootless Podman configuration.

# CAVEATS

Rootless by default. Docker CLI compatible.

# HISTORY

Podman was created by **Red Hat** as a daemonless Docker alternative.

# SEE ALSO

[docker](/man/docker)(1), [buildah](/man/buildah)(1), [skopeo](/man/skopeo)(1)

