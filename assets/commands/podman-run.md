# TLDR

**Run a container**

```podman run [image]```

**Run interactively**

```podman run -it [image] [/bin/bash]```

**Run in background**

```podman run -d [image]```

**Run with port mapping**

```podman run -p [8080:80] [image]```

**Run with volume mount**

```podman run -v [/host/path:/container/path] [image]```

**Run with name**

```podman run --name [mycontainer] [image]```

# SYNOPSIS

**podman run** [_options_] _image_ [_command_]

# PARAMETERS

_IMAGE_
> Container image.

**-it**
> Interactive terminal.

**-d**, **--detach**
> Run in background.

**-p**, **--publish** _PORT_
> Port mapping.

**-v**, **--volume** _MOUNT_
> Volume mount.

**--name** _NAME_
> Container name.

**-e**, **--env** _VAR_
> Environment variable.

**--rm**
> Remove after exit.

# DESCRIPTION

**podman run** runs a container from an image. Primary container execution command.

The tool creates and starts containers. Docker run compatible.

podman run starts containers.

# CAVEATS

Rootless by default. Docker-compatible flags.

# HISTORY

podman run provides **container execution** as a Docker-compatible command.

# SEE ALSO

[podman](/man/podman)(1), [podman-exec](/man/podman-exec)(1), [docker-run](/man/docker-run)(1)

