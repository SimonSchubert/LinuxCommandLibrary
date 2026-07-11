# TAGLINE

create Distrobox containers from Linux distribution images

# TLDR

Create a container using an **Ubuntu image**

```distrobox-create --name [container_name] --image [ubuntu:latest]```

**Clone** an existing container

```distrobox-create --clone [source_container] --name [new_container]```

Create non-interactively, **pulling the image** and installing extra packages

```distrobox-create -Y -n [dev] -i [fedora:latest] -ap "[git vim]"```

**Show compatible images**

```distrobox-create --compatibility```

# SYNOPSIS

**distrobox-create** [_options_] [_name_]

# DESCRIPTION

**distrobox-create** creates a Distrobox container from any Linux distribution image. The container integrates tightly with the host, sharing the user's home directory, external storage, USB devices, graphics (X11/Wayland), and audio.

# PARAMETERS

**-i, --image** _image_
> Container image to use

**-n, --name** _name_
> Container name

**-c, --clone** _container_
> Clone existing container

**-H, --home** _path_
> Custom home directory

**-p, --pull**
> Pull the image even if it exists locally (implies --yes)

**-Y, --yes**
> Non-interactive; pull images without asking

**-ap, --additional-packages** _packages_
> Additional packages to install during initial setup

**--volume** _spec_
> Additional volume to mount into the container

**-I, --init**
> Use an init system (like systemd) inside the container

**--nvidia**
> Integrate the host's NVIDIA drivers into the container

**-r, --root**
> Create a rootful container (launch the container manager as root)

**-C, --compatibility**
> Show a list of compatible images

# CAVEATS

Requires Podman or Docker. Images must be compatible Linux distributions. Home directory sharing is bidirectional. First entry may take time for initialization.

# SEE ALSO

[distrobox](/man/distrobox)(1), [distrobox-enter](/man/distrobox-enter)(1), [podman](/man/podman)(1)

# RESOURCES

```[Source code](https://github.com/89luca89/distrobox)```

```[Homepage](https://distrobox.it)```

<!-- verified: 2026-07-11 -->
