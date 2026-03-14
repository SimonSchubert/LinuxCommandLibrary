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
> Run in background. Prints the exec session ID and exits immediately.

**--detach-keys** _sequence_
> Key sequence for detaching from the container (default: ctrl-p,ctrl-q).

**--env-file** _file_
> Read environment variables from a line-delimited file.

**-l**, **--latest**
> Use the most recently created container instead of specifying a name or ID.

**--preserve-fds** _N_
> Pass N additional file descriptors (beyond stdin/stdout/stderr) to the process.

**--privileged**
> Give extended privileges to the command.

# DESCRIPTION

**podman exec** runs a command inside a running container. It's essential for debugging, maintenance, and interacting with container processes.

# CAVEATS

Container must be running. Command must exist in the container image. Rootless Podman has user namespace limitations. The **--latest** flag is not supported on remote clients.

# HISTORY

podman exec is part of **Podman**, the daemonless container engine developed by **Red Hat** as a Docker-compatible alternative.

# SEE ALSO

[podman-run](/man/podman-run)(1), [podman](/man/podman)(1), [docker-exec](/man/docker-exec)(1)
