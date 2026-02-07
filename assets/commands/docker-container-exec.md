# TAGLINE

execute command in running container

# TLDR

**Execute command in container**

```docker container exec [container] [command]```

**Interactive shell**

```docker container exec -it [container] /bin/bash```

**Run as specific user**

```docker container exec -u [user] [container] [command]```

**Set environment variable**

```docker container exec -e [VAR=value] [container] [command]```

**Set working directory**

```docker container exec -w [/path] [container] [command]```

# SYNOPSIS

**docker** **container** **exec** [_options_] _container_ _command_ [_args..._]

# PARAMETERS

**-i**, **--interactive**
> Keep STDIN open.

**-t**, **--tty**
> Allocate pseudo-TTY.

**-u**, **--user** _user_
> Run as specified user.

**-w**, **--workdir** _dir_
> Working directory.

**-e**, **--env** _list_
> Set environment variables.

**-d**, **--detach**
> Run in background.

# DESCRIPTION

**docker container exec** runs a command in a running container. Commonly used for debugging or administrative tasks.

# SEE ALSO

[docker-exec](/man/docker-exec)(1), [docker-container](/man/docker-container)(1)
