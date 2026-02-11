# TAGLINE

Execute commands inside running containers

# TLDR

**Execute command in container**

```podman exec [container] [command]```

**Interactive shell**

```podman exec -it [container] /bin/bash```

**Run as specific user**

```podman exec -u [root] [container] [command]```

**Set environment variable**

```podman exec -e [VAR=value] [container] [command]```

# SYNOPSIS

**podman exec** [_options_] _container_ _command_ [_args_]

# PARAMETERS

**-i**, **--interactive**
> Keep stdin open.

**-t**, **--tty**
> Allocate TTY.

**-u**, **--user** _user_
> Run as user.

**-e**, **--env** _var=val_
> Set environment variable.

**-w**, **--workdir** _dir_
> Working directory.

**-d**, **--detach**
> Run in background.

**--privileged**
> Extended privileges.

# DESCRIPTION

**podman exec** runs a command inside a running container. It's essential for debugging, maintenance, and interacting with container processes.

# EXAMPLES

```bash
# Interactive bash shell
podman exec -it mycontainer bash

# Run command as root
podman exec -u 0 mycontainer id

# Check process list
podman exec mycontainer ps aux

# Set working directory
podman exec -w /app mycontainer ls

# Run with environment
podman exec -e DEBUG=1 mycontainer ./app

# Detached execution
podman exec -d mycontainer ./background-task
```

# CAVEATS

Container must be running. Command must exist in container. Rootless Podman has user namespace limitations.

# HISTORY

podman exec is part of **Podman**, the daemonless container engine developed by **Red Hat** as a Docker-compatible alternative.

# SEE ALSO

[podman-run](/man/podman-run)(1), [podman-attach](/man/podman-attach)(1), [podman-logs](/man/podman-logs)(1), [docker-exec](/man/docker-exec)(1)
