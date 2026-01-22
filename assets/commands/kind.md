# TLDR

**Create cluster**

```kind create cluster```

**Create named cluster**

```kind create cluster --name [my-cluster]```

**Create with config**

```kind create cluster --config [kind-config.yaml]```

**List clusters**

```kind get clusters```

**Delete cluster**

```kind delete cluster --name [my-cluster]```

**Load image to cluster**

```kind load docker-image [myimage:tag] --name [my-cluster]```

# SYNOPSIS

**kind** _command_ [_options_]

# PARAMETERS

**create cluster**
> Create new cluster.

**delete cluster**
> Delete cluster.

**get clusters**
> List clusters.

**get nodes**
> List cluster nodes.

**load docker-image** _IMAGE_
> Load image to cluster.

**--name** _NAME_
> Cluster name.

**--config** _FILE_
> Configuration file.

**--help**
> Display help information.

# DESCRIPTION

**kind** runs Kubernetes clusters in Docker containers. It creates local clusters for development and testing.

The tool uses Docker containers as cluster nodes. It supports multi-node clusters and custom configurations.

kind runs Kubernetes in Docker.

# CAVEATS

Requires Docker. Development focused. Not for production.

# HISTORY

kind (Kubernetes IN Docker) was created by the **Kubernetes** SIG Testing as a tool for testing Kubernetes itself.

# SEE ALSO

[kubectl](/man/kubectl)(1), [k3d](/man/k3d)(1), [minikube](/man/minikube)(1), [docker](/man/docker)(1)
