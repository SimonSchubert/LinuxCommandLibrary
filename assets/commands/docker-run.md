# TLDR

**Run a container interactively**

```docker run -it [image] [bash]```

**Run container in background**

```docker run -d [image]```

**Run with port mapping**

```docker run -p [8080:80] [image]```

**Run with volume mount**

```docker run -v [/host/path:/container/path] [image]```

**Run with environment variables**

```docker run -e [VAR=value] [image]```

**Run with automatic removal on exit**

```docker run --rm [image]```

**Run with custom name**

```docker run --name [container_name] [image]```

**Run with memory limit**

```docker run -m [512m] [image]```

# SYNOPSIS

**docker run** [_options_] _image_ [_command_] [_args_]

# PARAMETERS

**-d**, **--detach**
> Run container in background.

**-it**
> Interactive with pseudo-TTY.

**-p**, **--publish** _host:container_
> Publish container port to host.

**-v**, **--volume** _host:container_
> Bind mount a volume.

**-e**, **--env** _VAR=value_
> Set environment variable.

**--name** _name_
> Assign container name.

**--rm**
> Remove container on exit.

**-m**, **--memory** _limit_
> Memory limit (e.g., 512m, 1g).

**--cpus** _n_
> Number of CPUs.

**--network** _network_
> Connect to network.

**--restart** _policy_
> Restart policy: no, always, unless-stopped, on-failure.

**-w**, **--workdir** _dir_
> Working directory inside container.

**-u**, **--user** _user_
> Username or UID.

**--entrypoint** _cmd_
> Override default entrypoint.

# DESCRIPTION

**docker run** creates and starts a new container from an image. It combines **docker create** and **docker start** into a single command, providing the primary way to launch containers.

The command pulls the image if not present locally, creates a container from it, and starts execution. Options control resource allocation, networking, storage, and runtime behavior.

Containers are isolated but can connect to host resources through port mapping, volume mounts, and network configuration. The **-it** flags enable interactive terminal access for debugging and exploration.

# CAVEATS

Containers run as root by default; use **-u** for non-root execution. Ports below 1024 require root on the host. Volumes with relative paths are created as Docker volumes, not bind mounts. Container filesystem changes are lost unless volumes are used.

# HISTORY

docker run has been the fundamental Docker command since the initial release in **2013** by **Solomon Hykes** and dotCloud (later Docker, Inc.). The command's design draws from Unix philosophy and LXC container concepts. Options have expanded significantly to support enterprise features, orchestration, and security requirements.

# SEE ALSO

[docker](/man/docker)(1), [docker-build](/man/docker-build)(1), [docker-ps](/man/docker-ps)(1), [docker-exec](/man/docker-exec)(1)
