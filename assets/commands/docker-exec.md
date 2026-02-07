# TAGLINE

execute commands in a running container

# TLDR

**Run command in container**

```docker exec [container] [command]```

**Open interactive shell**

```docker exec -it [container] /bin/bash```

**Run as specific user**

```docker exec -u [root] [container] [command]```

**Set environment variable**

```docker exec -e [VAR=value] [container] [command]```

**Run in specific directory**

```docker exec -w [/path] [container] [command]```

# SYNOPSIS

**docker** **exec** [_options_] _container_ _command_ [_args..._]

# PARAMETERS

**-d**, **--detach**
> Run command in background.

**-i**, **--interactive**
> Keep STDIN open.

**-t**, **--tty**
> Allocate pseudo-TTY.

**-u**, **--user** _user_
> Username or UID.

**-w**, **--workdir** _dir_
> Working directory inside container.

**-e**, **--env** _list_
> Set environment variables.

**--privileged**
> Give extended privileges.

# DESCRIPTION

**docker exec** runs a new command in a running container's existing environment, creating a new process within the container's namespaces and cgroups. This is fundamentally different from **docker run**, which creates an entirely new container.

The most common use case is opening an interactive shell for debugging with **docker exec -it container /bin/bash**, which provides direct access to the container's filesystem and running processes. Commands executed via **docker exec** inherit the container's environment but can be customized with user, working directory, and environment variable options.

The **--privileged** flag grants extended capabilities useful for system administration tasks, though it should be used cautiously as it reduces container isolation.

# SEE ALSO

[docker-container-exec](/man/docker-container-exec)(1), [docker-run](/man/docker-run)(1)
