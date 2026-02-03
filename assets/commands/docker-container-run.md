# TLDR

**Run a container**

```docker container run [image]```

**Run interactively**

```docker container run -it [image] /bin/bash```

**Run in background**

```docker container run -d [image]```

**Run with port mapping**

```docker container run -p [8080:80] [image]```

**Run with volume mount**

```docker container run -v [/host/path:/container/path] [image]```

**Run with name**

```docker container run --name [mycontainer] [image]```

**Run and remove on exit**

```docker container run --rm [image]```

**Run with environment variable**

```docker container run -e [VAR=value] [image]```

# SYNOPSIS

**docker** **container** **run** [_options_] _image_ [_command_] [_args..._]

# PARAMETERS

**-d**, **--detach**
> Run in background.

**-i**, **--interactive**
> Keep STDIN open.

**-t**, **--tty**
> Allocate pseudo-TTY.

**-p**, **--publish** _hostPort:containerPort_
> Publish port.

**-v**, **--volume** _src:dest_
> Bind mount a volume.

**-e**, **--env** _var=value_
> Set environment variable.

**--name** _name_
> Assign container name.

**--rm**
> Remove container on exit.

**--network** _network_
> Connect to network.

**-w**, **--workdir** _dir_
> Working directory inside container.

# DESCRIPTION

**docker container run** creates and starts a new container from an image. Equivalent to **docker run**.

# SEE ALSO

[docker-run](/man/docker-run)(1), [docker-container](/man/docker-container)(1)
