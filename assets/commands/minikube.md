# TLDR

**Start cluster**

```minikube start```

**Stop cluster**

```minikube stop```

**Delete cluster**

```minikube delete```

**Check status**

```minikube status```

**Open dashboard**

```minikube dashboard```

**SSH into node**

```minikube ssh```

# SYNOPSIS

**minikube** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Minikube operation.

**start**
> Start cluster.

**stop**
> Stop cluster.

**delete**
> Delete cluster.

**status**
> Show status.

**dashboard**
> Open dashboard.

**--driver** _NAME_
> VM driver (docker, virtualbox).

**--help**
> Display help information.

# DESCRIPTION

**minikube** runs local Kubernetes clusters. It's designed for development and learning.

The tool creates a single-node cluster on your machine. Supports multiple drivers.

minikube runs local Kubernetes.

# CAVEATS

Single-node only. Requires VM or container runtime. Resource intensive.

# HISTORY

Minikube was created by **Kubernetes** team for running local Kubernetes clusters for development.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kind](/man/kind)(1), [k3s](/man/k3s)(1)

