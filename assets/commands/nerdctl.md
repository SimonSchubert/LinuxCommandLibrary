# TLDR

**List all containers** (running and stopped)

```nerdctl ps -a```

**Run** a container with custom name

```nerdctl run --name [container_name] [image]```

**Start or stop** a container

```nerdctl start [container_name]```
```nerdctl stop [container_name]```

**Pull** an image from registry

```nerdctl pull [image]```

**List downloaded images**

```nerdctl images```

**Execute** interactive shell in container

```nerdctl exec -it [container_name] sh```

**Remove** stopped containers

```nerdctl rm [container1] [container2]```

**View logs** of a container

```nerdctl logs -f [container_name]```

# SYNOPSIS

**nerdctl** _command_ [_options_] [_arguments_]

# COMMANDS

**run**
> Run a new container

**ps**
> List containers

**start**
> Start stopped containers

**stop**
> Stop running containers

**exec**
> Execute command in running container

**pull**
> Pull image from registry

**push**
> Push image to registry

**images**
> List images

**rm**
> Remove containers

**rmi**
> Remove images

**build**
> Build image from Dockerfile

**logs**
> Fetch container logs

**compose**
> Docker Compose compatible commands

# PARAMETERS

**-a, --all**
> Show all containers (default: running only)

**-it, --interactive --tty**
> Interactive mode with pseudo-TTY

**-d, --detach**
> Run container in background

**--name _name_**
> Assign name to container

**-p, --publish _port_**
> Publish container port

**-v, --volume _mount_**
> Bind mount a volume

**-f, --follow**
> Follow log output

**--rm**
> Remove container after exit

# DESCRIPTION

**nerdctl** is a Docker-compatible CLI for containerd, the industry-standard container runtime. It provides familiar Docker commands while leveraging containerd's capabilities, including rootless containers and lazy-pulling images.

The tool supports Docker Compose files, Dockerfile builds, and most Docker CLI syntax. It can work with both Docker and containerd images and registries.

# CAVEATS

Some Docker features may not have exact equivalents. Rootless mode requires user namespace configuration. Image compatibility depends on container runtime configuration.

# HISTORY

**nerdctl** was developed by **containerd** maintainers as part of the containerd project. It provides a user-friendly CLI for containerd, which is used by Kubernetes and other container orchestrators as the underlying runtime.

# SEE ALSO

[docker](/man/docker)(1), [containerd](/man/containerd)(8), [ctr](/man/ctr)(1), [podman](/man/podman)(1)
