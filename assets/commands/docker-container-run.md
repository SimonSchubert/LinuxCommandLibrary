# TAGLINE

create and start a new container

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

**docker container run** creates and starts a new container from a specified image, combining the functionality of **docker container create** and **docker container start** into a single command. This is the most common way to launch containers in Docker.

When executed, Docker pulls the image if not locally available, creates a container with the specified configuration, and starts it. The command supports extensive configuration options for networking, storage, resource limits, and runtime behavior. Using **--rm** ensures ephemeral containers are cleaned up automatically, while **-d** enables daemon mode for background services.

This command is equivalent to the legacy **docker run** command.

# SEE ALSO

[docker-run](/man/docker-run)(1), [docker-container](/man/docker-container)(1)
