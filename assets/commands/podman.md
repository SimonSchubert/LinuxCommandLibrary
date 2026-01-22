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

**podman** is a daemonless container engine. Docker-compatible CLI.

The tool manages containers without root. OCI-compliant runtime.

podman runs containers.

# CAVEATS

Rootless by default. Docker CLI compatible.

# HISTORY

Podman was created by **Red Hat** as a daemonless Docker alternative.

# SEE ALSO

[docker](/man/docker)(1), [buildah](/man/buildah)(1), [skopeo](/man/skopeo)(1)

