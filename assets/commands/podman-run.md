# TAGLINE

Create and start containers from images

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

**Run with environment variable**

```podman run -e [VAR=value] [image]```

**Run and auto-remove on exit**

```podman run --rm -it [image] [command]```

**Run with custom network**

```podman run --network [network_name] [image]```

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
> Remove container after exit.

**--network** _MODE_
> Set network mode (bridge, host, none, or custom network name).

**--restart** _POLICY_
> Restart policy (no, on-failure[:max], always, unless-stopped).

**-w**, **--workdir** _DIR_
> Working directory inside the container.

**--user** _USER_
> Run as specified user (name or UID[:GID]).

**--cap-add** _CAP_
> Add Linux capabilities.

**--cap-drop** _CAP_
> Drop Linux capabilities.

**--entrypoint** _CMD_
> Override image entrypoint.

**--label** _KEY=VALUE_
> Set metadata label on container.

# DESCRIPTION

**podman run** creates and starts a new container from a specified image. It is the primary command for launching containers, supporting interactive sessions (**-it**), background execution (**-d**), port mapping (**-p**), volume mounts (**-v**), and environment variables (**-e**).

The **--rm** flag automatically removes the container when it exits. The **--name** option assigns a human-readable name. By default, Podman runs containers rootlessly without requiring a daemon, making it a drop-in replacement for docker run.

# CAVEATS

Runs rootless by default without requiring a daemon. Most Docker CLI flags are compatible. Some features (e.g., certain network modes) may behave differently in rootless mode.

# HISTORY

**podman run** was introduced as part of the Podman project by Red Hat, providing a daemonless, Docker-compatible container runtime.

# SEE ALSO

[podman](/man/podman)(1), [podman-exec](/man/podman-exec)(1), [docker-run](/man/docker-run)(1)

