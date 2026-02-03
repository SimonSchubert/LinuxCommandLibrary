# TLDR

**Start minikube cluster**

```minikube start```

**Start with specific driver**

```minikube start --driver=[docker]```

**Start with specific Kubernetes version**

```minikube start --kubernetes-version=[v1.28.0]```

**Start with more resources**

```minikube start --cpus=[4] --memory=[8192]```

**Start with specific profile**

```minikube start -p [profile-name]```

# SYNOPSIS

**minikube** **start** [_options_]

# PARAMETERS

**--driver** _name_
> VM driver (docker, virtualbox, kvm2).

**--kubernetes-version** _version_
> Kubernetes version.

**--cpus** _count_
> Number of CPUs.

**--memory** _mb_
> Memory in MB.

**-p**, **--profile** _name_
> Profile name.

**--nodes** _count_
> Number of nodes.

# DESCRIPTION

**minikube start** starts a local Kubernetes cluster. Creates a VM or container running Kubernetes. Default driver depends on platform. Supports multiple profiles for different clusters.

# SEE ALSO

[minikube](/man/minikube)(1), [kubectl](/man/kubectl)(1)

