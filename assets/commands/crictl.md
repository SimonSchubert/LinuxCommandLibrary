# TAGLINE

CRI-compatible container runtime CLI

# TLDR

**List containers**

```crictl ps```

**List all containers including stopped**

```crictl ps -a```

**List images**

```crictl images```

**Pull image**

```crictl pull [image:tag]```

**Run pod from config**

```crictl runp [pod.json]```

**Create container**

```crictl create [pod-id] [container.json] [pod.json]```

**Start container**

```crictl start [container-id]```

**Execute command in container**

```crictl exec -it [container-id] [/bin/sh]```

**View container logs**

```crictl logs [container-id]```

**Remove container**

```crictl rm [container-id]```

**Stop and remove pod**

```crictl stopp [pod-id] && crictl rmp [pod-id]```

# SYNOPSIS

**crictl** [_global_options_] _command_ [_options_] [_arguments_]

# DESCRIPTION

**crictl** is a command-line interface for CRI-compatible container runtimes. CRI (Container Runtime Interface) is the plugin interface that enables Kubernetes to work with different container runtimes. crictl provides debugging and inspection tools for Kubernetes nodes, interacting directly with containerd, CRI-O, or other CRI-compliant runtimes.

Unlike docker or podman which are designed for general container management, crictl is specifically built for Kubernetes troubleshooting. It exposes the CRI API operations, allowing cluster administrators to inspect pod sandboxes, containers, and images as they exist in the CRI runtime layer, helping diagnose issues with pod scheduling, container creation, and image pulling.

# COMMANDS

**ps**
> List containers

**pods**
> List pods

**images**
> List images

**pull**
> Pull image

**run**
> Run a new container

**exec**
> Execute command in container

**logs**
> View container logs

**attach**
> Attach to container

**start/stop**
> Start/stop container

**rm**
> Remove container

**rmi**
> Remove image

**runp/stopp/rmp**
> Run/stop/remove pod

**inspect**
> Inspect container

**inspecti**
> Inspect image

**inspectp**
> Inspect pod

**stats**
> Container resource usage

**info**
> Runtime info

# PARAMETERS

**-r**, **--runtime-endpoint** _endpoint_
> CRI runtime endpoint

**-i**, **--image-endpoint** _endpoint_
> CRI image endpoint

**--timeout** _duration_
> Connection timeout

**-D**, **--debug**
> Enable debug output

# CONFIGURATION

**~/.crictl.yaml** or **/etc/crictl.yaml**

```yaml
runtime-endpoint: unix:///run/containerd/containerd.sock
image-endpoint: unix:///run/containerd/containerd.sock
timeout: 10
debug: false
```

# CAVEATS

Must run with appropriate privileges. Different from docker CLI commands. Primarily for debugging Kubernetes nodes, not general container management.

# SEE ALSO

[kubectl](/man/kubectl)(1), [ctr](/man/ctr)(1), [podman](/man/podman)(1)
