# TAGLINE

Run Linux distributions in containers with host integration

# TLDR

**Create a new container**

```distrobox create --name [mycontainer] --image [ubuntu:latest]```

**List all containers**

```distrobox list```

**Enter a container**

```distrobox enter [mycontainer]```

**Run a command inside a container**

```distrobox enter [mycontainer] -- [command]```

**Export an app from the container to the host**

```distrobox-export --app [application]```

**Upgrade all containers**

```distrobox upgrade --all```

**Stop a container**

```distrobox stop [mycontainer]```

**Remove a container**

```distrobox rm [mycontainer]```

# SYNOPSIS

**distrobox** [_global_options_] _subcommand_ [_options_] [_arguments_]

# PARAMETERS

**create**
> Create a new container.

**enter**
> Enter an existing container.

**list**
> List containers created with distrobox.

**rm**
> Remove a container.

**stop**
> Stop a running container.

**upgrade**
> Upgrade one or more containers.

**--help**, **-h**
> Display help information.

**--root**
> Run distrobox as root (using sudo/doas).

# DESCRIPTION

**distrobox** allows running any Linux distribution inside a terminal container while tightly integrating with the host OS. Containers share the home directory, storage, and hardware access (including graphics and audio).

Built on top of Podman or Docker, it provides seamless access to different distributions' package managers and software. Applications installed inside containers can be exported to appear in the host's application menu.

# SEE ALSO

[distrobox-create](/man/distrobox-create)(1), [distrobox-enter](/man/distrobox-enter)(1), [distrobox-list](/man/distrobox-list)(1), [distrobox-rm](/man/distrobox-rm)(1), [distrobox-stop](/man/distrobox-stop)(1), [distrobox-upgrade](/man/distrobox-upgrade)(1), [distrobox-export](/man/distrobox-export)(1), [distrobox-host-exec](/man/distrobox-host-exec)(1), [podman](/man/podman)(1), [docker](/man/docker)(1)
