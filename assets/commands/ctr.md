# TAGLINE

Containerd command-line client

# TLDR

**List** all containers

```ctr containers list```

**List** all images

```ctr images list```

**Pull** an image

```ctr images pull [image]```

**Tag** an image

```ctr images tag [source_image]:[source_tag] [target_image]:[target_tag]```

# SYNOPSIS

**ctr** [_global options_] _command_ [_arguments_]

# DESCRIPTION

**ctr** is the command-line client for containerd, the industry-standard container runtime. It provides low-level container and image management capabilities.

Unlike Docker CLI, ctr is designed for debugging and direct containerd interaction rather than general use. Kubernetes typically uses containerd through crictl instead.

# PARAMETERS

**containers list**
> List all containers

**containers rm** _id_
> Remove a container

**images list**
> List all images

**images pull** _ref_
> Pull an image

**images push** _ref_
> Push an image

**images tag** _source_ _target_
> Tag an image

**run** _image_ _container_id_
> Run a container

# CAVEATS

Low-level tool primarily for debugging. For Kubernetes environments, use crictl. For general Docker-like experience, use nerdctl. Requires root or containerd socket access.

# HISTORY

**ctr** is part of **containerd**, which was originally developed by Docker Inc. and donated to the **Cloud Native Computing Foundation (CNCF)** in **2017**. containerd became a graduated CNCF project and is now the standard container runtime for Kubernetes and many other platforms.

# SEE ALSO

[containerd](/man/containerd)(8), [crictl](/man/crictl)(1), [nerdctl](/man/nerdctl)(1)
