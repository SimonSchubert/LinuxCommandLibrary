# TLDR

Create container using **Ubuntu image**

```distrobox-create [container_name] -i [ubuntu:latest]```

**Clone** an existing container

```distrobox-create -c [container_name] [cloned_container_name]```

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

**--init**
> Use init system inside container

**--nvidia**
> Enable NVIDIA GPU support

**--root**
> Create rootful container

# CAVEATS

Requires Podman or Docker. Images must be compatible Linux distributions. Home directory sharing is bidirectional. First entry may take time for initialization.

# SEE ALSO

[distrobox](/man/distrobox)(1), [distrobox-enter](/man/distrobox-enter)(1), [podman](/man/podman)(1)
