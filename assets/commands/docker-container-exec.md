# TAGLINE

execute a command in a running container

# TLDR

**Execute a command in a container**

```docker container exec [container] [command]```

**Start an interactive shell in a container**

```docker container exec -it [container] /bin/bash```

**Run a command as a specific user**

```docker container exec -u [user] [container] [command]```

**Set environment variables and execute a command**

```docker container exec -e [VAR=value] [container] [command]```

**Execute a command in a specific working directory**

```docker container exec -w [/path] [container] [command]```

**Run a command in the background (detached)**

```docker container exec -d [container] [command]```

**Load environment variables from a file**

```docker container exec --env-file [env.list] [container] [command]```

# SYNOPSIS

**docker** **container** **exec** [_options_] _container_ _command_ [_args..._]

# PARAMETERS

**-i**, **--interactive**
> Keep STDIN open even if not attached.

**-t**, **--tty**
> Allocate a pseudo-TTY.

**-u**, **--user** _user_
> Username or UID (format: user, user:group, uid, uid:gid).

**-w**, **--workdir** _dir_
> Working directory inside the container.

**-e**, **--env** _list_
> Set environment variables.

**--env-file** _file_
> Read environment variables from a file.

**-d**, **--detach**
> Run command in the background.

**--detach-keys** _string_
> Override the key sequence for detaching a container.

**--privileged**
> Give extended privileges to the command.

# DESCRIPTION

**docker container exec** runs a new command in a running container. The command runs in the default working directory of the container or the directory specified with **--workdir**. The command must be an executable; chained or quoted commands do not work.

This is the long form of **docker exec** and behaves identically.

# SEE ALSO

[docker-exec](/man/docker-exec)(1), [docker-container](/man/docker-container)(1), [docker-container-run](/man/docker-container-run)(1), [docker-run](/man/docker-run)(1), [podman-exec](/man/podman-exec)(1)
