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

**docker exec** runs a new command in a running container. Commonly used to open interactive shells for debugging or run maintenance commands.

# SEE ALSO

[docker-container-exec](/man/docker-container-exec)(1), [docker-run](/man/docker-run)(1)

